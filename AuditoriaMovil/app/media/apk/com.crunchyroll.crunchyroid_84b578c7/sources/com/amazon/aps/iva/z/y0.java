package com.amazon.aps.iva.z;
/* compiled from: SuspendAnimation.kt */
/* loaded from: classes.dex */
public final class y0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Long, Object> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Long, Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y0(com.amazon.aps.iva.xb0.l<? super Long, Object> lVar) {
        super(1);
        this.h = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(Long l) {
        return this.h.invoke(Long.valueOf(l.longValue() / 1));
    }
}
