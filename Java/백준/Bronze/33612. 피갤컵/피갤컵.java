//  피갤컵

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int year = 2024;
        int month = 8;

        month += (n - 1) * 7;

        while (month > 12) {
            month-=12;
            year++;
        }

        System.out.println(year + " " + month);

    }
}