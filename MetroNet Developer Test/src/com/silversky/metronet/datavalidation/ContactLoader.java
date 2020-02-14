package com.silversky.metronet.datavalidation;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ContactLoader {
    public ContactLoader() {
    }

    public List<ContactLoaderResponse> loadFile(String filename) throws IOException, ParseException {

        JSONArray ja = (JSONArray) new JSONParser().parse(new FileReader(filename));
//        System.out.println("JSONArray = " + ja);

        JSONObject jo;
        Contact contact;
        List<String> errors;
        ContactLoaderResponse resp;
        List<ContactLoaderResponse> responses = new ArrayList<ContactLoaderResponse>();
        for (Object obj: ja) {
            jo = (JSONObject) obj;

            String fullName = (String) jo.get("fullName");
            String cityName = (String) jo.get("cityName");
            String phoneNumber = (String) jo.get("phoneNumber");
            String emailAddress = (String) jo.get("emailAddress");

            contact = new Contact(fullName, cityName, phoneNumber, emailAddress);
            errors = validateContact(contact);
            resp = new ContactLoaderResponse(contact, errors);
            responses.add(resp);

//            System.out.println("Contact = " + contact + " errors = " + errors);
        }

        return responses;
    }

    public List<String> validateContact(Contact contact){
        List<String> errors = new ArrayList<String>();
        if (!isValidEmail(contact.getEmailAddress())){
            errors.add("email");
        }
        if (!isValidPhone(contact.getPhoneNumber())){
            errors.add("phone");
        }

        return errors;
    }

    /**
     * Email field: has exactly one @ symbol with data on each side
     * @param email
     * @return
     */
    public boolean isValidEmail(String email){
        int idx = email.indexOf("@");
        boolean isValid = idx > 0 && idx < (email.length() - 1);
        return isValid;
    }

    /**
     * Phone field: is numeric with only digits, dashes, and spaces allowed
     * @param phone
     * @return
     */
    public boolean isValidPhone(String phone){
        String regEx = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        boolean isValid = phone.matches(regEx);
        return isValid;
    }
}
