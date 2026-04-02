package com.rovio.rcs.socialnetwork;
/* loaded from: classes4.dex */
public class SocialServiceExceptions extends Exception {
    static final long serialVersionUID = -6175868750538697253L;
    private ExceptionCode a;

    /* loaded from: classes4.dex */
    public enum ExceptionCode {
        FACEBOOK_SESSION_CREATION_FAILED,
        FACEBOOK_SESSION_SHARE_FAILED,
        FACEBOOK_SEND_APP_REQUEST_FAILED,
        FACEBOOK_SEND_APP_INVITE_REQUEST_FAILED,
        FACEBOOK_SDK_INITIALIZATION_FAILED,
        UNKNOWN_EXCEPTION
    }

    public SocialServiceExceptions(String str) {
        super(str);
        this.a = ExceptionCode.UNKNOWN_EXCEPTION;
    }

    public SocialServiceExceptions(String str, ExceptionCode exceptionCode) {
        super(str);
        this.a = ExceptionCode.UNKNOWN_EXCEPTION;
        this.a = exceptionCode;
    }

    public ExceptionCode getErrorCode() {
        return this.a;
    }
}
