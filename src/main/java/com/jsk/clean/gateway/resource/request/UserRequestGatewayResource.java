package com.jsk.clean.gateway.resource.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequestGatewayResource {
    private Integer partnerId;
    private String name;
    private String username;
    private UserAddressRequestGatewayResource address;
    private String phone;
    private String website;
    private UserCompanyRequestGatewayResource company;
}
