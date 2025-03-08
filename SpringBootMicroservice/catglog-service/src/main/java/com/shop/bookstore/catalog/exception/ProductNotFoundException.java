package com.shop.bookstore.catalog.exception;

import org.springframework.http.HttpStatus;

public class ProductNotFoundException extends GenericException{

    /**
     * Constructs a new GenericException with the specified field name, message, and HTTP error code.
     *
     * @param fieldName      The name of the field associated with the exception.
     * @param httpStatusCode
     * @param message        The error message.
     */
    public ProductNotFoundException(String fieldName, HttpStatus httpStatusCode, String message) {
        super(fieldName, httpStatusCode, message);
    }
}
