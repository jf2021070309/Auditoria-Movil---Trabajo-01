package com.amazon.aps.iva.p6;

import com.amazon.aps.iva.o6.o;
import com.amazon.aps.iva.q5.r0;
/* compiled from: SinglePeriodAdTimeline.java */
/* loaded from: classes.dex */
public final class c extends o {
    public final com.amazon.aps.iva.q5.c h;

    public c(r0 r0Var, com.amazon.aps.iva.q5.c cVar) {
        super(r0Var);
        boolean z;
        if (r0Var.j() == 1) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        com.amazon.aps.iva.cq.b.C(r0Var.q() == 1);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.o6.o, com.amazon.aps.iva.q5.r0
    public final r0.b h(int i, r0.b bVar, boolean z) {
        this.g.h(i, bVar, z);
        long j = bVar.e;
        if (j == -9223372036854775807L) {
            j = this.h.e;
        }
        bVar.j(bVar.b, bVar.c, bVar.d, j, bVar.f, this.h, bVar.g);
        return bVar;
    }
}
