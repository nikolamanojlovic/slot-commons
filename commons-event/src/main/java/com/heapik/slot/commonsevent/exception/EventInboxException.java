package com.heapik.slot.commonsevent.exception;

public class EventInboxException extends RuntimeException {
    private final String code;

    public EventInboxException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
