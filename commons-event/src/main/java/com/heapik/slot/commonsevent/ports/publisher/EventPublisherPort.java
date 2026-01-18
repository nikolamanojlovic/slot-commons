package com.heapik.slot.commonsevent.ports.publisher;

import com.heapik.slot.commonsevent.domain.Event;

public interface EventPublisherPort {
    <T> void publish(Event<T> event) throws Exception;
}
