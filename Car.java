class Car 
{
	String brand;
	double price;

	Car(String brand,double price){
		this.brand=brand;
		this.price=price;
	}
	Engine e1=new Engine(411);
	Engine e2=new Engine(785);

public void display(){
	System.out.println("Car Brand: "+brand);
		System.out.println("Car price: "+price);	
}
}
