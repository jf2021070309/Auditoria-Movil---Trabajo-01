package com.amazon.aps.iva.r4;

import com.amazon.aps.iva.d4.d;
import com.amazon.aps.iva.r4.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
/* compiled from: GlanceAppWidgetManager.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.GlanceAppWidgetManager$cleanReceivers$2", f = "GlanceAppWidgetManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.d4.d, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.d4.d>, Object> {
    public /* synthetic */ Object h;
    public final /* synthetic */ Set<String> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Set<String> set, com.amazon.aps.iva.ob0.d<? super j0> dVar) {
        super(2, dVar);
        this.i = set;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        j0 j0Var = new j0(this.i, dVar);
        j0Var.h = obj;
        return j0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.d4.d dVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.d4.d> dVar2) {
        return ((j0) create(dVar, dVar2)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        com.amazon.aps.iva.ab.x.i0(obj);
        com.amazon.aps.iva.d4.d dVar = (com.amazon.aps.iva.d4.d) this.h;
        Set set = (Set) dVar.c(i0.g);
        if (set == null) {
            return dVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (!this.i.contains((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return dVar;
        }
        com.amazon.aps.iva.d4.a d = dVar.d();
        d.a<Set<String>> aVar2 = i0.g;
        com.amazon.aps.iva.yb0.j.f(aVar2, "key");
        d.h(aVar2, com.amazon.aps.iva.lb0.m0.P(set, arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d.g(i0.a.a(i0.d, (String) it.next()));
        }
        return d.e();
    }
}
