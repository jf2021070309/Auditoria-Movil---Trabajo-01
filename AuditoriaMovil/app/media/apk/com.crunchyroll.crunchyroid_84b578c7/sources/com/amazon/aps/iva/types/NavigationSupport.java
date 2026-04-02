package com.amazon.aps.iva.types;
/* loaded from: classes.dex */
public enum NavigationSupport {
    PLAYER_HANDLES("playerHandles"),
    AD_HANDLES("adHandles"),
    NOT_SUPPORTED("notSupported");
    
    private final String navigationSupport;

    NavigationSupport(String str) {
        this.navigationSupport = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.navigationSupport;
    }
}
