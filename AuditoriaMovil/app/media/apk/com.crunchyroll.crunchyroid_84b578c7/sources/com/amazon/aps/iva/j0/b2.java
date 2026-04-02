package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.j0.p2;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
/* compiled from: TextFieldKeyInput.kt */
/* loaded from: classes.dex */
public final class b2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ p2 h;
    public final /* synthetic */ com.amazon.aps.iva.l0.c0 i;
    public final /* synthetic */ com.amazon.aps.iva.i2.e0 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ com.amazon.aps.iva.i2.q m;
    public final /* synthetic */ s2 n;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.i2.e0, com.amazon.aps.iva.kb0.q> o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(p2 p2Var, com.amazon.aps.iva.l0.c0 c0Var, com.amazon.aps.iva.i2.e0 e0Var, boolean z, boolean z2, com.amazon.aps.iva.i2.q qVar, s2 s2Var, p2.b bVar, int i) {
        super(3);
        this.h = p2Var;
        this.i = c0Var;
        this.j = e0Var;
        this.k = z;
        this.l = z2;
        this.m = qVar;
        this.n = s2Var;
        this.o = bVar;
        this.p = i;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        com.amazon.aps.iva.o0.t1.c(num, fVar, "$this$composed", iVar2, 2057323757);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar2.s(-492369756);
        Object t = iVar2.t();
        i.a.C0550a c0550a = i.a.a;
        if (t == c0550a) {
            t = new com.amazon.aps.iva.l0.j0();
            iVar2.n(t);
        }
        iVar2.G();
        com.amazon.aps.iva.l0.j0 j0Var = (com.amazon.aps.iva.l0.j0) t;
        iVar2.s(-492369756);
        Object t2 = iVar2.t();
        if (t2 == c0550a) {
            t2 = new e0();
            iVar2.n(t2);
        }
        iVar2.G();
        com.amazon.aps.iva.a1.f a = androidx.compose.ui.input.key.a.a(new a2(new z1(this.h, this.i, this.j, this.k, this.l, j0Var, this.m, this.n, (e0) t2, this.o, this.p)));
        iVar2.G();
        return a;
    }
}
