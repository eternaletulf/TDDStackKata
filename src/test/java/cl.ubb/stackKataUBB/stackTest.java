package stackKataUBB;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import stackKataUBB.Stack.EmptyStackException;

public class StackTest {

	private Stack stack;

	@Before
	public void startUp() {
		stack = new Stack();
	}

	@Test
	public void EmptyIfStackIsNew() {
		assertTrue(stack.isEmpty());
	}

	@Test
	public void IfPush3StackIsNotEmpty() {
		stack.push(3);

		assertEquals(stack.isEmpty(), false);
	}

	@Test
	public void Push1and2StackIsNotEmpty() {
		stack.push(1);
		stack.push(2);

		assertEquals(stack.isEmpty(), false);
	}

	@Test
	public void push4Add5StackSizeIs2() {
		stack.push(4);
		stack.push(5);
		int expected = 2;

		assertEquals(expected, stack.size());
	}

	@Test
	public void push6And7AndPopShouldBe7() throws EmptyStackException {
		stack.push(6);
		stack.push(7);
		int expected = 7;
		int popped;

		popped = stack.pop();

		assertEquals(expected, popped);
	}

	@Test
	public void push8And9AndFirstPopShouldBe9AndSecondPopShouldBe8() throws EmptyStackException {
		stack.push(8);
		stack.push(9);
		int expectedFirst = 9;
		int expectedSecond = 8;
		int poppedFirst;
		int poppedSecond;

		poppedFirst = stack.pop();
		poppedSecond = stack.pop();
		assertEquals(expectedFirst, poppedFirst);
		assertEquals(expectedSecond, poppedSecond);
	}

	@Test(expected = EmptyStackException.class)
	public void popOnEmptyShouldThrowException() throws EmptyStackException {
		stack.pop();
	}

}
