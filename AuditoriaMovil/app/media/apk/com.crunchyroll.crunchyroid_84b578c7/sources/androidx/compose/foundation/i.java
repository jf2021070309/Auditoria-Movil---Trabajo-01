package androidx.compose.foundation;

import com.amazon.aps.iva.a0.v;
import com.amazon.aps.iva.kb0.q;
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public final class i extends a {
    public com.amazon.aps.iva.xb0.a<q> u;
    public final v v;
    public final j w;

    public i() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.amazon.aps.iva.c0.l lVar, boolean z, String str, com.amazon.aps.iva.a2.i iVar, com.amazon.aps.iva.xb0.a aVar, String str2, com.amazon.aps.iva.xb0.a aVar2, com.amazon.aps.iva.xb0.a aVar3) {
        super(lVar, z, aVar);
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionSource");
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        this.u = aVar2;
        v vVar = new v(z, str, iVar, aVar, str2, aVar2);
        t1(vVar);
        this.v = vVar;
        j jVar = new j(z, lVar, aVar, this.t, this.u, aVar3);
        t1(jVar);
        this.w = jVar;
    }

    @Override // androidx.compose.foundation.a
    public final b v1() {
        return this.w;
    }
}
