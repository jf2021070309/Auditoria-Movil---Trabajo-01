package com.amazon.aps.iva.p1;
/* compiled from: PointerInputEventProcessor.kt */
/* loaded from: classes.dex */
public final class c0 {
    public final androidx.compose.ui.node.e a;
    public final g b;
    public final z c;
    public final com.amazon.aps.iva.u1.s d;
    public boolean e;

    public c0(androidx.compose.ui.node.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "root");
        this.a = eVar;
        this.b = new g(eVar.z.b);
        this.c = new z();
        this.d = new com.amazon.aps.iva.u1.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0050 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.amazon.aps.iva.p1.a0 r18, com.amazon.aps.iva.p1.j0 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p1.c0.a(com.amazon.aps.iva.p1.a0, com.amazon.aps.iva.p1.j0, boolean):int");
    }

    public final void b() {
        if (!this.e) {
            this.c.a.clear();
            l lVar = this.b.b;
            com.amazon.aps.iva.p0.f<k> fVar = lVar.a;
            int i = fVar.d;
            if (i > 0) {
                k[] kVarArr = fVar.b;
                int i2 = 0;
                do {
                    kVarArr[i2].d();
                    i2++;
                } while (i2 < i);
                lVar.a.f();
            }
            lVar.a.f();
        }
    }
}
