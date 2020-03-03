package com.demo.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.data.api.TodoService;
import com.data.business.TodoBusinessImpl;

//This class is to test the  the stub class which gives some data in return
public class TodoBusinessImplMockTest {

	@Test
	public void todoListRelatedToSpring() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos=Arrays.asList("Learn Spring MVC", "Learn Spring","Learn to Dance");
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> todosList = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");
		assertEquals(2, todosList.size());   //Using assertequals gives you the value matching and returns you true value. So create different test function test the various scenarios
	}
	
	@Test
	public void todoListRelatedToSpring_empty() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos=Arrays.asList();
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> todosList = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");
		assertEquals(0, todosList.size());   //Using assertequals gives you the value matching and returns you true value. So create different test function test the various scenarios
	}

}
