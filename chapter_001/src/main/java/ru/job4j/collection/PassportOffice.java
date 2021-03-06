package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }


    /*public Citizen get(String passport) {
        for (String key : citizens.keySet()) {
            Citizen value = citizens.get(key);
           if (value.getPassport().equals(passport)) {
               return value;
           }
        }
        return null;
    }*/
    public Citizen get(String passport) {
            return citizens.get(passport);
    }
}
