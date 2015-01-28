package Q41;

import java.util.ArrayList;
import java.util.List;

//����һ��������ӡ�����еĺ�Ϊ���������������.����һ��startһ��end����start��end�ĺʹ���numberʱ��start++��
//��start��end�ĺ�С��snumberʱ��end++��
public class mainclass2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> listlist = solve(15);
		for(List<Integer> list:listlist)
		{
			for(int temp:list)
			{
				System.out.print(temp+" ");
			}
			System.out.println("");
		}
	}
	public static List<List<Integer>> solve(int number)
	{
		List<List<Integer>> listlist = new ArrayList<List<Integer>>();
		int start = 1;
		int end = 2;
		int sum = 3;
		while(start<(number+1)/2)
		{
			if(sum == number) 
			{	
				List<Integer> list = new ArrayList<Integer>();
				for(int i=start;i<=end;i++)
				{
					list.add(i);
				}
				listlist.add(list);
				
				end++;
				sum += end;
			}
			else
				if(sum > number)
				{	
					sum -= start;
					start++;
				}
				else
				{
					end++;
					sum += end;
				}
		}
		return listlist;
	}
}
