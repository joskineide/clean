package com.jsk.clean.domain.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserAddress {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private UserAddressGeo geo;
}
