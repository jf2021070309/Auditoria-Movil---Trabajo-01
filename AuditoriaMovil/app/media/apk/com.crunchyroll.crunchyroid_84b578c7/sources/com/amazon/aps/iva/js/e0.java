package com.amazon.aps.iva.js;
/* compiled from: ScreenLoadTimeProperty.kt */
/* loaded from: classes2.dex */
public final class e0 extends com.amazon.aps.iva.is.c {
    private final float screenLoadTime;

    public e0(float f) {
        super("screenLoadTime", Float.valueOf(f));
        this.screenLoadTime = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e0) && Float.compare(this.screenLoadTime, ((e0) obj).screenLoadTime) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.screenLoadTime);
    }

    public final String toString() {
        float f = this.screenLoadTime;
        return "ScreenLoadTimeProperty(screenLoadTime=" + f + ")";
    }
}
