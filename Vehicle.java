package Vehicle;


//base class
public class Vehicle {

	String brand;
	String model;
	
	public Vehicle (String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	void display() {
		System.out.println("Brand:" + brand +", Model:"+model);
	}
//derived class Car
	class Car extends Vehicle{
		int doors;
		
		public Car(String brand, String model, int doors) {
			super(brand, model);
			this.doors = doors;
		}
		
		@Override
		void display() {
			super.display();
			System.out.println("Doors:" + doors);
		}
	}
	
	//Derived class Truck
	class Truck extends Vehicle{
		int capacity;
		
		public Truck(String brand, String model, int Capacity) {
			super(brand, model);
			this.capacity = capacity;
			
		}
		
		public class SUV extends Vehicle{
			
			int speed;
			
			public SUV(String brand, String model, int speed) {
				super(brand, model);
				this.speed = speed;
				
			}
		}
		
		@Override
		void display() {
			super.display();
			System.out.println("Capacity:" + capacity);
		}
	}
	
	public class Main{
		public static void main(String[] args) {
			
			//Create an array of type vehicle
			Vehicle[] vehicles = new Vehicle[3];
			
			//Store objects of derived class in the array
			vehicles[0] = new Car("Toyota", "Liva", 4);
			vehicles[1] = new Truck("Ford", "F-100", 2000);
			vehicles[2] = new SUV("Honda", "City", 120);
			
			//Display information of all vehicles
			for(Vehicle vehicle : vehicles) {
				vehicle.display();
				System.out.println();
			}
			
		}
	}

}
