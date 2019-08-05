package uk.gov.hmcts.reform.profilesync.domain;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class UserProfileSyncException extends RuntimeException {

    private HttpStatus httpStatus;

    private String errorMessage;

    public UserProfileSyncException(HttpStatus httpStatus, String errorMessage) {
        super(errorMessage);
        this.httpStatus = httpStatus;
        this.errorMessage = errorMessage;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

}
