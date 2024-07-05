import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;


public class Tdd
{
	public static void main(String[] args)
	{
		List<String> names = List.of("Alice","Bob","Charlie","David","Eve","Alice","Frank","Eve","George","Hannah");
		
		List<String> duplicates = DuplicateValues(names);
		
		duplicates.stream().forEach(System.out::println);
	}
	
	public static List<String> DuplicateValues(List<String> values)
	{
		List<String> duplicate = new ArrayList<>();
		Set<String> names = new HashSet<>();
		
		for(String name : values)
		{
			if(names.contains(name)||duplicate.contains(name))
			{
				duplicate.add(name);
			}
			else{
				names.add(name);
			}
		}
		return duplicate;
	}
}