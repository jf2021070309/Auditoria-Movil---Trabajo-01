package com.amazon.aps.iva.ad0;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.ne0.e;
import com.amazon.aps.iva.ne0.q;
import com.amazon.aps.iva.ne0.s;
import com.amazon.aps.iva.ne0.u;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.yb0.l;
import java.util.Iterator;
/* compiled from: LazyJavaAnnotations.kt */
/* loaded from: classes4.dex */
public final class e implements com.amazon.aps.iva.pc0.h {
    public final com.amazon.aps.iva.la0.c b;
    public final com.amazon.aps.iva.ed0.d c;
    public final boolean d;
    public final com.amazon.aps.iva.de0.h<com.amazon.aps.iva.ed0.a, com.amazon.aps.iva.pc0.c> e;

    /* compiled from: LazyJavaAnnotations.kt */
    /* loaded from: classes4.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ed0.a, com.amazon.aps.iva.pc0.c> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.pc0.c invoke(com.amazon.aps.iva.ed0.a aVar) {
            com.amazon.aps.iva.ed0.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "annotation");
            com.amazon.aps.iva.nd0.f fVar = com.amazon.aps.iva.yc0.c.a;
            e eVar = e.this;
            return com.amazon.aps.iva.yc0.c.b(eVar.b, aVar2, eVar.d);
        }
    }

    public e(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.ed0.d dVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(cVar, "c");
        com.amazon.aps.iva.yb0.j.f(dVar, "annotationOwner");
        this.b = cVar;
        this.c = dVar;
        this.d = z;
        this.e = ((c) cVar.a).a.h(new a());
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final boolean A(com.amazon.aps.iva.nd0.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final com.amazon.aps.iva.pc0.c h(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.pc0.c invoke;
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        com.amazon.aps.iva.ed0.d dVar = this.c;
        com.amazon.aps.iva.ed0.a h = dVar.h(cVar);
        if (h == null || (invoke = this.e.invoke(h)) == null) {
            com.amazon.aps.iva.nd0.f fVar = com.amazon.aps.iva.yc0.c.a;
            return com.amazon.aps.iva.yc0.c.a(cVar, dVar, this.b);
        }
        return invoke;
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final boolean isEmpty() {
        com.amazon.aps.iva.ed0.d dVar = this.c;
        if (dVar.getAnnotations().isEmpty()) {
            dVar.D();
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<com.amazon.aps.iva.pc0.c> iterator() {
        com.amazon.aps.iva.ed0.d dVar = this.c;
        u b0 = s.b0(x.k0(dVar.getAnnotations()), this.e);
        com.amazon.aps.iva.nd0.f fVar = com.amazon.aps.iva.yc0.c.a;
        return new e.a(s.W(s.e0(b0, com.amazon.aps.iva.yc0.c.a(o.a.m, dVar, this.b)), q.h));
    }
}
