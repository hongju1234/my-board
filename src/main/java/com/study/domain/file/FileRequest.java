package com.study.domain.file;

import lombok.Builder;
import lombok.Getter;

@Getter
public class FileRequest {

    private Long id;                // 파일 번호 (PK)
    private Long postId;            // 게시글 번호 (FK)
    private String originalName;    // 원본 파일명
    private String saveName;        // 저장 파일명
    private long size;              // 파일 크기

    @Builder
    public FileRequest(String originalName, String saveName, long size) {
        this.originalName = originalName;
        this.saveName = saveName;
        this.size = size;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    /* 객체 생성 시 사용 예시 */
//    // 일반적인 생성자를 통한 객체 생성
//    FileRequest fileRequest = new FileRequest("테스트.txt", "abcdeabcde.txt", 10768);
//
//    // 빌더 패턴을 통한 객체 생성 1
//    FileRequest fileRequest = FileRequest.builder()
//            .originalName("테스트.txt")
//            .saveName("abcdeabcde.txt")
//            .size(10768)
//            .build();
//
//    // 빌더 패턴을 통한 객체 생성 2
//    FileRequest fileRequest = FileRequest.builder()
//            .size(10768)
//            .saveName("abcdeabcde.txt")
//            .originalName("테스트.txt")
//            .build();
//
//    // 빌더 패턴을 통한 객체 생성 3
//    FileRequest fileRequest = FileRequest.builder()
//            .saveName("abcdeabcde.txt")
//            .build();


}