<<<<<<< HEAD
class Employee{
	public void developer(){
		System.out.println("Employee1 belongs to developer ");
	}
	public void tester(){
		System.out.println("Employee2 belongs to tester ");
	}
	public void devops(){
		System.out.println("Employee3 belongs to devops ");
	}
	public void salary(){
		System.out.println("all employees has same salary-50k");
	}
}
class Details extends Employee{
	public void testid(){
		System.out.println("testerid:02");
		System.out.println("Name:sita");
	}
	public void deveid(){
		System.out.println("developerid:01");
		System.out.println("Name:Ram");
	}
	public void devopid(){
		System.out.println("devopsid:03");
		System.out.println("Name:shiva");
	}
	public static void main(String args[]){
		Details d=new Details();
		d.deveid();
		d.developer();
		d.testid();
		d.tester();
		d.devopid();
		d.devops();
		d.salary();	
		
		
	}
=======
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
>>>>>>> c0bfe3e139c274540dbc6a4d8de3dc12b2d504c2
}