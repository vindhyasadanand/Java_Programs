import java.util.Scanner;

class Node
{
	int value;
	Node left;
	Node right;
	Node(int value)
	{
		this.value = value;
		this.left = null;
		this.right = null;
		
	}
}
class BinarySearchTree
{
	Scanner sc = new Scanner(System.in);
	
	Node insert(Node root)
	{
		System.out.println("Enter the value");
		int value = sc.nextInt();
		Node newnode = new Node(value);
		if(root==null)
		{
			root = newnode;
			return root;
		}
		Node current = root;
		Node prev = null;
		while(current!=null)
		{
			prev = current;
			if(value<current.value)
			{
				current = current.left;
			}
			else
			{
				current = current.right;
			}
		}
		if(prev.value>value)
		{
			prev.left = current;
		}
		else
		{
			prev.right = current;
		}
		return root;
	}
	void search(Node root)
	{
		if(root==null)
		{
			System.out.println("Empty tree");
		}
		System.out.println("Enter element to be Searched");
		int ele = sc.nextInt();
		Node current = root;
		while(current!=null)
		{
			if(current.value==ele)
			{
				System.out.println("Successful search");
				return;
			}
	    	else if(current.value<ele)
			{
				current = current.left;
			}
	    	else
	    	{
	    		current = current.right;
	    	}
			
		}
		System.out.println("Unsuccessful search");
		
		
      }
	Node remove(Node root)
	{
		Scanner sc = new Scanner(System.in);
		if(root==null)
		{
			System.out.println("Empty tree");
			return null;
		}
		System.out.println("Enter the element to be deleted");
		int key = sc.nextInt();
		Node parent = null;
		Node next = null;
		Node successor = null;
		Node current= root;
		while(current!=null)
		{
			if(current.value==key)
			{
				break;
			}
			parent = current;
			 if(current.value>key)
			{
				current = current.left;
			}
			else
			{
				current = current.right;
			}
		}
		//if key to be deleted is not present in the tree
		if(current==null)
		{
			System.out.println("Key doesnt exist");
			return root;
		}
		//to check it is leaf node / parent with one child
		if(current.left==null)
		{
			next = current.right;
		}
		//to check it is leaf node / parent with one child
		else if(current.right==null)
		{
			next = current.left;
		}
		else
		{
			successor = current.right;
			while(successor.left!=null)
			{
				successor = successor.left;
			}
			successor.left = current.left;
			next = current.right;
		}
		if(parent==null)
		{
			
			return next;
		}
		if(current==parent.left)
		{
			parent.left=next;
		}
		else
		{
			parent.right=next;
		}
		
		return root;
	}
}
public class Main {

	public static void main(String[] args) 
	{
		Node root = null;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        	System.out.println("Enter the choice");
        	int choice = sc.nextInt();
        	BinarySearchTree t = new BinarySearchTree();
        	switch(choice)
        	{
        		case 1: root = t.insert(root);
        		        break;
        		case 2: t.search(root);
        		         break;
        		
        	}
        	
        }
	}

}
