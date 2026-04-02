package com.amazon.aps.iva.types;
/* loaded from: classes.dex */
public enum CloseButtonSupport {
    PLAYER_HANDLES("playerHandles"),
    AD_HANDLES("adHandles");
    
    private final String closeButtonSupport;

    CloseButtonSupport(String str) {
        this.closeButtonSupport = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.closeButtonSupport;
    }
}
