package com.amazon.aps.iva.sw;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.sw.e;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ToDownloadInteractor.kt */
/* loaded from: classes2.dex */
public final class k extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    public final /* synthetic */ e h;
    public final /* synthetic */ com.amazon.aps.iva.xg.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, com.amazon.aps.iva.xg.a aVar) {
        super(1);
        this.h = eVar;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Throwable th) {
        e.d dVar = this.h.l;
        dVar.getClass();
        com.amazon.aps.iva.xg.a aVar = this.i;
        com.amazon.aps.iva.yb0.j.f(aVar, "input");
        dVar.a.remove(aVar);
        return q.a;
    }
}
