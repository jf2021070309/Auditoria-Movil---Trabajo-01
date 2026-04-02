package com.amazon.aps.iva.kb;

import com.amazon.aps.iva.ga.m;
/* compiled from: CriteriaAdditionalRow.java */
/* loaded from: classes.dex */
public final class c extends m implements com.amazon.aps.iva.ib.j {
    public final int d;
    public int e;

    public c(i iVar, int i) {
        super(iVar, 1);
        this.d = i;
    }

    @Override // com.amazon.aps.iva.ib.j
    public final void a(com.amazon.aps.iva.ib.h hVar) {
        if (super.c((com.amazon.aps.iva.ib.a) hVar)) {
            this.e++;
        }
    }

    @Override // com.amazon.aps.iva.ga.m, com.amazon.aps.iva.kb.i
    public final boolean c(com.amazon.aps.iva.ib.a aVar) {
        aVar.s.add(this);
        if (super.c(aVar) && this.e >= this.d) {
            return true;
        }
        return false;
    }
}
