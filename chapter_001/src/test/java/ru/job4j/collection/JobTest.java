package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenJobDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("d", 1),
                new Job("e", 4),
                new Job("f", 2)

        );
       // List<Job> expect = Arrays.asList(                                // меняем на  list.of
        List<Job> expect = List.of(
                new Job("f", 1),
                new Job("e", 4),
                new Job("d", 2)
        );
        Collections.sort(jobs, new JobDescByName());
        assertThat(jobs.get(0).getName(), is(expect.get(0).getName()));
        assertThat(jobs.get(1).getName(), is(expect.get(1).getName()));
        assertThat(jobs.get(2).getName(), is(expect.get(2).getName()));
    }
    @Test
    public void whenJobDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("d", 1),
                new Job("e", 4),
                new Job("f", 2)

        );
        //List<Job> expect = Arrays.asList(                              // меняем на  list.of
                List<Job> expect = List.of(
                new Job("e", 4),
                new Job("f", 2),
                new Job("d", 1)
        );
        Collections.sort(jobs, new JobDescByPriority());
        assertThat(jobs.get(0).getName(), is(expect.get(0).getName()));
        assertThat(jobs.get(1).getName(), is(expect.get(1).getName()));
        assertThat(jobs.get(2).getName(), is(expect.get(2).getName()));
    }
    @Test
    public void whenJobDescByNameUp() {
        List<Job> jobs = Arrays.asList(
                new Job("e", 1),
                new Job("d", 4),
                new Job("f", 2)

        );
        //List<Job> expect = Arrays.asList(                                    // меняем на  list.of
                List<Job> expect = List.of(
                new Job("d", 1),
                new Job("e", 4),
                new Job("f", 2)
        );
        Collections.sort(jobs, new JobDescByNameUp());
        assertThat(jobs.get(0).getName(), is(expect.get(0).getName()));
        assertThat(jobs.get(1).getName(), is(expect.get(1).getName()));
        assertThat(jobs.get(2).getName(), is(expect.get(2).getName()));
    }
    @Test
    public void whenJobDescByPriorityUp() {
        List<Job> jobs = Arrays.asList(
                new Job("d", 1),
                new Job("e", 4),
                new Job("f", 2)

        );
        //List<Job> expect = Arrays.asList(                                     // меняем на  list.of
        List<Job> expect = List.of(
                new Job("d", 1),
                new Job("f", 2),
                new Job("e", 4)
        );
        Collections.sort(jobs, new JobDescByPriorityUp());
        assertThat(jobs.get(0).getName(), is(expect.get(0).getName()));
        assertThat(jobs.get(1).getName(), is(expect.get(1).getName()));
        assertThat(jobs.get(2).getName(), is(expect.get(2).getName()));
    }
    @Test
    public void whenCompatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("f", 0),
                new Job("f", 1)
        );
        assertThat(rsl, is(1));
    }
    @Test
    public void whenCompatorByPriorityAndName() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("f", 3),
                new Job("d", 3)
        );
        assertThat(rsl, is(-2));
    }
    @Test
    public void whenCompatorByPriorityUpAndNameUp() {
        Comparator<Job> cmpNamePriority = new JobDescByPriorityUp().thenComparing(new JobDescByNameUp());
        int rsl = cmpNamePriority.compare(
                new Job("f", 4),
                new Job("d", 4)
        );
        assertThat(rsl, is(2));
    }
    @Test
    public void whenCompatorByNameUpAndPriorityUp() {
        Comparator<Job> cmpNamePriority = new JobDescByNameUp().thenComparing(new JobDescByPriorityUp());
        int rsl = cmpNamePriority.compare(
                new Job("a", 4),
                new Job("a", 2)
        );
        assertThat(rsl, is(1));
    }
}

