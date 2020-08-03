package ru.job4j.tracker;

public class Item {

    private String id;
    private String name;

    public Item() {
    }
    public Item(String idOne) {
        this.id = idOne;
    }
    public Item(String idTwo, String nameTwo) {
        this.id = idTwo;
        this.name = nameTwo;
    }

}
