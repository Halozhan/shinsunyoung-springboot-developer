package me.shinsunyoung.springbootdeveloper.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import me.shinsunyoung.springbootdeveloper.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
