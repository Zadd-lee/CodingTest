
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = Math.pow(i,2);

        if (d <= 100000000) {
            System.out.println("Accepted");
        } else {
            System.out.println("Time limit exceeded");
        }

    }
}