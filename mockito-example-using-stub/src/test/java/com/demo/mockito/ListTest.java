package com.demo.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListTest {

	@Test
	public void letsMockListSize() {
		List list = mock(List.class);
		Mockito.when(list.size()).thenReturn(2);
		assertEquals(2, list.size());
	}
	
	@Test
	public void letsMockListSize_RetunrMultipleValue() {
		List list = mock(List.class);
		when(list.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, list.size());
		assertEquals(3, list.size());
	}
	
	@Test //for arguement matcher
	public void letsMockListGet() {
		List list = mock(List.class);
		//aRGUEMENT MATCHER
		when(list.get(anyInt())).thenReturn("suraj");
		assertEquals("suraj", list.get(0));
		assertEquals("suraj", list.get(1));
	}
	
	@Test(expected=RuntimeException.class)
	public void letsMockList_throwsAnException() {
		List list = mock(List.class);
		//aRGUEMENT MATCHER
		when(list.get(anyInt())).thenThrow(new RuntimeException("Something went wrong.."));
		list.get(0);
	}
}
