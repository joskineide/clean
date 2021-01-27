package com.jsk.clean.domain.user;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class UserAddressGeo {
    private BigDecimal lat;
    private BigDecimal lng;
}
