package me.shinsunyoung.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.shinsunyoung.springbootdeveloper.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
