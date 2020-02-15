package com.silversky.metronet.service;

public class DataService {

        public boolean isValid(String name, String funFact) {

                System.out.println("Validating name \"" + name + "\" funFact \"" + funFact + "\"");
                boolean isValid = true;
                if (name == null || "".equals(name)){
                        isValid = false;
                }
                if (funFact == null || "".equals(funFact)){
                        isValid = false;
                }

                return isValid;
        }
}
