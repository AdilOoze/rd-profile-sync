package uk.gov.hmcts.reform.profilesync.domain;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserProfile {

    private UUID idamId;
    private String email;
    private String firstName;
    private String lastName;
    private String idamStatus;
    private Integer idamRegistrationResponse;
}
