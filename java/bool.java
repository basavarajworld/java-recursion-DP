public class bool {
    public static boolean[] map=new boolean[25];
    public static void boo(String s,int idx,String a){
       
        if(idx==s.length()){
            System.out.println(a);
            return;
        }
        char curr=s.charAt(idx);
       if(map[curr-'a']){
            boo(s,idx+1,a);
        }
        else{
            a+=curr;
            map[curr-'a']=true;
            boo(s,idx+1,a);
        }
    }
    public static void main(String args[]){
      boo("basavaraj",0,"");
    }
}
