package com.jsk.clean.converter;

import com.jsk.clean.domain.user.request.UserRequest;
import com.jsk.clean.gateway.resource.request.UserAddressGeoRequestGatewayResource;
import com.jsk.clean.gateway.resource.request.UserAddressRequestGatewayResource;
import com.jsk.clean.gateway.resource.request.UserCompanyRequestGatewayResource;
import com.jsk.clean.gateway.resource.request.UserRequestGatewayResource;
import org.springframework.stereotype.Component;

@Component
public class UserRequestToUserRequestGatewayResourceConverter {
    public UserRequestGatewayResource convert(UserRequest user){
        return UserRequestGatewayResource.builder()
                .partnerId(user.getPartnerId())
                .name(user.getName())
                .username(user.getUsername())
                .address(UserAddressRequestGatewayResource.builder()
                        .street(user.getAddress().getStreet())
                        .suite(user.getAddress().getSuite())
                        .city(user.getAddress().getCity())
                        .zipcode(user.getAddress().getZipcode())
                        .geo(UserAddressGeoRequestGatewayResource.builder()
                                .lat(user.getAddress().getGeo().getLat())
                                .lng(user.getAddress().getGeo().getLng())
                                .build())
                        .build())
                .phone(user.getPhone())
                .website(user.getWebsite())
                .company(UserCompanyRequestGatewayResource.builder()
                        .catchPhrase(user.getCompany().getCatchPhrase())
                        .bs(user.getCompany().getBs())
                        .build())
                .build();
    }
}
