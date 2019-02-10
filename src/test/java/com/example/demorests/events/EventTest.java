/*
 * Copyright (c) 2018.
 * Made by jjwonyop
 */

package com.example.demorests.events;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
        testJava8();
    }

    private void testJava8() {
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivisibleByThree = someNumbers.stream().map(x -> x * x)
                .filter(x -> x % 3 == 0)
                .findFirst();

        firstSquareDivisibleByThree.ifPresent(System.out::println);

    }
}