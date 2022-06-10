import java.util.HashMap;
import java.util.Scanner;

public class Hashing3 {
	public static void main (String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(), k = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      /*
      for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
       int sum = arr[i]+arr[j];
        if(sum==k){
          System.out.println("1");
          return;
          }
        }
        }
       System.out.println("0");
       */
      HashMap<Integer,Integer> H = new HashMap<>();
      int diff=0;
      for(int i=0;i<n;i++){
        if(H.containsKey(arr[i])){
          System.out.println("1");
          return;
        }
        diff=k-arr[i];
        H.put(diff,arr[i]);
      }
      System.out.println("0");

}
    
}
