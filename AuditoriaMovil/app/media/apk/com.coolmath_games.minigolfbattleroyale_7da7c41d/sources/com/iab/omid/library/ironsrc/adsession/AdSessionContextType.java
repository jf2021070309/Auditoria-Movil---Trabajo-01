package com.iab.omid.library.ironsrc.adsession;

import com.facebook.internal.AnalyticsEvents;
/* loaded from: classes2.dex */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE),
    JAVASCRIPT("javascript");
    
    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.typeString;
    }
}
