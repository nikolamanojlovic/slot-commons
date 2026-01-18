package com.heapik.slot.commonsevent.domain;

import java.time.Instant;

public record Event<T>(
        String eventType,
        Instant occurredAt,
        T payload
) {
}
