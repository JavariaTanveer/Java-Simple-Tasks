
public class Vehicle {
	protected String brand ="Ford";
	public void brake()
	{
		System.out.println("Brakes working");
	}
}
class Car extends Vehicle
{
	private String model = "Mustang";
	public static void main(String[] args)
	{
		Car c = new Car();
		System.out.println(c.brand + " " + c.model);
		c.brake();
	}
}
