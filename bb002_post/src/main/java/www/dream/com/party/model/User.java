package www.dream.com.party.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 회원
 * @author ivarBae
 */
@Data
@NoArgsConstructor
public class User extends Party {
	public User(String userId) {
		super(userId);
	}

}
