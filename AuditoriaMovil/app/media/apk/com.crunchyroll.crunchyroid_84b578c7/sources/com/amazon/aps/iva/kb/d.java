package com.amazon.aps.iva.kb;

import com.amazon.aps.iva.ga.m;
/* compiled from: CriteriaDownAdditionalHeight.java */
/* loaded from: classes.dex */
public final class d extends m {
    public final int d;

    public d(e eVar, int i) {
        super(eVar, 1);
        this.d = i;
    }

    @Override // com.amazon.aps.iva.ga.m, com.amazon.aps.iva.kb.i
    public final boolean c(com.amazon.aps.iva.ib.a aVar) {
        int c = aVar.c();
        if (super.c(aVar) && aVar.f > c + this.d) {
            return true;
        }
        return false;
    }
}
