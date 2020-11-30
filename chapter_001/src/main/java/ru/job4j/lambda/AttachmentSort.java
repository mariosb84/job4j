package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 001", 100),
                new Attachment("image 010", 34),
                new Attachment("image 100", 13)
        );
        Comparator comparator =  new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);
        // Здесь создайте компаратор на основании анонимного класса.
        System.out.println();
        Comparator comparatorName =  new Comparator() {
            @Override
            public int compare(Object o3, Object o4) {
                Attachment leftName = (Attachment) o3;
                Attachment rightName = (Attachment) o4;
                return leftName.getName().compareTo(rightName.getName());
            }
        };
        attachments.sort(comparatorName);
        System.out.println(attachments);
    }
}
