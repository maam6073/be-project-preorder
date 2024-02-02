package com.dohyeong.preorder.domain.member.entity;


import com.dohyeong.preorder.domain.common.BaseEntity;
import com.dohyeong.preorder.domain.follow.entity.Follow;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BaseEntity {

    //pk
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long member_id;


    //팔로우
    @OneToMany(mappedBy = "follower", fetch = FetchType.LAZY)
    private List<Follow> followings;

    @OneToMany(mappedBy = "following", fetch = FetchType.LAZY)
    private List<Follow> followers;

    //권한
    @Enumerated(EnumType.STRING)
    private MemberRole memberRole;

    //이메일
    @Column(nullable = false, unique = true)
    private String email;

    //이름
    @Column(nullable = false, unique = true)
    private String name;

    //닉네임
    @Column(nullable = false, unique = true)
    private String nickname;

    //비밀번호
    @Column(nullable = false, length = 100)
    private String password;

    //자기소개
    @Column(nullable = false)
    private String description;

    //사진 url
    @Column(nullable = false)
    private String profile_img;
}
