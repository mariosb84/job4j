package ru.job4j.collection;

import java.time.LocalDateTime;
import java.util.Objects;

public class Item implements Comparable<Item> {
    private int id;
    private String name;
    private LocalDateTime  created = LocalDateTime.now();

    @Override
    public String toString() {
        return "Item{"
                +
                "id=" + id
                +
                ", name='" + name + '\''
                + '}';
    }
    public LocalDateTime getTime() {
        return created;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }



    @Override
    public int compareTo(Item another) {
        return Integer.compare(id, another.id);
    }
}