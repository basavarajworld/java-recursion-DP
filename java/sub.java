public class sub {
    public static void subs(String s,int idx,String a){
        if(idx==s.length()){
            System.out.println(a);
            return;
        }

        char curr=s.charAt(idx);
        subs(s,idx+1,a+curr);


        subs(s,idx+1,a);
    }
    public static void main(String args[]){
        subs("abc", 0, "");
    }
}
