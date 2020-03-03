package com.demo.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.data.api.TodoService;
import com.data.api.TodoServiceStub;
import com.data.business.TodoBusinessImpl;

//This class is to test the  the stub class which gives some data in return
public class TodoBusinessImplStubTest {

	@Test
	public void usingAStub() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");
		assertEquals(2, todos.size());   //Using assertequals gives you the value matching and returns you true value. So create different test function test the various scenarios
	}

}
