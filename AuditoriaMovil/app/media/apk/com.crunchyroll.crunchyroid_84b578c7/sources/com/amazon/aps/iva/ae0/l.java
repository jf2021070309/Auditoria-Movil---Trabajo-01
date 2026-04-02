package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.ae0.k;
import com.amazon.aps.iva.ae0.m;
import com.amazon.aps.iva.ae0.w;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.z0;
import com.amazon.aps.iva.fe0.l;
import com.amazon.aps.iva.qc0.a;
import com.amazon.aps.iva.qc0.c;
import com.amazon.aps.iva.qc0.e;
import com.amazon.aps.iva.wc0.c;
import java.util.List;
import java.util.Set;
import okhttp3.internal.http2.Http2;
/* compiled from: context.kt */
/* loaded from: classes4.dex */
public final class l {
    public final com.amazon.aps.iva.de0.l a;
    public final com.amazon.aps.iva.oc0.c0 b;
    public final m c;
    public final i d;
    public final d<com.amazon.aps.iva.pc0.c, com.amazon.aps.iva.sd0.g<?>> e;
    public final com.amazon.aps.iva.oc0.g0 f;
    public final w g;
    public final s h;
    public final com.amazon.aps.iva.wc0.c i;
    public final t j;
    public final Iterable<com.amazon.aps.iva.qc0.b> k;
    public final com.amazon.aps.iva.oc0.e0 l;
    public final k m;
    public final com.amazon.aps.iva.qc0.a n;
    public final com.amazon.aps.iva.qc0.c o;
    public final com.amazon.aps.iva.od0.f p;
    public final com.amazon.aps.iva.fe0.l q;
    public final com.amazon.aps.iva.qc0.e r;
    public final List<z0> s;
    public final j t;

    public l(com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.oc0.c0 c0Var, i iVar, d dVar, com.amazon.aps.iva.oc0.g0 g0Var, s sVar, t tVar, Iterable iterable, com.amazon.aps.iva.oc0.e0 e0Var, com.amazon.aps.iva.qc0.a aVar, com.amazon.aps.iva.qc0.c cVar, com.amazon.aps.iva.od0.f fVar, com.amazon.aps.iva.fe0.m mVar, com.amazon.aps.iva.wd0.b bVar, List list, int i) {
        com.amazon.aps.iva.fe0.m mVar2;
        m.a aVar2 = m.a.a;
        w.a aVar3 = w.a.a;
        c.a aVar4 = c.a.a;
        k.a.C0115a c0115a = k.a.a;
        com.amazon.aps.iva.qc0.a aVar5 = (i & 8192) != 0 ? a.C0644a.a : aVar;
        com.amazon.aps.iva.qc0.c cVar2 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? c.a.a : cVar;
        if ((65536 & i) != 0) {
            com.amazon.aps.iva.fe0.l.b.getClass();
            mVar2 = l.a.b;
        } else {
            mVar2 = mVar;
        }
        e.a aVar6 = (262144 & i) != 0 ? e.a.a : null;
        List J = (i & 524288) != 0 ? f1.J(com.amazon.aps.iva.ee0.p.a) : list;
        com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
        com.amazon.aps.iva.yb0.j.f(c0Var, "moduleDescriptor");
        com.amazon.aps.iva.yb0.j.f(g0Var, "packageFragmentProvider");
        com.amazon.aps.iva.yb0.j.f(iterable, "fictitiousClassDescriptorFactories");
        com.amazon.aps.iva.yb0.j.f(aVar5, "additionalClassPartsProvider");
        com.amazon.aps.iva.yb0.j.f(cVar2, "platformDependentDeclarationFilter");
        com.amazon.aps.iva.yb0.j.f(fVar, "extensionRegistryLite");
        com.amazon.aps.iva.yb0.j.f(mVar2, "kotlinTypeChecker");
        com.amazon.aps.iva.yb0.j.f(aVar6, "platformDependentTypeTransformer");
        com.amazon.aps.iva.yb0.j.f(J, "typeAttributeTranslators");
        this.a = lVar;
        this.b = c0Var;
        this.c = aVar2;
        this.d = iVar;
        this.e = dVar;
        this.f = g0Var;
        this.g = aVar3;
        this.h = sVar;
        this.i = aVar4;
        this.j = tVar;
        this.k = iterable;
        this.l = e0Var;
        this.m = c0115a;
        this.n = aVar5;
        this.o = cVar2;
        this.p = fVar;
        this.q = mVar2;
        this.r = aVar6;
        this.s = J;
        this.t = new j(this);
    }

    public final n a(com.amazon.aps.iva.oc0.f0 f0Var, com.amazon.aps.iva.kd0.c cVar, com.amazon.aps.iva.kd0.g gVar, com.amazon.aps.iva.kd0.h hVar, com.amazon.aps.iva.kd0.a aVar, com.amazon.aps.iva.ce0.j jVar) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "descriptor");
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        com.amazon.aps.iva.yb0.j.f(aVar, "metadataVersion");
        return new n(this, cVar, f0Var, gVar, hVar, aVar, jVar, null, com.amazon.aps.iva.lb0.z.b);
    }

    public final com.amazon.aps.iva.oc0.e b(com.amazon.aps.iva.nd0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "classId");
        Set<com.amazon.aps.iva.nd0.b> set = j.c;
        return this.t.a(bVar, null);
    }
}
