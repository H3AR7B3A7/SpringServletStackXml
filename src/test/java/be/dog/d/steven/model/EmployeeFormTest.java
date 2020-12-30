package be.dog.d.steven.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeFormTest {
    @Test
    public void testSetFirst() {
        EmployeeForm employeeForm = new EmployeeForm();
        employeeForm.setFirst("First");
        assertEquals("First", employeeForm.getFirst());
    }

    @Test
    public void testSetLast() {
        EmployeeForm employeeForm = new EmployeeForm();
        employeeForm.setLast("Last");
        assertEquals("Last", employeeForm.getLast());
    }

    @Test
    public void testSetPosition() {
        EmployeeForm employeeForm = new EmployeeForm();
        employeeForm.setPosition("Position");
        assertEquals("Position", employeeForm.getPosition());
    }

    @Test
    public void testSetEmail() {
        EmployeeForm employeeForm = new EmployeeForm();
        employeeForm.setEmail("jane.doe@example.org");
        assertEquals("jane.doe@example.org", employeeForm.getEmail());
    }
}

