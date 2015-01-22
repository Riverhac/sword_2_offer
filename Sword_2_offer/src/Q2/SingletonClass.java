package Q2;
//普通的获得唯一对象的方法
public class SingletonClass {
		
		private SingletonClass()
		{
			
		}
		private static SingletonClass sc = null;
		public static SingletonClass getSC()
		{
			if(sc==null)
			{
				sc = new SingletonClass();
			}
			return sc;
		}
}
