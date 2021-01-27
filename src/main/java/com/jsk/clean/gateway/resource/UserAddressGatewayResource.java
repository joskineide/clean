package com.jsk.clean.gateway.resource;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserAddressGatewayResource {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private UserAddressGeoGatewayResource geo;
}
