package com.amazon.aps.iva.xj;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.zj.c;
/* compiled from: UseCaseModule_ProvideSavePlayheadUseCaseFactory.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.jb0.a {
    public final com.amazon.aps.iva.jb0.a<c> a;

    public b(com.amazon.aps.iva.vj.b bVar) {
        this.a = bVar;
    }

    @Override // com.amazon.aps.iva.jb0.a
    public final Object get() {
        c cVar = this.a.get();
        j.f(cVar, "playheadGateway");
        return new com.amazon.aps.iva.ak.c(cVar);
    }
}
