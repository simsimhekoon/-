package com.test.project.controller;

import com.test.project.data.PostData;
import com.test.project.dto.BoardDto;
import com.test.project.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@AllArgsConstructor
public class BoardController {
    private BoardService boardService;

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


}
