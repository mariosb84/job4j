package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        //ArrayList<Person> result = new ArrayList<Person>();                   // рефакторинг с var
        var list = new ArrayList<Person>();
        //for (Person value : this.persons) {                                    // рефакторинг с var
        for (var value : this.persons) {
            if (value.getName().contains(key)
                    || value.getSurname().contains(key)
                    || value.getAddress().contains(key)
                    || value.getPhone().contains(key)) {
                //result.add(value);                                               // рефакторинг с var
                list.add(value);
            }
        }
//return result;                                                                   // рефакторинг с var
        return list;
    }
    public ArrayList<Person> findSecond(String key) {
        Predicate<Person> name = Person  -> Person.getName().contains(key);
        Predicate<Person> surName = Person  -> Person.getSurname().contains(key);
        Predicate<Person> address = Person  -> Person.getAddress().contains(key);
        Predicate<Person> phone = Person  -> Person.getPhone().contains(key);
        //Predicate<Person> combine = Person  -> name.test(Person) || surName.test(Person) || address.test(Person) || phone.test(Person);
        Predicate<Person> combine = name.or(surName).or(address).or(phone);
        //ArrayList<Person> result = new ArrayList<>();                         // рефакторинг с var
        var result = new ArrayList<Person>();
        //for (Person person : persons) {                                       // рефакторинг с var
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }


}
