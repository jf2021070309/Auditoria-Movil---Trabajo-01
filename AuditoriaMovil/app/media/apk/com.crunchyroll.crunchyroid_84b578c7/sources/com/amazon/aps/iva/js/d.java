package com.amazon.aps.iva.js;
/* compiled from: ContentFilterProperties.kt */
/* loaded from: classes2.dex */
public enum d {
    ALL("all"),
    SERIES_ONLY("series"),
    MOVIES_ONLY("movies");
    
    private final String value;

    d(String str) {
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
