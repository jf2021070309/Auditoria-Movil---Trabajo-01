package com.amazon.aps.iva.ha;

import android.graphics.PointF;
import com.amazon.aps.iva.z9.d0;
/* compiled from: PolystarShape.java */
/* loaded from: classes.dex */
public final class i implements b {
    public final String a;
    public final a b;
    public final com.amazon.aps.iva.ga.b c;
    public final com.amazon.aps.iva.ga.l<PointF, PointF> d;
    public final com.amazon.aps.iva.ga.b e;
    public final com.amazon.aps.iva.ga.b f;
    public final com.amazon.aps.iva.ga.b g;
    public final com.amazon.aps.iva.ga.b h;
    public final com.amazon.aps.iva.ga.b i;
    public final boolean j;
    public final boolean k;

    /* compiled from: PolystarShape.java */
    /* loaded from: classes.dex */
    public enum a {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        a(int i) {
            this.value = i;
        }

        public static a forValue(int i) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.value == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public i(String str, a aVar, com.amazon.aps.iva.ga.b bVar, com.amazon.aps.iva.ga.l<PointF, PointF> lVar, com.amazon.aps.iva.ga.b bVar2, com.amazon.aps.iva.ga.b bVar3, com.amazon.aps.iva.ga.b bVar4, com.amazon.aps.iva.ga.b bVar5, com.amazon.aps.iva.ga.b bVar6, boolean z, boolean z2) {
        this.a = str;
        this.b = aVar;
        this.c = bVar;
        this.d = lVar;
        this.e = bVar2;
        this.f = bVar3;
        this.g = bVar4;
        this.h = bVar5;
        this.i = bVar6;
        this.j = z;
        this.k = z2;
    }

    @Override // com.amazon.aps.iva.ha.b
    public final com.amazon.aps.iva.ba.b a(d0 d0Var, com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.ia.b bVar) {
        return new com.amazon.aps.iva.ba.m(d0Var, bVar, this);
    }
}
