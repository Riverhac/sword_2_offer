package Q2;
//��ͨ�Ļ��Ψһ����ķ���
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
