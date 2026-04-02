package com.amazon.aps.iva.b0;
/* compiled from: UpdatableAnimationState.kt */
/* loaded from: classes.dex */
public final class d1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Long, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ e1 h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Float, com.amazon.aps.iva.kb0.q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d1(e1 e1Var, com.amazon.aps.iva.xb0.l<? super Float, com.amazon.aps.iva.kb0.q> lVar) {
        super(1);
        this.h = e1Var;
        this.i = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Long l) {
        l.longValue();
        e1 e1Var = this.h;
        float f = e1Var.d;
        e1Var.d = 0.0f;
        this.i.invoke(Float.valueOf(f));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
