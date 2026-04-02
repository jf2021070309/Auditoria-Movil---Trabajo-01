package com.amazon.aps.iva.js;
/* compiled from: WatchDataMigrationStateProperty.kt */
/* loaded from: classes2.dex */
public enum s0 {
    IN_PROGRESS("In Progress"),
    COMPLETE("Complete");
    
    private final String value;

    s0(String str) {
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
