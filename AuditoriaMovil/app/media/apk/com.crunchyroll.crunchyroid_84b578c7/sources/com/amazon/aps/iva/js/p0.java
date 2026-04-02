package com.amazon.aps.iva.js;
/* compiled from: VideoSessionTypeProperty.kt */
/* loaded from: classes2.dex */
public enum p0 {
    ONLINE("online"),
    OFFLINE("offline");
    
    private final String value;

    p0(String str) {
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
