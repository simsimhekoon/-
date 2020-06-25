package com.test.project.controller;

import com.test.project.domain.entity.BoardEntity;
import com.test.project.domain.repository.BoardRepository;
import com.test.project.dto.BoardDto;
import com.test.project.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@AllArgsConstructor
public class BoardController {
    private BoardService boardService;
    private final BoardRepository boardRepository;

    // 게시판 목록 페이지
    @RequestMapping("/list")
    public String selectList(Model model){
        return "list";
    }

    // 게시글 입력 폼 이동
    @RequestMapping("/insert")
    public String insert() {
        return "insert";
    }

    // 게시글 내용으로 이동
    @RequestMapping("/contents/{post_num}")
    public ModelAndView contents(@PathVariable Integer post_num){
        ModelAndView modelAndView = new ModelAndView("contents");
        BoardEntity boardEntity = boardRepository.findById(post_num).get();

        modelAndView.addObject("boardEntity", boardEntity);
        return modelAndView;
    }

    // 수정 화면으로 이동
    @RequestMapping("/update/{post_num}")
    public ModelAndView update(@PathVariable Integer post_num){
        ModelAndView modelAndView = new ModelAndView("update");
        BoardEntity boardEntity = boardRepository.findById(post_num).get();

        modelAndView.addObject("boardEntity", boardEntity);
        return modelAndView;
    }


}
