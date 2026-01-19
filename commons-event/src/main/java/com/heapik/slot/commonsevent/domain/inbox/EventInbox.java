package com.heapik.slot.commonsevent.domain.inbox;

import java.time.Instant;
import java.util.UUID;

public class EventInbox {

    private UUID id;

    private String eventType;

    private String payload;

    private Instant occurredAt;

    private boolean published;

    private int retryCount;

    private String errorMessage;

    public EventInbox() {
    }

    public EventInbox(UUID id, String eventType, String payload, Instant occurredAt) {
        this.id = id;
        this.eventType = eventType;
        this.payload = payload;
        this.occurredAt = occurredAt;
        this.published = false;
        this.retryCount = 0;
    }

    public EventInbox(UUID id, String eventType, String payload, Instant occurredAt, boolean published, int retryCount, String errorMessage) {
        this.id = id;
        this.eventType = eventType;
        this.payload = payload;
        this.occurredAt = occurredAt;
        this.published = published;
        this.retryCount = retryCount;
        this.errorMessage = errorMessage;
    }

    public void incrementRetryCount() {
        this.retryCount++;
    }

    public void published() {
        this.published = true;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public UUID getId() {
        return id;
    }

    public String getEventType() {
        return eventType;
    }

    public String getPayload() {
        return payload;
    }

    public Instant getOccurredAt() {
        return occurredAt;
    }

    public boolean isPublished() {
        return published;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
