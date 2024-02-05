package com.dohyeong.preorder.domain.comment.dto;


import jakarta.persistence.*;
import lombok.Getter;

@Getter
public class CommentPostDto {
    private long post_id;

    @Column(length = 50)
    private String comment;
}
