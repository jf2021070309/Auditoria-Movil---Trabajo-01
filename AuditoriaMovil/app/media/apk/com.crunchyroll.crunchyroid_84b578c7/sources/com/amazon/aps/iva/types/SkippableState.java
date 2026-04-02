package com.amazon.aps.iva.types;
/* loaded from: classes.dex */
public enum SkippableState {
    PLAYER_HANDLES("playerHandles"),
    AD_HANDLES("adHandles"),
    NOT_SKIPPABLE("notSkippable");
    
    private final String skippableState;

    SkippableState(String str) {
        this.skippableState = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.skippableState;
    }
}
