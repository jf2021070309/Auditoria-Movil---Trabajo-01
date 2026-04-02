package com.amazon.aps.iva.js;
/* compiled from: ContentFilterProperties.kt */
/* loaded from: classes2.dex */
public enum m0 {
    FAVORITES_ONLY("favorites");
    
    private final String value;

    m0(String str) {
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
