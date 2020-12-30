package be.dog.d.steven.controller;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.validation.DataBinder;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeFormControllerTest {
    @Test
    public void testGetEmpForm() {
        EmployeeFormController employeeFormController = new EmployeeFormController();
        assertEquals("empForm", employeeFormController.getEmpForm(new ConcurrentModel()));
    }

    @Test
    public void testGetEmpForm2() {
        // TODO: This test is incomplete.

        RedirectAttributesModelMap model = new RedirectAttributesModelMap(new DataBinder("target"));
        (new EmployeeFormController()).getEmpForm(model);
    }
}

