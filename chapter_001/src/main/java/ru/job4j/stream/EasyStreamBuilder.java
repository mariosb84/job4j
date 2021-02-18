package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStreamBuilder {

    private List<Integer> of;
    // private Function<Integer, Integer> map;
   // private Predicate<Integer> filter;

    private EasyStreamBuilder() {

    }

    private EasyStreamBuilder(List<Integer> of/*, Function<Integer, Integer> map, Predicate<Integer> filter*/)
    {
        this.of = of;
       // this.map = map;
       // this.filter = filter;
    }

    public static EasyStreamBuilder ofBuild(List<Integer> source) {
        return new Builder().buildOf(source).build();
        //throw new UnsupportedOperationException();
    }

    public EasyStreamBuilder mapBuild(Function<Integer, Integer> fun) {
        List<Integer> rsl = new ArrayList<>();
        for (Integer i : of) {
            i = fun.apply(i);
            rsl.add(i);
        }
        return new Builder().buildOf(rsl)./*buildMap(fun).*/build();
        // throw new UnsupportedOperationException();
    }

    public EasyStreamBuilder filterBuild(Predicate<Integer> fun) {
        List<Integer> rsl = new ArrayList<>();
        for (Integer i : of) {
            if (fun.test(i)) {
                rsl.add(i);
            }
        }
        return new Builder().buildOf(rsl)./*buildFilter(fun).*/build();
        // throw new UnsupportedOperationException();
    }

    public List<Integer> collectBuild() {
        return of;
        // throw new UnsupportedOperationException();


    }

    static class Builder {

        private List<Integer> of;
        //private Function<Integer, Integer> map;
        //private Predicate<Integer> filter;

        EasyStreamBuilder.Builder buildOf(List<Integer> of) {
            this.of = of;
            return this;
        }
       /* EasyStreamBuilder.Builder buildMap(Function<Integer, Integer> map) {
            this.map = map;
            return this;
        }
        EasyStreamBuilder.Builder buildFilter(Predicate<Integer> filter) {
            this.filter = filter;
            return this;
        }*/

        EasyStreamBuilder build() {
            EasyStreamBuilder easyStreamBuilder = new EasyStreamBuilder(of/*, map, filter*/);
            easyStreamBuilder.of = of;
           // easyStreamBuilder.map = map;
           // easyStreamBuilder.filter = filter;
            return easyStreamBuilder;
        }
    }
}
