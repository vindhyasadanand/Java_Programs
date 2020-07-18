import java.util.Scanner;
class Node
{
	int data;
	Node next;
}
class MyList
{
	Scanner sc= new Scanner(System.in);
	Node insert_front(Node head)
	{
		
		Node temp = new Node();
		temp.next = null;
		temp.data = sc.nextInt();
		if(head==null)
		{
			return temp;
		}
		else
		{
			temp.next = head;
		}
		return temp;
		
	}
	 boolean compareLists(Node head1, Node head2)
     {
         
           Node cur = head1;
         int count1 = 0,count2=0;
         //find the length of first linkedlist
          while(cur!=null)
          {
              count1++;
              cur = cur.next;
          }
          cur = head2;
          //find the length of second linkedlist
          while(cur!=null)
          {
              count2++;
               cur = cur.next;
          }
          //if length of both linkedlists are equal 
          if(count1==count2)
          {
              //we are looing through two lists
              while(head1!=null && head2!=null)
               {    //checking data of two lists are not eual
                   if(head1.data!=head2.data)
                   {
                        return false;
                   }
                   head1 = head1.next;
                   head2 = head2.next;
               }
               return true;
          }
          //if length of two lists are not equal then definately they are different
          else
          {
              return false;
          }  
          
         
    }
}

public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nodes1,nodes2;
		Node head1 = null;
		Node head2 = null;
		System.out.println("Enter Number of Test cases");
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			MyList list  = new MyList();
			System.out.println("Enter number of nodes in list1");
			nodes1 = sc.nextInt();
			for(int j=0;j<nodes1;j++)
			{
				head1 = list.insert_front(head1);
			}
			
			System.out.println("Enter number of nodes in list2");
			nodes2 = sc.nextInt();
			for(int j=0;j<nodes2;j++)
			{
				head2 = list.insert_front(head2);
			}
			
			System.out.println(list.compareLists(head1, head2));
			
		}
		

	}

}
