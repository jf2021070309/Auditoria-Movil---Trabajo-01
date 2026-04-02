package com.amazon.aps.iva.js;
/* compiled from: SkuTypeProperty.kt */
/* loaded from: classes2.dex */
public enum g0 {
    AL_LA_CARTE("alLaCarte"),
    BUNDLE("bundle");
    
    private final String value;

    g0(String str) {
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
