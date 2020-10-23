package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        for (String key : citizens.keySet()) {
        if (citizens.containsKey(key)) {
        citizens.put(citizen.getPassport(), citizen);
        rsl = true;
        break;
    }
}
        return rsl;
    }


    public Citizen get(String passport) {
        for (String key : citizens.keySet()) {
           Citizen citizen = citizens.get(key);
            if (citizen.getPassport().equals(passport)) {
                return new Citizen(citizen.getPassport(), citizen.getUsername());
            }
        }
        return null;
    }
    // Map.containsKey(key) и Map.get(key)

    public static void main(String[] args) {
        Map<String, Citizen> citizens2 = new HashMap<>();
        PassportOffice passportOffice = new PassportOffice();
        Citizen citizen = new Citizen("12345", "abc");
        citizens2.put(citizen.getPassport(), citizen);
       System.out.println(passportOffice.add(citizen));
        System.out.println(passportOffice.get(citizen.getPassport()));
        System.out.println(citizen.getPassport());
        System.out.println(citizen.getUsername());
    }
}
