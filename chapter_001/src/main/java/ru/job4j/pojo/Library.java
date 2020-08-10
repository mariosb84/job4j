package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
Book bookOne = new Book("Clean code", 356);
Book bookTwo = new Book("Book two", 570);
Book bookThree = new Book("Book three", 982);
Book bookFour = new Book("Book four", 116);
Book[] bookFive = new Book[4];
bookFive[0] = bookOne;
bookFive[1] = bookTwo;
bookFive[2] = bookThree;
bookFive[3] = bookFour;
for (int i = 0; i < bookFive.length; i++) {
    System.out.println("Book name is : " + bookFive[i].getName() + ", "
            + "Page number is : " +  bookFive[i].getPageCount());
}
        System.out.println();
        System.out.println("Replace [0] and [3]");
bookFive[0] = bookFour;
bookFive[3] = bookOne;
        for (int i = 0; i < bookFive.length; i++) {
            System.out.println("Book name is : " + bookFive[i].getName() + ", "
                    + "Page number is : " +  bookFive[i].getPageCount());
        }
        System.out.println();
        System.out.println("Print name : \" Clean code \"");
        for (int i = 0; i < bookFive.length; i++) {
            if (bookFive[i].equals(bookOne.getName())) {
                System.out.println("Book name is : " + bookFive[i].getName() + ", "
                        + "Page number is : " + bookFive[i].getPageCount());
            }
        }
    }
}
