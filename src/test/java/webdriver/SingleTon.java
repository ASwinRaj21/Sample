package webdriver;

public class SingleTon {
	private SingleTon() {}
	
	public static SingleTon s1 = null;
	
	public static SingleTon getInstance() {
		if(s1==null) {
			s1= new SingleTon();
		}
		return s1;
		}
	
	
	
	public static void main(String[] args) {
		SingleTon s = new SingleTon();
		System.out.println(System.identityHashCode(s));
		
	}
}