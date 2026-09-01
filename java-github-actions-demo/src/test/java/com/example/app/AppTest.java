package com.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testApplicationMessage() {

        String message = "Kastro Java Application";

        assertEquals("Kastro Java Application", message);
    }
}