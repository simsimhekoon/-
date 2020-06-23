package com.test.project.controller;

import com.test.project.domain.entity.BoardEntity;
import com.test.project.domain.repository.BoardRepository;
import com.test.project.dto.BoardDto;
import com.test.project.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@Controller
@RequestMapping("/rest")
@RequiredArgsConstructor
public class RestController {
    private final BoardService boardService;
    private final BoardRepository boardRepository;
    //데이터 보내기
    @GetMapping("")
    public ModelMap get() {
        ModelMap modelMap = new ModelMap();
        List<BoardDto> boardList = boardService.getBoardlist();
        modelMap.addAttribute(boardList);
        return modelMap;
    }


    //데이터 받기
    @PostMapping("")
    public RedirectView insert(String title, String userID, String contents) {
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setTitle(title);
        boardEntity.setUserid(userID);
        boardEntity.setContents(contents);
        boardRepository.save(boardEntity);

        return new RedirectView("/list");
    }

}
