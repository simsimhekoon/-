package com.test.project.dto;

import com.test.project.domain.entity.BoardEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Integer post_num;
    private String userid;
    private String title;
    private String contents;

    public BoardEntity toEntity(){
        BoardEntity boardEntity = BoardEntity.builder()
                .post_num(post_num)
                .userid(userid)
                .title(title)
                .contents(contents)
                .build();
        return boardEntity;
    }

    @Builder
    public BoardDto(Integer post_num, String title, String contents, String userid) {
        this.post_num = post_num;
        this.userid = userid;
        this.title = title;
        this.contents = contents;
    }
}
