package com.iab.omid.library.ironsrc.adsession;

import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.internal.AnalyticsEvents;
/* loaded from: classes2.dex */
public enum Owner {
    NATIVE(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE),
    JAVASCRIPT("javascript"),
    NONE(IntegrityManager.INTEGRITY_TYPE_NONE);
    
    private final String owner;

    Owner(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.owner;
    }
}
