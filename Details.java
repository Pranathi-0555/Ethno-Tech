class Employee{
	public void developer(){
		System.out.println("Employee1 belongs to developer ");
	}
	public void tester(){
		System.out.println("Employee2 belongs to tester ");
	}
	public void salary(){
		System.out.println("Both employees has same salary-5k");
	}
}
class Details extends Employee{
	public void testid(){
		System.out.println("testerid:02");
	}
	public void deveid(){
		System.out.println("developerid:01");
	}
	public static void main(String args[]){
		Details d=new Details();
		d.deveid();
		d.developer();
		d.testid();
		d.tester();
		d.salary();	
	}
}