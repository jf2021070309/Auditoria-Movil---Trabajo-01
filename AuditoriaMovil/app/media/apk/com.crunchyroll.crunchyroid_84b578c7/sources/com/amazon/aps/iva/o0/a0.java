package com.amazon.aps.iva.o0;

import java.util.ArrayList;
import java.util.List;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<d<?>, b3, u2, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ z2 h;
    public final /* synthetic */ c i;
    public final /* synthetic */ List<com.amazon.aps.iva.xb0.q<d<?>, b3, u2, com.amazon.aps.iva.kb0.q>> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z2 z2Var, c cVar, ArrayList arrayList) {
        super(3);
        this.h = z2Var;
        this.i = cVar;
        this.j = arrayList;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(d<?> dVar, b3 b3Var, u2 u2Var) {
        d<?> dVar2 = dVar;
        b3 b3Var2 = b3Var;
        u2 u2Var2 = u2Var;
        com.amazon.aps.iva.d90.a.c(dVar2, "applier", b3Var2, "slots", u2Var2, "rememberManager");
        List<com.amazon.aps.iva.xb0.q<d<?>, b3, u2, com.amazon.aps.iva.kb0.q>> list = this.j;
        z2 z2Var = this.h;
        b3 j = z2Var.j();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(dVar2, j, u2Var2);
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            j.f();
            b3Var2.e();
            c cVar = this.i;
            cVar.getClass();
            b3Var2.u(z2Var, z2Var.d(cVar));
            b3Var2.j();
            return com.amazon.aps.iva.kb0.q.a;
        } catch (Throwable th) {
            j.f();
            throw th;
        }
    }
}
