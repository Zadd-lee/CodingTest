import java.util.*;
import java.lang.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<int[]> bridge = new LinkedList<>();
        Queue<Integer> waitting = new LinkedList<>();

        for (int i = 1; i < truck_weights.length; i++) {
            waitting.offer(i);
        }
        bridge.offer(addTruck(0));


        int sec = 1;
        while (!bridge.isEmpty()) {
            sec++;
            int len = bridge.size();
            //시간 추가
            for (int i = 0; i < len; i++) {
                int[] truck = bridge.poll();

                truck[1] += 1;
                if (truck[1] < bridge_length) {
                    bridge.offer(truck);
                }
            }


            int now = 0;
            for (int[] t : bridge) {
                now += truck_weights[t[0]];
            }

            //추가
            if (!waitting.isEmpty() && now + truck_weights[waitting.peek()] <= weight) {
                bridge.offer(addTruck(waitting.poll()));
            }

        }


        return sec;
    }

    private int[] addTruck(int i) {
        int[] nowTruck = new int[2];
        nowTruck[0] = i;
        nowTruck[1] = 0;
        return nowTruck;
    }
}