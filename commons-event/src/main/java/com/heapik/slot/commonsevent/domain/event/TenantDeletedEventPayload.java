package com.heapik.slot.commonsevent.domain.event;

public record TenantDeletedEventPayload(
        String id,
        String type
) {
}
