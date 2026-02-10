import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> nList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            nList.add(Integer.parseInt(st.nextToken()));
        }

        nList.sort(Integer::compareTo);

        System.out.print(nList.get(0)+" ");
        System.out.println(nList.get(n-1));

    }
}