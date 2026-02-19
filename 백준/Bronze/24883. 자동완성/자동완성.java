
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(0) == 'n' || s.charAt(0) == 'N') {
            System.out.println("Naver D2");
        } else {
            System.out.println("Naver Whale");
        }

    }
}