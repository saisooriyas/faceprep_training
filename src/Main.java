import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int ma = 35;
        int in = 67;
        int sta = recurse(ma,in);
        System.out.println(sta);
    }
    public static int recurse(int b, int a){
        if(b%13 == 0)
            return b +a;
        return recurse(b++,a/2);
    }

}