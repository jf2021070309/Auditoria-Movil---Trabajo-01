package com.fyber.inneractive.sdk.external;
/* loaded from: classes.dex */
public enum InneractiveMediationName {
    MOPUB("mopub"),
    ADMOB("admob"),
    DFP(InneractiveMediationNameConsts.DFP),
    FYBER("fyber"),
    OTHER("other");
    
    final String a;

    InneractiveMediationName(String str) {
        this.a = str;
    }

    public final String getKey() {
        return this.a;
    }
}
