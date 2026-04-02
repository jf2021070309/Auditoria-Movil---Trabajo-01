package com.amazon.aps.iva.fe;

import com.amazon.aps.iva.ez.g;
/* compiled from: OtpViewModel.kt */
/* loaded from: classes.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ t h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar) {
        super(1);
        this.h = tVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Integer num) {
        this.h.j.k(new com.amazon.aps.iva.ez.d<>(new g.c(Integer.valueOf(num.intValue()), null)));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
