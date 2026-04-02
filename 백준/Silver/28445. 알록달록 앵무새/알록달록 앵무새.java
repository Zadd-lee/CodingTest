//  알록달록 앵무새

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> color = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            color.add(sc.next());
        }
        color.sort(String::compareTo);

        List<String> colorC = new ArrayList<>();


        for (String bodyColor : color) {
            for (String tailColor : color) {
                String combo = bodyColor + " " + tailColor;
                if(colorC.contains(combo)) continue;
                colorC.add(combo);
                System.out.println(combo);
            }
        }

    }
}