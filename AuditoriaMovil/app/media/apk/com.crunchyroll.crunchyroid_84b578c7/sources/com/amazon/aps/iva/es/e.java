package com.amazon.aps.iva.es;
/* compiled from: VideoAdImpressionEvent.kt */
/* loaded from: classes2.dex */
public enum e {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll");
    
    private final String value;

    e(String str) {
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
