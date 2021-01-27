package com.jsk.clean.controller.resource.user.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResourceResponse {
    private String id;
    private Integer partnerId;
    private String name;
    private String username;
    private UserAddressResourceResponse address;
    private String phone;
    private String website;
    private UserCompanyResourceResponse company;
}
