package Q7;

import java.util.Stack;

//使用两个栈实现队列
public class stack2queue<T> {
	
	Stack<T> stacktail = new Stack<T>();
	Stack<T> stackhead = new Stack<T>();
	public  void  appendTail(T a)
	{
		stacktail.push(a);
	}
	public  void deleteHead()
	{	
		if(stackhead.isEmpty())
		{	
			if(stacktail.isEmpty()) System.out.println("ERRO!");
			while(!stacktail.isEmpty())
			{
				stackhead.push(stacktail.pop());
			}
		}
		stackhead.pop();
	}

}
