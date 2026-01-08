package org.quality5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.quality5.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByUserName(String user);
}