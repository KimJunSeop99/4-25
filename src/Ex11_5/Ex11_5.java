package Ex11_5;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		for (String s : list) {
			System.out.println(s);
		}

//		이터레이터를 이용한 for 문 : 향상된 for문과 비슷함
//		Iterator it = list.iterator();
//
//		while (it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}
	}

}
