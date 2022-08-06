

public class SingleyLinkedList<T> {
//implement node 
	private static class Node<T> {
		private T element;
		private Node<T> next;
		public Node(T e, Node<T> n) {
			element = e;
			next = n;
			
		}
		public T getElement() {
			return element;
			
		}
		public Node<T> getNext(){
			return next; 
		}
		public void setNext(Node<T> n) {
			next = n;
		}
	}
	//implement the list 
	
	private Node<T> head = null;
	private Node<T> tail = null;
	private int size = 0;
	
	public SingleyLinkedList() {};
	
	public int size() {
		return size;
	}
	
	//returns if empty if the size is == 0 
	public boolean isEmpty() {
		return size == 0;
	}
	
	//gets first element of list. if empty returns null (Top of the stack)
	public T first() {
		if(isEmpty()) {
			return null;
		}
		
		return head.getElement();	
	}
	
	//returns last element of the list  (bottom of the stack)
	public T last() {
		if(isEmpty()) {
			return null;
		
		}
	return tail.getElement();
	}
	
    //points to new element, adds system log
	public void addFirst(T e) {
		head = new Node<>(e,head);
		if (size==0) {
			tail = head;
		}
		size++;
		System.out.println("added head node with"+ head.getElement() + "'element ");
	}
	
	//adds element to tail
	public void addLast(T e) {
		Node<T> newNode = new Node<>(e, null);
		if(isEmpty()) {
			head = newNode;
		}else {
			tail.setNext(newNode);
		}
		tail = newNode;
		size++;
		System.out.println("added tail node with"+ tail.getElement() + "'element ");
	}
	
	// removes element from top of the stack
	public T removeFirst() {
		if(isEmpty()){
			return null;
		}
		T answer = head.getElement();
		head = head.getNext();
		size--;
		if(size == 0) {
			tail = null;
		}
		System.out.println("Removed head node");
		return answer;
		}
	}
	
