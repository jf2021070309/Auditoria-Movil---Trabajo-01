package com.amazon.aps.iva.cg;

import com.amazon.aps.iva.cg.p;
import com.ellation.crunchyroll.api.cms.model.Season;
/* compiled from: DeepLinkDataManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.deeplinks.DeepLinkDataManagerImpl$prepareDataForSeason$1", f = "DeepLinkDataManager.kt", l = {124}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super p>, Object> {
    public com.amazon.aps.iva.dg.a h;
    public int i;
    public final /* synthetic */ a0 j;
    public final /* synthetic */ i k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i iVar, a0 a0Var, com.amazon.aps.iva.ob0.d dVar) {
        super(1, dVar);
        this.j = a0Var;
        this.k = iVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
        return new n(this.k, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(com.amazon.aps.iva.ob0.d<? super p> dVar) {
        return ((n) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.dg.a aVar;
        com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.i;
        if (i != 0) {
            if (i == 1) {
                aVar = this.h;
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            a0 a0Var = this.j;
            com.amazon.aps.iva.dg.a aVar3 = a0Var.d;
            f fVar = this.k.a;
            this.h = aVar3;
            this.i = 1;
            obj = fVar.getSeason(a0Var.e, this);
            if (obj == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
        }
        return new p.j(aVar, (Season) obj);
    }
}
