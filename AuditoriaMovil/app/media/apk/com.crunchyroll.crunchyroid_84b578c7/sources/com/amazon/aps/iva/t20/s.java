package com.amazon.aps.iva.t20;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import java.util.List;
/* compiled from: ManageMembershipViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.manage.ManageMembershipViewModelImpl$upsellTiers$1$1", f = "ManageMembershipViewModel.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.i5.s<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>>>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> j;
    public final /* synthetic */ u k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> gVar, u uVar, com.amazon.aps.iva.ob0.d<? super s> dVar) {
        super(2, dVar);
        this.j = gVar;
        this.k = uVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        s sVar = new s(this.j, this.k, dVar);
        sVar.i = obj;
        return sVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.i5.s<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.n20.f>>> sVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((s) create(sVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.ez.g aVar;
        Object H;
        com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            com.amazon.aps.iva.i5.s sVar = (com.amazon.aps.iva.i5.s) this.i;
            com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> gVar = this.j;
            if (gVar instanceof g.c) {
                try {
                    H = this.k.b.B0((List) ((g.c) gVar).a);
                } catch (Throwable th) {
                    H = x.H(th);
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
