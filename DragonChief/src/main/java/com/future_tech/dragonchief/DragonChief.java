package com.future_tech.dragonchief;

import android.widget.EditText;

public class DragonChief {
    public static boolean isEmpty(EditText editText) {
        return editText.getText().toString().isEmpty();
    }

    public static boolean isAnyEmpty(EditText[] editTexts) {
        for (EditText editText : editTexts) {
            if (editText.getText().toString().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEmail(String email) {
        return (email.contains("@") && (email.contains(".")) && email.length() >= 5);
    }

    public static boolean isEmail(EditText editText) {
        return isEmail(editText.getText().toString());
    }

    private static boolean isAlpha(String s) {
        return s.matches("^[a-zA-Z]*$");
    }

    public static boolean isName(String name) {
        return isAlpha(name);
    }

    public static boolean isName(EditText editText) {
        return isAlpha(editText.getText().toString());
    }
}
