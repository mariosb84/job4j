package ru.job4j.stream;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EasyStream {

    private List<Integer>  source;
    private Function<Integer, Integer> fun;
    private Predicate<Integer> fun2;

    public EasyStream(List<Integer> source, Function<Integer, Integer> fun, Predicate<Integer> fun2) {
      this.source = source;
      this.fun = fun;
      this.fun2 = fun2;
    }

    public static EasyStream of(List<Integer> source) {
        throw new UnsupportedOperationException();

    }

    public EasyStream map(Function<Integer, Integer> fun) {
        throw new UnsupportedOperationException();
    }

    public EasyStream filter(Predicate<Integer> fun) {
        throw new UnsupportedOperationException();
    }

    public List<Integer> collect() {
        throw new UnsupportedOperationException();
    }

    static class Builder {

        private List<Integer>  source;
        private Function<Integer, Integer> fun;
        private Predicate<Integer> fun2;

        EasyStream.Builder buildSource(List<Integer>  source) {
            this.source = source;
            return this;
        }
        EasyStream.Builder buildFun(Function<Integer, Integer> fun) {
            this.fun = fun;
            return this;
        }
        EasyStream.Builder buildFun2(Predicate<Integer> fun2) {
            this.fun2 = fun2;
            return this;
        }

        EasyStream build() {
            EasyStream easyStream = new EasyStream(source, fun, fun2);
            easyStream.source = source;
            easyStream.fun = fun;
            easyStream.fun2 = fun2;
            return easyStream;
        }
    }
    public static void main(String[] args) {
        EasyStream easyStream = new Builder()
                .buildSource(List.of(1, 2, 3))
                .buildFun(e -> e * 2)
                .buildFun2(e -> e == 2)
                .build();
        System.out.println(easyStream);
    }
}