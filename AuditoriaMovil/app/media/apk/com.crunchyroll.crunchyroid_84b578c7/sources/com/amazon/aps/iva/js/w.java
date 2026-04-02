package com.amazon.aps.iva.js;

import com.google.common.net.HttpHeaders;
/* compiled from: PermissionStatusProperty.kt */
/* loaded from: classes2.dex */
public enum w {
    ALLOW(HttpHeaders.ALLOW),
    DENY("Deny");
    
    private final String value;

    w(String str) {
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
