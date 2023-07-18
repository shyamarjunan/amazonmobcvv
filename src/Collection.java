import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(105);
		l.add(205);
		l.add(305);
		l.add(405);
		l.add(505);	
		l.add(605);
		l.add(705);
		l.add(805);

		System.out.println(l);
		Set<Integer> s=new HashSet<>();
	 s.addAll(l);
		for (Integer integer : s) {
			System.out.println(integer);
		}		
		System.out.println("modified codes");
}
	}