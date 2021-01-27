package com.jsk.clean.controller.resource.user.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class UserAddressGeoResourceResponse {
    private BigDecimal lat;
    private BigDecimal lng;
}
