package webdriver;

public class SingleTon2 {
	public static void main(String[] args) {
		SingleTon s1 = SingleTon.getInstance();
		System.out.println(System.identityHashCode(s1));
		
	}

}
