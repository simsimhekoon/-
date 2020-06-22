package com.test.project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController2 {
    private final Board board;

    @GetMapping("/post/{postNum}")
    public Post get(@PathVariable("postNum") Integer postNum) {
        return board.findById(postNum).get();
    }
}
