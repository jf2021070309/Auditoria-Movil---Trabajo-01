package com.iab.omid.library.vungle.adsession;

import com.facebook.share.internal.MessengerShareContentUtility;
/* loaded from: classes2.dex */
public enum ErrorType {
    GENERIC(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE),
    VIDEO("video");
    
    private final String errorType;

    ErrorType(String str) {
        this.errorType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.errorType;
    }
}
