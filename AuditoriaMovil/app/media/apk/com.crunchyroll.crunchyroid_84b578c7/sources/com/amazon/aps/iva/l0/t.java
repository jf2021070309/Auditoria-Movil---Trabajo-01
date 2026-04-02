package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.z.u0;
/* compiled from: SelectionMagnifier.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", f = "SelectionMagnifier.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ com.amazon.aps.iva.z.b<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.z.n> i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.amazon.aps.iva.z.b<com.amazon.aps.iva.e1.c, com.amazon.aps.iva.z.n> bVar, long j, com.amazon.aps.iva.ob0.d<? super t> dVar) {
        super(2, dVar);
        this.i = bVar;
        this.j = j;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new t(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((t) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                com.amazon.aps.iva.ab.x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.e1.c cVar = new com.amazon.aps.iva.e1.c(this.j);
            u0<com.amazon.aps.iva.e1.c> u0Var = p.d;
            this.h = 1;
            if (com.amazon.aps.iva.z.b.b(this.i, cVar, u0Var, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
