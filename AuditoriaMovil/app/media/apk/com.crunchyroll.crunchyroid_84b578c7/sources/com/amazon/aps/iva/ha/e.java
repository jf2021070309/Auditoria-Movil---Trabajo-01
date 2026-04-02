package com.amazon.aps.iva.ha;

import com.amazon.aps.iva.ha.q;
import com.amazon.aps.iva.z9.d0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GradientStroke.java */
/* loaded from: classes.dex */
public final class e implements b {
    public final String a;
    public final f b;
    public final com.amazon.aps.iva.ga.c c;
    public final com.amazon.aps.iva.ga.d d;
    public final com.amazon.aps.iva.ga.e e;
    public final com.amazon.aps.iva.ga.e f;
    public final com.amazon.aps.iva.ga.b g;
    public final q.b h;
    public final q.c i;
    public final float j;
    public final List<com.amazon.aps.iva.ga.b> k;
    public final com.amazon.aps.iva.ga.b l;
    public final boolean m;

    public e(String str, f fVar, com.amazon.aps.iva.ga.c cVar, com.amazon.aps.iva.ga.d dVar, com.amazon.aps.iva.ga.e eVar, com.amazon.aps.iva.ga.e eVar2, com.amazon.aps.iva.ga.b bVar, q.b bVar2, q.c cVar2, float f, ArrayList arrayList, com.amazon.aps.iva.ga.b bVar3, boolean z) {
        this.a = str;
        this.b = fVar;
        this.c = cVar;
        this.d = dVar;
        this.e = eVar;
        this.f = eVar2;
        this.g = bVar;
        this.h = bVar2;
        this.i = cVar2;
        this.j = f;
        this.k = arrayList;
        this.l = bVar3;
        this.m = z;
    }

    @Override // com.amazon.aps.iva.ha.b
    public final com.amazon.aps.iva.ba.b a(d0 d0Var, com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.ia.b bVar) {
        return new com.amazon.aps.iva.ba.h(d0Var, bVar, this);
    }
}
