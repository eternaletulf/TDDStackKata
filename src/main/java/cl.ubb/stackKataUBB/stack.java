package stackKataUBB;

public class Stack {
	
	private int size = 0;
	private boolean status = true;

	public boolean isEmpty(){
		return status;
	}

	public void push(int i) {
		size++;
		status = false;		
	}

	public int size() {
		return size;
	}
	
	
}
