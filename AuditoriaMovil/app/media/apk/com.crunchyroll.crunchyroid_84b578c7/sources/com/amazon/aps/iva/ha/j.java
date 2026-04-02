package com.amazon.aps.iva.ha;

import android.graphics.PointF;
import com.amazon.aps.iva.z9.d0;
/* compiled from: RectangleShape.java */
/* loaded from: classes.dex */
public final class j implements b {
    public final String a;
    public final com.amazon.aps.iva.ga.l<PointF, PointF> b;
    public final com.amazon.aps.iva.ga.l<PointF, PointF> c;
    public final com.amazon.aps.iva.ga.b d;
    public final boolean e;

    public j(String str, com.amazon.aps.iva.ga.l lVar, com.amazon.aps.iva.ga.e eVar, com.amazon.aps.iva.ga.b bVar, boolean z) {
        this.a = str;
        this.b = lVar;
        this.c = eVar;
        this.d = bVar;
        this.e = z;
    }

    @Override // com.amazon.aps.iva.ha.b
    public final com.amazon.aps.iva.ba.b a(d0 d0Var, com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.ia.b bVar) {
        return new com.amazon.aps.iva.ba.n(d0Var, bVar, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
