package com.test.project.controller;

import com.test.project.dto.BoardDto;
import com.test.project.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class BoardController {
    BoardService boardService;

    // 게시판 목록 페이지
    @RequestMapping("/list")
    public String selectList(){
        return "list";
    }
    // 게시글 입력 폼 이동
    @RequestMapping("/insert")
    public String insert() {
        return "insert";
    }


    public String insert(BoardDto boardDto) {
        boardService.savePost(boardDto);

        return "redirect:/";
    }
}
