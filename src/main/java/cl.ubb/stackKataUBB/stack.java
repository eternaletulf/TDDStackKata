package stackKataUBB;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	private List<Integer> stack = new ArrayList<>();

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public void push(int i) {
		stack.add(i);
	}

	public int size() {
		return stack.size();
	}

	public int pop() throws EmptyStackException {
		if(!stack.isEmpty()){
			return stack.remove(stack.size() - 1);	
		}else{
			throw new EmptyStackException("Stack Vacio, imposible realizar pop()");
		}
		
	}
	
	public class EmptyStackException extends Exception {
	    public EmptyStackException(String message) {
	    	super(message);
	    }
	}
}

