import java.util.Scanner;
import java.util.Stack;

public class check_brackets {

	public static void main(String[] args) {
		
		
		
			String str1;
			Scanner sc = new Scanner(System.in);
			str1 = sc.next();
			char str[] = str1.toCharArray();
			int index=0,a=0;
			boolean balance = true;
			char top;
			
			Stack <Character> s1 = new Stack<>();
			while(index<str.length)
				{
				    if (s1.empty())
				    {	
				    	a=index;
				    }	
					if(str[index]=='['||str[index]=='{'||str[index]=='(')
					{	
						s1.push(str[index]);
					}	
					else
					{
						if((str[index]==']'||str[index]=='}'||str[index]==')'))
						{
						 if(s1.empty())
						{
							balance=false;
							break;
						}
						else
						{
							
							top = s1.pop();
						    if(( top =='[' && str[index]!=']')||( top=='{' && str[index]!='}')||( top=='(' && str[index]!=')'))
						    {
						    	balance=false;
								break;
						    }
						}
						}
					}
						index+=1;
				}
			if(balance&&s1.empty())
			{	
		       System.out.println("Success");
			}  
			else
			{
				if((index>=str.length)&&!s1.empty())
				{	
					System.out.println(a+1);
				}	
				else
				{
					System.out.println(index+1);
				}	
			}
		    return;
		}

	}


