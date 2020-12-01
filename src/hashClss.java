import java.util.HashMap;
import java.util.Set;

public class hashClss {

	public static void main(String[] args) {
		HashMap<String, Integer> ids = new HashMap<String, Integer>();
		ids.put("Negative Pow", 5);
		ids.put("Sally", 345);
		
		ids.put("Sally", ids.getOrDefault("Sally", 0)+1);
		
		
		Set<String> keys = ids.keySet();

		for(String key: keys) {
			System.out.println(key);
			System.out.println(ids.get(key));
		}
		
	}

}
