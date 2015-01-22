package Q2;

public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SingletonClass sc1 = new SingletonClass(); //这样是不行的
		SingletonClass sc2 = SingletonClass.getSC();
		SingletonClass2 sc3 = SingletonClass2.getSC();
	}

}
