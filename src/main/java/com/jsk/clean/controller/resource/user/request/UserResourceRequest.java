package com.jsk.clean.controller.resource.user.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResourceRequest {
    private String name;
    private String username;
    private UserAddressResourceRequest address;
    private String phone;
    private String website;
    private UserCompanyResourceRequest company;
}
