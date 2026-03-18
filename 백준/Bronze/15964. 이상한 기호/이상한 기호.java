import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(ast(a,b));
    }

    private static long ast(long a, long b) {
        return (a + b) * (a - b);
    }
}