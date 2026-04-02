package com.amazon.aps.iva.js;
/* compiled from: PanelContainerTypeProperty.kt */
/* loaded from: classes2.dex */
public enum t {
    CAROUSEL("carousel"),
    GRID("grid"),
    HERO("hero"),
    SINGLE("single");
    
    private final String value;

    t(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
