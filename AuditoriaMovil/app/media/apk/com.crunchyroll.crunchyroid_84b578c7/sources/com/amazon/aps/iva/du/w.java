package com.amazon.aps.iva.du;

import com.amazon.aps.iva.du.a;
import com.amazon.aps.iva.du.j;
import java.util.ArrayList;
/* compiled from: CommentMenuProvider.kt */
/* loaded from: classes2.dex */
public final class w implements com.amazon.aps.iva.n70.d<x> {
    public final com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> a;
    public final com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> b;
    public final com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> c;
    public final com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> d;
    public final com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> e;
    public final com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> f;
    public final com.amazon.aps.iva.xb0.l<x, com.amazon.aps.iva.kb0.q> g;

    public w(j.a aVar, j.b bVar, j.c cVar, j.d dVar, j.e eVar, j.f fVar, j.g gVar) {
        this.a = aVar;
        this.b = bVar;
        this.c = cVar;
        this.d = dVar;
        this.e = eVar;
        this.f = fVar;
        this.g = gVar;
    }

    @Override // com.amazon.aps.iva.n70.d
    /* renamed from: b */
    public final ArrayList a(x xVar) {
        com.amazon.aps.iva.n70.b bVar;
        com.amazon.aps.iva.n70.b bVar2;
        com.amazon.aps.iva.n70.b bVar3;
        com.amazon.aps.iva.yb0.j.f(xVar, "data");
        ArrayList arrayList = new ArrayList();
        if (xVar.i) {
            if (xVar.l) {
                bVar3 = new com.amazon.aps.iva.n70.b(a.f.e, new p(this, xVar));
            } else {
                bVar3 = new com.amazon.aps.iva.n70.b(a.c.e, new q(this, xVar));
            }
            arrayList.add(bVar3);
            arrayList.add(new com.amazon.aps.iva.n70.b(a.C0206a.e, new r(this, xVar)));
        } else {
            if (xVar.m) {
                bVar = new com.amazon.aps.iva.n70.b(a.e.e, new s(this, xVar));
            } else {
                bVar = new com.amazon.aps.iva.n70.b(a.b.e, new t(this, xVar));
            }
            arrayList.add(bVar);
            if (xVar.n) {
                bVar2 = new com.amazon.aps.iva.n70.b(a.g.e, new u(this, xVar));
            } else {
                bVar2 = new com.amazon.aps.iva.n70.b(a.d.e, new v(this, xVar));
            }
            arrayList.add(bVar2);
        }
        return arrayList;
    }
}
