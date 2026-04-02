package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.u4.e;
import com.amazon.aps.iva.u4.f;
import com.amazon.aps.iva.v4.w;
import java.util.Iterator;
import java.util.Map;
/* compiled from: WidgetLayout.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.LayoutConfiguration$save$2", f = "WidgetLayout.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.u4.e, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.u4.e>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ o0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(o0 o0Var, com.amazon.aps.iva.ob0.d<? super p0> dVar) {
        super(2, dVar);
        this.i = o0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        p0 p0Var = new p0(this.i, dVar);
        p0Var.h = obj;
        return p0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.u4.e eVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.u4.e> dVar) {
        return ((p0) create(eVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        com.amazon.aps.iva.u4.e eVar = (com.amazon.aps.iva.u4.e) this.h;
        eVar.getClass();
        w.a aVar2 = (w.a) eVar.f(w.f.NEW_BUILDER);
        aVar2.e();
        w.a.f(aVar2.c, eVar);
        e.a aVar3 = (e.a) aVar2;
        int q = ((com.amazon.aps.iva.u4.e) aVar3.c).q();
        aVar3.e();
        com.amazon.aps.iva.u4.e.n((com.amazon.aps.iva.u4.e) aVar3.c, q);
        aVar3.e();
        com.amazon.aps.iva.u4.e.m((com.amazon.aps.iva.u4.e) aVar3.c);
        o0 o0Var = this.i;
        Iterator<T> it = o0Var.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            com.amazon.aps.iva.u4.g gVar = (com.amazon.aps.iva.u4.g) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            if (o0Var.e.contains(new Integer(intValue))) {
                f.a p = com.amazon.aps.iva.u4.f.p();
                p.e();
                com.amazon.aps.iva.u4.f.l((com.amazon.aps.iva.u4.f) p.c, gVar);
                p.e();
                com.amazon.aps.iva.u4.f.m((com.amazon.aps.iva.u4.f) p.c, intValue);
                aVar3.e();
                com.amazon.aps.iva.u4.e.l((com.amazon.aps.iva.u4.e) aVar3.c, p.c());
            }
        }
        return aVar3.c();
    }
}
