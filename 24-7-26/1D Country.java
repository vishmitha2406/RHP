import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []v=new int[n];
    long[]p=new long[n+1];
    p[0]=0;
    for(int i=0;i<n;i++){
      v[i]=sc.nextInt();
    }
    for(int i=1;i<=n;i++){
      p[i]=p[i-1]+sc.nextLong();
    }
    int q=sc.nextInt();
    while(q-->0){
      int l=sc.nextInt();
      int r=sc.nextInt();
      int lb=lowerbound(v,l);
      int ub=upperbound(v,r);
      System.out.println(p[ub]-p[lb]);
    }
  }
  public static int lowerbound(int[]arr,int target){
    int low=0;
    int high=arr.length;
    while(low<high){
      int mid=low+(high-low)/2;
      if(arr[mid]>=target){
        high=mid;
      }else{
        low=mid+1;
      }
    }return low;
  }
  public static int upperbound(int[]arr,int target){
    int low=0;
    int high=arr.length;
    int ans=arr.length;
    while(low<high){
      int mid=low+(high-low)/2;
      if(arr[mid]>target){
        high=mid;
      }else{
        low=mid+1;
      }
    }return low;
  }
}
