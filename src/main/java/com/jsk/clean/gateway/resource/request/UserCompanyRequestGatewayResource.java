package com.jsk.clean.gateway.resource.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCompanyRequestGatewayResource {
    private String catchPhrase;
    private String bs;
}
