import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int targetInd = Integer.parseInt(st.nextToken());

            LinkedList<int[]> printList = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int[] print = new int[2];
                print[0] = Integer.parseInt(st.nextToken());
                if (j == targetInd) {
                    print[1] = 1;
                } else {
                    print[1] = 0;
                }
                printList.offer(print);
            }

            int cnt = 0;
            boolean isPrinted = false;
            while (!printList.isEmpty()) {

                int[] nowP= printList.poll();

                boolean isNowMax = true;

                int nowSize = printList.size();
                for (int j = 0; j < nowSize; j++) {
                    if (nowP[0] < printList.get(j)[0]) {
                        isNowMax = false;
                        break;
                    }
                }

                if (isNowMax) {
                    cnt++;
                    if(nowP[1]==1) break;
                } else {
                    printList.offer(nowP);
                }
            }

            System.out.println(cnt);
            

        }
    }
}