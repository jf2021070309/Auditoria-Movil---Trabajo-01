package com.amazon.aps.iva.d1;

import androidx.compose.ui.focus.FocusTargetNode;
/* compiled from: FocusTraversal.kt */
/* loaded from: classes.dex */
public final class a0 {

    /* compiled from: FocusTraversal.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.amazon.aps.iva.o2.l.values().length];
            try {
                iArr[com.amazon.aps.iva.o2.l.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.o2.l.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[x.values().length];
            try {
                iArr2[x.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[x.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[x.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[x.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x003d, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode a(androidx.compose.ui.focus.FocusTargetNode r9) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d1.a0.a(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final com.amazon.aps.iva.e1.e b(FocusTargetNode focusTargetNode) {
        com.amazon.aps.iva.e1.e f;
        com.amazon.aps.iva.yb0.j.f(focusTargetNode, "<this>");
        androidx.compose.ui.node.o oVar = focusTargetNode.i;
        if (oVar == null || (f = com.amazon.aps.iva.gd0.j.f(oVar).f(oVar, false)) == null) {
            return com.amazon.aps.iva.e1.e.e;
        }
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0023, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode c(androidx.compose.ui.focus.FocusTargetNode r9) {
        /*
            java.lang.String r0 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            com.amazon.aps.iva.a1.f$c r9 = r9.b
            boolean r0 = r9.n
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            if (r0 == 0) goto Lac
            com.amazon.aps.iva.p0.f r0 = new com.amazon.aps.iva.p0.f
            r2 = 16
            com.amazon.aps.iva.a1.f$c[] r3 = new com.amazon.aps.iva.a1.f.c[r2]
            r0.<init>(r3)
            com.amazon.aps.iva.a1.f$c r3 = r9.g
            if (r3 != 0) goto L20
            com.amazon.aps.iva.u1.i.a(r0, r9)
            goto L23
        L20:
            r0.b(r3)
        L23:
            boolean r9 = r0.j()
            if (r9 == 0) goto Lab
            int r9 = r0.d
            r3 = 1
            int r9 = r9 - r3
            java.lang.Object r9 = r0.l(r9)
            com.amazon.aps.iva.a1.f$c r9 = (com.amazon.aps.iva.a1.f.c) r9
            int r4 = r9.e
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L3d
            com.amazon.aps.iva.u1.i.a(r0, r9)
            goto L23
        L3d:
            if (r9 == 0) goto L23
            int r4 = r9.d
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La8
            r4 = r1
        L46:
            if (r9 == 0) goto L23
            boolean r5 = r9 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r5 == 0) goto L62
            androidx.compose.ui.focus.FocusTargetNode r9 = (androidx.compose.ui.focus.FocusTargetNode) r9
            com.amazon.aps.iva.d1.x r5 = r9.q
            int[] r6 = com.amazon.aps.iva.d1.a0.a.b
            int r5 = r5.ordinal()
            r5 = r6[r5]
            if (r5 == r3) goto L61
            r6 = 2
            if (r5 == r6) goto L61
            r6 = 3
            if (r5 == r6) goto L61
            goto La3
        L61:
            return r9
        L62:
            int r5 = r9.d
            r5 = r5 & 1024(0x400, float:1.435E-42)
            r6 = 0
            if (r5 == 0) goto L6b
            r5 = r3
            goto L6c
        L6b:
            r5 = r6
        L6c:
            if (r5 == 0) goto La3
            boolean r5 = r9 instanceof com.amazon.aps.iva.u1.j
            if (r5 == 0) goto La3
            r5 = r9
            com.amazon.aps.iva.u1.j r5 = (com.amazon.aps.iva.u1.j) r5
            com.amazon.aps.iva.a1.f$c r5 = r5.p
            r7 = r6
        L78:
            if (r5 == 0) goto La0
            int r8 = r5.d
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L82
            r8 = r3
            goto L83
        L82:
            r8 = r6
        L83:
            if (r8 == 0) goto L9d
            int r7 = r7 + 1
            if (r7 != r3) goto L8b
            r9 = r5
            goto L9d
        L8b:
            if (r4 != 0) goto L94
            com.amazon.aps.iva.p0.f r4 = new com.amazon.aps.iva.p0.f
            com.amazon.aps.iva.a1.f$c[] r8 = new com.amazon.aps.iva.a1.f.c[r2]
            r4.<init>(r8)
        L94:
            if (r9 == 0) goto L9a
            r4.b(r9)
            r9 = r1
        L9a:
            r4.b(r5)
        L9d:
            com.amazon.aps.iva.a1.f$c r5 = r5.g
            goto L78
        La0:
            if (r7 != r3) goto La3
            goto L46
        La3:
            com.amazon.aps.iva.a1.f$c r9 = com.amazon.aps.iva.u1.i.b(r4)
            goto L46
        La8:
            com.amazon.aps.iva.a1.f$c r9 = r9.g
            goto L3d
        Lab:
            return r1
        Lac:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d1.a0.c(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean d(FocusTargetNode focusTargetNode) {
        boolean z;
        boolean z2;
        androidx.compose.ui.node.e eVar;
        androidx.compose.ui.node.e eVar2;
        com.amazon.aps.iva.yb0.j.f(focusTargetNode, "<this>");
        androidx.compose.ui.node.o oVar = focusTargetNode.i;
        if (oVar != null && (eVar2 = oVar.i) != null && eVar2.G()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            androidx.compose.ui.node.o oVar2 = focusTargetNode.i;
            if (oVar2 != null && (eVar = oVar2.i) != null && eVar.F()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }
}
