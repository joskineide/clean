package com.jsk.clean.gateway.resource.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class UserAddressGeoRequestGatewayResource {
    private BigDecimal lat;
    private BigDecimal lng;
}
