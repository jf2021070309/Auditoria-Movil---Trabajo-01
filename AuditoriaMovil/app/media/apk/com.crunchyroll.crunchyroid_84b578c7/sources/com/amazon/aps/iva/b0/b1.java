package com.amazon.aps.iva.b0;
/* compiled from: UpdatableAnimationState.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {100, 146}, m = "animateToZero")
/* loaded from: classes.dex */
public final class b1 extends com.amazon.aps.iva.qb0.c {
    public e1 h;
    public com.amazon.aps.iva.kb0.a i;
    public com.amazon.aps.iva.xb0.a j;
    public float k;
    public /* synthetic */ Object l;
    public final /* synthetic */ e1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(e1 e1Var, com.amazon.aps.iva.ob0.d<? super b1> dVar) {
        super(dVar);
        this.m = e1Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, this);
    }
}
