
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        int a = i-(i * 22 / 100);
        int b = i- ((i * 20 / 100) * 22 / 100);
        System.out.println(a+" "+b);

    }
}