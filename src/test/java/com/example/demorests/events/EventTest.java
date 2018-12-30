/*
 * Copyright (c) 2018.
 * Made by jjwonyop
 */

package com.example.demorests.events;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EventTest {
    @Test
    public void builder() {
        Event event = Event.builder()
                .name("Inflearn REST API")
                .description("REST API with Spring")
                .build();

        assertThat(event).isNotNull();
    }


    @Test
    public void javaBean() {
        // Given
        String des = "REST API With Spring";
        String name = "Event";

        // When
        Event event = new Event();
        event.setName(name);
        event.setDescription(des);

        // Then
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(des);
    }
}