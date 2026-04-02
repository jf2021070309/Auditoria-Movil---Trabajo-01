package com.amazon.aps.iva.w40;

import com.amazon.aps.iva.j8.f;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: SimulcastDataSource.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.simulcast.SimulcastDataSource$loadInitial$2", f = "SimulcastDataSource.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ q i;
    public final /* synthetic */ f.e<Integer> j;
    public final /* synthetic */ f.c<Integer, com.amazon.aps.iva.uz.h> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, f.e<Integer> eVar, f.c<Integer, com.amazon.aps.iva.uz.h> cVar, com.amazon.aps.iva.ob0.d<? super r> dVar) {
        super(2, dVar);
        this.i = qVar;
        this.j = eVar;
        this.k = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new r(this.i, this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((r) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        q qVar = this.i;
        try {
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                x xVar = qVar.f;
                int i2 = this.j.a;
                this.h = 1;
                obj = xVar.x0(i2, 0, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ArrayList n = q.n(qVar, ((ContentApiResponse) obj).getData());
            qVar.h.invoke(n);
            this.k.b(n, new Integer(0), new Integer(1));
        } catch (IOException e) {
            qVar.i.invoke(e);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
