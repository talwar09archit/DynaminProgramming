import java.util.*;

class coinProblem {
    public static void main(String[] arg){
        int n;
        Scanner data = new Scanner(System.in);
        System.out.print("Enter the number of coins denomination: ");
        n=data.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the coin denomination: ");
        for(int i=0;i<n;i++)
            arr[i] = data.nextInt();
        System.out.print("Enter the total amount of the money you need: ");
        int amount = data.nextInt();
        int amountLeft = amount;
        int coinsNo = 0;
        int j=n-1;
        while(amountLeft!=0&&j>=0){
            if(arr[j]<=amountLeft){
                amountLeft = amountLeft - arr[j];
                coinsNo++;
            }
            else {
                j--;
            }
        }
        System.out.print("The total number of coins required are: "+coinsNo);
    }
}