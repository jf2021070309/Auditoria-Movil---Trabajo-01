package androidx.compose.foundation;

import com.amazon.aps.iva.a0.q0;
import com.amazon.aps.iva.a0.s0;
import com.amazon.aps.iva.a0.t0;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.c0.m;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.v1.t1;
import com.amazon.aps.iva.xb0.q;
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements q<com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.a1.f> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ String i;
    public final /* synthetic */ com.amazon.aps.iva.a2.i j;
    public final /* synthetic */ String k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> l;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> m;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.amazon.aps.iva.a2.i iVar, String str, String str2, com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.xb0.a aVar2, com.amazon.aps.iva.xb0.a aVar3, boolean z) {
        super(3);
        this.h = z;
        this.i = str;
        this.j = iVar;
        this.k = str2;
        this.l = aVar;
        this.m = aVar2;
        this.n = aVar3;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.a1.f invoke(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.a1.f fVar2;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        t1.c(num, fVar, "$this$composed", iVar2, 1969174843);
        e0.b bVar = e0.a;
        f.a aVar = f.a.c;
        q0 q0Var = (q0) iVar2.i(s0.a);
        iVar2.s(-492369756);
        Object t = iVar2.t();
        if (t == i.a.a) {
            t = new m();
            iVar2.n(t);
        }
        iVar2.G();
        com.amazon.aps.iva.c0.l lVar = (com.amazon.aps.iva.c0.l) t;
        boolean z = this.h;
        String str = this.i;
        com.amazon.aps.iva.a2.i iVar3 = this.j;
        String str2 = this.k;
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar2 = this.l;
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar3 = this.m;
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionSource");
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar4 = this.n;
        com.amazon.aps.iva.yb0.j.f(aVar4, "onClick");
        t1.a aVar5 = com.amazon.aps.iva.v1.t1.a;
        com.amazon.aps.iva.a1.f a = com.amazon.aps.iva.a1.e.a(aVar, aVar5, new t0(q0Var, lVar));
        com.amazon.aps.iva.yb0.j.f(a, "<this>");
        if (z) {
            fVar2 = new HoverableElement(lVar);
        } else {
            fVar2 = aVar;
        }
        com.amazon.aps.iva.a1.f a2 = com.amazon.aps.iva.v1.t1.a(aVar, aVar5, FocusableKt.b(lVar, a.o(fVar2), z).o(new CombinedClickableElement(lVar, z, str, iVar3, aVar4, str2, aVar2, aVar3)));
        iVar2.G();
        return a2;
    }
}
