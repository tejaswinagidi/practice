class Parent
{
        int t=10;
        String s="teja";
	public void disp()
	{
		System.out.println("Parent disp called");
	}

        public void eat()
        {
                System.out.println("Parent eat called");
        }
}
public class Child extends Parent
     
{
        int t=1;
        String s="yoshith";
        public void disp()
        {
		System.out.println("Child disp called");
	}
        public void feed()
        {
		System.out.println("Child feed called");
	}
	public static void main(String args[])
	{
		Parent p = new Child();
                Child c1=(Child)p;
                //Child c2=(Child) new Parent();
		c1.disp();
                //c2.disp();
                System.out.println(c1.t);
                System.out.println(c1.s);
                c1.eat();
                c1.feed();
                p.feed();
                //c2.eat();
	}
}