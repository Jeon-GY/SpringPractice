package www.dream.com.party.model;

import lombok.Data;

/**
 * 사장. 운영자 등록, 삭제 권한 있음
 * @author ivarBae
 */
@Data
public class Admin extends Party {@Override
	public String toString() {
		return "Admin [toString()=" + super.toString() + "]";
	}
	
}
