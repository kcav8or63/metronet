package com.silversky.metronet.datavalidation;

import java.util.ArrayList;
import java.util.List;

public class ContactLoaderResponse {
    private Contact contact;
    private List<String> errors;

    public ContactLoaderResponse() {
    }

    public ContactLoaderResponse(Contact contact, List<String> errors) {
        this.contact = contact;
        this.errors = errors;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<String> getErrors() {
        if (errors == null){
            errors = new ArrayList<String>();
        }
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "ContactLoaderResponse{" +
                "contact=" + contact +
                ", errors=" + errors +
                '}';
    }
}
