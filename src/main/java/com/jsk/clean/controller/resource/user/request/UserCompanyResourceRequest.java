package com.jsk.clean.controller.resource.user.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCompanyResourceRequest {
    private String catchPhrase;
    private String bs;
}
