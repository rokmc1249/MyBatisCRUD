package com.example.blog.mapper;

import com.example.blog.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {
    int boardCount();
    List<Board> getList();
    Board getBoard(Long boardId);
    void uploadBoard(Board board);

}
