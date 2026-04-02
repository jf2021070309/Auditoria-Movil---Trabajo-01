package com.amazon.aps.iva.l0;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.t1;
/* compiled from: AndroidSelectionHandles.android.kt */
/* loaded from: classes.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ com.amazon.aps.iva.n2.g i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z, com.amazon.aps.iva.n2.g gVar, boolean z2) {
        super(3);
        this.h = z;
        this.i = gVar;
        this.j = z2;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.a1.f fVar2 = fVar;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        t1.c(num, fVar2, "$this$composed", iVar2, -1538687176);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        long j = ((k0) iVar2.i(l0.a)).a;
        com.amazon.aps.iva.f1.x xVar = new com.amazon.aps.iva.f1.x(j);
        Boolean valueOf = Boolean.valueOf(this.h);
        Boolean valueOf2 = Boolean.valueOf(this.j);
        com.amazon.aps.iva.n2.g gVar = this.i;
        Object[] objArr = {xVar, valueOf, gVar, valueOf2};
        boolean z = this.h;
        boolean z2 = this.j;
        iVar2.s(-568225417);
        boolean z3 = false;
        for (int i = 0; i < 4; i++) {
            z3 |= iVar2.H(objArr[i]);
        }
        Object t = iVar2.t();
        if (z3 || t == i.a.a) {
            t = new d(j, z, gVar, z2);
            iVar2.n(t);
        }
        iVar2.G();
        com.amazon.aps.iva.a1.f o = fVar2.o(androidx.compose.ui.draw.a.b((com.amazon.aps.iva.xb0.l) t));
        e0.b bVar2 = com.amazon.aps.iva.o0.e0.a;
        iVar2.G();
        return o;
    }
}
