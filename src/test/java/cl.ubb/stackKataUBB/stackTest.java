package stackKataUBB;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void EmptyIfStackIsNew() {
		Stack stack = new Stack();
		assertTrue(stack.isEmpty());
	}

}
