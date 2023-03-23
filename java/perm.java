public class perm {
    public static void permu(String s,String p){
        if(s.length()==0){
            System.out.println(p);
            return;
        }

        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            String n=s.substring(0, i)+s.substring(i+1);
            permu(n, p+curr);
        }
    }
    public static void main(String args[]){
         permu("Basu", "");
    }
}
