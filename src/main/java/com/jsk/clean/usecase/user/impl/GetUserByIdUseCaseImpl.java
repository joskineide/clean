package com.jsk.clean.usecase.user.impl;

import com.jsk.clean.converter.UserGatewayResourceToUserConverter;
import com.jsk.clean.domain.user.User;
import com.jsk.clean.gateway.UserGateway;
import com.jsk.clean.usecase.user.GetUserByIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetUserByIdUseCaseImpl implements GetUserByIdUseCase {

    private final UserGateway userGateway;
    private final UserGatewayResourceToUserConverter userGatewayResourceToUserConverter;

    @Override
    public User execute(String id){
        return userGatewayResourceToUserConverter
                .convert(userGateway.getById(id));
    }
}
