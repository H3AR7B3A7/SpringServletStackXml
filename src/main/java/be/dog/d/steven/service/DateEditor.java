package be.dog.d.steven.service;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy");
        try {
            Date dataParam = sdf.parse(text);
            setValue(dataParam);
        } catch (ParseException e) {
            setValue(new Date());
        }
    }

    @Override
    public String getAsText() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy");
        String bdayFmt = sdf.format(new Date());
//        return bdayFmt;
        return "";
    }

}
