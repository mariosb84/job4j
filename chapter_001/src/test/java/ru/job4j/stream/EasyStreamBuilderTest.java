package ru.job4j.stream;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import java.util.List;

public class EasyStreamBuilderTest {

    @Test
    public void whenEmptySource() {
        var rsl = EasyStreamBuilder.ofBuild(List.of()).collectBuild();
        assertThat(rsl, is(List.of()));
    }

    @Test
    public void whenFilledSource() {
        var rsl = EasyStreamBuilder.ofBuild(List.of(1, 2, 3))
                .collectBuild();
        assertThat(rsl, is(List.of(1, 2, 3)));
    }

    @Test
    public void whenFilteredSource() {
        var rsl = EasyStreamBuilder.ofBuild(List.of(1, 2, 3))
                .filterBuild(e -> e == 2)
                .collectBuild();
        assertThat(rsl, is(List.of(2)));
    }

    @Test
    public void whenMappedSource() {
        var rsl = EasyStreamBuilder.ofBuild(List.of(1, 2, 3))
                .mapBuild(e -> e * 2)
                .collectBuild();
        assertThat(rsl, is(List.of(2, 4, 6)));
    }

    @Test
    public void whenFilteredMappedSource() {
        var rsl = EasyStreamBuilder.ofBuild(List.of(1, 2, 3))
                .filterBuild(e -> e == 2)
                .mapBuild(e -> e * 2)
                .collectBuild();
        assertThat(rsl, is(List.of(4)));
    }

    @Test
    public void whenMappedFilteredSource() {
        var rsl = EasyStreamBuilder.ofBuild(List.of(1, 2, 3))
                .mapBuild(e -> e * 2)
                .filterBuild(e -> e == 2)
                .collectBuild();
        //assertThat(rsl, is(List.of(4)));
        assertThat(rsl, is(List.of(2)));
    }

    @Test
    public void whenMultiFilterSource() {
        var rsl = EasyStreamBuilder.ofBuild(List.of(1, 2, 3, 4, 5))
                .filterBuild(e -> e >= 2)
                .filterBuild(e -> e <= 4)
                .collectBuild();
        assertThat(rsl, is(List.of(2, 3, 4)));
    }
}
