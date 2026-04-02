package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ String i;
    public final /* synthetic */ com.amazon.aps.iva.a2.i j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z, String str, com.amazon.aps.iva.a2.i iVar, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        super(3);
        this.h = z;
        this.i = str;
        this.j = iVar;
        this.k = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        com.amazon.aps.iva.o0.t1.c(num, fVar, "$this$composed", iVar2, -756081143);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        f.a aVar = f.a.c;
        q0 q0Var = (q0) iVar2.i(s0.a);
        iVar2.s(-492369756);
        Object t = iVar2.t();
        if (t == i.a.a) {
            t = new com.amazon.aps.iva.c0.m();
            iVar2.n(t);
        }
        iVar2.G();
        com.amazon.aps.iva.a1.f a = androidx.compose.foundation.f.a(aVar, (com.amazon.aps.iva.c0.l) t, q0Var, this.h, this.i, this.j, this.k);
        iVar2.G();
        return a;
    }
}
