public class Queue {
	int size,queue[],rear,front;
	Scanner sc = new Scanner(System.in);
	
	public Queue()
	{
		System.out.println("Enter the size of the queue");
		size = sc.nextInt();
		queue = new int[size];
		front = 0;
		rear = -1;
	}
	public void insert(int data)
	{
		//to check queue is full
		if(rear==size-1)
		{
			System.out.println("Queue is full");
			
		}
		else
		{
			rear++;
			queue[rear] = data;
		}
	}
 
 public void delete()
 {
	 if(front>rear)
	 {
		 System.out.println("Que is empty");
	 }
	 else
	 {
		 System.out.println("Deleted element is" + queue[front]);
		 front++;
	 }
 }
 
 public void display()
 {
	 for(int i=front;i<=rear;i++)
	 {
		 System.out.println(queue[i]);
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		Scanner sc = new Scanner(System.in);
		int choice;
		while(true)
		{ 
			
			System.out.println("Enter the choice" + "\n" + "1.insert "+ "\n"+ "2.delete"+ "\n" + "3.display"  );
			choice = sc.nextInt();
			int data;
			switch(choice)
			{
			case 1 : System.out.println("Enter the data to be inserted");
			       data = sc.nextInt();
			       q.insert(data);
			        break;
		        
			case 2 : q.delete();
			        break;
			 
				
			
			case 3: q.display();
			         break;
			
			
			
			 
			        
			}
		}

	}

}
/*
 * enqueue means inserting element inside the queue
 * dequeue removing element from the queue
 * insertion takes in rear end
 * deletion takes from  front
 * initially front = 0 and rear = -1  */
 
