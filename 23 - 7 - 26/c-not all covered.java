import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int t=sc.nextInt();
    int [] walls=new int[n+2];
    while(t>0){
      int l=sc.nextInt();
      int r=sc.nextInt();
      walls[l]++;
      walls[r+1]--;
      t--;
    }
    int ans=Integer.MAX_VALUE;
    for(int i=1;i<=n;i++){
      walls[i]+=walls[i-1];
      ans=Math.min(ans,walls[i]);
    }
    System.out.println(ans);
  }
}
