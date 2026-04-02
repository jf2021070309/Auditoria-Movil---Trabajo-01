package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.s1.u0;
import java.util.List;
/* compiled from: CoreTextField.kt */
/* loaded from: classes.dex */
public final class n implements com.amazon.aps.iva.s1.d0 {
    public final /* synthetic */ p2 a;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> b;
    public final /* synthetic */ com.amazon.aps.iva.i2.e0 c;
    public final /* synthetic */ com.amazon.aps.iva.i2.q d;
    public final /* synthetic */ com.amazon.aps.iva.o2.c e;
    public final /* synthetic */ int f;

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<u0.a, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(u0.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "$this$layout");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(p2 p2Var, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.c2.y, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.i2.e0 e0Var, com.amazon.aps.iva.i2.q qVar, com.amazon.aps.iva.o2.c cVar, int i) {
        this.a = p2Var;
        this.b = lVar;
        this.c = e0Var;
        this.d = qVar;
        this.e = cVar;
        this.f = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
        if (r0 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ea, code lost:
        if (com.amazon.aps.iva.o2.a.g(r32) == com.amazon.aps.iva.o2.a.g(r7)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ec, code lost:
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0220  */
    @Override // com.amazon.aps.iva.s1.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.s1.e0 d(com.amazon.aps.iva.s1.f0 r30, java.util.List<? extends com.amazon.aps.iva.s1.c0> r31, long r32) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j0.n.d(com.amazon.aps.iva.s1.f0, java.util.List, long):com.amazon.aps.iva.s1.e0");
    }

    @Override // com.amazon.aps.iva.s1.d0
    public final int e(androidx.compose.ui.node.o oVar, List list, int i) {
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        p2 p2Var = this.a;
        p2Var.a.a(oVar.i.t);
        com.amazon.aps.iva.c2.g gVar = p2Var.a.j;
        if (gVar != null) {
            return f1.a(gVar.b());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
}
