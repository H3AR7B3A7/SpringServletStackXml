package be.dog.d.steven.controller;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.validation.DataBinder;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirthFormControllerTest {
    @Test
    public void testGetBirthForm() {
        BirthFormController birthFormController = new BirthFormController();
        assertEquals("birthForm", birthFormController.getBirthForm(new ConcurrentModel()));
    }

    @Test
    public void testGetBirthForm2() {
        // TODO: This test is incomplete.

        RedirectAttributesModelMap model = new RedirectAttributesModelMap(new DataBinder("target"));
        (new BirthFormController()).getBirthForm(model);
    }
}

