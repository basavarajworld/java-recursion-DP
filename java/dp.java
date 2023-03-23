public class dp {
    public static void main(String[] args){
       int[] arr={2,4,8,6,4,1};
      boolean[][] dpp=new boolean[7][10];
      for(int h=0;h<7;h++){
        for(int a=0;a<10;a++){
            if(h==0){
            dpp[h][a]=false;}
            if(a==0){
                dpp[h][a]=true;
            }
        }
      }
       for(int i=1;i<7;i++){
        for(int j=1;j<10;j++){
           
            if(arr[i-1]<=j){
                dpp[i][j]=dpp[i-1][j-arr[i-1]] || dpp[i-1][j];
            }
            else{
                dpp[i][j]=dpp[i-1][j];
            }
        }
       }
       System.out.println(dpp[6][9]);
    }
}
