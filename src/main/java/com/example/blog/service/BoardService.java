package com.example.blog.service;

import com.example.blog.domain.Board;
import com.example.blog.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {
    private final BoardMapper boardMapper;

    public int boardCount(){return boardMapper.boardCount();}

    public List<Board> boardList(){return boardMapper.getList();}

    public Board getBoard(Long boardId){return boardMapper.getBoard(boardId);}

    @Transactional // DB 작업시 오류발생하면 RollBack 해주기 위해 선언
    public void uploadBoard(Board board){boardMapper.uploadBoard(board);}

    @Transactional // DB 작업시 오류발생하면 RollBack 해주기 위해 선언
    public void updateBoard(Board board){boardMapper.updateBoard(board);}

    @Transactional // DB 작업시 오류발생하면 RollBack 해주기 위해 선언
    public void deleteBoard(Long boardId){boardMapper.deleteBoard(boardId);}
}
