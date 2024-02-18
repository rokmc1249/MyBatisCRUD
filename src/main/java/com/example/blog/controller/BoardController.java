package com.example.blog.controller;

import com.example.blog.domain.Board;
import com.example.blog.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/hello")
    public String Hello(Model model){
        model.addAttribute("cnt",boardService.boardCount());
        return "/boards/first";
    }

    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("cnt",boardService.boardCount());
        model.addAttribute("test",boardService.boardList());
        return "/boards/hello";
    }

    @GetMapping("/main")
    public String getAllList(Model model){
        model.addAttribute("list",boardService.boardList());
        return "/boards/main";
    }

    @GetMapping("/view")
    public String viewBoard(Model model,@RequestParam Long boardId){
        model.addAttribute("view",boardService.getBoard(boardId));
        return "/boards/view";
    }

    @GetMapping("/upload")
    public String uploadBoardForm(){
        return "/boards/upload";
    }

    @PostMapping("/upload")
    public String uploadBoard(Board board){
        boardService.uploadBoard(board);
        return "redirect:/board/main";
    }

    @PutMapping("/update")
    public String updateBoard(Board board){
        boardService.updateBoard(board);
        return "redirect:/board/main";
    }

    @DeleteMapping("/delete")
    public String deleteBoard(@RequestParam Long boardId){
        boardService.deleteBoard(boardId);
        return "redirect:/board/main";
    }
}
