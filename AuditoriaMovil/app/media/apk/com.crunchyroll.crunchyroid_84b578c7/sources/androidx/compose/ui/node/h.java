package androidx.compose.ui.node;

import com.amazon.aps.iva.kb0.q;
/* compiled from: LayoutNodeLayoutDelegate.kt */
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.u1.b, q> {
    public static final h h = new h();

    public h() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(com.amazon.aps.iva.u1.b bVar) {
        com.amazon.aps.iva.u1.b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "child");
        bVar2.c().e = bVar2.c().d;
        return q.a;
    }
}
