package com.jsk.clean.domain.user.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCompanyRequest {
    private String catchPhrase;
    private String bs;
}
