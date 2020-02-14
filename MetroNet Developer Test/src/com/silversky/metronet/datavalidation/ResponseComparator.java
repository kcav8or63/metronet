package com.silversky.metronet.datavalidation;

import java.util.Comparator;

public class ResponseComparator implements Comparator<ContactLoaderResponse> {
    public int compare(ContactLoaderResponse r, ContactLoaderResponse r1) {
        return r.getContact().getFullName().compareTo(r1.getContact().getFullName());
    }
}
