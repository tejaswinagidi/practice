class Tst<T> 
{ 
    T obj; 
    Tst(T obj) {  
        this.obj = obj;  
    } 
    public T getObject()  { 
        return this.obj; 
    } 
} 
    
class Main 
{ 
    public static void main (String[] args) 
    { 
        Tst <Integer> iObj = new Tst<Integer>(15); 
        System.out.println(iObj.getObject()); 
   
     
        Tst <String> sObj = new Tst<String>("JAVA"); 
        System.out.println(sObj.getObject()); 
    } 
}