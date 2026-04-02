package com.amazon.aps.iva.la0;

import com.amazon.aps.iva.a6.m;
import com.amazon.aps.iva.de0.l;
import com.amazon.aps.iva.ka0.y;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.yb0.j;
import java.util.HashMap;
/* compiled from: BandwidthMetrics.kt */
/* loaded from: classes4.dex */
public final class c {
    public final Object a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;

    public c(m mVar, y yVar) {
        j.f(mVar, "player");
        j.f(yVar, "collector");
        this.a = mVar;
        this.b = yVar;
        this.d = new HashMap();
        this.e = new r0.d();
    }

    public final c0 a() {
        return ((com.amazon.aps.iva.ad0.c) this.a).o;
    }

    public final l b() {
        return ((com.amazon.aps.iva.ad0.c) this.a).a;
    }

    public c(com.amazon.aps.iva.ad0.c cVar, com.amazon.aps.iva.ad0.j jVar, e eVar) {
        j.f(cVar, "components");
        j.f(jVar, "typeParameterResolver");
        j.f(eVar, "delegateForDefaultTypeQualifiers");
        this.a = cVar;
        this.b = jVar;
        this.c = eVar;
        this.d = eVar;
        this.e = new com.amazon.aps.iva.cd0.d(this, jVar);
    }
}
