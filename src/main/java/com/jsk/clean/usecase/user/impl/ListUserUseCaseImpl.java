package com.jsk.clean.usecase.user.impl;

import com.jsk.clean.converter.UserGatewayResourceToUserConverter;
import com.jsk.clean.domain.user.User;
import com.jsk.clean.gateway.UserGateway;
import com.jsk.clean.usecase.user.ListUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ListUserUseCaseImpl implements ListUserUseCase {

    private final UserGateway userGateway;
    private final UserGatewayResourceToUserConverter userGatewayResourceToUserConverter;


    @Override
    public List<User> execute(){
        return userGateway.list().stream()
                .map(userGatewayResourceToUserConverter::convert)
                .collect(Collectors.toList());
    };
}
