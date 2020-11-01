package ru.job4j.collection;
import java.util.Objects;

public class Item implements Comparable<Item> {
    private int id;
    private String name;
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{"
                +
                "id=" + id
                +
                ", name='" + name + '\''
                + '}';
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
    public int compareTo(Item another) {
        return Integer.compare(id, another.id);
    }
}