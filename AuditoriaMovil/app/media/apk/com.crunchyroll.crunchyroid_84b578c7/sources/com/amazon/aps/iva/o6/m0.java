package com.amazon.aps.iva.o6;

import android.net.Uri;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.w5.f;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
/* compiled from: SingleSampleMediaSource.java */
/* loaded from: classes.dex */
public final class m0 extends a {
    public final com.amazon.aps.iva.w5.i h;
    public final f.a i;
    public final com.amazon.aps.iva.q5.v j;
    public final com.amazon.aps.iva.t6.j l;
    public final k0 n;
    public final com.amazon.aps.iva.q5.b0 o;
    public com.amazon.aps.iva.w5.y p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public m0(b0.j jVar, f.a aVar, com.amazon.aps.iva.t6.j jVar2) {
        this.i = aVar;
        this.l = jVar2;
        b0.b bVar = new b0.b();
        bVar.b = Uri.EMPTY;
        String uri = jVar.b.toString();
        uri.getClass();
        bVar.a = uri;
        bVar.h = ImmutableList.copyOf((Collection) ImmutableList.of(jVar));
        bVar.j = null;
        com.amazon.aps.iva.q5.b0 a = bVar.a();
        this.o = a;
        v.a aVar2 = new v.a();
        aVar2.k = (String) MoreObjects.firstNonNull(jVar.c, "text/x-unknown");
        aVar2.c = jVar.d;
        aVar2.d = jVar.e;
        aVar2.e = jVar.f;
        aVar2.b = jVar.g;
        String str = jVar.h;
        aVar2.a = str != null ? str : null;
        this.j = new com.amazon.aps.iva.q5.v(aVar2);
        Map emptyMap = Collections.emptyMap();
        Uri uri2 = jVar.b;
        com.amazon.aps.iva.cq.b.E(uri2, "The uri must be set.");
        this.h = new com.amazon.aps.iva.w5.i(uri2, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.n = new k0(-9223372036854775807L, true, false, a);
    }

    @Override // com.amazon.aps.iva.o6.v
    public final com.amazon.aps.iva.q5.b0 b() {
        return this.o;
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void c(u uVar) {
        ((l0) uVar).j.e(null);
    }

    @Override // com.amazon.aps.iva.o6.v
    public final u h(v.b bVar, com.amazon.aps.iva.t6.b bVar2, long j) {
        return new l0(this.h, this.i, this.p, this.j, this.k, this.l, o(bVar), this.m);
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void r(com.amazon.aps.iva.w5.y yVar) {
        this.p = yVar;
        s(this.n);
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void j() {
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void t() {
    }
}
