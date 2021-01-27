package com.jsk.clean.gateway.mongo;

import com.jsk.clean.gateway.resource.UserGatewayResource;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserGatewayResource, String> {
    List<UserGatewayResource> findByActive(Boolean active);
    Optional<UserGatewayResource> findByIdAndActive(String id, Boolean active);
}
