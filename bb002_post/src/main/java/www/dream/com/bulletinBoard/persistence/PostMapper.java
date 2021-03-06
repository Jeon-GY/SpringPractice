package www.dream.com.bulletinBoard.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import www.dream.com.bulletinBoard.model.BoardVO;
import www.dream.com.bulletinBoard.model.PostVO;

public interface PostMapper {
	//LRCUD
	/* mapper 함수의 인자 개수가 여러개 일 때는 필수적으로 @Param을 넣어야한다
	 * 이를 실수하지 않기 위하여 한개여도 그냥 명시적으로 달아라 */
	public List<PostVO> getList(@Param("boardId") int boardId);
	
	/** id 값으로 Post 객체 조회*/
	public PostVO findPostById(String id);
	
	public int insert(@Param("board") BoardVO board, @Param("post") PostVO post);

	/** 게시글 수정 처리 */ 
	public int updatePost(PostVO post);
	/** id 값으로 Post 객체 삭제*/
	public int deletePostById(String id);
}
