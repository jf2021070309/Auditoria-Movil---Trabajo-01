package com.amazon.aps.iva.js;
/* compiled from: WatchDataMigrationOptionProperty.kt */
/* loaded from: classes2.dex */
public enum r0 {
    MERGE_FN_AND_CR("Merge FN & CR"),
    KEEP_FN("Keep FN"),
    KEEP_CR("Keep CR");
    
    private final String value;

    r0(String str) {
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
