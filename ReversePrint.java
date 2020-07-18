import java.util.Scanner;

class Node
{
	int data;
	Node next;
	
	
}
class MyList
{ 
	//Node head = null;
	//to insert the element at the beginning of the linkedlist
	Node insert_front(Node head)
	{
		Scanner sc = new Scanner(System.in);
		Node temp = new Node();
		System.out.println("Enter the data to be inserted");
		 temp.data = sc.nextInt();
		temp.next = null;
		if(head==null)
		{
			
			return temp;
		}
		else {
			temp.next = head;
			
			
		}
		return temp;
	}
	//to print elements of the list in reversed manner
	void reversePrint(Node head)
	{
		if(head.next!=null)
		{
			reversePrint(head.next);
		}
		System.out.println(head.data);
		
	}
	//to display the List
	void display(Node head)
	{
		if(head==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node temp = head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}
}
public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t,count;
		Node head = null;
		//accept the number of test cases
		System.out.println("Enter the number of test cases");
		t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			MyList list = new MyList();
			System.out.println("Enter the list count");
		    count = sc.nextInt();
		    for(int j=0;j<count;j++)
		    {
		       head = 	list.insert_front(head);
		      // list.display(head);
		    }
		   list.display(head);
		   System.out.println("After reverse printing");
		   list.reversePrint(head);
		  
		}
		

	}

}
