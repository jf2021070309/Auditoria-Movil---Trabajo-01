package com.amazon.aps.iva.js;
/* compiled from: WatchDataMigrationCtaSelectedProperty.kt */
/* loaded from: classes2.dex */
public enum q0 {
    CONFIRMED("Confirmed"),
    CANCELED("Canceled");
    
    private final String value;

    q0(String str) {
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
