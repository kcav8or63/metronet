package com.silversky.metronet.datavalidation;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.*;

public class DataValidationDemo {

    public static void main(String[] args) {
        ContactLoader loader = new ContactLoader();
        List<ContactLoaderResponse> responses;
        try {
            responses = loader.loadFile("C:\\Users\\kwham\\IdeaProjects\\MetroNet Developer Test\\src\\com\\silversky\\metronet\\datavalidation\\Web Developer Test.txt");
            Collections.sort(responses, new ResponseComparator());

            String validationStr;
            boolean emailInvalid, phoneInvalid;
            Map<String, Integer> cityMap = new HashMap<String, Integer>();
            String city;
            int errCount = 0;
            System.out.println("Contacts:");
            for (ContactLoaderResponse resp: responses){
                city = resp.getContact().getCityName();
                if (cityMap.containsKey(city)){
                    errCount = ((Integer) cityMap.get(city)).intValue() + 1;
                    cityMap.put(city, errCount);
                } else {
                    cityMap.put(city, 1);
                }

                emailInvalid = false;
                phoneInvalid = false;
                for (String error: resp.getErrors()){
                    if (error.contains("email")){
                        emailInvalid = true;
                    } else if (error.contains("phone")){
                        phoneInvalid = true;
                    }
                }
                if (emailInvalid){
                    if (phoneInvalid){
                        validationStr = "Email and Phone are invalid.";
                    } else {
                        validationStr = "Email is invalid.";
                    }
                } else {
                    if (phoneInvalid){
                        validationStr = "Phone is invalid.";
                    } else {
                        validationStr = "Valid";
                    }
                }
//                validationStr += " " + resp.getContact().getEmailAddress() + " " + resp.getContact().getPhoneNumber();
                System.out.println(resp.getContact().getFullName() + " " + validationStr);
            }

            System.out.println("\nCity validation errors:");
            List<CitySummary> cities = new ArrayList<CitySummary>();
            for (String cityName: cityMap.keySet()){
                cities.add(new CitySummary(cityName, cityMap.get(cityName)));
            }
            Collections.reverse(cities);

            for (CitySummary citySummary: cities){
                System.out.println(citySummary.getCityName() + ": " + citySummary.getErrorCount());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
