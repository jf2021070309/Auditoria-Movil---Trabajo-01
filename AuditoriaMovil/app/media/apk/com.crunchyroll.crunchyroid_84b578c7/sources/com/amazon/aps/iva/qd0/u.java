package com.amazon.aps.iva.qd0;

import com.amazon.aps.iva.lb0.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: overridingUtils.kt */
/* loaded from: classes4.dex */
public final class u {

    /* JADX INFO: Add missing generic type declarations: [H] */
    /* compiled from: overridingUtils.kt */
    /* loaded from: classes4.dex */
    public static final class a<H> extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<H, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.me0.d<H> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.me0.d<H> dVar) {
            super(1);
            this.h = dVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Object obj) {
            com.amazon.aps.iva.yb0.j.e(obj, "it");
            this.h.add(obj);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> a(Collection<? extends H> collection, com.amazon.aps.iva.xb0.l<? super H, ? extends com.amazon.aps.iva.oc0.a> lVar) {
        com.amazon.aps.iva.yb0.j.f(collection, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        com.amazon.aps.iva.me0.d dVar = new com.amazon.aps.iva.me0.d();
        while (!linkedList.isEmpty()) {
            Object t0 = x.t0(linkedList);
            com.amazon.aps.iva.me0.d dVar2 = new com.amazon.aps.iva.me0.d();
            ArrayList g = n.g(t0, linkedList, lVar, new a(dVar2));
            if (g.size() == 1 && dVar2.isEmpty()) {
                Object O0 = x.O0(g);
                com.amazon.aps.iva.yb0.j.e(O0, "overridableGroup.single()");
                dVar.add(O0);
            } else {
                Object obj = (Object) n.s(g, lVar);
                com.amazon.aps.iva.oc0.a invoke = lVar.invoke(obj);
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    Object obj2 = (Object) it.next();
                    com.amazon.aps.iva.yb0.j.e(obj2, "it");
                    if (!n.k(invoke, lVar.invoke(obj2))) {
                        dVar2.add(obj2);
                    }
                }
                if (!dVar2.isEmpty()) {
                    dVar.addAll(dVar2);
                }
                dVar.add(obj);
            }
        }
        return dVar;
    }
}
