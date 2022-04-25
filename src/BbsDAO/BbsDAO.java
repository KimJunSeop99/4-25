package BbsDAO;

import java.util.ArrayList;

public class BbsDAO {

	ArrayList<BbsDTO> data;
	int count = 0;

	// 기본생성자
	public BbsDAO() {
		// 자료구조 생성 : BbsDTO
		data = new ArrayList<BbsDTO>();
	}

	// Create : 입력메소드
	public void create(BbsDTO bbs) {
		count = count + 1;
		data.add(bbs);
		// bbs쪽에 setter 이용해서 저장 : np (넘버)
		// 글번호 : no
		bbs.setNo(count);
	}

	// Read : no에 해당하는 특정 글읽기
	public BbsDTO read(int no) {
		// ArrayList data : 전체 글목록을 가지고 있는 자료구조
		// 매개변수 글번호에 해당하는게 있으면 반환
		for (BbsDTO item : data) {
			if (item.getNo() == no) {
				return item;
			}
		}
		return null;
	}

	// Read All : 전체 글읽기
	public ArrayList<BbsDTO> readAll() {
		// ArrayList data : 전체글
		return data;
	}

	// Delete : 글 지우기
	// item : 전체 글 중에 하나
	// no : 글번호
	public void delete(int no) {
		for (BbsDTO item : data) {
			if (item.getNo() == no) {
				data.remove(item);
			}
		}
	}
	// Update : 글수정
	public void update(BbsDTO bbs) {
		// 아무것도 안함
	}
}
