package chap16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main620 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("湊");
		names.add("朝香");
		names.add("菅原");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
	}

}