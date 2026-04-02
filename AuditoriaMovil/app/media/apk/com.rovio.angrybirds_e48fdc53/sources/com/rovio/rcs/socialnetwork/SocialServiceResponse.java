package com.rovio.rcs.socialnetwork;

import com.rovio.rcs.socialnetwork.SocialServiceUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class SocialServiceResponse {
    private String b;
    private SocialServiceObject c;
    private Error f;
    final int a = -32767;
    private String e = "";
    private int d = -32767;

    public SocialServiceResponse(String str, SocialServiceObject socialServiceObject, Error error) {
        this.b = str;
        this.c = socialServiceObject;
        this.f = error;
    }

    public String serviceName() {
        return this.b;
    }

    public SocialServiceObject result() {
        return this.c;
    }

    public Error error() {
        return this.f;
    }

    public int getSocialNetworkReturnCode() {
        return this.d;
    }

    public String getSocialNetworkMessage() {
        return this.e;
    }

    public void setSocialNetworkReturnCode(int i) {
        this.d = i;
    }

    public void setSocialNetworkMessage(String str) {
        this.e = str;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject;
        if (this.c != null) {
            jSONObject = this.c.toJSON();
        } else {
            jSONObject = new JSONObject();
        }
        try {
            if (this.b != null) {
                jSONObject.put("serviceName", this.b);
            }
            if (this.f != null) {
                jSONObject.put("error", this.f.message());
            }
        } catch (JSONException e) {
            SocialServiceUtils.Log.writeLine("SocialServiceResponse toJSON", e.getMessage());
        }
        return jSONObject;
    }

    /* loaded from: classes4.dex */
    public static final class Error {
        private ErrorCode a;
        private String b;

        /* loaded from: classes4.dex */
        public enum ErrorCode {
            SocialServiceErrorNoAccount,
            SocialServiceErrorNotLoggedIn,
            SocialServiceErrorUnsupportedRequest,
            SocialServiceErrorGetFailed,
            SocialServiceErrorPostFailed,
            SocialServiceErrorRequestCancelled,
            SocialServiceErrorSendAppRequestFailed,
            SocialServiceErrorIgnored,
            SocialServiceErrorNoService,
            SocialServiceErrorSendAppInviteRequestFailed,
            SocialServiceErrorPendingRequestFailed
        }

        public Error(ErrorCode errorCode, String str) {
            this.a = errorCode;
            this.b = str;
        }

        public ErrorCode code() {
            return this.a;
        }

        public String message() {
            return this.b;
        }

        public static String codeString(ErrorCode errorCode) {
            if (errorCode == ErrorCode.SocialServiceErrorNoAccount) {
                return "SocialServiceErrorNoAccount";
            }
            if (errorCode == ErrorCode.SocialServiceErrorNotLoggedIn) {
                return "SocialServiceErrorNotLoggedIn";
            }
            if (errorCode == ErrorCode.SocialServiceErrorUnsupportedRequest) {
                return "SocialServiceErrorUnsupportedRequest";
            }
            if (errorCode == ErrorCode.SocialServiceErrorGetFailed) {
                return "SocialServiceErrorGetFailed";
            }
            if (errorCode == ErrorCode.SocialServiceErrorPostFailed) {
                return "SocialServiceErrorPostFailed";
            }
            return null;
        }

        public String toString() {
            return "code: " + codeString(code()) + ", message: " + message();
        }
    }
}
