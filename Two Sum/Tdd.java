import java.util.*;

public class Tdd {
    public static void main(String[] args) {
        int[] numbers = {7, 8, 5, 6, 9};
        int target = 11;
        
        List<String> results = twoSum(numbers, target);
        
        results.forEach(System.out::println);
    }
    
    public static List<String> twoSum(int[] values, int target)
	{
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < values.length; i++)
		{
            for(int j = i + 1; j < values.length; j++)
			{
                if(values[i] + values[j] == target) 
				{
                    String value = "numbers[" + i + "] + numbers[" + j + "] = " + target;
                    result.add(value);
                }
            }
        }
        
        return result;
    }
}
