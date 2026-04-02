package com.amazon.aps.iva.fk;

import com.amazon.aps.iva.g6.g;
import com.amazon.aps.iva.o6.m;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: MediaSourceFactory.kt */
/* loaded from: classes.dex */
public final class b implements v.a {
    public final v.a a;

    public b(m mVar) {
        this.a = mVar;
    }

    @Override // com.amazon.aps.iva.o6.v.a
    public final v.a a(g gVar) {
        j.f(gVar, "p0");
        return this.a.a(gVar);
    }

    @Override // com.amazon.aps.iva.o6.v.a
    public final int[] c() {
        return this.a.c();
    }

    @Override // com.amazon.aps.iva.o6.v.a
    public final v d(b0 b0Var) {
        j.f(b0Var, "mediaItem");
        if (b0Var.c == null) {
            return new a(b0Var);
        }
        v d = this.a.d(b0Var);
        j.e(d, "{\n            actualMedi…urce(mediaItem)\n        }");
        return d;
    }

    @Override // com.amazon.aps.iva.o6.v.a
    public final v.a e(com.amazon.aps.iva.t6.j jVar) {
        j.f(jVar, "p0");
        return this.a.e(jVar);
    }
}
