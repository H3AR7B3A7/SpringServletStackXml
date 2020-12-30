package be.dog.d.steven.model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class SalaryGradeTest {
    @Test
    public void testConstructor() {
        SalaryGrade actualSalaryGrade = new SalaryGrade();
        assertNull(actualSalaryGrade.getGrade());
        assertNull(actualSalaryGrade.getRate());
    }

    @Test
    public void testSetGrade() {
        SalaryGrade salaryGrade = new SalaryGrade();
        salaryGrade.setGrade("Grade");
        assertEquals("Grade", salaryGrade.getGrade());
    }

    @Test
    public void testSetRate() {
        SalaryGrade salaryGrade = new SalaryGrade();
        salaryGrade.setRate(10.0);
        assertEquals(10.0, salaryGrade.getRate().doubleValue());
    }

    @Test
    public void testSetDate() {
        Date date = new Date(1L);
        SalaryGrade salaryGrade = new SalaryGrade();
        salaryGrade.setDate(date);
        assertSame(date, salaryGrade.getDate());
    }
}

