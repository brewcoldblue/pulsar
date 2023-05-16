package com.hammer.pulsar.dao;

import java.util.List;

// 추천 정보를 저장하고 있는 Like 테이블과 통신하는 DAO
public interface LikeDao {
    // 선택한 게시글의 추천수를 조회하는 메서드
    public int selectLikes(int articleId);

    // 회원이 선택한 게시글에 추천한 적있는지 조회하는 메서드
    public boolean selectLikeByMemberId(int articleId, int memberId);

    // 회원이 추천한 게시글 번호 목록을 조회하는 메서드
    public List<Integer> selectLikedByMemberId(int memberId);

    // 회원이 선택한 게시글에 추천을 추가하는 메서드
    public boolean insertLike(int articleId, int memberId);

    // 회원이 선택한 게시글에 추천을 삭제하는 메서드
    public boolean deleteLike(int articleId, int memberId);
}
