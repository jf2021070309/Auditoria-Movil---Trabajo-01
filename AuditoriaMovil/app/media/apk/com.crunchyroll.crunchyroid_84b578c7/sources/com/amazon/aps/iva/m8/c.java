package com.amazon.aps.iva.m8;

import com.amazon.aps.iva.j0.j0;
/* compiled from: FileSectionType.java */
/* loaded from: classes.dex */
public enum c {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    
    private final long mValue;

    c(long j) {
        this.mValue = j;
    }

    public static c fromValue(long j) {
        c[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].getValue() == j) {
                return values[i];
            }
        }
        throw new IllegalArgumentException(j0.f("Unsupported FileSection Type ", j));
    }

    public long getValue() {
        return this.mValue;
    }
}
