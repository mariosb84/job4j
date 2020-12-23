package ru.job4j.stream;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    List<Profile> profiles = List.of(
            new Profile(new Address("Moscow", "Leninskiy prospekt", 10, 135)),
            new Profile(new Address("Saint - Petersburg", "Nevskiy prospekt", 1, 14)),
            new Profile(new Address("Omsk", "Leninskiy prospekt", 98, 50))
    );
        @Test
        public void whenGetCityAddress() {
            Profiles profilesTest = new Profiles();
            List<Address> expected = new ArrayList<>();
            expected.add(new Address("Moscow", "Leninskiy prospekt", 10, 135));
            expected.add(new Address("Saint - Petersburg", "Nevskiy prospekt", 1, 14));
            expected.add(new Address("Omsk", "Leninskiy prospekt", 98, 50));
            assertThat(profilesTest.collect(profiles).get(0).getCity(), is(expected.get(0).getCity()));
        }
    @Test
    public void whenGetStreetAddress() {
        Profiles profilesTest = new Profiles();
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Moscow", "Leninskiy prospekt", 10, 135));
        expected.add(new Address("Saint - Petersburg", "Nevskiy prospekt", 1, 14));
        expected.add(new Address("Omsk", "Leninskiy prospekt", 98, 50));
        assertThat(profilesTest.collect(profiles).get(1).getStreet(), is(expected.get(1).getStreet()));
    }
    @Test
    public void whenGetHomeNumbAddress() {
        Profiles profilesTest = new Profiles();
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Moscow", "Leninskiy prospekt", 10, 135));
        expected.add(new Address("Saint - Petersburg", "Nevskiy prospekt", 1, 14));
        expected.add(new Address("Omsk", "Leninskiy prospekt", 98, 50));
        assertThat(profilesTest.collect(profiles).get(2).getHome(), is(expected.get(2).getHome()));
    }
    @Test
    public void whenGetApartmentNumbAddress() {
        Profiles profilesTest = new Profiles();
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Moscow", "Leninskiy prospekt", 10, 135));
        expected.add(new Address("Saint - Petersburg", "Nevskiy prospekt", 1, 14));
        expected.add(new Address("Omsk", "Leninskiy prospekt", 98, 50));
        assertThat(profilesTest.collect(profiles).get(0).getApartment(), is(expected.get(0).getApartment()));
    }
}
