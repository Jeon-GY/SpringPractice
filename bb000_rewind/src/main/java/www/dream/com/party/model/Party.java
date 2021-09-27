package www.dream.com.party.model;

import java.util.Date;

import lombok.Data;

@Data
public class Party {
	private String userId;		//로그인 ID
	private String userPwd;		//암호,암호화는 나중에
	private String name;	
	private Date birthDate;		//생일 년월일
	private boolean male;
	private boolean enabled;	//가입중... 탈퇴시 false
 	private Date registrationDate;	//등록시점
	private Date updateDate;	//수정시점

}
