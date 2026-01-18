package com.heapik.slot.commonsevent.ports.inbox;

import com.heapik.slot.commonsevent.domain.inbox.EventInboxCursor;

import java.util.Optional;

public interface EventInboxCursorRepositoryPort {
    Optional<EventInboxCursor> findByName(String name);
    EventInboxCursor save(EventInboxCursor eventInboxCursor);
}
