package ProductClassSession;

public class Product {
	
private static final Product[] Proj = null;
int id;
String name1;
private static int 

private Product[] aProj;
//price float
static int num_of_prods = 10;

//CONSTRUCTOR IS THE SPECIAL METHOD WITH SAME NAME AS CLASS WHICH IS USED TO INCITIALIZED AN OBJECT

Product(){
	id = 0;
	name1 = "";
}

Product(int pid, String pname )
{
	id=pid;
	name1=pname;
	
}

static int get_num_prods() {
return num_of_prods;
}


/* @param name the name to set
*/
public void setName(String name) {
	this.name1 = name;
}

void display1() {
	System.out.println("id="+id+"name=" +name1+"Total num of prods");
}

/**
 * @return the aProj
 */
public Product[] getaProj() {
	return Proj;
}

/**
 * @return the id
 */
public int getId() {
	return id;
}

/* @return the name
 */
public String getName() {
	return name1;
}

/**
 * @param aProj the aProj to set
 */
public void setaProj(Product[] aProj) {
	this.aProj = aProj;
}

/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}



//Add product
	//member product
	//list product
	//empty shoppng chart
	//check out
	
	public static void main(String []args)
	{
		Product proj = new Product(101, "Furniture - Sofa set");
		
	
				//proj.display();
				
				Product apoj[] = new Product[3];
				
				apoj[0] = new Product(100, "Mobile");
				apoj[1] = new Product(200, "Clothing");
				apoj[2] = new Product(300, "Furniture - Chair");
		
				//Enhansed for loop
				for (Product prod: apoj) {
					prod.display();
				}
	
	}
	void display()
	{
		System.out.println("id"+id+ " name="+name1);
	}

}
