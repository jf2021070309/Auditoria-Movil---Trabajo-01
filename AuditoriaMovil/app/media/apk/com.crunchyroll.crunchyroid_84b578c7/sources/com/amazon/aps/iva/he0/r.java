package com.amazon.aps.iva.he0;
/* compiled from: TypeSystemContext.kt */
/* loaded from: classes4.dex */
public enum r {
    IN("in"),
    OUT("out"),
    INV("");
    
    private final String presentation;

    r(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }
}
