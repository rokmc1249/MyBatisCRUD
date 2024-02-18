package com.example.blog.mapper;

import com.example.blog.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {

    // 총 게시글 수
    int boardCount();

    // 전체 게시글 조회
    List<Board> getList();

    // id를 이용해 게시글 조회
    Board getBoard(Long boardId);

    // 게시글 생성
    void uploadBoard(Board board);

    // 게시글 수정
    void updateBoard(Board board);

    // id를 이용해 게시글 삭제
    void deleteBoard(Long boardId);

}
