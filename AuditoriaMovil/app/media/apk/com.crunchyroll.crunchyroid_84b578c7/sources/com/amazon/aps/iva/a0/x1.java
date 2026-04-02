package com.amazon.aps.iva.a0;
/* compiled from: Scroll.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", l = {288, 290}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class x1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ c2 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(boolean z, c2 c2Var, float f, float f2, com.amazon.aps.iva.ob0.d<? super x1> dVar) {
        super(2, dVar);
        this.i = z;
        this.j = c2Var;
        this.k = f;
        this.l = f2;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new x1(this.i, this.j, this.k, this.l, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((x1) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.amazon.aps.iva.ab.x.i0(obj);
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            boolean z = this.i;
            c2 c2Var = this.j;
            if (z) {
                com.amazon.aps.iva.yb0.j.d(c2Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                this.h = 1;
                if (com.amazon.aps.iva.b0.m0.a(c2Var, this.k, com.amazon.aps.iva.z.k.c(0.0f, null, 7), this) == aVar) {
                    return aVar;
                }
            } else {
                com.amazon.aps.iva.yb0.j.d(c2Var, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                this.h = 2;
                if (com.amazon.aps.iva.b0.m0.a(c2Var, this.l, com.amazon.aps.iva.z.k.c(0.0f, null, 7), this) == aVar) {
                    return aVar;
                }
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
