package com.test.project.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.test.project.data.PostData;
import com.test.project.domain.entity.BoardEntity;
import com.test.project.domain.repository.BoardRepository;
import com.test.project.dto.BoardDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class BoardService {

    private BoardRepository boardRepository;

    @Transactional
    public List<BoardDto> getBoardlist() {
        List<BoardEntity> boardEntities = boardRepository.findAll();
        List<BoardDto> boardDtoList = new ArrayList<>();

        for(BoardEntity boardEntity : boardEntities) {
            BoardDto boardDto = BoardDto.builder()
                    .post_num(boardEntity.getPost_num())
                    .title(boardEntity.getTitle())
                    .contents(boardEntity.getContents())
                    .userid(boardEntity.getUserid())
                    .build();

            boardDtoList.add(boardDto);
        }

        return boardDtoList;
    }


    public Boolean delete(final Integer post_num) {
        final Optional<BoardEntity> boardEntity = boardRepository.findById(post_num);
        if(boardEntity == null) {
            return false;
        } else {
            boardRepository.deleteById(post_num);
            return true;
        }
    }
}
