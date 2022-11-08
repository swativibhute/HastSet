package HashsetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {


		HashSet set = new HashSet();
		set.add("swati");
		set.add(10);
		set.add("nayan");
		set.add("shailesh");
		set.add("swara");
		set.add("sharya");
		set.add("swati");
		
		 Iterator itr=set.iterator();
		 while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
