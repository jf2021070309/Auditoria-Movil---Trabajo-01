package com.amazon.aps.iva.js;
/* compiled from: SortProperties.kt */
/* loaded from: classes2.dex */
public enum h0 {
    ASCENDING("Ascending"),
    DESCENDING("Descending");
    
    private final String value;

    h0(String str) {
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
