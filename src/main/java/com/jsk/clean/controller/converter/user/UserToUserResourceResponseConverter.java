package com.jsk.clean.controller.converter.user;

import com.jsk.clean.controller.resource.user.response.UserAddressGeoResourceResponse;
import com.jsk.clean.controller.resource.user.response.UserAddressResourceResponse;
import com.jsk.clean.controller.resource.user.response.UserCompanyResourceResponse;
import com.jsk.clean.controller.resource.user.response.UserResourceResponse;
import com.jsk.clean.domain.user.User;
import org.springframework.stereotype.Component;

@Component
public class UserToUserResourceResponseConverter {
    public UserResourceResponse convert(User user){
        return UserResourceResponse.builder()
                .id(user.getId())
                .partnerId(user.getPartnerId())
                .name(user.getName())
                .username(user.getUsername())
                .address(UserAddressResourceResponse.builder()
                        .street(user.getAddress().getStreet())
                        .suite(user.getAddress().getSuite())
                        .city(user.getAddress().getCity())
                        .zipcode(user.getAddress().getZipcode())
                        .geo(UserAddressGeoResourceResponse.builder()
                                .lat(user.getAddress().getGeo().getLat())
                                .lng(user.getAddress().getGeo().getLng())
                                .build())
                        .build())
                .phone(user.getPhone())
                .website(user.getWebsite())
                .company(UserCompanyResourceResponse.builder()
                        .catchPhrase(user.getCompany().getCatchPhrase())
                        .bs(user.getCompany().getBs())
                        .build())
                .build();
    }
}
