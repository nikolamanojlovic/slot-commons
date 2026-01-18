package com.heapik.slot.commonsevent.ports.outbox;

import com.heapik.slot.commonsevent.domain.Event;
import com.heapik.slot.commonsevent.domain.outbox.EventOutbox;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public interface EventOutboxRepositoryPort {
    List<EventOutbox> findAllUnpublishedEvents(Instant cursor, UUID tieBreaker, int limit, int retryCount);
    void saveEvent(Event<?> event) throws Exception;
}

