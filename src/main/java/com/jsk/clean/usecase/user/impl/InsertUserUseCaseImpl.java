package com.jsk.clean.usecase.user.impl;

import com.jsk.clean.converter.UserGatewayResourceToUserConverter;
import com.jsk.clean.converter.UserRequestToUserRequestGatewayResourceConverter;
import com.jsk.clean.domain.user.User;
import com.jsk.clean.domain.user.request.UserRequest;
import com.jsk.clean.gateway.UserGateway;
import com.jsk.clean.usecase.user.InsertUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsertUserUseCaseImpl implements InsertUserUseCase {

    private final UserGateway userGateway;
    private final UserGatewayResourceToUserConverter userGatewayResourceToUserConverter;
    private final UserRequestToUserRequestGatewayResourceConverter userRequestToUserRequestGatewayResourceConverter;


    @Override
    public User execute(UserRequest user){
        return userGatewayResourceToUserConverter
                .convert(userGateway
                        .insert(userRequestToUserRequestGatewayResourceConverter.convert(user)));
    }
}
