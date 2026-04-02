package com.amazon.aps.iva.zn;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.e0;
/* compiled from: Inputs.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, int i) {
        super(2);
        this.h = str;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.a1.f i = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.e.o(f.a.c, null, 3), 0.0f, 8, 0.0f, 0.0f, 13);
            a0 a0Var = com.amazon.aps.iva.ao.b.h;
            a4.b(this.h, i, com.amazon.aps.iva.ao.a.j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a0Var, iVar2, ((this.i >> 9) & 14) | 432, 1572864, 65528);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
