package com.amazon.aps.iva.b0;

import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.o0.q1;
/* compiled from: ScrollableState.kt */
/* loaded from: classes.dex */
public final class u0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Float, Float> {
    public final /* synthetic */ p3<com.amazon.aps.iva.xb0.l<Float, Float>> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(q1 q1Var) {
        super(1);
        this.h = q1Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Float invoke(Float f) {
        return this.h.getValue().invoke(Float.valueOf(f.floatValue()));
    }
}
