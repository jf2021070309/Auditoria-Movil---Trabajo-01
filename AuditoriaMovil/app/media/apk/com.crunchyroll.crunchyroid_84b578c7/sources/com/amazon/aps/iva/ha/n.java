package com.amazon.aps.iva.ha;

import android.graphics.Path;
import com.amazon.aps.iva.z9.d0;
/* compiled from: ShapeFill.java */
/* loaded from: classes.dex */
public final class n implements b {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final com.amazon.aps.iva.ga.a d;
    public final com.amazon.aps.iva.ga.d e;
    public final boolean f;

    public n(String str, boolean z, Path.FillType fillType, com.amazon.aps.iva.ga.a aVar, com.amazon.aps.iva.ga.d dVar, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = aVar;
        this.e = dVar;
        this.f = z2;
    }

    @Override // com.amazon.aps.iva.ha.b
    public final com.amazon.aps.iva.ba.b a(d0 d0Var, com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.ia.b bVar) {
        return new com.amazon.aps.iva.ba.f(d0Var, bVar, this);
    }

    public final String toString() {
        return defpackage.a.b(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
