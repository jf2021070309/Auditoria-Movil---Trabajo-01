package com.amazon.aps.iva.h0;

import com.amazon.aps.iva.a0.q0;
import com.amazon.aps.iva.a0.s0;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.c0.m;
import com.amazon.aps.iva.nl.g;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: Selectable.kt */
/* loaded from: classes.dex */
public final class a extends l implements q<f, i, Integer, f> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ com.amazon.aps.iva.a2.i j;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z, boolean z2, com.amazon.aps.iva.a2.i iVar, g gVar) {
        super(3);
        this.h = z;
        this.i = z2;
        this.j = iVar;
        this.k = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final f invoke(f fVar, i iVar, Integer num) {
        i iVar2 = iVar;
        t1.c(num, fVar, "$this$composed", iVar2, -2124609672);
        e0.b bVar = e0.a;
        iVar2.s(-492369756);
        Object t = iVar2.t();
        if (t == i.a.a) {
            t = new m();
            iVar2.n(t);
        }
        iVar2.G();
        f a = c.a(this.h, (com.amazon.aps.iva.c0.l) t, (q0) iVar2.i(s0.a), this.i, this.j, this.k);
        iVar2.G();
        return a;
    }
}
