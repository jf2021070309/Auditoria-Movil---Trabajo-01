package com.amazon.aps.iva.j30;

import com.amazon.aps.iva.ez.g;
import java.util.List;
/* compiled from: UpsellV2ViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2.UpsellV2ViewModelImpl$upsellTiers$1$1", f = "UpsellV2ViewModel.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.i5.s<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>>>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> j;
    public final /* synthetic */ e0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> gVar, e0 e0Var, com.amazon.aps.iva.ob0.d<? super c0> dVar) {
        super(2, dVar);
        this.j = gVar;
        this.k = e0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        c0 c0Var = new c0(this.j, this.k, dVar);
        c0Var.i = obj;
        return c0Var;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.i5.s<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>>> sVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((c0) create(sVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.ez.g aVar;
        Object H;
        com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.i5.s sVar = (com.amazon.aps.iva.i5.s) this.i;
            com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> gVar = this.j;
            if (gVar instanceof g.c) {
                try {
                    H = this.k.c.B0((List) ((g.c) gVar).a);
                } catch (Throwable th) {
                    H = com.amazon.aps.iva.ab.x.H(th);
                }
                aVar = com.amazon.aps.iva.ez.h.e(H);
            } else if (gVar instanceof g.b) {
                aVar = new g.b(null);
            } else if (gVar instanceof g.a) {
                aVar = new g.a(null, ((g.a) gVar).a);
            } else {
                throw new com.amazon.aps.iva.kb0.h();
            }
            this.h = 1;
            if (sVar.a(aVar, this) == aVar2) {
                return aVar2;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
