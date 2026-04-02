package com.amazon.aps.iva.ha;

import android.graphics.PointF;
import com.amazon.aps.iva.z9.d0;
/* compiled from: CircleShape.java */
/* loaded from: classes.dex */
public final class a implements b {
    public final String a;
    public final com.amazon.aps.iva.ga.l<PointF, PointF> b;
    public final com.amazon.aps.iva.ga.e c;
    public final boolean d;
    public final boolean e;

    public a(String str, com.amazon.aps.iva.ga.l<PointF, PointF> lVar, com.amazon.aps.iva.ga.e eVar, boolean z, boolean z2) {
        this.a = str;
        this.b = lVar;
        this.c = eVar;
        this.d = z;
        this.e = z2;
    }

    @Override // com.amazon.aps.iva.ha.b
    public final com.amazon.aps.iva.ba.b a(d0 d0Var, com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.ia.b bVar) {
        return new com.amazon.aps.iva.ba.e(d0Var, bVar, this);
    }
}
