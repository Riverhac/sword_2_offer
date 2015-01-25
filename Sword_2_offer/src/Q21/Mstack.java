package Q21;
//构造带有min函数的栈
import java.util.Stack;

public class Mstack {
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;
	
	public void push(int item)
	{	
		stack1.push(item);
		if(stack1.isEmpty())  
		{		
			stack2.push(item);
		}
		else
		{
			if(item > stack2.peek()) 
				stack2.push(item);
			else stack2.push(stack2.peek());
		}
	}
	
	public int pop()
	{
		if(!stack1.isEmpty())
		{
			stack2.pop();
			return stack1.pop();
		}
		else return Integer.MIN_VALUE;
	}
	
	public int min()
	{	
		
		if(!stack1.isEmpty())
		{
			return stack1.peek();
		}
		else return Integer.MIN_VALUE;
	}
}
