//package com.study;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
//import com.study.domain.post.PostMapper;
//import com.study.domain.post.PostRequest;
//import com.study.domain.post.PostResponse;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
//public class PostMapperTest {
//
//    @Autowired
//    PostMapper postMapper;
//
//    @Test
//    void save() {
//        PostRequest params = new PostRequest();
//        params.setTitle("게시글 제목 테스트");
//        params.setContent("게시글 내용 테스트");
//        params.setWriter("tester");
//        params.setNoticeYn(false);
//        postMapper.save(params);
//
//        List<PostResponse> posts = postMapper.findAll();
//        System.out.println("전체 게시글 개수는 : " + posts.size() + "개입니다.");
//
//    }
//
//    @Test
//    void findById() {
//        PostResponse post = postMapper.findById(1L);
//        try {
//            // 게시글 응답 객체를 JSON 문자열로 변환하여 콘솔에 출력
//            String postJson = new ObjectMapper().
//                    registerModule(new JavaTimeModule()).writeValueAsString(post);
//            System.out.println(postJson);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Test
//    void update() {
//        // 1. 게시글 수정
//        PostRequest params = new PostRequest();
//        params.setId(1L);
//        params.setTitle("게시글 제목 수정 테스트");
//        params.setContent("게시글 내용 수정 테스트");
//        params.setWriter("tester 수정");
//        params.setNoticeYn(true);
//        postMapper.update(params);
//
//        // 2. 게시글 상세정보 조회
//        PostResponse post = postMapper.findById(1L);
//        try {
//            String postJson = new ObjectMapper().
//                    registerModule(new JavaTimeModule()).writeValueAsString(post);
//            System.out.println(postJson);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Test
//    void delete() {
//        System.out.println("삭제 이전의 전체 개시글 개수는 : " + postMapper.findAll().size() + "개입니다.");
//        postMapper.deleteById(1L);
//        System.out.println("삭제 이후의 전체 개시글 개수는 : " + postMapper.findAll().size() + "개입니다.");
//    }
//}
