package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        //PhoneDictionary phones = new PhoneDictionary();                                                        // рефакторинг с var
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        //ArrayList<Person> persons = phones.find("Pe");                                                         // рефакторинг с var
        var persons = phones.find("Pe");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
    @Test
    public void whenFindBySurName() {
        //PhoneDictionary phones = new PhoneDictionary();                                                     // рефакторинг с var
       var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        //ArrayList<Person> persons = phones.find("Ar");                                                      // рефакторинг с var
       var persons = phones.find("Ar");
        assertThat(persons.get(0).getName(), is("Petr"));
    }
    @Test
    public void whenFindByPhone() {
       // PhoneDictionary phones = new PhoneDictionary();                                                     // рефакторинг с var
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        //ArrayList<Person> persons = phones.find("72");                                                      // рефакторинг с var
        var persons = phones.find("72");
        assertThat(persons.get(0).getAddress(), is("Bryansk"));
    }
    @Test
    public void whenFindByAdress() {
        //PhoneDictionary phones = new PhoneDictionary();                                                       // рефакторинг с var
        var phones  = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        //ArrayList<Person> persons = phones.find("Br");                                                       // рефакторинг с var
        var persons = phones.find("Br");
        assertThat(persons.get(0).getPhone(), is("534872"));
    }
    @Test
    public void whenFindByNameSecond() {
        //PhoneDictionary phones = new PhoneDictionary();                                                      // рефакторинг с var
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        //ArrayList<Person> persons = phones.findSecond("Petr");                                                    // рефакторинг с var
        var persons = phones.findSecond("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

}
