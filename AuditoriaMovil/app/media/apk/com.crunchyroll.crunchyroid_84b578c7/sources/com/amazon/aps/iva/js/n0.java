package com.amazon.aps.iva.js;
/* compiled from: UserStatusProperty.kt */
/* loaded from: classes2.dex */
public enum n0 {
    FREE("free"),
    FAN("Fan"),
    MEGA_FAN("Mega Fan"),
    ANNUAL_MEGA_FAN("Annual Mega Fan"),
    ULTIMATE_FAN("Ultimate Fan"),
    PREMIUM("premium"),
    PREMIUM_PLUS("premium+");
    
    private final String value;

    n0(String str) {
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
