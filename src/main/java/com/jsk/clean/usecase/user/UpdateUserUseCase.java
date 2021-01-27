package com.jsk.clean.usecase.user;

import com.jsk.clean.domain.user.User;
import com.jsk.clean.domain.user.request.UserRequest;

import java.util.List;

public interface UpdateUserUseCase {
    User execute(UserRequest user, String id);
}
