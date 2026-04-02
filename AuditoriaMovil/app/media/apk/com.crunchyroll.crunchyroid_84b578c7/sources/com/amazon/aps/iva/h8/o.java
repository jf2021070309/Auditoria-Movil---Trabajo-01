package com.amazon.aps.iva.h8;

import com.amazon.aps.iva.g8.g0;
import com.amazon.aps.iva.h8.e;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: NavHost.kt */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.g8.f h;
    public final /* synthetic */ com.amazon.aps.iva.y.o i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.amazon.aps.iva.g8.f fVar, com.amazon.aps.iva.y.o oVar) {
        super(2);
        this.h = fVar;
        this.i = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.g8.f fVar = this.h;
            g0 g0Var = fVar.c;
            com.amazon.aps.iva.yb0.j.d(g0Var, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            ((e.a) g0Var).k.K(this.i, fVar, iVar2, 72);
        }
        return q.a;
    }
}
