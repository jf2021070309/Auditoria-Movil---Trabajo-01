package com.amazon.aps.iva.kb;

import com.amazon.aps.iva.ga.m;
/* compiled from: CriteriaUpAdditionalHeight.java */
/* loaded from: classes.dex */
public final class h extends m {
    public final int d;

    public h(com.amazon.aps.iva.da0.a aVar, int i) {
        super(aVar, 1);
        this.d = i;
    }

    @Override // com.amazon.aps.iva.ga.m, com.amazon.aps.iva.kb.i
    public final boolean c(com.amazon.aps.iva.ib.a aVar) {
        int b = aVar.b();
        if (super.c(aVar) && aVar.e < b - this.d) {
            return true;
        }
        return false;
    }
}
