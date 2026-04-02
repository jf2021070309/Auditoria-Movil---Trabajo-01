package com.amazon.aps.iva.kb;

import com.amazon.aps.iva.ga.m;
import com.amazon.aps.iva.j0.d1;
/* compiled from: CriteriaRightAdditionalWidth.java */
/* loaded from: classes.dex */
public final class g extends m {
    public final int d;

    public g(d1 d1Var, int i) {
        super(d1Var, 1);
        this.d = i;
    }

    @Override // com.amazon.aps.iva.ga.m, com.amazon.aps.iva.kb.i
    public final boolean c(com.amazon.aps.iva.ib.a aVar) {
        int d = aVar.d();
        if (super.c(aVar) && aVar.h > d + this.d) {
            return true;
        }
        return false;
    }
}
