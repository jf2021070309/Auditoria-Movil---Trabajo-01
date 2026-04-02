package com.ironsource.mediationsdk.model;
/* loaded from: classes2.dex */
public enum m {
    PER_DAY("d"),
    PER_HOUR("h");
    
    public String c;

    m(String str) {
        this.c = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
