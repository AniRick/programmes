import java.util.*;

public class O0_AP_GP {
    
    public static int gp(int a, int r, int n){
        int ans;
        int m = Math.pow(r,n-1);
        ans = a * m;
        return ans;
    }

    public static void main(String[] args) {
        
        // 1st line contains the initial term of G.P
        // 2nd line contains the common ratio of G.P
        // 3rd line contains the nth term we have to find

        int a = 2;
        int r = 3;
        int n = 6;

        System.out.println(gp(a,r,n));
    }
}
