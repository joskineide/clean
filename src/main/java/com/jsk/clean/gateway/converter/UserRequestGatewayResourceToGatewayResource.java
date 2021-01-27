package com.jsk.clean.gateway.converter;

import com.jsk.clean.gateway.resource.UserAddressGatewayResource;
import com.jsk.clean.gateway.resource.UserAddressGeoGatewayResource;
import com.jsk.clean.gateway.resource.UserCompanyGatewayResource;
import com.jsk.clean.gateway.resource.UserGatewayResource;
import com.jsk.clean.gateway.resource.request.UserRequestGatewayResource;
import org.springframework.stereotype.Component;

@Component
public class UserRequestGatewayResourceToGatewayResource {
    public UserGatewayResource convert(UserRequestGatewayResource user){
        return UserGatewayResource.builder()
                .partnerId(user.getPartnerId())
                .name(user.getName())
                .username(user.getUsername())
                .address(UserAddressGatewayResource.builder()
                        .street(user.getAddress().getStreet())
                        .suite(user.getAddress().getSuite())
                        .city(user.getAddress().getCity())
                        .zipcode(user.getAddress().getZipcode())
                        .geo(UserAddressGeoGatewayResource.builder()
                                .lat(user.getAddress().getGeo().getLat())
                                .lng(user.getAddress().getGeo().getLng())
                                .build())
                        .build())
                .phone(user.getPhone())
                .website(user.getWebsite())
                .company(UserCompanyGatewayResource.builder()
                        .catchPhrase(user.getCompany().getCatchPhrase())
                        .bs(user.getCompany().getBs())
                        .build())
                .build();
    }
}
