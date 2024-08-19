package Employee;

public class Employee {

	private int eid;
	private String name;
	
	Employee(){
		
	}
	
	Employee(int eid, String name){
		this.eid=eid;
		this.name=name;
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void displaye() {
		System.out.println("Employee id: "+eid+" name:" + name);
	}
	
	class PermanentEmployee extends Employee{
		private float salary;
		private String addr;
		
		public PermanentEmployee() {
			this.salary = salary;
			this.addr = addr;
			
		}
		
		public float getSalary() {
			return salary;
		}
		
		public void setSalary(float salary) {
			this.salary = salary;
		}
		
		public String getAddr() {
			return addr;
		}
		
		public void setAddr(String addr) {
			this.addr=addr;
		}
		
		void displayp() {
			displaye();
			System.out.println(" Salary:" +salary+" Address:" +addr);
		}
		
	}
}
