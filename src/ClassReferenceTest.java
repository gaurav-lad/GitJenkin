class WebDriver{
	WebDriver(){
		System.out.println("WebDriver's constructor");
	}
	void method() {
		System.out.println("WebDriver's Method");
	}
}

class FirefoxDriver extends WebDriver{
	FirefoxDriver(){
		System.out.println("FirefoxDriver's Constructor");
	}
	void method() {
		System.out.println("FirefoxDriver's Method");
	}
}

public class ClassReferenceTest {
	public static void main(String[] args) {
		System.out.println("Calling WebDriver: ");
		WebDriver p = new WebDriver();
		p.method();
		System.out.println("Calling FirefoxDriver: ");
		FirefoxDriver c = new FirefoxDriver();
		c.method();
	}
}
