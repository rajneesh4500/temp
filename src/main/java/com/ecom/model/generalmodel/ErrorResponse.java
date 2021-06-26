package com.ecom.model.generalmodel;

import lombok.Data;

public @Data class ErrorResponse {
    private Integer errorCode;
    private String errorMessage;

}
