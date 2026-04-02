package com.amazon.aps.iva.cg;

import com.amazon.aps.iva.cg.p;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.se0.g0;
/* compiled from: DeepLinkDataManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.deeplinks.DeepLinkDataManagerImpl$prepareData$1", f = "DeepLinkDataManager.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super p>, Object> j;
    public final /* synthetic */ i k;
    public final /* synthetic */ e0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ob0.d<? super p>, ? extends Object> lVar, i iVar, e0 e0Var, com.amazon.aps.iva.ob0.d<? super j> dVar) {
        super(2, dVar);
        this.j = lVar;
        this.k = iVar;
        this.l = e0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        j jVar = new j(this.j, this.k, this.l, dVar);
        jVar.i = obj;
        return jVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((j) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object H;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        try {
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                g0 g0Var = (g0) this.i;
                com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super p>, Object> lVar = this.j;
                this.h = 1;
                obj = lVar.invoke(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            H = (p) obj;
        } catch (Throwable th) {
            H = com.amazon.aps.iva.ab.x.H(th);
        }
        boolean z = !(H instanceof k.a);
        i iVar = this.k;
        if (z) {
            iVar.c((p) H);
        }
        Throwable a = com.amazon.aps.iva.kb0.k.a(H);
        if (a != null) {
            q qVar = iVar.e;
            if (qVar != null) {
                qVar.T0(p.d.b.b);
            }
            iVar.b.a(this.l.getUri(), a);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
