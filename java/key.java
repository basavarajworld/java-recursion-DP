public class key {
    public static String[] keyboard={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
      public static void phone(String digits,int idx,String ne){
       
         if(idx==digits.length()){
            System.out.println(ne);
            return ;
        }
        char curr=digits.charAt(idx);
        String mapping=keyboard[curr-'0'];
        for(int i=0;i<mapping.length();i++){
            phone(digits,idx+1,ne+mapping.charAt(i));
        }
       
    }
    public static void main(String args[]) {
        
        phone("34",0,"");
       
        
    }
}
