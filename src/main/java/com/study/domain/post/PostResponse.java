package com.study.domain.post;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostResponse {

    private Long id;                        // pk
    private String title;                   // 제목
    private String content;                 // 내용
    private String writer;                  // 작성자
    private int ViewCnt;                    // 조회 수
    private Boolean noticeYn;               // 공지글 여부
    private Boolean deleteYn;               // 삭제 여부
    private LocalDateTime createdDate;      // 생성일시
    private LocalDateTime modifiedDate;     // 최종 수정일시
}