package Ex11_16;

import java.util.*;

public class Ex11_16 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111"); // 오류
		map.put("asdf", "1234");

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.println("id : ");
			// trim : 입력값 앞 뒤 공백제거
			String id = s.nextLine().trim();

			System.out.println("password : ");
			// trim : 입력값 앞 뒤 공백제거
			// 같은 것을 비교할때 공백이 있으면 안됨
			String password = s.nextLine().trim();
			System.out.println();

			// HashMap 자료구조의 키값이 있는지 확인하는 메소드
			// 있으면 true , 없으면 false
			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue; // 아래의 로직 실행을 안시키고 반복문 재실행
			}
			// id가 있으면 패스워드 같은지 체크
			// get : 매개변수 key를 넣으면 hashMap의 값(password)
			if (!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			} else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break; // 무한루프 종료
			}
		}

	}

}
