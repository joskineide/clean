package com.jsk.clean.gateway.resource;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class UserAddressGeoGatewayResource {
    private BigDecimal lat;
    private BigDecimal lng;
}
