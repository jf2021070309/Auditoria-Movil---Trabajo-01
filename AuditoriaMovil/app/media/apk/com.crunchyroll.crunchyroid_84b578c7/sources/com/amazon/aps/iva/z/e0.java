package com.amazon.aps.iva.z;
/* compiled from: InfiniteAnimationPolicy.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<Object>, Object> {
    public int h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Long, Object> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(com.amazon.aps.iva.xb0.l<? super Long, Object> lVar, com.amazon.aps.iva.ob0.d<? super e0> dVar) {
        super(1, dVar);
        this.i = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
        return new e0(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(com.amazon.aps.iva.ob0.d<Object> dVar) {
        return ((e0) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
