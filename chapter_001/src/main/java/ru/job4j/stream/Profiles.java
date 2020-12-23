package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public  class Profiles {
    List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
        .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Profile> profiles = List.of(
                new Profile(new Address("Moscow", "Leninskiy prospekt", 10, 135)),
                new Profile(new Address("Saint - Petersburg", "Nevskiy prospekt", 1, 14)),
                new Profile(new Address("Omsk", "Leninskiy prospekt", 98, 50))
        );
        Profiles profiles1 = new Profiles();
        System.out.println(profiles1.collect(profiles));
    }
}
