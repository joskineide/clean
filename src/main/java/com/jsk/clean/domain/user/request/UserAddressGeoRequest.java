package com.jsk.clean.domain.user.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class UserAddressGeoRequest {
    private BigDecimal lat;
    private BigDecimal lng;
}
