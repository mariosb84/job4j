package ru.job4j.stream;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {

    private List<Integer> of;
    private Function<Integer, Integer> map;
    private Predicate<Integer> filter;

    public EasyStream(List<Integer> of, Function<Integer, Integer> map, Predicate<Integer> filter) {
        this.of = of;
        this.map = map;
        this.filter = filter;
    }

    public static EasyStream of(List<Integer> source) {

        return new Builder().build();
        //throw new UnsupportedOperationException();

    }

    public EasyStream map(Function<Integer, Integer> fun) {
       // throw new UnsupportedOperationException();
        this.map = fun;
        return new EasyStream.Builder().build();
    }

    public EasyStream filter(Predicate<Integer> fun) {
        this.filter = fun;
        //throw new UnsupportedOperationException();
        return new EasyStream.Builder().build();
    }

    public List<Integer> collect() {
        throw new UnsupportedOperationException();


    }

    static class Builder {

        private List<Integer> of;
        private Function<Integer, Integer> map;
        private Predicate<Integer> filter;

        EasyStream.Builder buildOf(List<Integer> of) {
            this.of = of;
            return this;
        }
        EasyStream.Builder buildMap(Function<Integer, Integer> map) {
            this.map = map;
            return this;
        }
        EasyStream.Builder buildFilter(Predicate<Integer> filter) {
            this.filter = filter;
            return this;
        }

        EasyStream build() {
            EasyStream easyStream = new EasyStream(of, map, filter);
            easyStream.of = of;
            easyStream.map = map;
            easyStream.filter = filter;
            return easyStream;
        }
    }
    public static void main(String[] args) {
        EasyStream easyStream = new Builder()
                .buildOf(List.of(1, 2, 3))
                .buildMap(e -> e * 2)
                .buildFilter(e -> e == 2)
                .build();
        System.out.println(easyStream);
    }
}