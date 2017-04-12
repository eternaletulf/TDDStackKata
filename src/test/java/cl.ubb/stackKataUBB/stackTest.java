package stackKataUBB;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void EmptyIfStackIsNew() {
		Stack stack = new Stack();
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void IfPush3StackIsNotEmpty(){
		Stack stack = new Stack();
		
		stack.push(3);
		
		assertEquals(stack.isEmpty(), false);
	}

	
}
