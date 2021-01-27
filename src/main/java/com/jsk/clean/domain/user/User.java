package com.jsk.clean.domain.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String id;
    private Integer partnerId;
    private String name;
    private String username;
    private UserAddress address;
    private String phone;
    private String website;
    private UserCompany company;
}
