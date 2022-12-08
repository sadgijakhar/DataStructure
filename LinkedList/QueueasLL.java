package LinkedList;

class Node {
	int key;
	Node next;

	public Node(int key)
	{
		this.key = key;
		this.next = null;
	}
}
public class QueueasLL {
	Node front, rear;

	public QueueasLL() { 
        this.front = this.rear = null; 
    }

	void insert(int key){
		Node temp = new Node(key);
		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}
		this.rear.next = temp;
		this.rear = temp;
	}

	void delete(){
		if (this.front == null)
			return;

		Node temp = this.front;
		this.front = this.front.next;

		if (this.front == null)
			this.rear = null;
	}
	public static void main(String[] args)
	{
		QueueasLL q = new QueueasLL();
		q.insert(10);
		q.insert(20);
		q.delete();
		q.delete();
		q.insert(30);
		q.insert(40);
		q.insert(50);
		q.insert(60);
		q.delete();
		System.out.println("Queue Front : " + q.front.key);
		System.out.println("Queue Rear : " + q.rear.key);
	}
}


