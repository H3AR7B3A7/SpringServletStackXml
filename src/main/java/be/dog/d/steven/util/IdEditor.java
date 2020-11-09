package be.dog.d.steven.util;

import java.beans.PropertyEditorSupport;

public class IdEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        try {
            int id = Integer.parseInt(text);
            setValue(id);
        } catch (NumberFormatException e) {
            setValue(0);
        }
    }

    @Override
    public String getAsText() {
//        return super.getAsText();
        return "";
    }
}
