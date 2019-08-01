package uk.gov.hmcts.reform.profilesync.domain;

import static java.util.Objects.requireNonNull;

import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class GetUserProfileResponse {

    private UUID idamId;
    private String email;
    private String firstName;
    private String lastName;
    private String idamStatus;

    public GetUserProfileResponse(UserProfile userProfile) {

        requireNonNull(userProfile, "userProfile must not be null");
        this.idamId = userProfile.getIdamId();
        this.email = userProfile.getEmail();
        this.firstName = userProfile.getFirstName();
        this.lastName = userProfile.getLastName();
        this.idamStatus = userProfile.getIdamStatus();
    }

}
