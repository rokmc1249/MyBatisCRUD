package com.example.blog.controller;

import com.example.blog.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
