package com.amazon.aps.iva.js;
/* compiled from: OrientationProperty.kt */
/* loaded from: classes2.dex */
public enum s {
    PORTRAIT("Portrait"),
    LANDSCAPE("Landscape");
    
    private final String value;

    s(String str) {
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
