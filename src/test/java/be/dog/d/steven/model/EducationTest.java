package be.dog.d.steven.model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class EducationTest {
    @Test
    public void testConstructor() {
        Education actualEducation = new Education();
        assertNull(actualEducation.getDegree());
        assertNull(actualEducation.getInstitution());
        assertNull(actualEducation.getMajor());
    }

    @Test
    public void testSetDegree() {
        Education education = new Education();
        education.setDegree("Degree");
        assertEquals("Degree", education.getDegree());
    }

    @Test
    public void testSetInstitution() {
        Education education = new Education();
        education.setInstitution("Institution");
        assertEquals("Institution", education.getInstitution());
    }

    @Test
    public void testSetMajor() {
        Education education = new Education();
        education.setMajor("Major");
        assertEquals("Major", education.getMajor());
    }

    @Test
    public void testSetDate() {
        Date date = new Date(1L);
        Education education = new Education();
        education.setDate(date);
        assertSame(date, education.getDate());
    }
}

