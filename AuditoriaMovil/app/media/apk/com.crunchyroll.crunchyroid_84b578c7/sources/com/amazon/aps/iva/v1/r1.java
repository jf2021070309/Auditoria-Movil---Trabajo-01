package com.amazon.aps.iva.v1;
/* compiled from: InfiniteAnimationPolicy.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r1 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<Object>, Object> {
    public int h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Long, Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r1(com.amazon.aps.iva.xb0.l<? super Long, Object> lVar, com.amazon.aps.iva.ob0.d<? super r1> dVar) {
        super(1, dVar);
        this.i = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
        return new r1(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(com.amazon.aps.iva.ob0.d<Object> dVar) {
        return ((r1) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            this.h = 1;
            obj = com.amazon.aps.iva.o0.j1.b(this.i, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
