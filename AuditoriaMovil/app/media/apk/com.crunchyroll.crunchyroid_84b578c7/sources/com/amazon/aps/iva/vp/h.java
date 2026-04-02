package com.amazon.aps.iva.vp;

import com.amazon.aps.iva.tp.l;
import com.amazon.aps.iva.tp.m;
import com.amazon.aps.iva.yb0.j;
import java.util.concurrent.ExecutorService;
/* compiled from: BatchFilePersistenceStrategy.kt */
/* loaded from: classes2.dex */
public class h<T> implements com.amazon.aps.iva.sp.g<T> {
    public final m a;
    public final ExecutorService b;
    public final com.amazon.aps.iva.sp.f c;
    public final l d;
    public final com.amazon.aps.iva.kb0.m e;
    public final a f;

    public h(com.amazon.aps.iva.up.c cVar, ExecutorService executorService, com.amazon.aps.iva.sp.h hVar, com.amazon.aps.iva.sp.f fVar, com.amazon.aps.iva.iq.a aVar, l lVar) {
        j.f(fVar, "payloadDecoration");
        j.f(aVar, "internalLogger");
        this.a = cVar;
        this.b = executorService;
        this.c = fVar;
        this.d = lVar;
        this.e = com.amazon.aps.iva.kb0.f.b(new g(this, hVar, aVar));
        this.f = new a(cVar, fVar, lVar, aVar);
    }

    public com.amazon.aps.iva.up.f a(m mVar, ExecutorService executorService, com.amazon.aps.iva.sp.h hVar, com.amazon.aps.iva.sp.f fVar, com.amazon.aps.iva.iq.a aVar) {
        j.f(mVar, "fileOrchestrator");
        j.f(executorService, "executorService");
        j.f(hVar, "serializer");
        j.f(fVar, "payloadDecoration");
        j.f(aVar, "internalLogger");
        return new com.amazon.aps.iva.up.f(new b(mVar, hVar, fVar, this.d, aVar), executorService, aVar);
    }

    @Override // com.amazon.aps.iva.sp.g
    public final com.amazon.aps.iva.sp.c<T> b() {
        return (com.amazon.aps.iva.sp.c) this.e.getValue();
    }

    @Override // com.amazon.aps.iva.sp.g
    public final com.amazon.aps.iva.sp.b getReader() {
        return this.f;
    }
}
