package org.mardssss;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        check();
    }
    public static void check() {
        ArrayList<Integer> a=new ArrayList<>();
        for(int n=1; n<=100; n++){
            int c = 0;
            for (int i = 1; i <= n; i++)
                if (n % i == 0)
                    c++;
            if (c == 2) {
                a.add(n);
            }
            else
                continue;
        }
        System.out.println("All the prime numbers Between 1 and 10 are:");
        System.out.println(a);
}
}