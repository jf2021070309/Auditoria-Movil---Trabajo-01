package com.amazon.aps.iva.ct;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.xb0.p;
/* compiled from: SyncedBenefitProvider.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.benefits.SyncedBenefitProviderImpl$hasBenefit$2", f = "SyncedBenefitProvider.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ c j;

    /* compiled from: SyncedBenefitProvider.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.benefits.SyncedBenefitProviderImpl$hasBenefit$2$1", f = "SyncedBenefitProvider.kt", l = {34}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                l lVar = this.i.a;
                this.h = 1;
                if (lVar.b(this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
        super(2, dVar);
        this.j = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        b bVar = new b(this.j, dVar);
        bVar.i = obj;
        return bVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
        return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        c cVar = this.j;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            g0 g0Var = (g0) this.i;
            j1 j1Var = cVar.d;
            if (j1Var != null && j1Var.isActive()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                cVar.d = com.amazon.aps.iva.se0.i.d(g0Var, null, null, new a(cVar, null), 3);
            }
            j1 j1Var2 = cVar.d;
            if (j1Var2 != null) {
                this.h = 1;
                if (j1Var2.N(this) == aVar) {
                    return aVar;
                }
            }
        }
        return cVar.c.invoke(cVar.b);
    }
}
