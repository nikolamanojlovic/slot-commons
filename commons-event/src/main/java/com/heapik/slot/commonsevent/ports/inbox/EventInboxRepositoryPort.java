package com.heapik.slot.commonsevent.ports.inbox;

import com.heapik.slot.commonsevent.domain.Event;
import com.heapik.slot.commonsevent.domain.inbox.EventInbox;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public interface EventInboxRepositoryPort {
    List<EventInbox> findAllUnpublishedEvents(Instant cursor, UUID tieBreaker, int limit, int retryCount);
    void saveEvent(Event<?> event) throws Exception;
}

