package Ex11_4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
// 자동 import 필요
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 10;

	private static void save(String input) {
//		offer : 큐에 저장
//		빈문자를 제외한 문자열이 들어오면
//		큐에 저장
		if (!"".equals(input))
			q.offer(input);
//		큐의 최대 크기를 제한
		if (q.size() > MAX_SIZE)
//			큐의 삭제 + 삭제한 자료를 읽기 메소드 (Read + Delete)
//			poll == remove
			q.remove();
	}

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

		while (true) {
			System.out.println(">>");
			try {
//				화면 입력 받기
				Scanner s = new Scanner(System.in);
//				한 라인씩 입력 받고 , trim (앞 뒤 공백을 지움)
				String input = s.nextLine().trim();

//				입력여부 유효성 체크 : 아무값도 없으면 위로 올림
				if ("".equals(input))
					continue;
//				equalsIgnoreCase : 대소문자 구별하지않고 동일한지 비교
				if (input.equalsIgnoreCase("q")) {
//					자바 프로그램 강제 종료 명령
//					무한 루프 탈출
					System.exit(0);
//					입력값이 help이면 도움말 보여주기
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를" + MAX_SIZE + "개 보여줍니다.");
//					history : 최근 입력된 명령어를 모두 보여주기
//					history 명령어를 입력하면
//					기존에 저장된 모든 명령어를 화면에 출력
				} else if (input.equalsIgnoreCase("history")) {
					int i = 0;
//					큐에 자료 저장
					save(input);
					
					LinkedList tmp = (LinkedList) q;
//					향상된 for문 같이 반복문을 돌리기 위해
					ListIterator it = tmp.listIterator();

					while (it.hasNext()) // it 안의 자료가 없을때까지 반복
//						next : 자료를 읽고 다음으로 넘어감
						System.out.println(++i + "." + it.next());
				} else {
//					명령문이니까 모든 자료를 큐에 저장
					save(input);
//					저장된 명령문 출력
					System.out.println(input);
				}
			} catch (Exception e) {
				System.out.println("입력오류입니다.");
			}
		}

	}

}
