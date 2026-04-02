package com.amazon.aps.iva.ce0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.v;
import java.util.Iterator;
import java.util.List;
/* compiled from: DeserializedAnnotations.kt */
/* loaded from: classes4.dex */
public class a implements com.amazon.aps.iva.pc0.h {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] c = {e0.c(new v(e0.a(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    public final com.amazon.aps.iva.de0.i b;

    public a(com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.xb0.a<? extends List<? extends com.amazon.aps.iva.pc0.c>> aVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
        this.b = lVar.g(aVar);
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final boolean A(com.amazon.aps.iva.nd0.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final com.amazon.aps.iva.pc0.c h(com.amazon.aps.iva.nd0.c cVar) {
        return h.b.a(this, cVar);
    }

    @Override // com.amazon.aps.iva.pc0.h
    public boolean isEmpty() {
        return ((List) x.T(this.b, c[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<com.amazon.aps.iva.pc0.c> iterator() {
        return ((List) x.T(this.b, c[0])).iterator();
    }
}
