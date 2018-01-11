public class QueueDemo {
	int front;
	int rear;

	Integer[] a = new Integer[5]; 

	QueueDemo() {
		front = -1;
		rear = -1;
	}

	boolean isEmpty() {
		if ((front == -1) && (rear == -1)) {
			return true;
		} else {
			return false;
		}
	}

	boolean isFull() {
		if (rear == a.length - 1) {
			return true;
		} else {
			return false;
		}
	}
	
	void enqueue(int x) {
		if (isEmpty()==true) {
			front=rear=0;
			a[rear]=x;
			System.out.println(a[rear]);
		} else if (isFull()==true) {
			System.out.println("The array is full and can't be queued.");
			System.out.println();
		} else {
			//rear=rear+1;
			a[++rear]=x;
			System.out.println(a[rear]);
		}
	}
	
	void dequeue() {
		if (isEmpty()==true) {
			System.out.println("The array is empty and can't be dequeued.");
			System.out.println();
		} else if (front==rear) {
			System.out.println("The exited array element is: "+a[front]);
			a[front]= null;
			System.out.println("The exited array element now is not needed and the array elements is now set to value of:"+a[front]);
			front=rear=-1;
			System.out.println("The array is empty now.");
			System.out.println();
		} else {
			System.out.println("The exited array element is:"+a[front]);
			a[front]= null;
			System.out.println("The exited array element now is not needed and the array elements is now set to value of:"+a[front]);
			front++;
			System.out.println("The front array element now is:"+a[front]);
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {

		QueueDemo q = new QueueDemo();
		
		System.out.println("The default value set to front: "+q.front);
		System.out.println("The default value set to rear: "+q.rear);
		System.out.println();
		
		q.enqueue(21);
		q.enqueue(71);
		q.enqueue(101);
		q.enqueue(64);
		q.enqueue(78);
		q.enqueue(1);
		q.enqueue(7);
		q.enqueue(421);
		q.enqueue(371);
		q.enqueue(3101);
		q.enqueue(564);
		q.enqueue(718);
		q.enqueue(51);
		q.enqueue(447);
		System.out.println();
		
		for (int i = 0; i <= q.a.length - 1; i++) {
			System.out.println("Array index:"+i + ", Value:" + q.a[i]);
		}
		
		System.out.println();
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();

		for (int i = 0; i <= q.a.length - 1; i++) {
			System.out.println("Array index:"+i + ", Value:" + q.a[i]);
		}
	}
}
