package ru.job4j.ex;

public class FindEl  {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
            if (rsl == -1) {
                throw new ElementNotFoundException("Element not found");
            }
            return rsl;
        }

    public static void main(String[] args) {
        try {
            FindEl findEl = new FindEl();
            System.out.println(findEl.indexOf(new String[]{"123", "234", "345"}, "345"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
