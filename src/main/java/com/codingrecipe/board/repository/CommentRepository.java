package com.codingrecipe.board.repository;

import com.codingrecipe.board.entity.BoardEntity;
import com.codingrecipe.board.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    List<CommentEntity> findAllByBoardEntityOrderByIdDes(BoardEntity boardEntity);
}
