package com.data.api;

import java.util.Arrays;
import java.util.List;


//This is stub class which gives you the data as dummy or it can act as a third party interface or the microservices which gives you data
//The disadvantages of this class is you need to create the different methods for the different scenarios 
//Or the different classes should be created for different microservices
public class TodoServiceStub implements TodoService{

	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
	}
}
