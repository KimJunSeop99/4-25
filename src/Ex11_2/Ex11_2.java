package Ex11_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
//		*CRUD Create Read Update Delete
//		push : 스택에 값을 추가(Create)
		st.push("0");
		st.push("1");
		st.push("2");
//		offer : q에 값을 추가(Create)
		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println(" = Stack = ");
		while (!st.empty()) {
//			pop : 스택에서 꺼낸값을 반환해줌 return (Read 와 Delete)
			System.out.println(st.pop());
		}

		System.out.println(" = Queue = ");
		while (!q.isEmpty()) {
//			poll : q에서 꺼낸 값을 반환해줌(return), 값이 없으면 반환값 = null
			System.out.println(q.poll());
		}

	}

}
