package com.amazon.aps.iva.cg;

import com.amazon.aps.iva.cg.p;
import com.ellation.crunchyroll.model.music.Artist;
/* compiled from: DeepLinkDataManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.deeplinks.DeepLinkDataManagerImpl$prepareDataForArtist$1", f = "DeepLinkDataManager.kt", l = {132}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super p>, Object> {
    public com.amazon.aps.iva.dg.a h;
    public int i;
    public final /* synthetic */ a j;
    public final /* synthetic */ i k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, i iVar, com.amazon.aps.iva.ob0.d<? super k> dVar) {
        super(1, dVar);
        this.j = aVar;
        this.k = iVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
        return new k(this.j, this.k, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(com.amazon.aps.iva.ob0.d<? super p> dVar) {
        return ((k) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            a aVar3 = this.j;
            com.amazon.aps.iva.dg.a aVar4 = aVar3.c;
            f fVar = this.k.a;
            this.h = aVar4;
            this.i = 1;
            obj = fVar.J(aVar3.d, this);
            if (obj == aVar2) {
                return aVar2;
            }
            aVar = aVar4;
        }
        return new p.a(aVar, (Artist) obj);
    }
}
