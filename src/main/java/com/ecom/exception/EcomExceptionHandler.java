package com.ecom.exception;


import com.ecom.constants.ErrorCodes;
import com.ecom.model.generalmodel.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EcomExceptionHandler {

    @ExceptionHandler(ProductException.class)
    public ResponseEntity<ErrorResponse> handleProductException(ProductException e){
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrorCode(e.getErrorCode());
        errorResponse.setErrorMessage(ErrorCodes.resolveMessage(e.getErrorCode()));

        return new ResponseEntity<>(errorResponse, null, HttpStatus.BAD_REQUEST);
    }



}
