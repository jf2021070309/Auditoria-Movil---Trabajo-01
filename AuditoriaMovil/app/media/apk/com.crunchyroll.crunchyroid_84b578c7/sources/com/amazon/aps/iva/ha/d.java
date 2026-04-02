package com.amazon.aps.iva.ha;

import android.graphics.Path;
import com.amazon.aps.iva.z9.d0;
/* compiled from: GradientFill.java */
/* loaded from: classes.dex */
public final class d implements b {
    public final f a;
    public final Path.FillType b;
    public final com.amazon.aps.iva.ga.c c;
    public final com.amazon.aps.iva.ga.d d;
    public final com.amazon.aps.iva.ga.e e;
    public final com.amazon.aps.iva.ga.e f;
    public final String g;
    public final boolean h;

    public d(String str, f fVar, Path.FillType fillType, com.amazon.aps.iva.ga.c cVar, com.amazon.aps.iva.ga.d dVar, com.amazon.aps.iva.ga.e eVar, com.amazon.aps.iva.ga.e eVar2, boolean z) {
        this.a = fVar;
        this.b = fillType;
        this.c = cVar;
        this.d = dVar;
        this.e = eVar;
        this.f = eVar2;
        this.g = str;
        this.h = z;
    }

    @Override // com.amazon.aps.iva.ha.b
    public final com.amazon.aps.iva.ba.b a(d0 d0Var, com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.ia.b bVar) {
        return new com.amazon.aps.iva.ba.g(d0Var, hVar, bVar, this);
    }
}
