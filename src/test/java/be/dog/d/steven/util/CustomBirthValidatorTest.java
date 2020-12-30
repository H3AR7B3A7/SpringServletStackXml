package be.dog.d.steven.util;

import be.dog.d.steven.model.BirthForm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomBirthValidatorTest {
    @Test
    public void testSupports() {
        Class<?> aClass = Object.class;
        assertFalse((new CustomBirthValidator()).supports(aClass));
    }

    @Test
    public void testSupports2() {
        Class<?> aClass = BirthForm.class;
        assertTrue((new CustomBirthValidator()).supports(aClass));
    }
}

