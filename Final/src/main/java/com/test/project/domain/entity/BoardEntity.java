package com.test.project.domain.entity;

import lombok.*;

import javax.persistence.*;


@Entity(name = "post")
@Data
public class BoardEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer post_num;
    private String contents;
    private String title;
    private String userid;

    public BoardEntity(){}//기본생성자

    @Builder
    public BoardEntity(Integer post_num, String title, String contents, String userid) {
        this.post_num = post_num;
        this.userid = userid;
        this.title = title;
        this.contents = contents;
    }


}
