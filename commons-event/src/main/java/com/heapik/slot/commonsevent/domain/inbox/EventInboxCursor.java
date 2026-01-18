package com.heapik.slot.commonsevent.domain.inbox;

import java.time.Instant;
import java.util.UUID;

public class EventInboxCursor {

    private String processorName;

    private Instant cursor;

    private UUID tieBreaker;

    public EventInboxCursor() {
    }

    public EventInboxCursor(String processorName, Instant cursor, UUID tieBreaker) {
        this.processorName = processorName;
        this.cursor = cursor;
        this.tieBreaker = tieBreaker;
    }

    public String getProcessorName() {
        return processorName;
    }

    public Instant getCursor() {
        return cursor;
    }

    public UUID getTieBreaker() {
        return tieBreaker;
    }

    public void setCursor(Instant cursor) {
        this.cursor = cursor;
    }

    public void setTieBreaker(UUID tieBreaker) {
        this.tieBreaker = tieBreaker;
    }
}
