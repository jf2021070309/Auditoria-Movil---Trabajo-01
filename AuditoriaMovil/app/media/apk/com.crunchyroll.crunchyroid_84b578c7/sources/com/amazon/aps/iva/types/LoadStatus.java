package com.amazon.aps.iva.types;
/* loaded from: classes.dex */
public enum LoadStatus {
    PENDING_LOAD("PENDING_LOAD"),
    SUCCEEDED("SUCCEEDED"),
    LOADING("LOADING"),
    FAILED("FAILED");
    
    private final String loadStatus;

    LoadStatus(String str) {
        this.loadStatus = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.loadStatus;
    }
}
