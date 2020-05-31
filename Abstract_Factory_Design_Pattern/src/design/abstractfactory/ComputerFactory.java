package design.abstractfactory;

import design.model.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
