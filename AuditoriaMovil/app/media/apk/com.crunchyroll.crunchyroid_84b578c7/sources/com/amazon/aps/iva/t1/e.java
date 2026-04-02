package com.amazon.aps.iva.t1;

import androidx.compose.ui.node.p;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import java.util.HashSet;
/* compiled from: ModifierLocalManager.kt */
/* loaded from: classes.dex */
public final class e {
    public final p a;
    public final com.amazon.aps.iva.p0.f<androidx.compose.ui.node.a> b;
    public final com.amazon.aps.iva.p0.f<c<?>> c;
    public final com.amazon.aps.iva.p0.f<androidx.compose.ui.node.e> d;
    public final com.amazon.aps.iva.p0.f<c<?>> e;
    public boolean f;

    /* compiled from: ModifierLocalManager.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
        public a() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[LOOP:2: B:19:0x005d->B:21:0x0063, LOOP_END] */
        @Override // com.amazon.aps.iva.xb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.kb0.q invoke() {
            /*
                r11 = this;
                com.amazon.aps.iva.t1.e r0 = com.amazon.aps.iva.t1.e.this
                r1 = 0
                r0.f = r1
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                com.amazon.aps.iva.p0.f<androidx.compose.ui.node.e> r3 = r0.d
                int r4 = r3.d
                com.amazon.aps.iva.p0.f<com.amazon.aps.iva.t1.c<?>> r5 = r0.e
                if (r4 <= 0) goto L2e
                T[] r6 = r3.b
                r7 = r1
            L15:
                r8 = r6[r7]
                androidx.compose.ui.node.e r8 = (androidx.compose.ui.node.e) r8
                T[] r9 = r5.b
                r9 = r9[r7]
                com.amazon.aps.iva.t1.c r9 = (com.amazon.aps.iva.t1.c) r9
                androidx.compose.ui.node.m r8 = r8.z
                com.amazon.aps.iva.a1.f$c r8 = r8.e
                boolean r10 = r8.n
                if (r10 == 0) goto L2a
                com.amazon.aps.iva.t1.e.b(r8, r9, r2)
            L2a:
                int r7 = r7 + 1
                if (r7 < r4) goto L15
            L2e:
                r3.f()
                r5.f()
                com.amazon.aps.iva.p0.f<androidx.compose.ui.node.a> r3 = r0.b
                int r4 = r3.d
                com.amazon.aps.iva.p0.f<com.amazon.aps.iva.t1.c<?>> r0 = r0.c
                if (r4 <= 0) goto L53
                T[] r5 = r3.b
            L3e:
                r6 = r5[r1]
                androidx.compose.ui.node.a r6 = (androidx.compose.ui.node.a) r6
                T[] r7 = r0.b
                r7 = r7[r1]
                com.amazon.aps.iva.t1.c r7 = (com.amazon.aps.iva.t1.c) r7
                boolean r8 = r6.n
                if (r8 == 0) goto L4f
                com.amazon.aps.iva.t1.e.b(r6, r7, r2)
            L4f:
                int r1 = r1 + 1
                if (r1 < r4) goto L3e
            L53:
                r3.f()
                r0.f()
                java.util.Iterator r0 = r2.iterator()
            L5d:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6d
                java.lang.Object r1 = r0.next()
                androidx.compose.ui.node.a r1 = (androidx.compose.ui.node.a) r1
                r1.v1()
                goto L5d
            L6d:
                com.amazon.aps.iva.kb0.q r0 = com.amazon.aps.iva.kb0.q.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.t1.e.a.invoke():java.lang.Object");
        }
    }

    public e(p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "owner");
        this.a = pVar;
        this.b = new com.amazon.aps.iva.p0.f<>(new androidx.compose.ui.node.a[16]);
        this.c = new com.amazon.aps.iva.p0.f<>(new c[16]);
        this.d = new com.amazon.aps.iva.p0.f<>(new androidx.compose.ui.node.e[16]);
        this.e = new com.amazon.aps.iva.p0.f<>(new c[16]);
    }

    public static void b(f.c cVar, c cVar2, HashSet hashSet) {
        boolean z;
        boolean z2;
        boolean z3;
        f.c cVar3 = cVar.b;
        if (cVar3.n) {
            com.amazon.aps.iva.p0.f fVar = new com.amazon.aps.iva.p0.f(new f.c[16]);
            f.c cVar4 = cVar3.g;
            if (cVar4 == null) {
                com.amazon.aps.iva.u1.i.a(fVar, cVar3);
            } else {
                fVar.b(cVar4);
            }
            while (fVar.j()) {
                f.c cVar5 = (f.c) fVar.l(fVar.d - 1);
                if ((cVar5.e & 32) != 0) {
                    for (f.c cVar6 = cVar5; cVar6 != null; cVar6 = cVar6.g) {
                        if ((cVar6.d & 32) != 0) {
                            f.c cVar7 = cVar6;
                            com.amazon.aps.iva.p0.f fVar2 = null;
                            while (true) {
                                if (cVar7 != null) {
                                    z = false;
                                    if (cVar7 instanceof f) {
                                        f fVar3 = (f) cVar7;
                                        if (fVar3 instanceof androidx.compose.ui.node.a) {
                                            androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) fVar3;
                                            if ((aVar.o instanceof d) && aVar.r.contains(cVar2)) {
                                                hashSet.add(fVar3);
                                            }
                                        }
                                        if (!(!fVar3.P().d(cVar2))) {
                                            break;
                                        }
                                    } else {
                                        if ((cVar7.d & 32) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2 && (cVar7 instanceof com.amazon.aps.iva.u1.j)) {
                                            int i = 0;
                                            for (f.c cVar8 = ((com.amazon.aps.iva.u1.j) cVar7).p; cVar8 != null; cVar8 = cVar8.g) {
                                                if ((cVar8.d & 32) != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (z3) {
                                                    i++;
                                                    if (i == 1) {
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
                                            if (i == 1) {
                                            }
                                        }
                                    }
                                    cVar7 = com.amazon.aps.iva.u1.i.b(fVar2);
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                            }
                        }
                    }
                }
                com.amazon.aps.iva.u1.i.a(fVar, cVar5);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }

    public final void a() {
        if (!this.f) {
            this.f = true;
            this.a.h(new a());
        }
    }
}
