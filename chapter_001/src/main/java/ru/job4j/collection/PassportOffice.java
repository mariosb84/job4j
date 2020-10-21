package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        //Map.containsKey(key)  Map.get(key)
        for (Map.Entry<String, Citizen> entry : citizens.entrySet()) {
            String key = entry.getKey();
            Citizen value = entry.getValue();
            if (citizens.containsKey(key)) {
                citizens.put(citizen.getPassport(), citizen);
                rsl = true;
                break;
            }
        }
        return rsl;
    }


    public Citizen get(String passport) {

        return null;
    }
}
