package com.test.project.controller;

import com.test.project.dto.BoardDto;
import com.test.project.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@Controller
@RequestMapping("/rest")
@RequiredArgsConstructor
public class RestController {
    private final BoardService boardService;
    //데이터 보내기
    @GetMapping("")
    public ModelMap get() {
        ModelMap modelMap = new ModelMap();
        List<BoardDto> boardList = boardService.getBoardlist();
        modelMap.addAttribute(boardList);
        return modelMap;
    }

    //데이터 받기
    @PostMapping("/post")
    public String write(BoardDto boardDto) {
        boardService.savePost(boardDto);

        return "redirect:/";
    }
//    @PostMapping("")
//    public ModelMap get2() {
//        ModelMap modelGet = new ModelMap();
//        List<BoardDto> boardList = boardService.getBoardlist();
//        modelGet.addAttribute(boardList);
//        return modelGet;
//    }
}
