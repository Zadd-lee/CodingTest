import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if(s.equals("0 0")) break;

            StringTokenizer st = new StringTokenizer(s);

            List<Integer> inputs = new ArrayList<>();

            while (st.hasMoreTokens()) {
                inputs.add(Integer.parseInt(st.nextToken()));
            }
            int a = inputs.get(0);
            int b = inputs.get(1);
            if (a % b != 0 && b % a != 0) {
                System.out.println("neither");
            } else if (a > b) {
                System.out.println("multiple");
            } else {
                System.out.println("factor");
            }

        }

    }
}