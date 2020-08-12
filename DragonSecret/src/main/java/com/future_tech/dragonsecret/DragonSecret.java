package com.future_tech.dragonsecret;

import android.widget.EditText;

public class DragonSecret {
    private String password;

    private int minLen = 8;
    private int maxLen = 30;

    public DragonSecret(String password, int minLen, int maxLen) {
        this.password = password;
        this.minLen = minLen;
        this.maxLen = maxLen;
    }

    public DragonSecret(EditText password, int minLen, int maxLen) {
        this.password = password.getText().toString();
        this.minLen = minLen;
        this.maxLen = maxLen;
    }

    public boolean isPassword(int minLen, int maxLen) {
        return password.length() >= minLen && password.length() <= maxLen;
    }

    public boolean isPassword() {
        return isPassword(minLen, maxLen);
    }

    public boolean isTooShort() {
        return password.length() < minLen;
    }

    public boolean isTooLong() {
        return password.length() > maxLen;
    }
}
