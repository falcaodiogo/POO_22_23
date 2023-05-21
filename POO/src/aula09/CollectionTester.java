package aula09;

import java.util.*;

public class CollectionTester {
    public static void main(String[] args) {
        int[] dimensions = {1000, 5000, 10000, 20000, 40000, 100000};
        Collection<Integer> col;
        for (int DIM : dimensions) {
            System.out.println("Testing for dimension " + DIM);
            col = new ArrayList<>();
            checkPerformance(col, DIM);
            col = new LinkedList<>();
            checkPerformance(col, DIM);
            col = new HashSet<>();
            checkPerformance(col, DIM);
            col = new TreeSet<>();
            checkPerformance(col, DIM);
            System.out.println();
        }
    }

    private static void checkPerformance(Collection<Integer> col, int DIM) {
        double start, stop, delta;
        // Add
        start = System.nanoTime(); // clock snapshot before
        for (int i = 0; i < DIM; i++)
            col.add(i);
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop - start) / 1e6; // convert to milliseconds
        System.out.println(col.size() + ": Add to " +
                col.getClass().getSimpleName() + " took " + delta + "ms");
        // Search
        start = System.nanoTime(); // clock snapshot before
        for (int i = 0; i < DIM; i++) {
            int n = (int) (Math.random() * DIM);
            if (!col.contains(n))
                System.out.println("Not found???" + n);
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop - start) / 1e6; // convert nanoseconds to milliseconds
        System.out.println(col.size() + ": Search to " +
                col.getClass().getSimpleName() + " took " + delta + "ms");
        // Remove
        start = System.nanoTime(); // clock snapshot before
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop - start) / 1e6; // convert nanoseconds to milliseconds
        System.out.println(col.size() + ": Remove from " +
                col.getClass().getSimpleName() + " took " + delta + "ms");
    }
}

