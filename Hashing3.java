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


/*import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt(), k = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      int count=0;
      for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
          int diff=0;
          diff = Math.abs(arr[i]-arr[j]);
        //  System.out.println(diff);
          if(diff==k){
            count++;
         //   System.out.println(count);
            }
        }
      }
      System.out.println(count);
      
	}
}*/


 class hashing4 {
   //Count distinct pairs with difference k
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int n =input.nextInt(), k = input.nextInt();
      int a[] = new int[n];
      for(int i = 0; i < n; i++){
        a[i] = input.nextInt();
      }
      HashMap<Integer, Integer> map = new HashMap();
      int ans = 0;
      for(int i = 0; i < n; i++){
        int cnt = 0;
        if(map.containsKey(a[i])){
          cnt = map.get(a[i]);
        }
        cnt++;
        map.put(a[i], cnt);
      }
      for(int i = 0; i < n; i++){
        if(map.containsKey(a[i] - k)){

          if(k != 0 || map.get(a[i] - k) > 1){
          
            ans++;
           // System.out.println(ans);
            map.remove(a[i] - k);
          }
        }
      }
      System.out.println(ans);
    }
}



class Hashing5
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer,Integer> Map = new HashMap<>();
        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
          if(Map.containsKey(arr[i])){
            System.out.println("true");
            return;
          }
          Map.put(arr[i],1);
        }
        System.out.println("false");
        
    }
  }

  class Hashing6
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt() , sum=sc.nextInt();
      int arr[] = new int[n];
      HashMap<Integer, Integer> Map = new HashMap<>();
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        if(Map.containsKey(sum-arr[i])){
          System.out.println("Yes");
          return;
        }
        Map.put(arr[i],1);
      }
      System.out.println("No");
	}
}
