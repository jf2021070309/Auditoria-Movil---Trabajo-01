package com.amazon.aps.iva.types;

import android.annotation.SuppressLint;
import okhttp3.internal.ws.WebSocketProtocol;
/* loaded from: classes.dex */
public enum IVAErrorCode {
    NO_ACTIONABLE_AD(1000, "RTH-IVA_1000", "NO_ACTIONABLE_AD"),
    INVALID_ACTIONABLE_AD(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, "RTH-IVA_1001", "INVALID_ACTIONABLE_AD"),
    NO_INTERACTIVE_CREATIVE_FILE(1002, "RTH-IVA_1002", "NO_INTERACTIVE_CREATIVE_FILE"),
    INVALID_INTERACTIVE_CREATIVE_FILE(1003, "RTH-IVA_1003", "INVALID_INTERACTIVE_CREATIVE_FILE"),
    NO_AD_PARAMETERS(1004, "RTH-IVA_1004", "NO_AD_PARAMETERS"),
    INVALID_AD_PARAMETERS(WebSocketProtocol.CLOSE_NO_STATUS_CODE, "RTH-IVA_1005", "INVALID_AD_PARAMETERS"),
    NO_IVA_EXTENSION(1006, "RTH-IVA_1006", "NO_IVA_EXTENSION"),
    TOO_MANY_IVA_V2_EXTENSIONS(1007, "RTH-IVA_1007", "TOO_MANY_IVA_V2_EXTENSIONS"),
    UNKNOWN_IVA_VAST_EXCEPTION(1008, "RTH-IVA-1008", "UNKNOWN_IVA_VAST_EXCEPTION"),
    REQUEST_PLAY_NOT_HONORED(1009, "RTH-IVA_1100", "REQUEST_PLAY_NOT_HONORED"),
    REQUEST_PAUSE_NOT_HONORED(1010, "RTH-IVA_1106", "PAUSE_NOT_HONORED"),
    INVALID_MESSAGE_PARAMS(1011, "RTH-IVA_1200", "INVALID_MESSAGE_PARAMS"),
    SPEC_NOT_FOLLOWED_ON_MESSAGES(1012, "RTH-IVA_1211", "SPEC_NOT_FOLLOWED_ON_MESSAGES"),
    NAVIGATION_NOT_POSSIBLE(1013, "RTH-IVA_1215", "NAVIGATION_NOT_POSSIBLE"),
    INVALID_NAVIGATION_URL(1014, "RTH-IVA_1217", "INVALID_NAVIGATION_URL"),
    AD_CLIP_PRELOAD_FAILED(1015, "RTH-IVA_1224", "AD_CLIP_PRELOAD_FAILED"),
    GENERIC_ERROR_CODE(1016, "RTH-IVA_1300", "GENERIC_ERROR_CODE");
    
    private final String mErrorCode;
    private final String mErrorMessage;
    private final int mErrorNumber;

    @SuppressLint({"RestrictedApi"})
    IVAErrorCode(int i, String str, String str2) {
        this.mErrorNumber = i;
        this.mErrorCode = str;
        this.mErrorMessage = str2;
    }

    public String getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public Integer getErrorNumber() {
        return Integer.valueOf(this.mErrorNumber);
    }
}
