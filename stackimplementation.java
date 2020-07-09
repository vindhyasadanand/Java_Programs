import java.util.Scanner;

public class Stack {
	private int stack[],size,top;
 private Scanner sc = new Scanner(System.in);
	public Stack()
	{
		top = -1;
		System.out.println("Enter the size of the stack");
		size = sc.nextInt();
	   stack = new int[size];
	  
		
	}
	
     public void push(int data)
     {
    	 if(top == size-1)
    	 {
    		 System.out.println("stack is full");
    		 return;
    	 }
    	 else
    	 {
    		 top++;
    		 stack[top] = data;
    	 }
     }
     public void pop()
     {
    	 if(top==-1)
    	 {
    		 System.out.println("Stack is empty");
    		 return;
    	 }
    	 else
    	 {
    		 System.out.println("Deleted item is"+ stack[top]);
    		 top--;
    	 }
     }
     public void display()
     {
    	 for(int i = top; i>=0;i--)
    	 {
    		 System.out.println(stack[i]);
    	 }
     }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		Stack st = new Stack();
       while(true)
       {
    	   System.out.println("enter the choice"+ "\n" + "1.push" + "\n" + "2.pop" + "\n" + "3.display");
    	   ch = sc.nextInt();
    	   int data;
    	   switch(ch)
    	   {
    	   case 1 : System.out.println("Enter the value data to be inserted");
    	            data = sc.nextInt();
    	            st.push(data);
    	            break;
    	   case 2: st.pop();
    	           break;
    	   case 3: st.display();
    	           break;
    	            
    	   }
       }
	}

}
