import java.util.*;
public class MapoExmple {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("one", "Monday");
		map.put("second", "Tuesday");
		map.put("third", "Wednesday");
		map.put("third", "Thursday");
		Set set1 = map.keySet();
		Collection collection =map.values();
		Set set2 = map.entrySet();
		System.out.println(set1 + "\n"  +collection + "\n" +set2);
	}

}
