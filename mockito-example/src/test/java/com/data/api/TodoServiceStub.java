package com.data.api;

import java.util.Arrays;
import java.util.List;


//This is stub class which gives you the data as dummy or it can act as a third party interface or the microservices which gives you data
public class TodoServiceStub implements TodoService{

	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
	}
}
