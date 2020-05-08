package com.demo.business;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.data.api.TodoService;
import com.data.business.TodoBusinessImpl;

//This class is to test the  the stub class which gives some data in return
@RunWith(MockitoJUnitRunner.class) // This actually helps commenting the todoService mock refernce created.
public class TodoBusinessImplInjectMock {

	@Mock//this is basically writing code below.
	TodoService todoServiceMock;
	//TodoService todoServiceMock = mock(TodoService.class);
	
	@InjectMocks //this is basically writing code below.
	TodoBusinessImpl todoBusinessImpl;
	//TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
	
	@Test
	public void todoListRelatedToSpring() {
		/*This mocking is used to create the virtual class of the interface which is the advantage of mocking*/
		//TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos=Arrays.asList("Learn Spring MVC", "Learn Spring","Learn to Dance");
		/*after creating the class invoke the function of related class or interface and return the todos list as earlier 
		our stub function is to give the list back in arraylist*/
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		//TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> todosList = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");
		assertEquals(2, todosList.size());   //Using assertequals gives you the value matching and returns you true value. 
		//So create different test function test the various scenarios
	}
	
	@Test
	public void todoListRelatedToSpring_empty() {
		//TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos=Arrays.asList();
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		//TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> todosList = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");
		assertEquals(0, todosList.size());   //Using assertequals gives you the value matching and returns you true value. So create different test function test the various scenarios
	}

}