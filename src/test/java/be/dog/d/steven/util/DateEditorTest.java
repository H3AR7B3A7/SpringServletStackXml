package be.dog.d.steven.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateEditorTest {
    @Test
    public void testSetAsText() throws IllegalArgumentException {
        // TODO: This test is incomplete.

        (new DateEditor()).setAsText("Text");
    }

    @Test
    public void testGetAsText() {
        assertEquals("", (new DateEditor()).getAsText());
    }
}

