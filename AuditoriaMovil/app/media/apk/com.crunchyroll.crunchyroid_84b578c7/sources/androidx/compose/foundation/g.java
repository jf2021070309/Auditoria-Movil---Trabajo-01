package androidx.compose.foundation;

import com.amazon.aps.iva.a0.v;
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public final class g extends a {
    public final v u;
    public final h v;

    public g() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.c0.l lVar, boolean z, String str, com.amazon.aps.iva.a2.i iVar, com.amazon.aps.iva.xb0.a aVar) {
        super(lVar, z, aVar);
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionSource");
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        v vVar = new v(z, str, iVar, aVar, null, null);
        t1(vVar);
        this.u = vVar;
        h hVar = new h(z, lVar, aVar, this.t);
        t1(hVar);
        this.v = hVar;
    }

    @Override // androidx.compose.foundation.a
    public final b v1() {
        return this.v;
    }
}
