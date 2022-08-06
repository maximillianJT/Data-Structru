public class Stack<E>{
	//create list which is stack 
	private SingleyLinkedList <E> list = new SingleyLinkedList<>(); 
	SingleyLinkedList link = new SingleyLinkedList();
	public Stack() {}
	public int size() {
	
		return list.size();
	}
	//adds element to the stack
	public void push(E element) {
		list.addFirst(element);
	}
	//removes element from the top of the stack
	public E pop() {
		return list.removeFirst();
	}
	// returns element from the top of the stack (peek)
	public E top() {
		return list.first();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
    //shows the top of the stack