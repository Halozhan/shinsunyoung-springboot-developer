package me.shinsunyoung.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.shinsunyoung.springbootdeveloper.domain.Article;

@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자
@Getter
public class AddArticleRequest {
    private String title;

    private String content;

    public Article toArticle() {
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
