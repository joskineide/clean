package com.jsk.clean.gateway.resource;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@Builder
@Document("user")
public class UserGatewayResource {
    @Id
    private ObjectId id;
    private Integer partnerId;
    private String name;
    private String username;
    private UserAddressGatewayResource address;
    private String phone;
    private String website;
    private UserCompanyGatewayResource company;
    private Boolean active;
    @LastModifiedDate
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime lastModifiedDate;
}
