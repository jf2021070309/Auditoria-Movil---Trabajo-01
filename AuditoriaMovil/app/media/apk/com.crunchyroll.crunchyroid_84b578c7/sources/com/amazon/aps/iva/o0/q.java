package com.amazon.aps.iva.o0;

import java.util.ArrayList;
import java.util.List;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ j h;
    public final /* synthetic */ List<com.amazon.aps.iva.xb0.q<d<?>, b3, u2, com.amazon.aps.iva.kb0.q>> i;
    public final /* synthetic */ y2 j;
    public final /* synthetic */ m1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(j jVar, ArrayList arrayList, y2 y2Var, m1 m1Var) {
        super(0);
        this.h = jVar;
        this.i = arrayList;
        this.j = y2Var;
        this.k = m1Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        List<com.amazon.aps.iva.xb0.q<d<?>, b3, u2, com.amazon.aps.iva.kb0.q>> list = this.i;
        y2 y2Var = this.j;
        m1 m1Var = this.k;
        j jVar = this.h;
        List<com.amazon.aps.iva.xb0.q<d<?>, b3, u2, com.amazon.aps.iva.kb0.q>> list2 = jVar.e;
        try {
            jVar.e = list;
            y2 y2Var2 = jVar.E;
            int[] iArr = jVar.n;
            jVar.n = null;
            jVar.E = y2Var;
            j.K(jVar, m1Var.a, m1Var.g, m1Var.b);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            jVar.E = y2Var2;
            jVar.n = iArr;
            jVar.e = list2;
            return com.amazon.aps.iva.kb0.q.a;
        } catch (Throwable th) {
            jVar.e = list2;
            throw th;
        }
    }
}
