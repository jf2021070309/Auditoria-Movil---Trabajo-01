package com.amazon.aps.iva.p1;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.u1.g1;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: HitPathTracker.kt */
/* loaded from: classes.dex */
public final class k extends l {
    public final f.c b;
    public final com.amazon.aps.iva.p0.f<x> c;
    public final LinkedHashMap d;
    public androidx.compose.ui.node.o e;
    public m f;
    public boolean g;
    public boolean h;
    public boolean i;

    public k(f.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "modifierNode");
        this.b = cVar;
        this.c = new com.amazon.aps.iva.p0.f<>(new x[16]);
        this.d = new LinkedHashMap();
        this.h = true;
        this.i = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0202, code lost:
        if (r12 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x026c, code lost:
        if (r2 == false) goto L141;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ed  */
    @Override // com.amazon.aps.iva.p1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.util.Map<com.amazon.aps.iva.p1.x, com.amazon.aps.iva.p1.y> r38, com.amazon.aps.iva.s1.q r39, com.amazon.aps.iva.p1.h r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p1.k.a(java.util.Map, com.amazon.aps.iva.s1.q, com.amazon.aps.iva.p1.h, boolean):boolean");
    }

    @Override // com.amazon.aps.iva.p1.l
    public final void b(h hVar) {
        super.b(hVar);
        m mVar = this.f;
        if (mVar == null) {
            return;
        }
        this.g = this.h;
        List<y> list = mVar.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= size) {
                break;
            }
            y yVar = list.get(i);
            boolean z3 = yVar.d;
            long j = yVar.a;
            if (z3 || (hVar.a(j) && this.h)) {
                z2 = false;
            }
            if (z2) {
                this.c.k(new x(j));
            }
            i++;
        }
        this.h = false;
        if (mVar.c == 5) {
            z = true;
        }
        this.i = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r9 = this;
            com.amazon.aps.iva.p0.f<com.amazon.aps.iva.p1.k> r0 = r9.a
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L15
            T[] r0 = r0.b
            r4 = r2
        Lb:
            r5 = r0[r4]
            com.amazon.aps.iva.p1.k r5 = (com.amazon.aps.iva.p1.k) r5
            r5.d()
            int r4 = r4 + r3
            if (r4 < r1) goto Lb
        L15:
            r0 = 0
            com.amazon.aps.iva.a1.f$c r1 = r9.b
            r4 = r0
        L19:
            if (r1 == 0) goto L6a
            boolean r5 = r1 instanceof com.amazon.aps.iva.u1.g1
            if (r5 == 0) goto L25
            com.amazon.aps.iva.u1.g1 r1 = (com.amazon.aps.iva.u1.g1) r1
            r1.G0()
            goto L65
        L25:
            int r5 = r1.d
            r6 = 16
            r5 = r5 & r6
            if (r5 == 0) goto L2e
            r5 = r3
            goto L2f
        L2e:
            r5 = r2
        L2f:
            if (r5 == 0) goto L65
            boolean r5 = r1 instanceof com.amazon.aps.iva.u1.j
            if (r5 == 0) goto L65
            r5 = r1
            com.amazon.aps.iva.u1.j r5 = (com.amazon.aps.iva.u1.j) r5
            com.amazon.aps.iva.a1.f$c r5 = r5.p
            r7 = r2
        L3b:
            if (r5 == 0) goto L62
            int r8 = r5.d
            r8 = r8 & r6
            if (r8 == 0) goto L44
            r8 = r3
            goto L45
        L44:
            r8 = r2
        L45:
            if (r8 == 0) goto L5f
            int r7 = r7 + 1
            if (r7 != r3) goto L4d
            r1 = r5
            goto L5f
        L4d:
            if (r4 != 0) goto L56
            com.amazon.aps.iva.p0.f r4 = new com.amazon.aps.iva.p0.f
            com.amazon.aps.iva.a1.f$c[] r8 = new com.amazon.aps.iva.a1.f.c[r6]
            r4.<init>(r8)
        L56:
            if (r1 == 0) goto L5c
            r4.b(r1)
            r1 = r0
        L5c:
            r4.b(r5)
        L5f:
            com.amazon.aps.iva.a1.f$c r5 = r5.g
            goto L3b
        L62:
            if (r7 != r3) goto L65
            goto L19
        L65:
            com.amazon.aps.iva.a1.f$c r1 = com.amazon.aps.iva.u1.i.b(r4)
            goto L19
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p1.k.d():void");
    }

    public final boolean e(h hVar) {
        com.amazon.aps.iva.p0.f<k> fVar;
        int i;
        Object[] objArr;
        Object[] objArr2;
        LinkedHashMap linkedHashMap = this.d;
        boolean z = false;
        int i2 = 0;
        z = false;
        if (!linkedHashMap.isEmpty()) {
            f.c cVar = this.b;
            if (cVar.n) {
                m mVar = this.f;
                com.amazon.aps.iva.yb0.j.c(mVar);
                androidx.compose.ui.node.o oVar = this.e;
                com.amazon.aps.iva.yb0.j.c(oVar);
                long j = oVar.d;
                f.c cVar2 = cVar;
                com.amazon.aps.iva.p0.f fVar2 = null;
                while (cVar2 != null) {
                    if (cVar2 instanceof g1) {
                        ((g1) cVar2).C0(mVar, n.Final, j);
                    } else {
                        if ((cVar2.d & 16) != 0) {
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        if (objArr != null && (cVar2 instanceof com.amazon.aps.iva.u1.j)) {
                            int i3 = 0;
                            for (f.c cVar3 = ((com.amazon.aps.iva.u1.j) cVar2).p; cVar3 != null; cVar3 = cVar3.g) {
                                if ((cVar3.d & 16) != 0) {
                                    objArr2 = 1;
                                } else {
                                    objArr2 = null;
                                }
                                if (objArr2 != null) {
                                    i3++;
                                    if (i3 == 1) {
                                        cVar2 = cVar3;
                                    } else {
                                        if (fVar2 == null) {
                                            fVar2 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                        }
                                        if (cVar2 != null) {
                                            fVar2.b(cVar2);
                                            cVar2 = null;
                                        }
                                        fVar2.b(cVar3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                    }
                    cVar2 = com.amazon.aps.iva.u1.i.b(fVar2);
                }
                if (cVar.n && (i = (fVar = this.a).d) > 0) {
                    k[] kVarArr = fVar.b;
                    do {
                        kVarArr[i2].e(hVar);
                        i2++;
                    } while (i2 < i);
                    z = true;
                } else {
                    z = true;
                }
            }
        }
        b(hVar);
        linkedHashMap.clear();
        this.e = null;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(java.util.Map<com.amazon.aps.iva.p1.x, com.amazon.aps.iva.p1.y> r17, com.amazon.aps.iva.s1.q r18, com.amazon.aps.iva.p1.h r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.p1.k.f(java.util.Map, com.amazon.aps.iva.s1.q, com.amazon.aps.iva.p1.h, boolean):boolean");
    }

    public final String toString() {
        return "Node(pointerInputFilter=" + this.b + ", children=" + this.a + ", pointerIds=" + this.c + ')';
    }
}
