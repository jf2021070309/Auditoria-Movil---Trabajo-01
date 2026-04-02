package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.me0.a;
import java.util.Collection;
import java.util.Set;
/* compiled from: LazyJavaStaticClassScope.kt */
/* loaded from: classes4.dex */
public final class w extends a.b<com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.oc0.e a;
    public final /* synthetic */ Set<Object> b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xd0.i, Collection<Object>> c;

    public w(com.amazon.aps.iva.zc0.c cVar, Set set, com.amazon.aps.iva.xb0.l lVar) {
        this.a = cVar;
        this.b = set;
        this.c = lVar;
    }

    @Override // com.amazon.aps.iva.me0.a.d
    public final /* bridge */ /* synthetic */ Object a() {
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.me0.a.d
    public final boolean c(Object obj) {
        com.amazon.aps.iva.oc0.e eVar = (com.amazon.aps.iva.oc0.e) obj;
        com.amazon.aps.iva.yb0.j.f(eVar, "current");
        if (eVar != this.a) {
            com.amazon.aps.iva.xd0.i h0 = eVar.h0();
            com.amazon.aps.iva.yb0.j.e(h0, "current.staticScope");
            if (h0 instanceof y) {
                this.b.addAll(this.c.invoke(h0));
                return false;
            }
        }
        return true;
    }
}
