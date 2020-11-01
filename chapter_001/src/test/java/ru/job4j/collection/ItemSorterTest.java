package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemSorterTest {
    @Test
    public void whenFwdSortToId() {
        List<Item> items1 = Arrays.asList(
                new Item(3, "f"),
                new Item(2, "e"),
                new Item(1, "d")
        );
        List<Item> expect = Arrays.asList(
                new Item(1, "d"),
                new Item(2, "e"),
                new Item(3, "f")
        );
        Collections.sort(items1);
        assertThat(items1.get(0).getId(), is(expect.get(0).getId()));
        assertThat(items1.get(1).getId(), is(expect.get(1).getId()));
        assertThat(items1.get(2).getId(), is(expect.get(2).getId()));
    }
    @Test
    public void whenRevSortToId() {
        List<Item> items1 = Arrays.asList(
                new Item(1, "d"),
                new Item(2, "e"),
                new Item(3, "f")
        );
        List<Item> expect = Arrays.asList(
                new Item(3, "f"),
                new Item(2, "e"),
                new Item(1, "d")
        );
        Collections.sort(items1, Collections.reverseOrder());
        assertThat(items1.get(0).getId(), is(expect.get(0).getId()));
        assertThat(items1.get(1).getId(), is(expect.get(1).getId()));
        assertThat(items1.get(2).getId(), is(expect.get(2).getId()));
    }
    @Test
    public void whenFwdSortToName() {
        List<Item> items1 = Arrays.asList(
                new Item(3, "f"),
                new Item(2, "e"),
                new Item(1, "d")
        );
        List<Item> expect = Arrays.asList(
                new Item(1, "d"),
                new Item(2, "e"),
                new Item(3, "f")
        );
        Collections.sort(items1, new SortByNameItem());
        assertThat(items1.get(0).getName(), is(expect.get(0).getName()));
        assertThat(items1.get(1).getName(), is(expect.get(1).getName()));
        assertThat(items1.get(2).getName(), is(expect.get(2).getName()));
    }
    @Test
    public void whenRevSortToName() {
        List<Item> items1 = Arrays.asList(
                new Item(1, "d"),
                new Item(2, "e"),
                new Item(3, "f")
        );
        List<Item> expect = Arrays.asList(
                new Item(3, "f"),
                new Item(2, "e"),
                new Item(1, "d")
        );
        Collections.sort(items1, new SortByNameItem().reversed());
        assertThat(items1.get(0).getName(), is(expect.get(0).getName()));
        assertThat(items1.get(1).getName(), is(expect.get(1).getName()));
        assertThat(items1.get(2).getName(), is(expect.get(2).getName()));
    }
}
