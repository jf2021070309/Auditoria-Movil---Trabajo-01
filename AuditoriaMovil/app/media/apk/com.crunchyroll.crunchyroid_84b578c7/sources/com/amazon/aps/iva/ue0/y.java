package com.amazon.aps.iva.ue0;

import com.amazon.aps.iva.ee0.f1;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes4.dex */
public final class y<E> extends x<E> {
    public final com.amazon.aps.iva.xb0.l<E, com.amazon.aps.iva.kb0.q> g;

    public y(Object obj, com.amazon.aps.iva.se0.n nVar, com.amazon.aps.iva.xb0.l lVar) {
        super(obj, nVar);
        this.g = lVar;
    }

    @Override // com.amazon.aps.iva.xe0.h
    public final boolean n() {
        if (!super.n()) {
            return false;
        }
        u();
        return true;
    }

    @Override // com.amazon.aps.iva.ue0.v
    public final void u() {
        com.amazon.aps.iva.ob0.g context = this.f.getContext();
        com.amazon.aps.iva.xe0.y m = f1.m(this.g, this.e, null);
        if (m != null) {
            com.amazon.aps.iva.se0.i.c(context, m);
        }
    }
}
