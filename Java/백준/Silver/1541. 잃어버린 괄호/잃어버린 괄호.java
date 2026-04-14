//  잃어버린 괄호

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> sik = new ArrayDeque<>();
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c == '+' || c == '-') {
                sik.offer(sb.toString());
                sb.setLength(0);
                sik.offer(c + "");
            } else {
                sb.append(c);
            }
        }
        sik.offer(sb.toString());

        int min = 0;
        if (!sik.contains("-")) {
            for (String s : sik) {
                if (s.contains("+") || s.contains("-")) continue;
                min += Integer.parseInt(s);
            }
        } else {
            min += Integer.parseInt(sik.poll());
            while (!sik.isEmpty()) {
                if (sik.peek().equals("+")) {
                    sik.poll();
                    min += Integer.parseInt(sik.poll());
                } else {
                    sik.poll();
                    int cha = Integer.parseInt(sik.poll());
                    while (!sik.isEmpty() && !sik.peek().equals("-")) {
                        sik.poll();
                        cha += Integer.parseInt(sik.poll());
                    }
                    min -= cha;
                }
            }

        }
        System.out.println(min);

    }
}