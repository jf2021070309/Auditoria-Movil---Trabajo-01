package com.amazon.aps.iva.i5;

import com.amazon.aps.iva.se0.j1;
/* compiled from: CoroutineLiveData.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {188}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ d<Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d<Object> dVar, com.amazon.aps.iva.ob0.d<? super b> dVar2) {
        super(2, dVar2);
        this.i = dVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new b(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        boolean z = true;
        d<Object> dVar = this.i;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            long j = dVar.c;
            this.h = 1;
            if (com.amazon.aps.iva.ab.t.l(j, this) == aVar) {
                return aVar;
            }
        }
        if (dVar.a.c <= 0) {
            z = false;
        }
        if (!z) {
            j1 j1Var = dVar.f;
            if (j1Var != null) {
                j1Var.a(null);
            }
            dVar.f = null;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
