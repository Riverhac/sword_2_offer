package Q2;
//使用一个诶不静态类获取唯一的对象
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
