package com.facebook.ads.internal.protocol;

import com.kwad.library.solder.lib.ext.PluginError;
import com.qq.e.comm.constants.ErrorCode;
/* loaded from: classes2.dex */
public enum AdErrorType {
    UNKNOWN_ERROR(-1, "unknown error", false),
    NETWORK_ERROR(1000, "Network Error", true),
    NO_FILL(1001, "No Fill", true),
    LOAD_TOO_FREQUENTLY(1002, "Ad was re-loaded too frequently", true),
    DISABLED_APP(1005, "App is disabled from making ad requests", true),
    SERVER_ERROR(2000, "Server Error", true),
    INTERNAL_ERROR(2001, "Internal Error", true),
    START_BEFORE_INIT(PluginError.ERROR_UPD_EXTRACT, "initAd must be called before startAd", true),
    AD_REQUEST_FAILED(1111, "Facebook Ads SDK request for ads failed", false),
    AD_REQUEST_TIMEOUT(1112, "Facebook Ads SDK request for ads timed out", false),
    PARSER_FAILURE(1201, "Failed to parse Facebook Ads SDK delivery response", false),
    UNKNOWN_RESPONSE(1202, "Unknown Facebook Ads SDK delivery response type", false),
    ERROR_MESSAGE(1203, "Facebook Ads SDK delivery response Error message", true),
    NO_AD_PLACEMENT(1302, "Facebook Ads SDK returned no ad placements", false),
    MEDIATION_ERROR(3001, "Mediation Error", true),
    BID_IMPRESSION_MISMATCH(4001, "Bid payload does not match placement", true),
    BID_PAYLOAD_ERROR(4002, "Invalid bid payload", false),
    NO_ADAPTER_ON_LOAD(ErrorCode.SERVER_JSON_PARSE_ERROR, "Adapter is null onLoad Ad", false),
    NO_ADAPTER_ON_START(ErrorCode.VIDEO_DOWNLOAD_FAIL, "Adapter is null onStart Ad", false);
    
    private final int a;
    private final String b;
    private final boolean c;

    AdErrorType(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public static AdErrorType adErrorTypeFromCode(int i) {
        return adErrorTypeFromCode(i, UNKNOWN_ERROR);
    }

    public static AdErrorType adErrorTypeFromCode(int i, AdErrorType adErrorType) {
        AdErrorType[] values;
        for (AdErrorType adErrorType2 : values()) {
            if (adErrorType2.getErrorCode() == i) {
                return adErrorType2;
            }
        }
        return adErrorType;
    }

    public String getDefaultErrorMessage() {
        return this.b;
    }

    public int getErrorCode() {
        return this.a;
    }

    public boolean isPublicError() {
        return this.c;
    }
}
