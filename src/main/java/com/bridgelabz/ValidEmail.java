package com.bridgelabz;

import java.util.regex.Pattern;

public class ValidEmail {
    public boolean validateEmail(String email) {
        return Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
    }
}