package com.amazon.aps.iva.ec;
/* compiled from: MemoryCategory.java */
/* loaded from: classes.dex */
public enum b {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);
    
    private final float multiplier;

    b(float f) {
        this.multiplier = f;
    }

    public float getMultiplier() {
        return this.multiplier;
    }
}
