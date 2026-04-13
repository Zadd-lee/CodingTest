//  HI-ARC=?

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int i = sc.nextInt();
        int a = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();


        int x = h * i - a * r * c;
        System.out.println(x);

    }
}