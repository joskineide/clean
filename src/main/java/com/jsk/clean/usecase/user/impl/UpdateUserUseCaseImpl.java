package com.jsk.clean.usecase.user.impl;

import com.jsk.clean.converter.UserGatewayResourceToUserConverter;
import com.jsk.clean.converter.UserRequestToUserRequestGatewayResourceConverter;
import com.jsk.clean.domain.user.User;
import com.jsk.clean.domain.user.request.UserRequest;
import com.jsk.clean.gateway.UserGateway;
import com.jsk.clean.usecase.user.UpdateUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateUserUseCaseImpl implements UpdateUserUseCase {

    private final UserGateway userGateway;
    private final UserGatewayResourceToUserConverter userGatewayResourceToUserConverter;
    private final UserRequestToUserRequestGatewayResourceConverter userRequestToUserRequestGatewayResourceConverter;



    @Override
    public User execute(UserRequest user, String id){
        return userGatewayResourceToUserConverter
                .convert(userGateway
                        .update(userRequestToUserRequestGatewayResourceConverter.convert(user), id));
    }
}
