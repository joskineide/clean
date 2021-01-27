package com.jsk.clean.gateway;

import com.jsk.clean.gateway.resource.UserGatewayResource;
import com.jsk.clean.gateway.resource.request.UserRequestGatewayResource;

import java.util.List;

public interface UserGateway {
    List<UserGatewayResource> list();
    UserGatewayResource getById(String id);
    UserGatewayResource insert(UserRequestGatewayResource user);
    UserGatewayResource update(UserRequestGatewayResource user, String id);
    void delete(String id);
}
