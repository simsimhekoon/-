package com.test.project.domain.repository;

import com.test.project.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface BoardRepository extends JpaRepository<BoardEntity, Integer>, CrudRepository<BoardEntity, Integer> {
}
