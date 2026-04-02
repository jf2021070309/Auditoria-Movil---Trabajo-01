package com.amazon.aps.iva.js;
/* compiled from: ContentFilterProperties.kt */
/* loaded from: classes2.dex */
public enum k0 {
    ALL("all"),
    SUBTITLED_ONLY("subtitled"),
    DUBBED_ONLY("dubbed");
    
    private final String value;

    k0(String str) {
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
