package com.silversky.metronet.regex;

import javafx.css.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
        String str = "2014-08-18T13:03:25Z";
        System.out.println("Parsing \"" + str + "\"");
        System.out.println("Date = \"" + extractDate(str) + "\"");
        System.out.println("Time = \"" + extractTime(str) + "\"");

        str = "2014/08/18T13:03:25Z";
        System.out.println("Parsing \"" + str + "\"");
        System.out.println("Date = \"" + extractDate(str) + "\"");
        System.out.println("Time = \"" + extractTime(str) + "\"");

        str = "2014-08-18";
        System.out.println("Parsing \"" + str + "\"");
        System.out.println("Date = \"" + extractDate(str) + "\"");
        System.out.println("Time = \"" + extractTime(str) + "\"");

        str = "2014/08/18";
        System.out.println("Parsing \"" + str + "\"");
        System.out.println("Date = \"" + extractDate(str) + "\"");
        System.out.println("Time = \"" + extractTime(str) + "\"");
    }

    public static String extractDate(String str) {
        String regEx =  "\\d{4}[-.\\/]\\d{2}[-.\\/]\\d{2}";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);
        String result = "";
        if (matcher.find()) {
            result = matcher.group();
        }

        return result;
    }

    public static String extractTime(String str) {
        String regEx =  "\\d{2}:\\d{2}:\\d{2}";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);
        String result = "";
        if (matcher.find()) {
            result = matcher.group();
        }

        return result;
    }
}
