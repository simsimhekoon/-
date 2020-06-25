package com.test.project.controller;

import com.test.project.domain.entity.BoardEntity;
import com.test.project.domain.repository.BoardRepository;
import com.test.project.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
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
        List<BoardEntity> boardEntity = boardService.get();
        modelMap.addAttribute(boardEntity);
        return modelMap;
    }

    //게시글 등록
    @PostMapping("")
    public RedirectView insert(String title, String userID, String contents) {
        final BoardEntity insert = boardService.insert(title, userID, contents);

        return new RedirectView("/list");
    }


    //게시글 삭제
    @DeleteMapping("/{post_num}")
    public String delete(@PathVariable("post_num") final Integer post_num) {
        Boolean deleteResult = boardService.delete(post_num);
        return "list";
    }


    //게시글 수정
    @PutMapping("/{post_num}")
    public ResponseEntity<BoardEntity> updatePost(@PathVariable("post_num") final Integer post_num, @RequestBody final BoardEntity boardEntity) {
        final BoardEntity updatePost = boardService.update(post_num, boardEntity);

        if (updatePost == null) {
            return new ResponseEntity<BoardEntity>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<BoardEntity>(updatePost, HttpStatus.OK);
    }
}
