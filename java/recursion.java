import java.io.PrintStream;
import java.lang.*;
public class recursion{
    public static void rec(String s,int count,int idx,String a){
        
        
        if(idx==s.length()){
           for(int i=0;i<count;i++){
            a+='x';
           }
           System.out.println(a);
           return;
        }
        char curr=s.charAt(idx);
        if(curr=='x'){
           count++;
           rec(s,count,idx+1,a);
        }
        else{
            a+=curr;
            rec(s,count,idx+1,a);
        }
    }
    public static void main(String args[]) {
        
        rec("basaxxraj",0,0,"");
       
        
    }
}