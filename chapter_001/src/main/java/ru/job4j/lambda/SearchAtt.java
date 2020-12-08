package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list) {
            Function<Attachment, Attachment> func = new Function<Attachment, Attachment>() {
            @Override
            public Attachment apply(Attachment attachment) {
                if (attachment.getSize() > 100) {
                    return attachment;
                } else {
                    return null;
                }
            }
        };

        return filter(list, func);
    }
    public static List<Attachment> filterName(List<Attachment> list) {
        Function<Attachment, Attachment> func = new Function<Attachment, Attachment>() {
            @Override
            public Attachment apply(Attachment attachment) {
                if (attachment.getName().contains("bug")) {
                    return attachment;
                } else {
                    return null;
                }
            }
        };
        return filter(list, func);
    }
    private static List<Attachment>  filter(List<Attachment> attachments, Function<Attachment, Attachment> func) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : attachments) {
            if (att.equals(func.apply(att))) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Attachment> listTest = Arrays.asList(
                new Attachment("image 001", 101),
                new Attachment("image bug", 34),
                new Attachment("bug 100", 135)
        );
        System.out.println("filterSize :");
        System.out.println(filterSize(listTest));
        System.out.println();
        System.out.println("filterName :");
        System.out.println(filterName(listTest));

    }

}


