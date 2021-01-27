package com.jsk.clean.usecase.user.impl;

import com.jsk.clean.gateway.UserGateway;
import com.jsk.clean.usecase.user.DeleteUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteUserUseCaseImpl implements DeleteUserUseCase {

    private final UserGateway userGateway;

    @Override
    public void execute(String id){
        userGateway.delete(id);
    }
}
