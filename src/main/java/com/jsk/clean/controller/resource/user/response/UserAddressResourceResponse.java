package com.jsk.clean.controller.resource.user.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserAddressResourceResponse {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private UserAddressGeoResourceResponse geo;
}
