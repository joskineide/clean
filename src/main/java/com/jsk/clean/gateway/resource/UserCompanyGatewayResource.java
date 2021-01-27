package com.jsk.clean.gateway.resource;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCompanyGatewayResource {
    private String catchPhrase;
    private String bs;
}
