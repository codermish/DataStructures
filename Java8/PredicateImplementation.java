package Java8;
import java.util.function.Predicate;
public class PredicateImplementation {

	public static void main(String[] args) {
		
		
		
		Predicate<String> val = s -> s.length() >5;
		
		System.out.print(val.test("an"));
		

	}

}
