package com.jsk.clean.domain.user.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRequest {
    private Integer partnerId;
    private String name;
    private String username;
    private UserAddressRequest address;
    private String phone;
    private String website;
    private UserCompanyRequest company;
}
