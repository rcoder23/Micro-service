package com.shop.bookstore.catalog.exception;

import org.springframework.http.HttpStatus;


public class GenericException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private String fieldName;
    private HttpStatus httpStatusCode;
    /**
     * Constructs a new GenericException with the specified field name, message, and HTTP error code.
     *
     * @param fieldName  The name of the field associated with the exception.
     * @param message    The error message.
     * @param errorCode  The HTTP error code.
     */
    public GenericException(final String fieldName,final HttpStatus httpStatusCode,final String message) {
        super(message);
        this.fieldName = fieldName;
        this.httpStatusCode = httpStatusCode;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public HttpStatus getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(HttpStatus httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }
}
