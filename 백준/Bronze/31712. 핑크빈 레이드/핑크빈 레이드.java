
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] c = new int[3];
        int[] d = new int[3];

        for (int i = 0; i < 3; i++) {
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        int health = sc.nextInt();

        for (int i : d) {
            health -= i;
        }

        if (health <= 0) {
            System.out.println(0);
            return;
        }

        int sec = 1;
        while (true) {
            for (int i = 0; i < 3; i++) {
                if (sec % c[i] == 0) {
                    health -= d[i];
                }
                if (health <= 0) {
                    System.out.println(sec);
                    return;
                }
            }
            sec++;
        }


    }
}