import java.util.Scanner;

class Node
{
	int data;
	Node next;
}

class LinkedList
{ 
	Node head;
	public void InsertFirst(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
			node.next = head;
		  head = node;
		}
	
	public void insertLast(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head ==null)
		{
			head = node;
		}
		else
		{
			Node current = head;
			while(current.next!=null)
			{
				current = current.next;
				
			}
			current.next = node;
		}
		
	}
	public void insertSpecific(int index,int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(index==0)
		{
			InsertFirst( data);
		}
		else
		{	
		Node current  = head;
		for(int i=0;i<index-1;i++)
		{
			current = current.next;
		}
       node.next = current.next;
       current.next = node;
		}
	}
	public void deleteSpecificIndex(int index)
	{
		if(index == 0)
		{
			head = head.next;
			
		}
		else
		{		
		Node current  = head;
		for(int i=0;i<index-1;i++)
		{
			current = current.next;
		}
		Node deleted = current.next;
		current.next = deleted.next;
		System.out.println("Deleted is:" + deleted.data);
		deleted = null;
		}
	}
	public void show()
	{
		Node current = head;
		System.out.println("The list is");
		while(current!=null)
		{
			System.out.println(current.data);
			current = current.next;
		}
	}
	
}

public class MyList {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
System.out.println("Enter the operation that you want to perform:" + "1.insert front"+ "\n " + "2.insert Rear "+ "\n "+ 
		"3.insert at specific index" +  " \n " + "4.delete at specific index" + "\n"+ "5.display" );
		int choice  = sc.nextInt();
		switch(choice)
		{
		case 1 : System.out.println("Enter the data to be inserted");
		        int data = sc.nextInt();
		        l.InsertFirst( data);
		        break;
		        
		case 2 : System.out.println("Enter the data to be inserted");
				data = sc.nextInt();
				l.insertLast( data);
				break;  
				
		case 3 : System.out.println("Enter the data to be inserted and the index");
		      
		        data = sc.nextInt();
		        int index = sc.nextInt();
		l.insertSpecific( index,data);
		break; 
		case 4 : System.out.println("Enter the index from where you want to delete element");
		          index = sc.nextInt();
		         l.deleteSpecificIndex(index);
		         break;
		          
				
		case 5 : l.show();
		        break;
		}
		}
	
		
		
           
	}

}
