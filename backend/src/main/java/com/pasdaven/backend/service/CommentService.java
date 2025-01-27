package com.pasdaven.backend.service;

import com.pasdaven.backend.model.CommentEntity;
import com.pasdaven.backend.repo.CommentRepo;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CommentService {

    private final CommentRepo commentRepo;

    public CommentService(CommentRepo commentRepo) {
        this.commentRepo = commentRepo;
    }
}
