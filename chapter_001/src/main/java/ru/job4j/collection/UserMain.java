package ru.job4j.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UserMain {
    public static void main(String[] args) {
      // Set<User> users = new TreeSet<>(Collections.reverseOrder());
        Set<User> users = new TreeSet<>();
       users.add(new User("Ivan", 31));
        users.add(new User("Ivan", 32));
        users.add(new User("Ivan", 33));
        System.out.println(users);


    }
}
