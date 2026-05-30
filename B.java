class A{
public void method(){
System.out.println("Something ..");
}
}
class B extends A{
public void m(){
System.out.println("Good..");
}

public static void  main(String args[]){
	B b=new B();
b.method();
b.m();
}
}