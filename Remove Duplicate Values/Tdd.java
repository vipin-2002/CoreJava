import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Tdd
{
	public static void main(String[] args)
	{
		List<String> names = List.of("Alice","Bob","Charlie","David","Eve","Alice","Frank","Eve","George","Hannah");
		
		Set<String> unique = removeDuplicates(names);
		
		unique.stream().forEach(System.out::println);
	}
	
	public static Set<String> removeDuplicates(List<String> values)
	{
		Set<String> uniqueValues = new HashSet<>();
		
		for(String name : values)
		{
			uniqueValues.add(name);
		}
		return uniqueValues;
	}
}	