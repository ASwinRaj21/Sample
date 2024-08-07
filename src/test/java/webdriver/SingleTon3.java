package webdriver;

public class SingleTon3 {
	public static void main(String[] args) {
		SingleTon s3 = SingleTon.getInstance();
		System.out.println(System.identityHashCode(s3));
	}

}
