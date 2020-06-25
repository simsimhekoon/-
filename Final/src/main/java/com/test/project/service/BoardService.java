package com.test.project.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.test.project.domain.entity.BoardEntity;
import com.test.project.domain.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;



@AllArgsConstructor
@Service
public class BoardService {

    private BoardRepository boardRepository;

    //JSP로 데이터전송
    public List<BoardEntity> get() {
        List<BoardEntity> boardEntities = new ArrayList<>();
        List<BoardEntity> length = boardRepository.findAll();

        for(BoardEntity boardEntity : length) {
            boardEntity = BoardEntity.builder()
                    .post_num(boardEntity.getPost_num())
                    .title(boardEntity.getTitle())
                    .contents(boardEntity.getContents())
                    .userid(boardEntity.getUserid())
                    .build();

            boardEntities.add(boardEntity);
        }


        return boardEntities;
    }

    //추가
    public BoardEntity insert(String title, String userID, String contents) {
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setTitle(title);
        boardEntity.setUserid(userID);
        boardEntity.setContents(contents);
        boardRepository.save(boardEntity);

        return boardEntity;
    }


    //삭제
    public Boolean delete(final Integer post_num) {
        final Optional<BoardEntity> boardEntity = boardRepository.findById(post_num);
        if(boardEntity == null) {
            return false;
        } else {
            boardRepository.deleteById(post_num);
            return true;
        }
    }

    //수정
    public BoardEntity update(final Integer post_num, final BoardEntity boardEntity) {
        final BoardEntity updatePost = boardRepository.findById(post_num).orElse(null);
        if (updatePost == null) {
            return null;
        }
        updatePost.setContents(boardEntity.getContents());
        updatePost.setUserid(boardEntity.getUserid());
        updatePost.setTitle(boardEntity.getTitle());
        boardRepository.save(updatePost);

        return updatePost;
    }
}
