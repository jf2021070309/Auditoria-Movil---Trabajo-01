package com.amazon.aps.iva.ha;
/* compiled from: Mask.java */
/* loaded from: classes.dex */
public final class g {
    public final a a;
    public final com.amazon.aps.iva.ga.g b;
    public final com.amazon.aps.iva.ga.d c;
    public final boolean d;

    /* compiled from: Mask.java */
    /* loaded from: classes.dex */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public g(a aVar, com.amazon.aps.iva.ga.g gVar, com.amazon.aps.iva.ga.d dVar, boolean z) {
        this.a = aVar;
        this.b = gVar;
        this.c = dVar;
        this.d = z;
    }
}
