package com.amazon.aps.iva.js;

import com.google.common.net.HttpHeaders;
/* compiled from: UpsellType.kt */
/* loaded from: classes2.dex */
public enum l0 {
    UPGRADE(HttpHeaders.UPGRADE),
    ASYNC("async"),
    FREE_TRIAL("Free Trial"),
    SUBSCRIPTION("Subscription");
    
    private final String value;

    l0(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
