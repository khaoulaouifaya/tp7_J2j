package tp7_D2j;

public class TestReflectionAnnotation {

	public static void main(String[] args) {
		Class c = CalculatriceMath.class;
		programmers programmer = (programmers)
	c.getAnnotation(programmers.class);
	System.out.println(programmer.id()+":"+programmer.name());

	}
	
	
	
}
