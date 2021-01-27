package com.jsk.clean.gateway.resource.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserAddressRequestGatewayResource {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private UserAddressGeoRequestGatewayResource geo;
}
