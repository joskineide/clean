package com.jsk.clean.controller.resource.user.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class UserAddressGeoResourceRequest {
    private BigDecimal lat;
    private BigDecimal lng;
}
