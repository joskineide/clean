package com.jsk.clean.controller.converter.user;

import com.jsk.clean.controller.resource.user.request.UserResourceRequest;
import com.jsk.clean.controller.resource.user.response.UserAddressGeoResourceResponse;
import com.jsk.clean.controller.resource.user.response.UserAddressResourceResponse;
import com.jsk.clean.controller.resource.user.response.UserCompanyResourceResponse;
import com.jsk.clean.controller.resource.user.response.UserResourceResponse;
import com.jsk.clean.domain.user.User;
import com.jsk.clean.domain.user.request.UserAddressGeoRequest;
import com.jsk.clean.domain.user.request.UserAddressRequest;
import com.jsk.clean.domain.user.request.UserCompanyRequest;
import com.jsk.clean.domain.user.request.UserRequest;
import org.springframework.stereotype.Component;

@Component
public class UserResourceRequestToUserRequestConverter {
    public UserRequest convert(UserResourceRequest user){
        return UserRequest.builder()
                .name(user.getName())
                .username(user.getUsername())
                .address(UserAddressRequest.builder()
                        .street(user.getAddress().getStreet())
                        .suite(user.getAddress().getSuite())
                        .city(user.getAddress().getCity())
                        .zipcode(user.getAddress().getZipcode())
                        .geo(UserAddressGeoRequest.builder()
                                .lat(user.getAddress().getGeo().getLat())
                                .lng(user.getAddress().getGeo().getLng())
                                .build())
                        .build())
                .phone(user.getPhone())
                .website(user.getWebsite())
                .company(UserCompanyRequest.builder()
                        .catchPhrase(user.getCompany().getCatchPhrase())
                        .bs(user.getCompany().getBs())
                        .build())
                .build();
    }
}
