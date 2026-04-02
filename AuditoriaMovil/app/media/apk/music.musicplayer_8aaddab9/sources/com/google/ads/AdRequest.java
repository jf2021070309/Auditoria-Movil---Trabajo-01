package com.google.ads;

import androidx.annotation.RecentlyNonNull;
@Deprecated
/* loaded from: classes.dex */
public final class AdRequest {
    @RecentlyNonNull
    public static final String LOGTAG = "Ads";
    @RecentlyNonNull
    public static final String TEST_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    @RecentlyNonNull
    public static final String VERSION = "0.0.0";

    /* loaded from: classes.dex */
    public enum ErrorCode {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");
        
        private final String zza;

        ErrorCode(String str) {
            this.zza = str;
        }

        @Override // java.lang.Enum
        @RecentlyNonNull
        public String toString() {
            return this.zza;
        }
    }

    /* loaded from: classes.dex */
    public enum Gender {
        UNKNOWN,
        MALE,
        FEMALE
    }
}
