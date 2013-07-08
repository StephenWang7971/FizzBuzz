package org.bjdp.kata;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    private static List<Integer> values = new ArrayList<Integer>();

    public static void run() {
        for (int i = 0; i < 100; i++) {
            values.add(i);
        }

        values.stream().mapMulti(new FizzBuzzFunction()).forEach(System.out::println);
    }
    public static void main(String[] args) {
        FizzBuzz.run();
    }

}
