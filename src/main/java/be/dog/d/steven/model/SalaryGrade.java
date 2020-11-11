package be.dog.d.steven.model;

import java.util.Date;

public class SalaryGrade {
    private String grade;
    private Double rate;
    private Date date;

    public SalaryGrade(){
        date = new Date();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
