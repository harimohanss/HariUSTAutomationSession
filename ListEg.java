

package ListEg;

import java.util.ArrayList;

class City{
	String name;
	int population;
	
	public City(String name, int population) {
		this.name = name;
		this.population = population;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public class Main{
		public static void main(String[] args) {
			//Create an ArrayList of City objects
			ArrayList<City> cities = new ArrayList<>();
			
			//Add City objects to the ArrayList
			cities.add(new City("TVM", 567));
			cities.add(new City("Pattom", 432));
			cities.add(new City("Ullor", 333));
			
			//iterate over the ArrayList using an enhanced for loop
			for (City city: cities) {
				System.out.println("City: "+city.getName()+"Population: "+city.getPopulation());
				
			}
			
			
		}
	}
}