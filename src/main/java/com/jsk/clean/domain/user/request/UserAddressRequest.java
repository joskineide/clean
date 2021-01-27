package com.jsk.clean.domain.user.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserAddressRequest {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private UserAddressGeoRequest geo;
}
