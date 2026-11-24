import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        List<Integer> input = new ArrayList<>();
        while (st.hasMoreTokens()) {
            input.add(Integer.parseInt(st.nextToken()));
        }

        int max = Integer.MIN_VALUE;
        int hap = 0;
        int cnt = k;
        for (int i = 0; i < input.size(); i++) {
            if(cnt>0){
                hap += input.get(i);
                cnt--;
                max = hap;
            }else{
                hap -= input.get(i-k);
                hap += input.get(i);
                max = Math.max(max, hap);
            }


        }
        System.out.println(max);

    }

}
