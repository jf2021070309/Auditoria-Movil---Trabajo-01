package com.amazon.aps.iva.r4;
/* compiled from: NormalizeCompositionTree.kt */
/* loaded from: classes.dex */
public final class v {
    public final com.amazon.aps.iva.p4.n a;
    public final com.amazon.aps.iva.p4.n b;

    public v() {
        this((com.amazon.aps.iva.p4.n) null, 3);
    }

    public static v a(v vVar, com.amazon.aps.iva.p4.n nVar, com.amazon.aps.iva.p4.n nVar2, int i) {
        if ((i & 1) != 0) {
            nVar = vVar.a;
        }
        if ((i & 2) != 0) {
            nVar2 = vVar.b;
        }
        vVar.getClass();
        com.amazon.aps.iva.yb0.j.f(nVar, "sizeModifiers");
        com.amazon.aps.iva.yb0.j.f(nVar2, "nonSizeModifiers");
        return new v(nVar, nVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, vVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, vVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeModifiers(sizeModifiers=" + this.a + ", nonSizeModifiers=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ v(com.amazon.aps.iva.p4.n r3, int r4) {
        /*
            r2 = this;
            r0 = r4 & 1
            com.amazon.aps.iva.p4.n$a r1 = com.amazon.aps.iva.p4.n.a.b
            if (r0 == 0) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            r4 = r4 & 2
            if (r4 == 0) goto Le
            r3 = r1
        Le:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r4.v.<init>(com.amazon.aps.iva.p4.n, int):void");
    }

    public v(com.amazon.aps.iva.p4.n nVar, com.amazon.aps.iva.p4.n nVar2) {
        com.amazon.aps.iva.yb0.j.f(nVar, "sizeModifiers");
        com.amazon.aps.iva.yb0.j.f(nVar2, "nonSizeModifiers");
        this.a = nVar;
        this.b = nVar2;
    }
}
