package androidx.compose.ui.node;

import com.amazon.aps.iva.a1.f;
/* compiled from: NodeChain.kt */
/* loaded from: classes.dex */
public final class n {
    public static final a a;

    /* compiled from: NodeChain.kt */
    /* loaded from: classes.dex */
    public static final class a extends f.c {
        public final String toString() {
            return "<Head>";
        }
    }

    static {
        a aVar = new a();
        aVar.e = -1;
        a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r4 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(com.amazon.aps.iva.a1.f.b r4, com.amazon.aps.iva.a1.f.b r5) {
        /*
            java.lang.String r0 = "prev"
            com.amazon.aps.iva.yb0.j.f(r4, r0)
            java.lang.String r0 = "next"
            com.amazon.aps.iva.yb0.j.f(r5, r0)
            boolean r0 = com.amazon.aps.iva.yb0.j.a(r4, r5)
            if (r0 == 0) goto L12
            r4 = 2
            goto L43
        L12:
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r1 = r5.getClass()
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L20
            r0 = r2
            goto L21
        L20:
            r0 = r3
        L21:
            if (r0 != 0) goto L42
            boolean r0 = r4 instanceof androidx.compose.ui.node.ForceUpdateElement
            if (r0 == 0) goto L40
            androidx.compose.ui.node.ForceUpdateElement r4 = (androidx.compose.ui.node.ForceUpdateElement) r4
            java.lang.String r0 = "a"
            com.amazon.aps.iva.u1.f0<?> r4 = r4.c
            com.amazon.aps.iva.yb0.j.f(r4, r0)
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r5 = r5.getClass()
            if (r4 != r5) goto L3c
            r4 = r2
            goto L3d
        L3c:
            r4 = r3
        L3d:
            if (r4 == 0) goto L40
            goto L42
        L40:
            r4 = r3
            goto L43
        L42:
            r4 = r2
        L43:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.n.a(com.amazon.aps.iva.a1.f$b, com.amazon.aps.iva.a1.f$b):int");
    }
}
