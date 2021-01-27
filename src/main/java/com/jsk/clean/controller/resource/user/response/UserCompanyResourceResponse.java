package com.jsk.clean.controller.resource.user.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCompanyResourceResponse {
    private String catchPhrase;
    private String bs;
}
