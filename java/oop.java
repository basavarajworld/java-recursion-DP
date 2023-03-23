class student{
    String color;
    String type;
    student(){
        System.out.println(this.color);
    }

    public void pen(){
        System.out.println(this.color);
    }
}
class maths extends student{
    public void  pen(String l){
        System.out.println(l);
    }
}
class s extends maths{
    public void pen(String s){
        System.out.println(s);
    }
}

public class oop {
    public static void main(String args[]){
       
       s s2=new s();
       s2.color="blue";
       s2.type="ball";
       s2.pen("34");
       s2.pen();
    }
    
}
