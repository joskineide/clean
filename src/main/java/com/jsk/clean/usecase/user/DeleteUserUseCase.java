package com.jsk.clean.usecase.user;

import com.jsk.clean.domain.user.User;

import java.util.List;

public interface DeleteUserUseCase {
    void execute(String id);
}
