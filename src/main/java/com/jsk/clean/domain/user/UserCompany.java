package com.jsk.clean.domain.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCompany {
    private String catchPhrase;
    private String bs;
}
