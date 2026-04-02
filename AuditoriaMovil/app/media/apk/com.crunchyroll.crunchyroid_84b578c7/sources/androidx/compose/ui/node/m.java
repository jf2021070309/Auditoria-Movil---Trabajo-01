package androidx.compose.ui.node;

import androidx.compose.ui.node.n;
import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.u1.f0;
import com.amazon.aps.iva.u1.k0;
import com.amazon.aps.iva.u1.k1;
import com.amazon.aps.iva.u1.u0;
import com.amazon.aps.iva.u1.x;
/* compiled from: NodeChain.kt */
/* loaded from: classes.dex */
public final class m {
    public final e a;
    public final c b;
    public o c;
    public final k1 d;
    public f.c e;
    public com.amazon.aps.iva.p0.f<f.b> f;
    public com.amazon.aps.iva.p0.f<f.b> g;
    public a h;

    /* compiled from: NodeChain.kt */
    /* loaded from: classes.dex */
    public final class a {
        public f.c a;
        public int b;
        public com.amazon.aps.iva.p0.f<f.b> c;
        public com.amazon.aps.iva.p0.f<f.b> d;
        public boolean e;

        public a(f.c cVar, int i, com.amazon.aps.iva.p0.f<f.b> fVar, com.amazon.aps.iva.p0.f<f.b> fVar2, boolean z) {
            this.a = cVar;
            this.b = i;
            this.c = fVar;
            this.d = fVar2;
            this.e = z;
        }

        public final boolean a(int i, int i2) {
            com.amazon.aps.iva.p0.f<f.b> fVar = this.c;
            int i3 = this.b;
            if (n.a(fVar.b[i + i3], this.d.b[i3 + i2]) != 0) {
                return true;
            }
            return false;
        }

        public final void b(int i) {
            int i2 = this.b + i;
            f.c cVar = this.a;
            m mVar = m.this;
            mVar.getClass();
            f.c b = m.b(this.d.b[i2], cVar);
            this.a = b;
            if (this.e) {
                f.c cVar2 = b.g;
                com.amazon.aps.iva.yb0.j.c(cVar2);
                o oVar = cVar2.i;
                com.amazon.aps.iva.yb0.j.c(oVar);
                x c = com.amazon.aps.iva.u1.i.c(this.a);
                if (c != null) {
                    d dVar = new d(mVar.a, c);
                    this.a.s1(dVar);
                    m.a(mVar, this.a, dVar);
                    dVar.k = oVar.k;
                    dVar.j = oVar;
                    oVar.k = dVar;
                } else {
                    this.a.s1(oVar);
                }
                this.a.k1();
                this.a.q1();
                k0.a(this.a);
                return;
            }
            b.j = true;
        }

        public final void c() {
            boolean z;
            f.c cVar = this.a.g;
            com.amazon.aps.iva.yb0.j.c(cVar);
            m mVar = m.this;
            mVar.getClass();
            if ((cVar.d & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                o oVar = cVar.i;
                com.amazon.aps.iva.yb0.j.c(oVar);
                o oVar2 = oVar.k;
                o oVar3 = oVar.j;
                com.amazon.aps.iva.yb0.j.c(oVar3);
                if (oVar2 != null) {
                    oVar2.j = oVar3;
                }
                oVar3.k = oVar2;
                m.a(mVar, this.a, oVar3);
            }
            this.a = m.c(cVar);
        }

        public final void d(int i, int i2) {
            f.c cVar = this.a.g;
            com.amazon.aps.iva.yb0.j.c(cVar);
            this.a = cVar;
            com.amazon.aps.iva.p0.f<f.b> fVar = this.c;
            int i3 = this.b;
            f.b bVar = fVar.b[i + i3];
            f.b bVar2 = this.d.b[i3 + i2];
            boolean a = com.amazon.aps.iva.yb0.j.a(bVar, bVar2);
            m mVar = m.this;
            if (!a) {
                f.c cVar2 = this.a;
                mVar.getClass();
                m.h(bVar, bVar2, cVar2);
                return;
            }
            mVar.getClass();
        }
    }

    public m(e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "layoutNode");
        this.a = eVar;
        c cVar = new c(eVar);
        this.b = cVar;
        this.c = cVar;
        k1 k1Var = cVar.G;
        this.d = k1Var;
        this.e = k1Var;
    }

    public static final void a(m mVar, f.c cVar, o oVar) {
        c cVar2;
        boolean z;
        mVar.getClass();
        for (f.c cVar3 = cVar.f; cVar3 != null; cVar3 = cVar3.f) {
            if (cVar3 == n.a) {
                e v = mVar.a.v();
                if (v != null) {
                    cVar2 = v.z.b;
                } else {
                    cVar2 = null;
                }
                oVar.k = cVar2;
                mVar.c = oVar;
                return;
            }
            if ((cVar3.d & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                cVar3.s1(oVar);
            } else {
                return;
            }
        }
    }

    public static f.c b(f.b bVar, f.c cVar) {
        f.c aVar;
        if (bVar instanceof f0) {
            aVar = ((f0) bVar).l();
            aVar.d = k0.g(aVar);
        } else {
            aVar = new androidx.compose.ui.node.a(bVar);
        }
        if (!aVar.n) {
            aVar.j = true;
            f.c cVar2 = cVar.g;
            if (cVar2 != null) {
                cVar2.f = aVar;
                aVar.g = cVar2;
            }
            cVar.g = aVar;
            aVar.f = cVar;
            return aVar;
        }
        throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ".toString());
    }

    public static f.c c(f.c cVar) {
        boolean z = cVar.n;
        if (z) {
            if (z) {
                k0.b(cVar, -1, 2);
                cVar.r1();
                cVar.l1();
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        f.c cVar2 = cVar.g;
        f.c cVar3 = cVar.f;
        if (cVar2 != null) {
            cVar2.f = cVar3;
            cVar.g = null;
        }
        if (cVar3 != null) {
            cVar3.g = cVar2;
            cVar.f = null;
        }
        com.amazon.aps.iva.yb0.j.c(cVar3);
        return cVar3;
    }

    public static void h(f.b bVar, f.b bVar2, f.c cVar) {
        if ((bVar instanceof f0) && (bVar2 instanceof f0)) {
            n.a aVar = n.a;
            com.amazon.aps.iva.yb0.j.d(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((f0) bVar2).p(cVar);
            if (cVar.n) {
                k0.d(cVar);
            } else {
                cVar.k = true;
            }
        } else if (cVar instanceof androidx.compose.ui.node.a) {
            androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) cVar;
            aVar2.getClass();
            com.amazon.aps.iva.yb0.j.f(bVar2, "value");
            if (aVar2.n) {
                aVar2.u1();
            }
            aVar2.o = bVar2;
            aVar2.d = k0.e(bVar2);
            if (aVar2.n) {
                aVar2.t1(false);
            }
            if (cVar.n) {
                k0.d(cVar);
            } else {
                cVar.k = true;
            }
        } else {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
    }

    public final boolean d(int i) {
        if ((i & this.e.e) != 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        for (f.c cVar = this.e; cVar != null; cVar = cVar.g) {
            cVar.q1();
            if (cVar.j) {
                k0.a(cVar);
            }
            if (cVar.k) {
                k0.d(cVar);
            }
            cVar.j = false;
            cVar.k = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
        if (r10[(r14 + 1) + r17] > r10[(r14 - 1) + r17]) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r31, com.amazon.aps.iva.p0.f<com.amazon.aps.iva.a1.f.b> r32, com.amazon.aps.iva.p0.f<com.amazon.aps.iva.a1.f.b> r33, com.amazon.aps.iva.a1.f.c r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.m.f(int, com.amazon.aps.iva.p0.f, com.amazon.aps.iva.p0.f, com.amazon.aps.iva.a1.f$c, boolean):void");
    }

    public final void g() {
        e eVar;
        c cVar;
        d dVar;
        f.c cVar2 = this.d.f;
        o oVar = this.b;
        f.c cVar3 = cVar2;
        while (true) {
            eVar = this.a;
            if (cVar3 == null) {
                break;
            }
            x c = com.amazon.aps.iva.u1.i.c(cVar3);
            if (c != null) {
                o oVar2 = cVar3.i;
                if (oVar2 != null) {
                    d dVar2 = (d) oVar2;
                    x xVar = dVar2.G;
                    dVar2.G = c;
                    dVar = dVar2;
                    if (xVar != cVar3) {
                        u0 u0Var = dVar2.z;
                        dVar = dVar2;
                        if (u0Var != null) {
                            u0Var.invalidate();
                            dVar = dVar2;
                        }
                    }
                } else {
                    d dVar3 = new d(eVar, c);
                    cVar3.s1(dVar3);
                    dVar = dVar3;
                }
                oVar.k = dVar;
                dVar.j = oVar;
                oVar = dVar;
            } else {
                cVar3.s1(oVar);
            }
            cVar3 = cVar3.f;
        }
        e v = eVar.v();
        if (v != null) {
            cVar = v.z.b;
        } else {
            cVar = null;
        }
        oVar.k = cVar;
        this.c = oVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        f.c cVar = this.e;
        k1 k1Var = this.d;
        if (cVar != k1Var) {
            while (true) {
                if (cVar == null || cVar == k1Var) {
                    break;
                }
                sb.append(String.valueOf(cVar));
                if (cVar.g == k1Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                cVar = cVar.g;
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
