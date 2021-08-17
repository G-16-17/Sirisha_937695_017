package gof_abstractfactory;

public class Client {
	public void clientJob()
	{
		Tire tire = FactoryMaker.getFactory("audi").makeTire();
		System.out.println(tire.getTireModel());
		Headlight light = FactoryMaker.getFactory("mercedes").makeHeadlight();
		System.out.println(light.getHeadlightModel());
	}
}
