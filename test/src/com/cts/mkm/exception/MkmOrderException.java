package com.cts.mkm.exception;
public class MkmOrderException extends Exception {
    private static final long serialVersionUID = -1105431869622052445L;
    /**
     * @param message
     * @param cause
     */
    public MkmOrderException(String message, Throwable cause) {
        super(message, cause);
    }
}