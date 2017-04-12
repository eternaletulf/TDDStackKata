package stackKataUBB;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
	
	private Stack stack;
	
	@Before
	public void startUp(){
		stack = new Stack();
	}

	@Test
	public void EmptyIfStackIsNew() {
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void IfPush3StackIsNotEmpty(){
		stack.push(3);
		
		assertEquals(stack.isEmpty(), false);
	}
	
	@Test
	public void Push1and2StackIsNotEmpty(){
		stack.push(1);
		stack.push(2);
		
		assertEquals(stack.isEmpty(), false);
	}
	
	@Test
	public void push4Add5StackSizeIs2(){
		stack.push(4);
		stack.push(5);
		int expected = 2;
		
		assertEquals(expected, stack.size());
	}
	
	@Test
	public void push6And7AndPopShouldBe7(){
		stack.push(6);
		stack.push(7);
		int expected = 7;
		int popped;
		
		popped = stack.pop();
		
		assertEquals(expected, popped);
	}

	
}
