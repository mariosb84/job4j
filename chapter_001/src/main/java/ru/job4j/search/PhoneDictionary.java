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
        ArrayList<Person> result = new ArrayList<Person>();
        for (Person value : this.persons) {
            if (value.getName().contains(key)
                    || value.getSurname().contains(key)
                    || value.getAddress().contains(key)
                    || value.getPhone().contains(key)) {
                result.add(value);
            }
        }
return result;
    }
    public ArrayList<Person> findSecond(String key) {
        Predicate<Person> name = Person  -> Person.getName().contains(key);
        Predicate<Person> surName = Person  -> Person.getSurname().contains(key);
        Predicate<Person> address = Person  -> Person.getAddress().contains(key);
        Predicate<Person> phone = Person  -> Person.getPhone().contains(key);
        Predicate<Person> combine = Person  -> name.test(Person) || surName.test(Person) || address.test(Person) || phone.test(Person);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }


}
