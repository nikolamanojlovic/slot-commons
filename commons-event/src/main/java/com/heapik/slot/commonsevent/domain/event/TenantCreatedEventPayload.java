package com.heapik.slot.commonsevent.domain.event;

public record TenantCreatedEventPayload(
        String id,
        String name,
        String type
) {
}
