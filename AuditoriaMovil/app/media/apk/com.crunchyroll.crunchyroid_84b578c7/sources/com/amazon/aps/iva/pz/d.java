package com.amazon.aps.iva.pz;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.xb0.l;
import java.util.NoSuchElementException;
/* compiled from: ActionMenuPresenter.kt */
/* loaded from: classes2.dex */
public final class d<T> extends com.amazon.aps.iva.wy.b<e<T>> implements c {
    public final com.amazon.aps.iva.a70.c<T> b;
    public final T c;
    public final com.amazon.aps.iva.rv.a d;
    public final l<com.amazon.aps.iva.a70.a<T>, q> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(e eVar, com.amazon.aps.iva.a70.c cVar, Object obj, com.amazon.aps.iva.rv.e eVar2, l lVar) {
        super(eVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(eVar, "view");
        this.b = cVar;
        this.c = obj;
        this.d = eVar2;
        this.e = lVar;
    }

    @Override // com.amazon.aps.iva.pz.c
    public final void e3(com.amazon.aps.iva.a70.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "menuItem");
        for (T t : this.b.a) {
            if (com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.a70.a) t).a, bVar)) {
                this.e.invoke(t);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
