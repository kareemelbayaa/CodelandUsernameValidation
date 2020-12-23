package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static String CodelandUsernameValidation(String str) {
        // code goes here
        if (str.length() < 4 || str.length() > 25) {
            return "false";
        } else if (!Character.isLetter(str.charAt(0))) {
            return "false";
        } else if (str.endsWith("_")) {
            return "false";
        } else if (!Pattern.matches("^[a-zA-Z0-9_]*$", str)) {
            return "false";
        } else {
            return "true";
        }
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println(CodelandUsernameValidation(s.nextLine()));
        }
    }
}
