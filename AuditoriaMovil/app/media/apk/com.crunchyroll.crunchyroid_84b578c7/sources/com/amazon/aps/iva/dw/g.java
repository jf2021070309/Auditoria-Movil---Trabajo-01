package com.amazon.aps.iva.dw;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.downloading.e0;
/* compiled from: ExoPlayerDownloadProgressUpdateMonitor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerDownloadProgressUpdateMonitorImpl$monitorProgressUpdate$1", f = "ExoPlayerDownloadProgressUpdateMonitor.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ h i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<e0, com.amazon.aps.iva.kb0.q> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(h hVar, com.amazon.aps.iva.xb0.l<? super e0, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(2, dVar);
        this.i = hVar;
        this.j = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new g(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((g) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        long j;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        x.i0(obj);
        do {
            h hVar = this.i;
            if (!hVar.c.invoke().booleanValue()) {
                for (e0 e0Var : hVar.b.h().invoke()) {
                    this.j.invoke(e0Var);
                }
            }
            j = hVar.d;
            this.h = 1;
        } while (t.l(j, this) != aVar);
        return aVar;
    }
}
