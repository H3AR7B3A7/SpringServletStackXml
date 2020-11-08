package be.dog.d.steven.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeeForm {
    @Size(min = 2, max = 30)
    private String first;
    @Size(min = 2, max = 30)
    private String last;
    @Size(min = 5,max = 100)
    @NotNull
    private String position;
    @Email(message = "Must be a email format.") // Hardcoding messages while possible, is bad practice, see: 'errors'
    @NotEmpty
    private String email;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
