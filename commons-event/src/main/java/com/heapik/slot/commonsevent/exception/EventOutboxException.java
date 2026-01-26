package com.heapik.slot.commonsevent.exception;

public class EventOutboxException extends RuntimeException {
    private final String code;

    public EventOutboxException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
