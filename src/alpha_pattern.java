import java.util.*;
public class alpha_pattern
{
    public static void main(String args[]){

        char c;
        int n;
        n = 5;
        drawPatternA(n);
        System.out.println();
        drawPatternB(n);
        System.out.println();
        drawPatternC(n);
        System.out.println();
        drawPatternD(n);
        System.out.println();
        /*drawPatternG(n, (2 * n) - 1);
        System.out.println();
        drawPatternJ(n);
        System.out.println();
        drawPatternK(n);
        System.out.println();
        drawPatternM(n);
        System.out.println();
        drawPatternR(n, (2 * n) - 1);
        System.out.println();
        drawPatternY(n);*/
    }
    public static void drawPatternA(int h){
        for(int i=0;i<h;i++){
            for(int j=0;j<h;j++){
                if(i==0 || j==0 || j==h-1 || i == h/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void drawPatternB(int h){
        for(int i=0;i<h;i++){
            for(int j=0;j<h;j++){
                if(i==0 || j==0 || j==h-1 || i == h-1 || i == h/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void drawPatternC(int h){
        for(int i=0;i<h;i++){
            for(int j=0;j<h;j++){
                if(i==0 && j!=0 || j==0 && i!=0 && i!=h-1 || i == h-1 && j!=0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void drawPatternD(int h){
        for(int i=0;i<h;i++){
            for(int j=0;j<h;j++){
                if(i==0 && j!= h-1 || j==1 || j==h-1 && i!=0 && i!=h-1 || i == h-1 && j != h-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
   /* public static void drawPatternG(int h){
        for(int i=0;i<h;i++){
            for(int j=0;j<h;j++){
                if(i==0 && j!=0 || j==0 && i!=0 && i!=h-1 || i == h-1 && j!=0 || ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }*/
}