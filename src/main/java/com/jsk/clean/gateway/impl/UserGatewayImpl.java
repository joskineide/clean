package com.jsk.clean.gateway.impl;

import com.jsk.clean.gateway.UserGateway;
import com.jsk.clean.gateway.converter.UserRequestGatewayResourceToGatewayResource;
import com.jsk.clean.gateway.mongo.UserRepository;
import com.jsk.clean.gateway.resource.UserGatewayResource;
import com.jsk.clean.gateway.resource.request.UserRequestGatewayResource;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserGatewayImpl implements UserGateway {

    private final UserRepository repository;
    private final UserRequestGatewayResourceToGatewayResource userRequestGatewayResourceToGatewayResource;

    @Override
    public List<UserGatewayResource> list() {
        return repository.findByActive(true);
    }

    @Override
    public UserGatewayResource getById(String id) {
        return repository.findByIdAndActive(id, true)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public UserGatewayResource insert(UserRequestGatewayResource user) {
        return repository.save(
                userRequestGatewayResourceToGatewayResource.convert(user));
    }

    @Override
    public UserGatewayResource update(UserRequestGatewayResource user, String id) {
        getById(id);
        UserGatewayResource userToSave = userRequestGatewayResourceToGatewayResource.convert(user);
        userToSave.setId(new ObjectId(id));
        return repository.save(userToSave);
    }

    @Override
    public void delete(String id) {
        getById(id);
        repository.deleteById(id);
    }
}
