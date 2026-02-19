import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        if (i < b) {
            System.out.println(i * 50);
        } else {
            System.out.println(b * 50);
        }


    }
}