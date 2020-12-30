package be.dog.d.steven.controller;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirthsControllerTest {
    @Test
    public void testGetBirths() {
        BirthsController birthsController = new BirthsController();
        assertEquals("births", birthsController.getBirths(new ConcurrentModel()));
    }
}

