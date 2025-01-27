package com.pasdaven.backend.service;

import com.pasdaven.backend.model.FollowBoardEntity;
import com.pasdaven.backend.repo.FollowBoardRepo;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class FollowBoardService {

    private final FollowBoardRepo followBoardRepo;

    public FollowBoardService(FollowBoardRepo followBoardRepo) {
        this.followBoardRepo = followBoardRepo;
    }
}
