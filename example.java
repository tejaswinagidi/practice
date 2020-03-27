class StaticExample {
    public static int staticInt = 9;
    public int normalInt =0;
    public StaticExample(){
      normalInt=10;
    }
    public void Example() {
        staticInt++;
    }
}
public class Example{
    
public static void main(String[] args){
System.out.println(StaticExample.staticInt);
StaticExample object1 = new StaticExample();
System.out.println(object1.staticInt); 
System.out.println(object1.normalInt); 
object1.Example();
System.out.println(object1.staticInt); 
System.out.println(object1.normalInt);
StaticExample object2 = new StaticExample();
System.out.println(object2.staticInt); 
System.out.println(object2.normalInt); 
object2.Example();
System.out.println(object2.staticInt); 
System.out.println(object2.normalInt);
object1.staticInt = 10;
object1.normalInt = 1;
System.out.println(object2.staticInt); 
System.out.println(object2.normalInt);
}
}
