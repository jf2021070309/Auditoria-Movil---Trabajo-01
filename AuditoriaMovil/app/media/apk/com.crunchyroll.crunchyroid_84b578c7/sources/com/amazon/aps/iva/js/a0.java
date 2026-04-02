package com.amazon.aps.iva.js;
/* compiled from: PlayerSettingsTypeProperty.kt */
/* loaded from: classes2.dex */
public enum a0 {
    SUBS_CC("SubsCC"),
    VIDEO_QUALITY("VideoQuality"),
    AUTOPLAY("Autoplay");
    
    private final String value;

    a0(String str) {
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
