package com.amazon.aps.iva.js;
/* compiled from: PositionOnScreenProperty.kt */
/* loaded from: classes2.dex */
public enum b0 {
    TOP("top"),
    BOTTOM("bottom"),
    RIGHT("right"),
    LEFT("left"),
    CENTER("center"),
    TOP_LEFT("top left"),
    TOP_RIGHT("top right"),
    BOTTOM_LEFT("bottom left"),
    BOTTOM_RIGHT("bottom right");
    
    private final String value;

    b0(String str) {
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
