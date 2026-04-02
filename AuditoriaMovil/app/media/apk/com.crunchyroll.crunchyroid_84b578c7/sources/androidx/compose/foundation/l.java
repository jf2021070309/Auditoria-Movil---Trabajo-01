package androidx.compose.foundation;

import com.amazon.aps.iva.a0.b2;
import com.amazon.aps.iva.a0.c2;
import com.amazon.aps.iva.a0.p1;
import com.amazon.aps.iva.a0.x;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.a2.o;
import com.amazon.aps.iva.b0.b0;
import com.amazon.aps.iva.b0.f0;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.n0;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.v1.d1;
import com.amazon.aps.iva.xb0.q;
/* compiled from: Scroll.kt */
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.yb0.l implements q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ boolean h = true;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ c2 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ b0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c2 c2Var, b0 b0Var, boolean z, boolean z2) {
        super(3);
        this.i = z;
        this.j = c2Var;
        this.k = z2;
        this.l = b0Var;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        f0 f0Var;
        boolean z;
        com.amazon.aps.iva.a1.f fVar2;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        t1.c(num, fVar, "$this$composed", iVar2, 1478351300);
        e0.b bVar = e0.a;
        p1 G = com.amazon.aps.iva.aq.j.G(iVar2);
        iVar2.s(773894976);
        iVar2.s(-492369756);
        Object t = iVar2.t();
        if (t == i.a.a) {
            n0 n0Var = new n0(x0.g(iVar2));
            iVar2.n(n0Var);
            t = n0Var;
        }
        iVar2.G();
        g0 g0Var = ((n0) t).b;
        iVar2.G();
        f.a aVar = f.a.c;
        boolean z2 = false;
        com.amazon.aps.iva.a1.f a = o.a(aVar, false, new b2(this.i, this.h, this.k, this.j, g0Var));
        boolean z3 = this.h;
        if (z3) {
            f0Var = f0.Vertical;
        } else {
            f0Var = f0.Horizontal;
        }
        f0 f0Var2 = f0Var;
        com.amazon.aps.iva.o2.l lVar = (com.amazon.aps.iva.o2.l) iVar2.i(d1.k);
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        com.amazon.aps.iva.yb0.j.f(f0Var2, "orientation");
        boolean z4 = this.i;
        boolean z5 = !z4;
        if (lVar == com.amazon.aps.iva.o2.l.Rtl) {
            z2 = true;
        }
        if (z2 && f0Var2 != f0.Vertical) {
            z = !z5;
        } else {
            z = z5;
        }
        c2 c2Var = this.j;
        com.amazon.aps.iva.a1.f b = androidx.compose.foundation.gestures.a.b(aVar, c2Var, f0Var2, G, this.k, z, this.l, c2Var.c);
        ScrollingLayoutElement scrollingLayoutElement = new ScrollingLayoutElement(c2Var, z4, z3);
        float f = x.a;
        com.amazon.aps.iva.yb0.j.f(a, "<this>");
        if (f0Var2 == f0.Vertical) {
            fVar2 = x.c;
        } else {
            fVar2 = x.b;
        }
        com.amazon.aps.iva.a1.f o = a.o(fVar2);
        com.amazon.aps.iva.yb0.j.f(o, "<this>");
        com.amazon.aps.iva.yb0.j.f(G, "overscrollEffect");
        com.amazon.aps.iva.a1.f o2 = o.o(G.d()).o(b).o(scrollingLayoutElement);
        iVar2.G();
        return o2;
    }
}
