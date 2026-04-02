package com.amazon.aps.iva.d1;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.d1.m;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2;
/* compiled from: FocusOwnerImpl.kt */
/* loaded from: classes.dex */
public final class m implements l {
    public final i b;
    public com.amazon.aps.iva.o2.l d;
    public final FocusTargetNode a = new FocusTargetNode();
    public final FocusOwnerImpl$modifier$1 c = new f0<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return false;
        }

        @Override // com.amazon.aps.iva.u1.f0
        public final int hashCode() {
            return m.this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.u1.f0
        public final FocusTargetNode l() {
            return m.this.a;
        }

        @Override // com.amazon.aps.iva.u1.f0
        public final void p(FocusTargetNode focusTargetNode) {
            j.f(focusTargetNode, "node");
        }
    };

    /* compiled from: FocusOwnerImpl.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.amazon.aps.iva.d1.b.values().length];
            try {
                iArr[com.amazon.aps.iva.d1.b.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.d1.b.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.d1.b.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.amazon.aps.iva.d1.b.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[x.values().length];
            try {
                iArr2[x.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[x.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[x.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[x.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    /* compiled from: FocusOwnerImpl.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<FocusTargetNode, Boolean> {
        public final /* synthetic */ FocusTargetNode h;
        public final /* synthetic */ int i;
        public final /* synthetic */ com.amazon.aps.iva.yb0.z j;

        /* compiled from: FocusOwnerImpl.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[com.amazon.aps.iva.d1.b.values().length];
                try {
                    iArr[com.amazon.aps.iva.d1.b.Redirected.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.amazon.aps.iva.d1.b.Cancelled.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.amazon.aps.iva.d1.b.RedirectCancelled.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.amazon.aps.iva.d1.b.None.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FocusTargetNode focusTargetNode, int i, com.amazon.aps.iva.yb0.z zVar) {
            super(1);
            this.h = focusTargetNode;
            this.i = i;
            this.j = zVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean z;
            f.c cVar;
            androidx.compose.ui.node.m mVar;
            boolean z2;
            boolean z3;
            FocusTargetNode focusTargetNode2 = focusTargetNode;
            com.amazon.aps.iva.yb0.j.f(focusTargetNode2, FirebaseAnalytics.Param.DESTINATION);
            if (com.amazon.aps.iva.yb0.j.a(focusTargetNode2, this.h)) {
                return Boolean.FALSE;
            }
            f.c cVar2 = focusTargetNode2.b;
            if (cVar2.n) {
                f.c cVar3 = cVar2.f;
                androidx.compose.ui.node.e e = com.amazon.aps.iva.u1.i.e(focusTargetNode2);
                loop0: while (true) {
                    z = true;
                    cVar = null;
                    if (e == null) {
                        break;
                    }
                    if ((e.z.e.e & 1024) != 0) {
                        while (cVar3 != null) {
                            if ((cVar3.d & 1024) != 0) {
                                f.c cVar4 = cVar3;
                                com.amazon.aps.iva.p0.f fVar = null;
                                while (cVar4 != null) {
                                    if (cVar4 instanceof FocusTargetNode) {
                                        cVar = cVar4;
                                        break loop0;
                                    }
                                    if ((cVar4.d & 1024) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2 && (cVar4 instanceof com.amazon.aps.iva.u1.j)) {
                                        int i = 0;
                                        for (f.c cVar5 = ((com.amazon.aps.iva.u1.j) cVar4).p; cVar5 != null; cVar5 = cVar5.g) {
                                            if ((cVar5.d & 1024) != 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                i++;
                                                if (i == 1) {
                                                    cVar4 = cVar5;
                                                } else {
                                                    if (fVar == null) {
                                                        fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                    }
                                                    if (cVar4 != null) {
                                                        fVar.b(cVar4);
                                                        cVar4 = null;
                                                    }
                                                    fVar.b(cVar5);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    cVar4 = com.amazon.aps.iva.u1.i.b(fVar);
                                }
                                continue;
                            }
                            cVar3 = cVar3.f;
                        }
                    }
                    e = e.v();
                    if (e != null && (mVar = e.z) != null) {
                        cVar3 = mVar.d;
                    } else {
                        cVar3 = null;
                    }
                }
                if (cVar != null) {
                    int i2 = a.a[y.f(focusTargetNode2, this.i).ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2 && i2 != 3) {
                            if (i2 == 4) {
                                z = y.g(focusTargetNode2);
                            } else {
                                throw new com.amazon.aps.iva.kb0.h();
                            }
                        } else {
                            this.j.b = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                throw new IllegalStateException("Focus search landed at the root.".toString());
            }
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public m(AndroidComposeView.e eVar) {
        this.b = new i(eVar);
    }

    @Override // com.amazon.aps.iva.d1.l
    public final FocusOwnerImpl$modifier$1 a() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.d1.l
    public final void b() {
        FocusTargetNode focusTargetNode = this.a;
        if (focusTargetNode.q == x.Inactive) {
            focusTargetNode.w1(x.Active);
        }
    }

    @Override // com.amazon.aps.iva.d1.l
    public final void c(p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "node");
        i iVar = this.b;
        iVar.getClass();
        iVar.a(iVar.d, pVar);
    }

    @Override // com.amazon.aps.iva.d1.l
    public final void d(boolean z, boolean z2) {
        x xVar;
        FocusTargetNode focusTargetNode = this.a;
        if (!z) {
            int i = a.a[y.d(focusTargetNode, 8).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return;
            }
        }
        x xVar2 = focusTargetNode.q;
        if (y.a(focusTargetNode, z, z2)) {
            int i2 = a.b[xVar2.ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    xVar = x.Inactive;
                } else {
                    throw new com.amazon.aps.iva.kb0.h();
                }
            } else {
                xVar = x.Active;
            }
            focusTargetNode.w1(xVar);
        }
    }

    @Override // com.amazon.aps.iva.d1.l
    public final void e(f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "node");
        i iVar = this.b;
        iVar.getClass();
        iVar.a(iVar.c, fVar);
    }

    @Override // com.amazon.aps.iva.d1.l
    public final void f(com.amazon.aps.iva.o2.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "<set-?>");
        this.d = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x026d, code lost:
        if (r1 != false) goto L58;
     */
    @Override // com.amazon.aps.iva.d1.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r17) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d1.m.g(int):boolean");
    }

    @Override // com.amazon.aps.iva.d1.l
    public final boolean h(com.amazon.aps.iva.r1.c cVar) {
        com.amazon.aps.iva.r1.a aVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        androidx.compose.ui.node.m mVar;
        boolean z5;
        boolean z6;
        f.c cVar2;
        androidx.compose.ui.node.m mVar2;
        boolean z7;
        boolean z8;
        FocusTargetNode a2 = a0.a(this.a);
        if (a2 != null) {
            f.c cVar3 = a2.b;
            if (cVar3.n) {
                f.c cVar4 = cVar3.f;
                androidx.compose.ui.node.e e = com.amazon.aps.iva.u1.i.e(a2);
                loop0: while (true) {
                    if (e != null) {
                        if ((e.z.e.e & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            while (cVar4 != null) {
                                if ((cVar4.d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                    com.amazon.aps.iva.p0.f fVar = null;
                                    cVar2 = cVar4;
                                    while (cVar2 != null) {
                                        if (cVar2 instanceof com.amazon.aps.iva.r1.a) {
                                            break loop0;
                                        }
                                        if ((cVar2.d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (z7 && (cVar2 instanceof com.amazon.aps.iva.u1.j)) {
                                            int i2 = 0;
                                            for (f.c cVar5 = ((com.amazon.aps.iva.u1.j) cVar2).p; cVar5 != null; cVar5 = cVar5.g) {
                                                if ((cVar5.d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                if (z8) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        cVar2 = cVar5;
                                                    } else {
                                                        if (fVar == null) {
                                                            fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                        }
                                                        if (cVar2 != null) {
                                                            fVar.b(cVar2);
                                                            cVar2 = null;
                                                        }
                                                        fVar.b(cVar5);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        cVar2 = com.amazon.aps.iva.u1.i.b(fVar);
                                    }
                                    continue;
                                }
                                cVar4 = cVar4.f;
                            }
                        }
                        e = e.v();
                        if (e != null && (mVar2 = e.z) != null) {
                            cVar4 = mVar2.d;
                        } else {
                            cVar4 = null;
                        }
                    } else {
                        cVar2 = null;
                        break;
                    }
                }
                aVar = (com.amazon.aps.iva.r1.a) cVar2;
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            if (aVar.V().n) {
                f.c cVar6 = aVar.V().f;
                androidx.compose.ui.node.e e2 = com.amazon.aps.iva.u1.i.e(aVar);
                ArrayList arrayList = null;
                while (e2 != null) {
                    if ((e2.z.e.e & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                        while (cVar6 != null) {
                            if ((cVar6.d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                f.c cVar7 = cVar6;
                                com.amazon.aps.iva.p0.f fVar2 = null;
                                while (cVar7 != null) {
                                    if (cVar7 instanceof com.amazon.aps.iva.r1.a) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(cVar7);
                                    } else {
                                        if ((cVar7.d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5 && (cVar7 instanceof com.amazon.aps.iva.u1.j)) {
                                            int i3 = 0;
                                            for (f.c cVar8 = ((com.amazon.aps.iva.u1.j) cVar7).p; cVar8 != null; cVar8 = cVar8.g) {
                                                if ((cVar8.d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                if (z6) {
                                                    i3++;
                                                    if (i3 == 1) {
                                                        cVar7 = cVar8;
                                                    } else {
                                                        if (fVar2 == null) {
                                                            fVar2 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                        }
                                                        if (cVar7 != null) {
                                                            fVar2.b(cVar7);
                                                            cVar7 = null;
                                                        }
                                                        fVar2.b(cVar8);
                                                    }
                                                }
                                            }
                                            if (i3 == 1) {
                                            }
                                        }
                                    }
                                    cVar7 = com.amazon.aps.iva.u1.i.b(fVar2);
                                }
                            }
                            cVar6 = cVar6.f;
                        }
                    }
                    e2 = e2.v();
                    if (e2 != null && (mVar = e2.z) != null) {
                        cVar6 = mVar.d;
                    } else {
                        cVar6 = null;
                    }
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i4 = i - 1;
                        if (((com.amazon.aps.iva.r1.a) arrayList.get(i)).g1(cVar)) {
                            return true;
                        }
                        if (i4 < 0) {
                            break;
                        }
                        i = i4;
                    }
                }
                f.c V = aVar.V();
                com.amazon.aps.iva.p0.f fVar3 = null;
                while (V != null) {
                    if (V instanceof com.amazon.aps.iva.r1.a) {
                        if (((com.amazon.aps.iva.r1.a) V).g1(cVar)) {
                            return true;
                        }
                    } else {
                        if ((V.d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3 && (V instanceof com.amazon.aps.iva.u1.j)) {
                            int i5 = 0;
                            for (f.c cVar9 = ((com.amazon.aps.iva.u1.j) V).p; cVar9 != null; cVar9 = cVar9.g) {
                                if ((cVar9.d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    i5++;
                                    if (i5 == 1) {
                                        V = cVar9;
                                    } else {
                                        if (fVar3 == null) {
                                            fVar3 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                        }
                                        if (V != null) {
                                            fVar3.b(V);
                                            V = null;
                                        }
                                        fVar3.b(cVar9);
                                    }
                                }
                            }
                            if (i5 == 1) {
                            }
                        }
                    }
                    V = com.amazon.aps.iva.u1.i.b(fVar3);
                }
                f.c V2 = aVar.V();
                com.amazon.aps.iva.p0.f fVar4 = null;
                while (V2 != null) {
                    if (V2 instanceof com.amazon.aps.iva.r1.a) {
                        if (((com.amazon.aps.iva.r1.a) V2).Q0(cVar)) {
                            return true;
                        }
                    } else {
                        if ((V2.d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && (V2 instanceof com.amazon.aps.iva.u1.j)) {
                            int i6 = 0;
                            for (f.c cVar10 = ((com.amazon.aps.iva.u1.j) V2).p; cVar10 != null; cVar10 = cVar10.g) {
                                if ((cVar10.d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    i6++;
                                    if (i6 == 1) {
                                        V2 = cVar10;
                                    } else {
                                        if (fVar4 == null) {
                                            fVar4 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                        }
                                        if (V2 != null) {
                                            fVar4.b(V2);
                                            V2 = null;
                                        }
                                        fVar4.b(cVar10);
                                    }
                                }
                            }
                            if (i6 == 1) {
                            }
                        }
                    }
                    V2 = com.amazon.aps.iva.u1.i.b(fVar4);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (((com.amazon.aps.iva.r1.a) arrayList.get(i7)).Q0(cVar)) {
                            return true;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.d1.l
    public final boolean i(KeyEvent keyEvent) {
        com.amazon.aps.iva.n1.f fVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        androidx.compose.ui.node.m mVar;
        boolean z5;
        boolean z6;
        f.c cVar;
        androidx.compose.ui.node.m mVar2;
        boolean z7;
        boolean z8;
        com.amazon.aps.iva.yb0.j.f(keyEvent, "keyEvent");
        FocusTargetNode a2 = a0.a(this.a);
        if (a2 != null) {
            f.c cVar2 = a2.b;
            if (cVar2.n) {
                f.c cVar3 = cVar2.f;
                androidx.compose.ui.node.e e = com.amazon.aps.iva.u1.i.e(a2);
                loop0: while (true) {
                    if (e != null) {
                        if ((e.z.e.e & 131072) != 0) {
                            while (cVar3 != null) {
                                if ((cVar3.d & 131072) != 0) {
                                    com.amazon.aps.iva.p0.f fVar2 = null;
                                    cVar = cVar3;
                                    while (cVar != null) {
                                        if (cVar instanceof com.amazon.aps.iva.n1.f) {
                                            break loop0;
                                        }
                                        if ((cVar.d & 131072) != 0) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (z7 && (cVar instanceof com.amazon.aps.iva.u1.j)) {
                                            int i2 = 0;
                                            for (f.c cVar4 = ((com.amazon.aps.iva.u1.j) cVar).p; cVar4 != null; cVar4 = cVar4.g) {
                                                if ((cVar4.d & 131072) != 0) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                if (z8) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        cVar = cVar4;
                                                    } else {
                                                        if (fVar2 == null) {
                                                            fVar2 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                        }
                                                        if (cVar != null) {
                                                            fVar2.b(cVar);
                                                            cVar = null;
                                                        }
                                                        fVar2.b(cVar4);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        cVar = com.amazon.aps.iva.u1.i.b(fVar2);
                                    }
                                    continue;
                                }
                                cVar3 = cVar3.f;
                            }
                        }
                        e = e.v();
                        if (e != null && (mVar2 = e.z) != null) {
                            cVar3 = mVar2.d;
                        } else {
                            cVar3 = null;
                        }
                    } else {
                        cVar = null;
                        break;
                    }
                }
                fVar = (com.amazon.aps.iva.n1.f) cVar;
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        } else {
            fVar = null;
        }
        if (fVar != null) {
            if (fVar.V().n) {
                f.c cVar5 = fVar.V().f;
                androidx.compose.ui.node.e e2 = com.amazon.aps.iva.u1.i.e(fVar);
                ArrayList arrayList = null;
                while (e2 != null) {
                    if ((e2.z.e.e & 131072) != 0) {
                        while (cVar5 != null) {
                            if ((cVar5.d & 131072) != 0) {
                                f.c cVar6 = cVar5;
                                com.amazon.aps.iva.p0.f fVar3 = null;
                                while (cVar6 != null) {
                                    if (cVar6 instanceof com.amazon.aps.iva.n1.f) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(cVar6);
                                    } else {
                                        if ((cVar6.d & 131072) != 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5 && (cVar6 instanceof com.amazon.aps.iva.u1.j)) {
                                            int i3 = 0;
                                            for (f.c cVar7 = ((com.amazon.aps.iva.u1.j) cVar6).p; cVar7 != null; cVar7 = cVar7.g) {
                                                if ((cVar7.d & 131072) != 0) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                if (z6) {
                                                    i3++;
                                                    if (i3 == 1) {
                                                        cVar6 = cVar7;
                                                    } else {
                                                        if (fVar3 == null) {
                                                            fVar3 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                        }
                                                        if (cVar6 != null) {
                                                            fVar3.b(cVar6);
                                                            cVar6 = null;
                                                        }
                                                        fVar3.b(cVar7);
                                                    }
                                                }
                                            }
                                            if (i3 == 1) {
                                            }
                                        }
                                    }
                                    cVar6 = com.amazon.aps.iva.u1.i.b(fVar3);
                                }
                            }
                            cVar5 = cVar5.f;
                        }
                    }
                    e2 = e2.v();
                    if (e2 != null && (mVar = e2.z) != null) {
                        cVar5 = mVar.d;
                    } else {
                        cVar5 = null;
                    }
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i4 = i - 1;
                        if (((com.amazon.aps.iva.n1.f) arrayList.get(i)).C()) {
                            return true;
                        }
                        if (i4 < 0) {
                            break;
                        }
                        i = i4;
                    }
                }
                f.c V = fVar.V();
                com.amazon.aps.iva.p0.f fVar4 = null;
                while (V != null) {
                    if (V instanceof com.amazon.aps.iva.n1.f) {
                        if (((com.amazon.aps.iva.n1.f) V).C()) {
                            return true;
                        }
                    } else {
                        if ((V.d & 131072) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3 && (V instanceof com.amazon.aps.iva.u1.j)) {
                            int i5 = 0;
                            for (f.c cVar8 = ((com.amazon.aps.iva.u1.j) V).p; cVar8 != null; cVar8 = cVar8.g) {
                                if ((cVar8.d & 131072) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    i5++;
                                    if (i5 == 1) {
                                        V = cVar8;
                                    } else {
                                        if (fVar4 == null) {
                                            fVar4 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                        }
                                        if (V != null) {
                                            fVar4.b(V);
                                            V = null;
                                        }
                                        fVar4.b(cVar8);
                                    }
                                }
                            }
                            if (i5 == 1) {
                            }
                        }
                    }
                    V = com.amazon.aps.iva.u1.i.b(fVar4);
                }
                f.c V2 = fVar.V();
                com.amazon.aps.iva.p0.f fVar5 = null;
                while (V2 != null) {
                    if (V2 instanceof com.amazon.aps.iva.n1.f) {
                        if (((com.amazon.aps.iva.n1.f) V2).Y0()) {
                            return true;
                        }
                    } else {
                        if ((V2.d & 131072) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && (V2 instanceof com.amazon.aps.iva.u1.j)) {
                            int i6 = 0;
                            for (f.c cVar9 = ((com.amazon.aps.iva.u1.j) V2).p; cVar9 != null; cVar9 = cVar9.g) {
                                if ((cVar9.d & 131072) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    i6++;
                                    if (i6 == 1) {
                                        V2 = cVar9;
                                    } else {
                                        if (fVar5 == null) {
                                            fVar5 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                        }
                                        if (V2 != null) {
                                            fVar5.b(V2);
                                            V2 = null;
                                        }
                                        fVar5.b(cVar9);
                                    }
                                }
                            }
                            if (i6 == 1) {
                            }
                        }
                    }
                    V2 = com.amazon.aps.iva.u1.i.b(fVar5);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (((com.amazon.aps.iva.n1.f) arrayList.get(i7)).Y0()) {
                            return true;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.d1.l
    public final void j(FocusTargetNode focusTargetNode) {
        com.amazon.aps.iva.yb0.j.f(focusTargetNode, "node");
        i iVar = this.b;
        iVar.getClass();
        iVar.a(iVar.b, focusTargetNode);
    }

    @Override // com.amazon.aps.iva.d1.l
    public final com.amazon.aps.iva.e1.e k() {
        FocusTargetNode a2 = a0.a(this.a);
        if (a2 != null) {
            return a0.b(a2);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.d1.l
    public final void l() {
        y.a(this.a, true, true);
    }

    @Override // com.amazon.aps.iva.d1.j
    public final void m(boolean z) {
        d(z, true);
    }

    @Override // com.amazon.aps.iva.d1.l
    public final boolean n(KeyEvent keyEvent) {
        f.c cVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        androidx.compose.ui.node.m mVar;
        boolean z5;
        boolean z6;
        f.c cVar2;
        androidx.compose.ui.node.m mVar2;
        boolean z7;
        boolean z8;
        boolean z9;
        com.amazon.aps.iva.yb0.j.f(keyEvent, "keyEvent");
        FocusTargetNode a2 = a0.a(this.a);
        if (a2 != null) {
            f.c cVar3 = a2.b;
            if (cVar3.n) {
                if ((cVar3.e & 9216) != 0) {
                    cVar = null;
                    for (f.c cVar4 = cVar3.g; cVar4 != null; cVar4 = cVar4.g) {
                        int i2 = cVar4.d;
                        if ((i2 & 9216) != 0) {
                            if ((i2 & 1024) != 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                break;
                            }
                            cVar = cVar4;
                        }
                    }
                } else {
                    cVar = null;
                }
                if (cVar == null) {
                    f.c cVar5 = a2.b;
                    if (cVar5.n) {
                        f.c cVar6 = cVar5.f;
                        androidx.compose.ui.node.e e = com.amazon.aps.iva.u1.i.e(a2);
                        loop1: while (true) {
                            if (e != null) {
                                if ((e.z.e.e & 8192) != 0) {
                                    while (cVar6 != null) {
                                        if ((cVar6.d & 8192) != 0) {
                                            cVar2 = cVar6;
                                            com.amazon.aps.iva.p0.f fVar = null;
                                            while (cVar2 != null) {
                                                if (cVar2 instanceof com.amazon.aps.iva.n1.d) {
                                                    break loop1;
                                                }
                                                if ((cVar2.d & 8192) != 0) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                if (z7 && (cVar2 instanceof com.amazon.aps.iva.u1.j)) {
                                                    int i3 = 0;
                                                    for (f.c cVar7 = ((com.amazon.aps.iva.u1.j) cVar2).p; cVar7 != null; cVar7 = cVar7.g) {
                                                        if ((cVar7.d & 8192) != 0) {
                                                            z8 = true;
                                                        } else {
                                                            z8 = false;
                                                        }
                                                        if (z8) {
                                                            i3++;
                                                            if (i3 == 1) {
                                                                cVar2 = cVar7;
                                                            } else {
                                                                if (fVar == null) {
                                                                    fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                                }
                                                                if (cVar2 != null) {
                                                                    fVar.b(cVar2);
                                                                    cVar2 = null;
                                                                }
                                                                fVar.b(cVar7);
                                                            }
                                                        }
                                                    }
                                                    if (i3 == 1) {
                                                    }
                                                }
                                                cVar2 = com.amazon.aps.iva.u1.i.b(fVar);
                                            }
                                            continue;
                                        }
                                        cVar6 = cVar6.f;
                                    }
                                }
                                e = e.v();
                                if (e != null && (mVar2 = e.z) != null) {
                                    cVar6 = mVar2.d;
                                } else {
                                    cVar6 = null;
                                }
                            } else {
                                cVar2 = null;
                                break;
                            }
                        }
                        com.amazon.aps.iva.n1.d dVar = (com.amazon.aps.iva.n1.d) cVar2;
                        if (dVar != null) {
                            cVar = dVar.V();
                        } else {
                            cVar = null;
                        }
                    } else {
                        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                    }
                }
                if (cVar != null) {
                    f.c cVar8 = cVar.b;
                    if (cVar8.n) {
                        f.c cVar9 = cVar8.f;
                        androidx.compose.ui.node.e e2 = com.amazon.aps.iva.u1.i.e(cVar);
                        ArrayList arrayList = null;
                        while (e2 != null) {
                            if ((e2.z.e.e & 8192) != 0) {
                                while (cVar9 != null) {
                                    if ((cVar9.d & 8192) != 0) {
                                        f.c cVar10 = cVar9;
                                        com.amazon.aps.iva.p0.f fVar2 = null;
                                        while (cVar10 != null) {
                                            if (cVar10 instanceof com.amazon.aps.iva.n1.d) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(cVar10);
                                            } else {
                                                if ((cVar10.d & 8192) != 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z5 && (cVar10 instanceof com.amazon.aps.iva.u1.j)) {
                                                    int i4 = 0;
                                                    for (f.c cVar11 = ((com.amazon.aps.iva.u1.j) cVar10).p; cVar11 != null; cVar11 = cVar11.g) {
                                                        if ((cVar11.d & 8192) != 0) {
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                        if (z6) {
                                                            i4++;
                                                            if (i4 == 1) {
                                                                cVar10 = cVar11;
                                                            } else {
                                                                if (fVar2 == null) {
                                                                    fVar2 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                                }
                                                                if (cVar10 != null) {
                                                                    fVar2.b(cVar10);
                                                                    cVar10 = null;
                                                                }
                                                                fVar2.b(cVar11);
                                                            }
                                                        }
                                                    }
                                                    if (i4 == 1) {
                                                    }
                                                }
                                            }
                                            cVar10 = com.amazon.aps.iva.u1.i.b(fVar2);
                                        }
                                    }
                                    cVar9 = cVar9.f;
                                }
                            }
                            e2 = e2.v();
                            if (e2 != null && (mVar = e2.z) != null) {
                                cVar9 = mVar.d;
                            } else {
                                cVar9 = null;
                            }
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i5 = i - 1;
                                if (((com.amazon.aps.iva.n1.d) arrayList.get(i)).s0(keyEvent)) {
                                    return true;
                                }
                                if (i5 < 0) {
                                    break;
                                }
                                i = i5;
                            }
                        }
                        f.c cVar12 = cVar.b;
                        com.amazon.aps.iva.p0.f fVar3 = null;
                        while (cVar12 != null) {
                            if (cVar12 instanceof com.amazon.aps.iva.n1.d) {
                                if (((com.amazon.aps.iva.n1.d) cVar12).s0(keyEvent)) {
                                    return true;
                                }
                            } else {
                                if ((cVar12.d & 8192) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3 && (cVar12 instanceof com.amazon.aps.iva.u1.j)) {
                                    int i6 = 0;
                                    for (f.c cVar13 = ((com.amazon.aps.iva.u1.j) cVar12).p; cVar13 != null; cVar13 = cVar13.g) {
                                        if ((cVar13.d & 8192) != 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            i6++;
                                            if (i6 == 1) {
                                                cVar12 = cVar13;
                                            } else {
                                                if (fVar3 == null) {
                                                    fVar3 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                }
                                                if (cVar12 != null) {
                                                    fVar3.b(cVar12);
                                                    cVar12 = null;
                                                }
                                                fVar3.b(cVar13);
                                            }
                                        }
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                            }
                            cVar12 = com.amazon.aps.iva.u1.i.b(fVar3);
                        }
                        f.c cVar14 = cVar.b;
                        com.amazon.aps.iva.p0.f fVar4 = null;
                        while (cVar14 != null) {
                            if (cVar14 instanceof com.amazon.aps.iva.n1.d) {
                                if (((com.amazon.aps.iva.n1.d) cVar14).D0(keyEvent)) {
                                    return true;
                                }
                            } else {
                                if ((cVar14.d & 8192) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z && (cVar14 instanceof com.amazon.aps.iva.u1.j)) {
                                    int i7 = 0;
                                    for (f.c cVar15 = ((com.amazon.aps.iva.u1.j) cVar14).p; cVar15 != null; cVar15 = cVar15.g) {
                                        if ((cVar15.d & 8192) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            i7++;
                                            if (i7 == 1) {
                                                cVar14 = cVar15;
                                            } else {
                                                if (fVar4 == null) {
                                                    fVar4 = new com.amazon.aps.iva.p0.f(new f.c[16]);
                                                }
                                                if (cVar14 != null) {
                                                    fVar4.b(cVar14);
                                                    cVar14 = null;
                                                }
                                                fVar4.b(cVar15);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                            }
                            cVar14 = com.amazon.aps.iva.u1.i.b(fVar4);
                        }
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                if (((com.amazon.aps.iva.n1.d) arrayList.get(i8)).D0(keyEvent)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                    }
                }
                return false;
            }
            throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
        }
        throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
    }
}
