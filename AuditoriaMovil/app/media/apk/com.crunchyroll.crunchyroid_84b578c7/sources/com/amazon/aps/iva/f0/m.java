package com.amazon.aps.iva.f0;

import java.util.LinkedHashMap;
/* compiled from: LazyLayoutItemContentFactory.kt */
/* loaded from: classes.dex */
public final class m {
    public final com.amazon.aps.iva.x0.e a;
    public final com.amazon.aps.iva.xb0.a<p> b;
    public final LinkedHashMap c;

    /* compiled from: LazyLayoutItemContentFactory.kt */
    /* loaded from: classes.dex */
    public final class a {
        public final Object a;
        public final Object b;
        public int c;
        public com.amazon.aps.iva.xb0.p<? super com.amazon.aps.iva.o0.i, ? super Integer, com.amazon.aps.iva.kb0.q> d;
        public final /* synthetic */ m e;

        public a(m mVar, int i, Object obj, Object obj2) {
            com.amazon.aps.iva.yb0.j.f(obj, "key");
            this.e = mVar;
            this.a = obj;
            this.b = obj2;
            this.c = i;
        }
    }

    public m(com.amazon.aps.iva.x0.e eVar, t tVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "saveableStateHolder");
        this.a = eVar;
        this.b = tVar;
        this.c = new LinkedHashMap();
    }

    public final com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> a(int i, Object obj, Object obj2) {
        com.amazon.aps.iva.yb0.j.f(obj, "key");
        LinkedHashMap linkedHashMap = this.c;
        a aVar = (a) linkedHashMap.get(obj);
        if (aVar != null && aVar.c == i && com.amazon.aps.iva.yb0.j.a(aVar.b, obj2)) {
            com.amazon.aps.iva.xb0.p pVar = aVar.d;
            if (pVar == null) {
                com.amazon.aps.iva.v0.a c = com.amazon.aps.iva.v0.b.c(1403994769, new l(aVar.e, aVar), true);
                aVar.d = c;
                return c;
            }
            return pVar;
        }
        a aVar2 = new a(this, i, obj, obj2);
        linkedHashMap.put(obj, aVar2);
        com.amazon.aps.iva.xb0.p pVar2 = aVar2.d;
        if (pVar2 == null) {
            com.amazon.aps.iva.v0.a c2 = com.amazon.aps.iva.v0.b.c(1403994769, new l(aVar2.e, aVar2), true);
            aVar2.d = c2;
            return c2;
        }
        return pVar2;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = (a) this.c.get(obj);
        if (aVar != null) {
            return aVar.b;
        }
        p invoke = this.b.invoke();
        int a2 = invoke.a(obj);
        if (a2 == -1) {
            return null;
        }
        return invoke.c(a2);
    }
}
