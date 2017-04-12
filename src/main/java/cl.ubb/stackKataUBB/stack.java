package stackKataUBB;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	private List<Integer> stack = new ArrayList<>();

	private int size = 0;
	private int head;
	private boolean status = true;

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public void push(int i) {
		stack.add(i);
	}

	public int size() {
		return stack.size();
	}

	public int pop() {
		return stack.remove(stack.size() - 1);
	}

}
