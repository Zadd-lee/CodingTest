
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] periods = new int[3];
        int[] damages = new int[3];


        for (int i = 0; i < 3; i++) {
            periods[i] = sc.nextInt();
            damages[i] = sc.nextInt();
        }
        int health = sc.nextInt();

        for (int damage : damages) {
            health -= damage;
        }
        if (health <= 0) {
            System.out.println(0);
            return;
        }

        int sec = 1;

        while (health > 0) {
            for (int i = 0; i < 3; i++) {
                if (sec % periods[i] == 0) {
                    health -= damages[i];
                    if (health <= 0) {
                        System.out.println(sec);
                        return;
                    }
                }
            }
            sec++;
        }







    }
}