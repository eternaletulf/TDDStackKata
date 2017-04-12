package stackKataUBB;

public class Stack {
	
	private int size = 0;
	private int head;
	private boolean status = true;

	public boolean isEmpty(){
		return status;
	}

	public void push(int i) {
		head = i;
		size++;
		status = false;		
	}

	public int size() {
		return size;
	}

	public int pop() {
		return head;
	}
	
	
}
