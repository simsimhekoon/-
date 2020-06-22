package com.test.project.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Board extends JpaRepository<Post, Integer> {
}
