package androidx.compose.ui.node;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.u1.k1;
/* compiled from: BackwardsCompatNode.kt */
/* loaded from: classes.dex */
public final class b {
    public static final a a = new a();
    public static final C0016b b = C0016b.h;
    public static final c c = c.h;

    /* compiled from: BackwardsCompatNode.kt */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.t1.h {
        @Override // com.amazon.aps.iva.t1.h
        public final Object l(com.amazon.aps.iva.t1.i iVar) {
            com.amazon.aps.iva.yb0.j.f(iVar, "<this>");
            return iVar.a.invoke();
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    /* renamed from: androidx.compose.ui.node.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0016b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.compose.ui.node.a, q> {
        public static final C0016b h = new C0016b();

        public C0016b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(androidx.compose.ui.node.a aVar) {
            androidx.compose.ui.node.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            aVar2.p = true;
            com.amazon.aps.iva.u1.p.a(aVar2);
            return q.a;
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.compose.ui.node.a, q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(androidx.compose.ui.node.a aVar) {
            androidx.compose.ui.node.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            aVar2.v1();
            return q.a;
        }
    }

    public static final boolean a(androidx.compose.ui.node.a aVar) {
        k1 k1Var = com.amazon.aps.iva.u1.i.e(aVar).z.d;
        com.amazon.aps.iva.yb0.j.d(k1Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return k1Var.o;
    }
}
