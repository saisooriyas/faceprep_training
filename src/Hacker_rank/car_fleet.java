package Hacker_rank;
import java.util.*;
public class car_fleet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        int num = s.nextInt();
        int[] position = new int[num];
        int[] speed = new int[num];
        for(int i=0;i<num;i++){
            position[i] = s.nextInt();
        }
        num = s.nextInt();
        for(int i=0;i<num;i++){
            speed[i] = s.nextInt();
        }
        if (position.length == 0)
            System.out.println("0");
        int n = position.length;
        int[][] distance_speed = new int[n][2];
        for (int i = 0; i < n; i++) {
            distance_speed[i][0] = position[i];
            distance_speed[i][1] = speed[i];
        }
        Arrays.sort(distance_speed, (a, b) -> b[0] - a[0]);

        int res = 1;
        double pre_arrive_time = (target - distance_speed[0][0]) * 1.0 / distance_speed[0][1];
        for (int i = 1; i < n; i++) {
            double cur_arrive_time = (target - distance_speed[i][0]) * 1.0 / distance_speed[i][1];
            //System.out.println(cur_arrive_time + " > ? " + pre_arrive_time);
            if (cur_arrive_time > pre_arrive_time) {
                res++;
                pre_arrive_time = cur_arrive_time;
            }
        }
        System.out.println(res);
    }
}
