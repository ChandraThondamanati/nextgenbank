package com.nextgen.sourcing.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersAndSum {
    public void test() {
        List<Integer> numList = Arrays.asList(2,3,9,4,7,8);
        List<Integer> results = numList.stream().filter(num -> num % 2 == 0)
                .map(n -> n*2).collect(Collectors.toList());
        System.out.println(results);
        int sum = numList.stream().filter(n -> n%2==0)
                .map(n -> n*2)
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
