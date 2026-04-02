package com.flurry.android;
/* loaded from: classes2.dex */
public enum FlurrySyndicationEventName {
    REBLOG("Reblog"),
    FAST_REBLOG("FastReblog"),
    SOURCE_LINK("SourceClick"),
    LIKE("Like");
    
    private String a;

    FlurrySyndicationEventName(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
