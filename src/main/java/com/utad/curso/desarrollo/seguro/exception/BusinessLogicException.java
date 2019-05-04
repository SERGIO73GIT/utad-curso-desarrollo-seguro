package com.utad.curso.desarrollo.seguro.exception;

public class BusinessLogicException
        extends RuntimeException {

    private static final long serialVersionUID = -8292242662103179747L;

    public BusinessLogicException(
            String message) {
        super(message);
    }

    public BusinessLogicException(
            String message,
            Throwable cause) {
        super(message, cause);
    }

}
