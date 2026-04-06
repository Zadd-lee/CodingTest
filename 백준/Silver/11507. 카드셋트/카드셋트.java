
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> p = new ArrayList<>();
        List<String> k = new ArrayList<>();
        List<String> h = new ArrayList<>();
        List<String> t = new ArrayList<>();
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i+=3) {
            String card = input.substring(i, i + 3);
            switch (card.charAt(0)) {
                case 'P':
                    if (p.contains(card)) {
                        System.out.println("GRESKA");
                        return;
                    } else {
                        p.add(card);
                    }
                    break;
                case 'K':
                    if (k.contains(card)) {
                        System.out.println("GRESKA");
                        return;
                    } else {
                        k.add(card);
                    }
                    break;
                case 'H':
                    if (h.contains(card)) {
                        System.out.println("GRESKA");
                        return;
                    } else {
                        h.add(card);
                    }
                    break;
                case 'T':
                    if (t.contains(card)) {
                        System.out.println("GRESKA");
                        return;
                    } else {
                        t.add(card);
                    }
                    break;
            }

        }


        System.out.println((13-p.size())+" "+(13-k.size())+" "+(13-h.size())+" "+(13-t.size()));
    }
}