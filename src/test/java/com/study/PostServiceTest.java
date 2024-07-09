package com.study;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.study.domain.post.PostRequest;
import com.study.domain.post.PostResponse;
import com.study.domain.post.PostService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PostServiceTest {

    @Autowired
    PostService postService;

    private Long postId;

//    @BeforeEach
//    void setUp() {
//        // 게시글을 저장하고 ID를 받아옵니다.
//        PostRequest params = new PostRequest();
//        params.setTitle("게시글 제목 테스트");
//        params.setContent("게시글 내용 테스트");
//        params.setWriter("tester");
//        params.setNoticeYn(false);
//        postId = postService.savePost(params);
//    }

//    @Test
//    void save() {
//        PostRequest params = new PostRequest();
//        params.setTitle("게시글 제목 테스트");
//        params.setContent("게시글 내용 테스트");
//        params.setWriter("tester");
//        params.setNoticeYn(false);
//        Long id = postService.savePost(params);
//        System.out.println("생성된 게시글 ID : " + id);
//
//        List<PostResponse> posts = postService.findAllPost();
//        System.out.println("전체 게시글 개수는 : " + posts.size() + "개입니다.");
//    }

    @Test
    void findById() {
        PostResponse post = postService.findPostById(postId);
        try {
            // 게시글 응답 객체를 JSON 문자열로 변환하여 콘솔에 출력
            String postJson = new ObjectMapper().
                    registerModule(new JavaTimeModule()).writeValueAsString(post);
            System.out.println(postJson);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void update() {
        // 게시글 수정
        PostRequest updateParams = new PostRequest();
        updateParams.setId(postId);
        updateParams.setTitle("게시글 제목 수정 테스트");
        updateParams.setContent("게시글 내용 수정 테스트");
        updateParams.setWriter("tester 수정");
        updateParams.setNoticeYn(true);
        postService.updatePost(updateParams);

        // 수정된 게시글 조회
        PostResponse post = postService.findPostById(postId);
        try {
            String postJson = new ObjectMapper().
                    registerModule(new JavaTimeModule()).writeValueAsString(post);
            System.out.println(postJson);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

//    @Test
//    void delete() {
//        System.out.println("삭제 이전의 전체 개시글 개수는 : " + postService.findAllPost().size() + "개입니다.");
//        postService.deletePost(postId);
//        System.out.println("삭제 이후의 전체 개시글 개수는 : " + postService.findAllPost().size() + "개입니다.");
//    }

    @Test
    void saveByForeach() {
        for (int i = 1; i <= 1000; i++) {
            PostRequest params = new PostRequest();
            params.setTitle(i + "번 게시글 제목");
            params.setContent(i + "번 게시글 내용");
            params.setWriter("테스터" + i);
            params.setNoticeYn(false);
            postService.savePost(params);
        }
    }
}
