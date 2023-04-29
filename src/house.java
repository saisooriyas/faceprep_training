import java.util.*;
public class house {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int h_num = s.nextInt(),p_num = s.nextInt();
        int house[] = new int[h_num],plot1[] = new int[p_num];
        for(int i=0;i<h_num;i++)
            house[i] = s.nextInt();
        for(int i=0;i<p_num;i++)
            plot1[i] = s.nextInt();

        int plot[] = new int[p_num];
        for(int i=0;i<p_num;i++){
            plot[i] = plot1[i];
        }
        Arrays.sort(plot);
        int max = plot[p_num-1];
        int space =0,check = 0,max_space=0,tempi=0,index=max,checki = 0;
        for(int i=0;i<p_num;i++){
            check = 0;
            for(int j=i;j<p_num;j++){
                if ((plot[j]>plot[i])&&(plot[j]<=max))
                    check = 1;
                if (check == 1){
                    if (space< plot[j]-plot[i]&& plot[j]<=index) {
                        space = plot[j] - plot[i];
                        index = plot[j];
                        checki = 1;
                    }
                    check = 0;
                }
            }
            if (checki == 0){
                space = max - plot[i];
                if (max_space<space)
                    max_space = space;
            }
            if (checki == 1){
                if (max_space<space) {
                    max_space = space;
                    index = max;
                }
            }
        }
        System.out.println(max_space);
    }
}
//1 2 3 4
//6 3 1 7
