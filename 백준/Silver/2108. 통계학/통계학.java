
import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> inputs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            inputs.add(Integer.parseInt(br.readLine()));
        }

        inputs.sort(Integer::compareTo);

        StringBuilder sb = new StringBuilder();
        sb.append(getAvg(inputs)).append("\n");
        sb.append(getMid(inputs)).append("\n");
        sb.append(getFrequence(inputs)).append("\n");
        sb.append(getDiffer(inputs)).append("\n");

        System.out.println(sb);
    }

    public static int getAvg(List<Integer> inputs) {
        double sum = 0;
        for (Integer input : inputs) {
            sum += input;
        }
        return (int) Math.round(sum / inputs.size());
    }

    public static int getMid(List<Integer> inputs) {
        return inputs.get(inputs.size()/2);
    }

    public static int getFrequence(List<Integer> inputs) {

        Map<Integer, Integer> freq = new HashMap<>();

        for (Integer input : inputs) {
            freq.put(input, freq.getOrDefault(input, 0)+1);
        }

        int maxValue = Collections.max(freq.values());
        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> ent : freq.entrySet()) {
            if (ent.getValue() == maxValue) {
                list.add(ent.getKey());
            }
        }

        if (list.size() == 1) {
            return list.get(0);
        } else {
            list.sort(Integer::compareTo);

            return list.get(1);
        }

    }

    public static int getDiffer(List<Integer> inputs) {
        return Collections.max(inputs) - Collections.min(inputs);
    }
}