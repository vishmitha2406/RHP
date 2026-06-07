import java.util.*;
public class Main
{
    
   public static long[] fsmaxf(long[][] arr,int r,int c){
    long fmx=0L,smx=0L;
    for(int i=0;i<c;i++){
        if(arr[r][i]>fmx){
            smx=fmx;
            fmx=arr[r][i];
        }
        else if(arr[r][i]>smx){
            smx=arr[r][i];
        }
    }
    return new long[] {fmx,smx};
}
    
    
	public static void main(String[] args) {
	  
	  Scanner sc= new Scanner(System.in);
	    
  int R=sc.nextInt();
  int C=sc.nextInt();
  

  long[][] arr=new long[R][C];
  long[][] dp=new long[R][C];

  for(int i=0;i<R;i++){
    for(int j=0;j<C;j++){
      arr[i][j]=sc.nextLong();
      if(i==0){
        dp[i][j]=arr[i][j];
      }
    }
  }
  
  for(int row=1;row<R;row++){
      long []fsmax=fsmaxf(dp,row-1,C);
      for(int col=0;col<C;col++){
          dp[row][col]=arr[row][col]+(dp[row-1][col]==fsmax[0]?fsmax[1]:fsmax[0]);
      }
  }
	    
		System.out.println();
		long []fsmax=fsmaxf(dp,R-1,C);
		System.out.println(fsmax[0]);
	}
}
