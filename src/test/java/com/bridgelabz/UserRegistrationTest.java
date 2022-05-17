package com.bridgelabz;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    Function<List<String>, List<Boolean>> firstNameTestCases = cases -> cases.stream().map(x -> {
        try {
            return userRegistration.firstNameValidate.userEntries(x);
        } catch (InvalidUserInputException e) {
            // TODO Auto-generated catch block

        }
        return false;
    }).collect(Collectors.toList());

    Function<List<String>, List<Boolean>> lastNameTestCases = cases -> cases.stream().map(x -> {
        try {
            return userRegistration.lastNameValidate.userEntries(x);
        } catch (InvalidUserInputException e) {
            // TODO Auto-generated catch block

        }
        return false;
    }).collect(Collectors.toList());

    Function<List<String>, List<Boolean>> emailTestCases = cases -> cases.stream().map(x -> {
        try {
            return userRegistration.emailValidate.userEntries(x);
        } catch (InvalidUserInputException e) {
            // TODO Auto-generated catch block

        }
        return false;
    }).collect(Collectors.toList());

    Function<List<String>, List<Boolean>> phoneTestCases = cases -> cases.stream().map(x -> {
        try {
            return userRegistration.phoneNumberValidate.userEntries(x);
        } catch (InvalidUserInputException e) {
            // TODO Auto-generated catch block

        }
        return false;
    }).collect(Collectors.toList());

    Function<List<String>, List<Boolean>> passwordTestCases = cases -> cases.stream().map(x -> {
        try {
            return userRegistration.passwordValidate.userEntries(x);
        } catch (InvalidUserInputException e) {
            // TODO Auto-generated catch block

        }
        return false;
    }).collect(Collectors.toList());

    @Test
    public void test_firstName_Cases() {
        List<Boolean> result = firstNameTestCases.apply(Arrays.asList("Manali", "Nilofar", "Nikita", "Neha", "sdfs"));
        List<Boolean> expected = Arrays.asList(true, true, true, true, false);
        assertEquals(expected, result);
    }

    @Test
    public void test_lastName_Cases() {
        List<Boolean> result = lastNameTestCases.apply(Arrays.asList("Patil", "Mujawar", "Chougule", "Chougule", "dvsd"));
        List<Boolean> expected = Arrays.asList(true, true, true, true, false);
        assertEquals(expected, result);
    }

    @Test
    public void test_email_Cases() {
        List<Boolean> result = emailTestCases.apply(Arrays.asList("abc@1.com", "abc@2.com", "abc@3.com", "abc@4.com", "sdvs@"));
        List<Boolean> expected = Arrays.asList(true, true, true, true, false);
        assertEquals(expected, result);
    }

    @Test
    public void test_phoneNumber_Cases() {
        List<Boolean> result = phoneTestCases.apply(Arrays.asList("91 7062567839", "91 7442345628", "91 8180908638", "91 9657475623", "2354453454"));
        List<Boolean> expected = Arrays.asList(true, true, true, true, false);
        assertEquals(expected, result);
    }

    @Test
    public void test_password_Cases() {
        List<Boolean> result = passwordTestCases.apply(Arrays.asList("Manali@2017", "Nilofar@2017", "Nikita@2017", "Neha@2017", "sdfs@2017"));
        List<Boolean> expected = Arrays.asList(true, true, true, true, false);
        assertEquals(expected, result);
    }

}