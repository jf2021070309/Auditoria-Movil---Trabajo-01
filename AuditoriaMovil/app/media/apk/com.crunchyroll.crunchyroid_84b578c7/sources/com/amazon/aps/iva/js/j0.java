package com.amazon.aps.iva.js;
/* compiled from: SubFlowType.kt */
/* loaded from: classes2.dex */
public enum j0 {
    UPSELL("upsell"),
    UPGRADE("upgrade"),
    DOWNGRADE("downgrade");
    
    private final String value;

    j0(String str) {
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
