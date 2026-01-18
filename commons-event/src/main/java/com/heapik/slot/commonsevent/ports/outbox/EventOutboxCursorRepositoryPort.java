package com.heapik.slot.commonsevent.ports.outbox;

import com.heapik.slot.commonsevent.domain.outbox.EventOutboxCursor;

import java.util.Optional;

public interface EventOutboxCursorRepositoryPort {
    Optional<EventOutboxCursor> findByName(String name);
    EventOutboxCursor save(EventOutboxCursor eventOutboxCursor);
}
