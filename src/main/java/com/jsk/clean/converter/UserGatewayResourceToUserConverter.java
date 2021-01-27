package com.jsk.clean.converter;

import com.jsk.clean.domain.user.User;
import com.jsk.clean.domain.user.UserAddress;
import com.jsk.clean.domain.user.UserAddressGeo;
import com.jsk.clean.domain.user.UserCompany;
import com.jsk.clean.gateway.resource.UserGatewayResource;
import org.springframework.stereotype.Component;

@Component
public class UserGatewayResourceToUserConverter {
    public User convert(UserGatewayResource user){
        return User.builder()
                .id(user.getId().toHexString())
                .partnerId(user.getPartnerId())
                .name(user.getName())
                .username(user.getUsername())
                .address(UserAddress.builder()
                        .street(user.getAddress().getStreet())
                        .suite(user.getAddress().getSuite())
                        .city(user.getAddress().getCity())
                        .zipcode(user.getAddress().getZipcode())
                        .geo(UserAddressGeo.builder()
                                .lat(user.getAddress().getGeo().getLat())
                                .lng(user.getAddress().getGeo().getLng())
                                .build())
                        .build())
                .phone(user.getPhone())
                .website(user.getWebsite())
                .company(UserCompany.builder()
                        .catchPhrase(user.getCompany().getCatchPhrase())
                        .bs(user.getCompany().getBs())
                        .build())
                .build();
    }
}
