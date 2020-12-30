package be.dog.d.steven.model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class BirthFormTest {
    @Test
    public void testSetId() {
        BirthForm birthForm = new BirthForm();
        birthForm.setId(1);
        assertEquals(1, birthForm.getId().intValue());
    }

    @Test
    public void testSetFirst() {
        BirthForm birthForm = new BirthForm();
        birthForm.setFirst("First");
        assertEquals("First", birthForm.getFirst());
    }

    @Test
    public void testSetLast() {
        BirthForm birthForm = new BirthForm();
        birthForm.setLast("Last");
        assertEquals("Last", birthForm.getLast());
    }

    @Test
    public void testSetBirthDate() {
        Date date = new Date(1L);
        BirthForm birthForm = new BirthForm();
        birthForm.setBirthDate(date);
        assertSame(date, birthForm.getBirthDate());
    }

    @Test
    public void testSetBirthPlace() {
        BirthForm birthForm = new BirthForm();
        birthForm.setBirthPlace("Birth Place");
        assertEquals("Birth Place", birthForm.getBirthPlace());
    }
}

