package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
               // new Job("Fix bug", 1),
               // new Job("Fix bug", 4),
                new Job("d", 2),
                new Job("f", 0)
        );
       /* Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        System.out.println();
        Comparator<Job> comb = new JobDescByName()
                .thenComparing(new JobDescByPriority())
                .thenComparing(new JobDescByNameLn());
        Collections.sort(jobs, comb);
        System.out.println(jobs);
        System.out.println();*/
        Collections.sort(jobs, new JobDescByPriorityUp().thenComparing(new JobDescByNameUp()));
        Comparator<Job> cmpNamePriority2 = new JobDescByPriorityUp().thenComparing(new JobDescByNameUp());
        int rsl = cmpNamePriority2.compare(
                new Job("f", 2),
                new Job("a", 2)
        );
        System.out.println(jobs);
        System.out.println(rsl);
    }
}
