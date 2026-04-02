package com.amazon.aps.iva.kb;

import com.amazon.aps.iva.ga.m;
/* compiled from: CriteriaLeftAdditionalWidth.java */
/* loaded from: classes.dex */
public final class f extends m {
    public final int d;

    public f(com.amazon.aps.iva.hb.e eVar, int i) {
        super(eVar, 1);
        this.d = i;
    }

    @Override // com.amazon.aps.iva.ga.m, com.amazon.aps.iva.kb.i
    public final boolean c(com.amazon.aps.iva.ib.a aVar) {
        int a = aVar.a();
        if (super.c(aVar) && aVar.g < a - this.d) {
            return true;
        }
        return false;
    }
}
