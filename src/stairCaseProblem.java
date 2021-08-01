import java.util.*;

class stairCaseProblem{
    static int n;
    static int[] dp = new int[100];
    int solve(int n){
        if(dp[n]!=0)
            return dp[n];
        if(n>=2)
            dp[n]=solve(n-1)+solve(n-2);
        return dp[n];
    }
    public static void main(String[] args){
        stairCaseProblem obj = new stairCaseProblem();
        System.out.print("Enter the number of stairs given: ");
        Scanner data = new Scanner(System.in);
        n = data.nextInt();
        dp[0]=0;
        dp[1]=1;
        int answer=obj.solve(n);
        System.out.print("The number of distinct ways in which one can travel is:"+answer);
        /*
        * for(int i=2;i<=n;i++)
        * dp[i]=dp[n-1]+dp[n-2];
        */
        //this is the recursive method
    }
}