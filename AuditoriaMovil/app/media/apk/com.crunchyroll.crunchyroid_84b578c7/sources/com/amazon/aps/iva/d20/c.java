package com.amazon.aps.iva.d20;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: MatureContentInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.mature.MatureContentInteractorImpl$enableMatureContent$3", f = "MatureContentInteractor.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ l<Throwable, q> j;
    public final /* synthetic */ b k;
    public final /* synthetic */ PlayableAsset l;
    public final /* synthetic */ l<PlayableAsset, q> m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(l<? super Throwable, q> lVar, b bVar, PlayableAsset playableAsset, l<? super PlayableAsset, q> lVar2, com.amazon.aps.iva.ob0.d<? super c> dVar) {
        super(2, dVar);
        this.j = lVar;
        this.k = bVar;
        this.l = playableAsset;
        this.m = lVar2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        c cVar = new c(this.j, this.k, this.l, this.m, dVar);
        cVar.i = obj;
        return cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((c) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object H;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        try {
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                g0 g0Var = (g0) this.i;
                b bVar = this.k;
                PlayableAsset playableAsset = this.l;
                EtpContentService etpContentService = bVar.c;
                String id = playableAsset.getId();
                t parentType = playableAsset.getParentType();
                this.h = 1;
                obj = EtpContentServiceKt.loadAsset(etpContentService, id, parentType, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            H = (PlayableAsset) obj;
        } catch (Throwable th) {
            H = x.H(th);
        }
        if (!(H instanceof k.a)) {
            this.m.invoke((PlayableAsset) H);
        }
        Throwable a = com.amazon.aps.iva.kb0.k.a(H);
        if (a != null) {
            this.j.invoke(a);
        }
        return q.a;
    }
}
