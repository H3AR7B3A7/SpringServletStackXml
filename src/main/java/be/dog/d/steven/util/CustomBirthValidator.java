package be.dog.d.steven.util;

import be.dog.d.steven.model.BirthForm;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.Calendar;

public class CustomBirthValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(BirthForm.class);
    }

    @Override
    public void validate(Object model, Errors errors) {
        BirthForm birthForm = (BirthForm) model;
        if(birthForm.getId() < 0) errors.rejectValue("id", "negative.id");
        if(birthForm.getId().toString().length() != 11) errors.rejectValue("id", "size.id");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "first", "empty.first");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "last", "empty.last");
        if(birthForm.getBirthDate().before(Calendar.getInstance().getTime())) errors.rejectValue("birthDate", "born.birthDate");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "birthPlace", "empty.birthPlace");
    }

}
