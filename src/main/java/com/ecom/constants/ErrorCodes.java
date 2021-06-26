package com.ecom.constants;

import org.springframework.lang.Nullable;

public enum ErrorCodes {

    PRODUCT_NOT_FOUND(9001,"Product ID not found"),
    PRODUCT_NOT_IN_STOCK(9002, "Product not in Stock"),
    PRODUCT_INSERT_ERROR(9003, "Product initialization error");

    private final int errorCode;
    private final String message;
    private static final ErrorCodes[] errorCodes;

    static{
        errorCodes = values();
    }

    private ErrorCodes(int errorCode, String message){
        this.errorCode = errorCode;
        this.message = message;
    }


    @Nullable
    public static String resolveMessage(int errorCode){
        for(ErrorCodes e : errorCodes){
            if(e.errorCode == errorCode){
                return e.message;
            }
        }
        return null;
    }


}
