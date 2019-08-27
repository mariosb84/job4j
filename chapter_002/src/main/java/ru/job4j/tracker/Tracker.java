package ru.job4j.tracker;

import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
    /**
     * Replace an existing item with a new one while keeping the original ID.
     *
     * @param id   unique identifier of the item to be replaced.
     * @param item replacement item.
     * @return <tt>true</tt> if this tracker contained the specified item.
     */
    public boolean replace(String id, Item item) {
        boolean replaced = false;
        Item result = null;
        for (Item item1 : this.items) {
            if (item1 != null && item1.getId().equals(id)) {
                result = item1;
                item.setId(item1.getId());
                replaced = true;
                break;
            }
        }

            return replaced;
        }


    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
    public Item [] getAll () {
        Item [] result = new Item [this.position];
        for (int index = 0; index != this.position;index++) {
            result[index] = this.items[index];
        }
        return  result;
    }
}