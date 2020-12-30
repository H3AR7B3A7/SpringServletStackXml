package be.dog.d.steven.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileUploadControllerTest {
    @Test
    public void testUpload() {
        assertEquals("upload", (new FileUploadController()).upload());
    }
}

