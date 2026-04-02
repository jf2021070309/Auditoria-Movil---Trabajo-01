package com.amazon.aps.iva.wh;
/* compiled from: PreselectedTierConfig.kt */
/* loaded from: classes.dex */
public enum b {
    FAN("crunchyroll.google.premium.monthly"),
    MEGA_FAN("crunchyroll.google.fanpack.monthly"),
    ANNUAL_MEGA_FAN("crunchyroll.google.fanpack.annually"),
    ULTIMATE_FAN("crunchyroll.google.superfanpack.monthly");
    
    private final String sku;

    b(String str) {
        this.sku = str;
    }

    public final String getSku() {
        return this.sku;
    }
}
