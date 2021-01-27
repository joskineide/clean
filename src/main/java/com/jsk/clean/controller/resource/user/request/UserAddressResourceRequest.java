package com.jsk.clean.controller.resource.user.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserAddressResourceRequest {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private UserAddressGeoResourceRequest geo;
}
