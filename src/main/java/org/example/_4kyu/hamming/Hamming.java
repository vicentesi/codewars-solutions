package org.example._4kyu.hamming;

import java.util.TreeSet;

public class Hamming {

    public static long hamming(int n) {
        TreeSet<Long> set = new TreeSet<>();
        set.add(1L);
        
        for (int i = 1; i < n; i++) {
            System.out.println(set);
            long smallest = set.pollFirst();
            set.add(smallest * 2);
            set.add(smallest * 3);
            set.add(smallest * 5);
        }
        
        return set.first();
    }

    public static void main(String[] args) {
        System.out.println(hamming(1));
        System.out.println(hamming(2));
        System.out.println(hamming(3));
        System.out.println(hamming(4));
        System.out.println(hamming(5));
        System.out.println(hamming(6));
        System.out.println(hamming(7));
    }
}