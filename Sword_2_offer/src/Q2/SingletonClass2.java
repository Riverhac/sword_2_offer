package Q2;
//ʹ��һ��������̬���ȡΨһ�Ķ���
public class SingletonClass2 {
	private SingletonClass2()
	{
		
	}
	public static SingletonClass2 getSC()
	{
		return Nested.sc;
	}
	
	static class Nested
	{
		Nested()
		{
			
		}
		static SingletonClass2 sc = new SingletonClass2();
	}
}
