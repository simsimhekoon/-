package com.test.project.controller;

import com.test.project.domain.entity.BoardEntity;
import com.test.project.domain.repository.BoardRepository;
import com.test.project.dto.BoardDto;
import com.test.project.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Map;

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


    //게시글 등록
    @PostMapping("")
    public RedirectView insert(String title, String userID, String contents) {
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setTitle(title);
        boardEntity.setUserid(userID);
        boardEntity.setContents(contents);
        boardRepository.save(boardEntity);

        return new RedirectView("/list");
    }


    //게시글 삭제
    @RequestMapping(value = "/{post_num}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("post_num") final Integer post_num) {
        Boolean deleteResult = boardService.delete(post_num);
        return "list";
    }


    //게시글 수정
    @RequestMapping(value = "/{post_num}", method = RequestMethod.PUT)
    public ResponseEntity<BoardEntity> updatePost(@PathVariable("post_num") final Integer post_num, @RequestBody final BoardEntity boardEntity) {
        final BoardEntity updatePost = boardService.update(post_num, boardEntity);

        if (updatePost == null) {
            return new ResponseEntity<BoardEntity>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<BoardEntity>(updatePost, HttpStatus.OK);
    }
}
