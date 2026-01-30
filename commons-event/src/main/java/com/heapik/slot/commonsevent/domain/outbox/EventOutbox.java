package com.heapik.slot.commonsevent.domain.outbox;

import com.fasterxml.jackson.databind.JsonNode;

import java.time.Instant;
import java.util.UUID;

public class EventOutbox {

    private UUID id;

    private String eventType;

    private JsonNode payload;

    private Instant occurredAt;

    private boolean published;

    private int retryCount;

    private String errorMessage;

    public EventOutbox() {
    }

    public EventOutbox(UUID id, String eventType, JsonNode payload, Instant occurredAt) {
        this.id = id;
        this.eventType = eventType;
        this.payload = payload;
        this.occurredAt = occurredAt;
        this.published = false;
        this.retryCount = 0;
    }

    public EventOutbox(UUID id, String eventType, JsonNode payload, Instant occurredAt, boolean published, int retryCount, String errorMessage) {
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

    public JsonNode getPayload() {
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
