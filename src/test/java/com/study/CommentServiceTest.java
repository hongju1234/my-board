package com.study;

import com.study.domain.comment.CommentRequest;
import com.study.domain.comment.CommentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommentServiceTest {

    @Autowired
    CommentService commentService;

    private Long postId = 32356L;

    @Test
    void saveByForeach() {
        for (int i = 1; i <= 100; i++) {
            CommentRequest params = new CommentRequest();
            params.setPostId(postId);
            params.setContent(i + "번 게시글 내용");
            params.setWriter("테스터" + i);
            commentService.saveComment(params);
        }
    }
}
