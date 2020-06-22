package com.test.project.service;

import com.test.project.mapper.BoardMapper;
import com.test.project.vo.PostVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    BoardMapper boardMapper;
}

public int insertBoard(PostVO postVO) {
    return boardMapper.insertBoard(postVO);
}