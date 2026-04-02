package com.amazon.aps.iva.y0;

import com.amazon.aps.iva.o0.n3;
import com.amazon.aps.iva.o0.t3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class m {
    public static final a a = a.h;
    public static final n3 b = new n3(0);
    public static final Object c = new Object();
    public static k d;
    public static int e;
    public static final j f;
    public static final a0<h0> g;
    public static final ArrayList h;
    public static final ArrayList i;
    public static final AtomicReference<com.amazon.aps.iva.y0.a> j;
    public static final h k;
    public static final com.amazon.aps.iva.k.w l;

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<k, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(k kVar) {
            com.amazon.aps.iva.yb0.j.f(kVar, "it");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> h;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar2) {
            super(1);
            this.h = lVar;
            this.i = lVar2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Object obj) {
            com.amazon.aps.iva.yb0.j.f(obj, "state");
            this.h.invoke(obj);
            this.i.invoke(obj);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    static {
        k kVar = k.f;
        d = kVar;
        e = 1;
        f = new j();
        g = new a0<>();
        h = new ArrayList();
        i = new ArrayList();
        int i2 = e;
        e = i2 + 1;
        com.amazon.aps.iva.y0.a aVar = new com.amazon.aps.iva.y0.a(i2, kVar);
        d = d.j(aVar.b);
        AtomicReference<com.amazon.aps.iva.y0.a> atomicReference = new AtomicReference<>(aVar);
        j = atomicReference;
        com.amazon.aps.iva.y0.a aVar2 = atomicReference.get();
        com.amazon.aps.iva.yb0.j.e(aVar2, "currentGlobalSnapshot.get()");
        k = aVar2;
        l = new com.amazon.aps.iva.k.w();
    }

    public static final void a() {
        f(l.h);
    }

    public static final com.amazon.aps.iva.xb0.l b(com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.l lVar2) {
        if (lVar != null && lVar2 != null && !com.amazon.aps.iva.yb0.j.a(lVar, lVar2)) {
            return new n(lVar, lVar2);
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    public static final HashMap c(com.amazon.aps.iva.y0.b bVar, com.amazon.aps.iva.y0.b bVar2, k kVar) {
        i0 t;
        com.amazon.aps.iva.p0.c<h0> w = bVar2.w();
        int d2 = bVar.d();
        if (w == null) {
            return null;
        }
        k g2 = bVar2.e().j(bVar2.d()).g(bVar2.j);
        Object[] objArr = w.c;
        int i2 = w.b;
        HashMap hashMap = null;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            h0 h0Var = (h0) obj;
            i0 n = h0Var.n();
            i0 t2 = t(n, d2, kVar);
            if (t2 != null && (t = t(n, d2, g2)) != null && !com.amazon.aps.iva.yb0.j.a(t2, t)) {
                i0 t3 = t(n, bVar2.d(), bVar2.e());
                if (t3 != null) {
                    i0 x = h0Var.x(t, t2, t3);
                    if (x == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(t2, x);
                } else {
                    s();
                    throw null;
                }
            }
        }
        return hashMap;
    }

    public static final void d(h hVar) {
        if (d.e(hVar.d())) {
            return;
        }
        throw new IllegalStateException("Snapshot is not open".toString());
    }

    public static final k e(int i2, int i3, k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "<this>");
        while (i2 < i3) {
            kVar = kVar.j(i2);
            i2++;
        }
        return kVar;
    }

    public static final <T> T f(com.amazon.aps.iva.xb0.l<? super k, ? extends T> lVar) {
        com.amazon.aps.iva.y0.a aVar;
        com.amazon.aps.iva.p0.c<h0> cVar;
        T t;
        ArrayList Z0;
        h hVar = k;
        com.amazon.aps.iva.yb0.j.d(hVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        com.amazon.aps.iva.y0.a aVar2 = (com.amazon.aps.iva.y0.a) hVar;
        Object obj = c;
        synchronized (obj) {
            aVar = j.get();
            com.amazon.aps.iva.yb0.j.e(aVar, "currentGlobalSnapshot.get()");
            cVar = aVar.h;
            if (cVar != null) {
                ((AtomicInteger) l.b).addAndGet(1);
            }
            t = (T) w(aVar, lVar);
        }
        if (cVar != null) {
            try {
                synchronized (obj) {
                    Z0 = com.amazon.aps.iva.lb0.x.Z0(h);
                }
                int size = Z0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((com.amazon.aps.iva.xb0.p) Z0.get(i2)).invoke(cVar, aVar);
                }
            } finally {
                ((AtomicInteger) l.b).addAndGet(-1);
            }
        }
        synchronized (c) {
            g();
            if (cVar != null) {
                Object[] objArr = cVar.c;
                int i3 = cVar.b;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object obj2 = objArr[i4];
                    com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    r((h0) obj2);
                }
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
        }
        return t;
    }

    public static final void g() {
        a0<h0> a0Var = g;
        int i2 = a0Var.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            h0 h0Var = null;
            if (i3 >= i2) {
                break;
            }
            t3<h0> t3Var = a0Var.c[i3];
            if (t3Var != null) {
                h0Var = t3Var.get();
            }
            if (h0Var != null && !(!q(h0Var))) {
                if (i4 != i3) {
                    a0Var.c[i4] = t3Var;
                    int[] iArr = a0Var.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            a0Var.c[i5] = null;
            a0Var.b[i5] = 0;
        }
        if (i4 != i2) {
            a0Var.a = i4;
        }
    }

    public static final h h(h hVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar, boolean z) {
        com.amazon.aps.iva.y0.b bVar;
        boolean z2 = hVar instanceof com.amazon.aps.iva.y0.b;
        if (!z2 && hVar != null) {
            return new l0(hVar, lVar, z);
        }
        if (z2) {
            bVar = (com.amazon.aps.iva.y0.b) hVar;
        } else {
            bVar = null;
        }
        return new k0(bVar, lVar, null, false, z);
    }

    public static final <T extends i0> T i(T t) {
        T t2;
        com.amazon.aps.iva.yb0.j.f(t, "r");
        h k2 = k();
        T t3 = (T) t(t, k2.d(), k2.e());
        if (t3 == null) {
            synchronized (c) {
                h k3 = k();
                t2 = (T) t(t, k3.d(), k3.e());
            }
            if (t2 != null) {
                return t2;
            }
            s();
            throw null;
        }
        return t3;
    }

    public static final <T extends i0> T j(T t, h hVar) {
        com.amazon.aps.iva.yb0.j.f(t, "r");
        T t2 = (T) t(t, hVar.d(), hVar.e());
        if (t2 != null) {
            return t2;
        }
        s();
        throw null;
    }

    public static final h k() {
        h hVar = (h) b.a();
        if (hVar == null) {
            com.amazon.aps.iva.y0.a aVar = j.get();
            com.amazon.aps.iva.yb0.j.e(aVar, "currentGlobalSnapshot.get()");
            return aVar;
        }
        return hVar;
    }

    public static final com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> l(com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> lVar2, boolean z) {
        if (!z) {
            lVar2 = null;
        }
        if (lVar != null && lVar2 != null && !com.amazon.aps.iva.yb0.j.a(lVar, lVar2)) {
            return new b(lVar, lVar2);
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
        if (r5 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends com.amazon.aps.iva.y0.i0> T m(T r12, com.amazon.aps.iva.y0.h0 r13) {
        /*
            java.lang.String r0 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r12, r0)
            java.lang.String r0 = "state"
            com.amazon.aps.iva.yb0.j.f(r13, r0)
            com.amazon.aps.iva.y0.i0 r0 = r13.n()
            int r1 = com.amazon.aps.iva.y0.m.e
            com.amazon.aps.iva.y0.j r2 = com.amazon.aps.iva.y0.m.f
            int r3 = r2.a
            r4 = 0
            if (r3 <= 0) goto L1b
            int[] r1 = r2.b
            r1 = r1[r4]
        L1b:
            int r1 = r1 + (-1)
            r2 = 0
            r3 = r2
        L1f:
            if (r0 == 0) goto L67
            int r5 = r0.a
            if (r5 != 0) goto L26
            goto L60
        L26:
            if (r5 == 0) goto L53
            if (r5 > r1) goto L53
            int r5 = r5 + 0
            r6 = 1
            r7 = 0
            r9 = 1
            r11 = 64
            if (r5 < 0) goto L41
            if (r5 >= r11) goto L41
            long r9 = r9 << r5
            long r9 = r9 & r7
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 == 0) goto L3f
        L3d:
            r5 = r6
            goto L50
        L3f:
            r5 = r4
            goto L50
        L41:
            if (r5 < r11) goto L3f
            r11 = 128(0x80, float:1.794E-43)
            if (r5 >= r11) goto L3f
            int r5 = r5 + (-64)
            long r9 = r9 << r5
            long r9 = r9 & r7
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 == 0) goto L3f
            goto L3d
        L50:
            if (r5 != 0) goto L53
            goto L54
        L53:
            r6 = r4
        L54:
            if (r6 == 0) goto L64
            if (r3 != 0) goto L5a
            r3 = r0
            goto L64
        L5a:
            int r1 = r0.a
            int r2 = r3.a
            if (r1 >= r2) goto L62
        L60:
            r2 = r0
            goto L67
        L62:
            r2 = r3
            goto L67
        L64:
            com.amazon.aps.iva.y0.i0 r0 = r0.b
            goto L1f
        L67:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == 0) goto L6f
            r2.a = r0
            goto L7e
        L6f:
            com.amazon.aps.iva.y0.i0 r2 = r12.b()
            r2.a = r0
            com.amazon.aps.iva.y0.i0 r12 = r13.n()
            r2.b = r12
            r13.g(r2)
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y0.m.m(com.amazon.aps.iva.y0.i0, com.amazon.aps.iva.y0.h0):com.amazon.aps.iva.y0.i0");
    }

    public static final <T extends i0> T n(T t, h0 h0Var, h hVar) {
        T t2;
        com.amazon.aps.iva.yb0.j.f(t, "<this>");
        com.amazon.aps.iva.yb0.j.f(h0Var, "state");
        synchronized (c) {
            t2 = (T) m(t, h0Var);
            t2.a(t);
            t2.a = hVar.d();
        }
        return t2;
    }

    public static final void o(h hVar, h0 h0Var) {
        com.amazon.aps.iva.yb0.j.f(h0Var, "state");
        hVar.s(hVar.h() + 1);
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> i2 = hVar.i();
        if (i2 != null) {
            i2.invoke(h0Var);
        }
    }

    public static final <T extends i0> T p(T t, h0 h0Var, h hVar, T t2) {
        T t3;
        com.amazon.aps.iva.yb0.j.f(t, "<this>");
        com.amazon.aps.iva.yb0.j.f(h0Var, "state");
        if (hVar.g()) {
            hVar.n(h0Var);
        }
        int d2 = hVar.d();
        if (t2.a == d2) {
            return t2;
        }
        synchronized (c) {
            t3 = (T) m(t, h0Var);
        }
        t3.a = d2;
        hVar.n(h0Var);
        return t3;
    }

    public static final boolean q(h0 h0Var) {
        i0 i0Var;
        boolean z;
        int i2 = e;
        j jVar = f;
        if (jVar.a > 0) {
            i2 = jVar.b[0];
        }
        i0 i0Var2 = null;
        i0 i0Var3 = null;
        int i3 = 0;
        for (i0 n = h0Var.n(); n != null; n = n.b) {
            int i4 = n.a;
            if (i4 != 0) {
                if (i4 < i2) {
                    if (i0Var2 == null) {
                        i3++;
                        i0Var2 = n;
                    } else {
                        if (i4 < i0Var2.a) {
                            i0Var = i0Var2;
                            i0Var2 = n;
                        } else {
                            i0Var = n;
                        }
                        if (i0Var3 == null) {
                            i0Var3 = h0Var.n();
                            i0 i0Var4 = i0Var3;
                            while (true) {
                                if (i0Var3 != null) {
                                    int i5 = i0Var3.a;
                                    if (i5 >= i2) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        break;
                                    }
                                    if (i0Var4.a < i5) {
                                        i0Var4 = i0Var3;
                                    }
                                    i0Var3 = i0Var3.b;
                                } else {
                                    i0Var3 = i0Var4;
                                    break;
                                }
                            }
                        }
                        i0Var2.a = 0;
                        i0Var2.a(i0Var3);
                        i0Var2 = i0Var;
                    }
                } else {
                    i3++;
                }
            }
        }
        if (i3 <= 1) {
            return false;
        }
        return true;
    }

    public static final void r(h0 h0Var) {
        h0 h0Var2;
        h0 h0Var3;
        h0 h0Var4;
        if (q(h0Var)) {
            a0<h0> a0Var = g;
            a0Var.getClass();
            int i2 = a0Var.a;
            int identityHashCode = System.identityHashCode(h0Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = a0Var.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 <= i4) {
                        int i6 = (i5 + i4) >>> 1;
                        int i7 = a0Var.b[i6];
                        if (i7 < identityHashCode) {
                            i5 = i6 + 1;
                        } else if (i7 > identityHashCode) {
                            i4 = i6 - 1;
                        } else {
                            t3<h0> t3Var = a0Var.c[i6];
                            if (t3Var != null) {
                                h0Var2 = t3Var.get();
                            } else {
                                h0Var2 = null;
                            }
                            if (h0Var == h0Var2) {
                                i3 = i6;
                            } else {
                                int i8 = i6 - 1;
                                while (-1 < i8 && a0Var.b[i8] == identityHashCode) {
                                    t3<h0> t3Var2 = a0Var.c[i8];
                                    if (t3Var2 != null) {
                                        h0Var4 = t3Var2.get();
                                    } else {
                                        h0Var4 = null;
                                    }
                                    if (h0Var4 == h0Var) {
                                        break;
                                    }
                                    i8--;
                                }
                                int i9 = a0Var.a;
                                i8 = i6 + 1;
                                while (true) {
                                    if (i8 < i9) {
                                        if (a0Var.b[i8] != identityHashCode) {
                                            break;
                                        }
                                        t3<h0> t3Var3 = a0Var.c[i8];
                                        if (t3Var3 != null) {
                                            h0Var3 = t3Var3.get();
                                        } else {
                                            h0Var3 = null;
                                        }
                                        if (h0Var3 == h0Var) {
                                            break;
                                        }
                                        i8++;
                                    } else {
                                        i8 = a0Var.a;
                                        break;
                                    }
                                }
                                i8 = -(i8 + 1);
                                i3 = i8;
                            }
                        }
                    } else {
                        i3 = -(i5 + 1);
                        break;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            t3<h0>[] t3VarArr = a0Var.c;
            int length = t3VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                t3<T>[] t3VarArr2 = new t3[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                com.amazon.aps.iva.lb0.m.F(t3VarArr, i12, t3VarArr2, i10, i2);
                com.amazon.aps.iva.lb0.m.H(a0Var.c, t3VarArr2, 0, 0, i10, 6);
                com.amazon.aps.iva.lb0.m.C(i12, i10, a0Var.b, iArr, i2);
                com.amazon.aps.iva.lb0.m.G(a0Var.b, iArr, i10, 6);
                a0Var.c = t3VarArr2;
                a0Var.b = iArr;
            } else {
                int i13 = i10 + 1;
                com.amazon.aps.iva.lb0.m.F(t3VarArr, i13, t3VarArr, i10, i2);
                int[] iArr2 = a0Var.b;
                com.amazon.aps.iva.lb0.m.C(i13, i10, iArr2, iArr2, i2);
            }
            a0Var.c[i10] = new t3<>(h0Var);
            a0Var.b[i10] = identityHashCode;
            a0Var.a++;
        }
    }

    public static final void s() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final <T extends i0> T t(T t, int i2, k kVar) {
        boolean z;
        T t2 = null;
        while (t != null) {
            int i3 = t.a;
            if (i3 != 0 && i3 <= i2 && !kVar.e(i3)) {
                z = true;
            } else {
                z = false;
            }
            if (z && (t2 == null || t2.a < t.a)) {
                t2 = t;
            }
            t = (T) t.b;
        }
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    public static final <T extends i0> T u(T t, h0 h0Var) {
        T t2;
        com.amazon.aps.iva.yb0.j.f(t, "<this>");
        com.amazon.aps.iva.yb0.j.f(h0Var, "state");
        h k2 = k();
        com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> f2 = k2.f();
        if (f2 != null) {
            f2.invoke(h0Var);
        }
        T t3 = (T) t(t, k2.d(), k2.e());
        if (t3 == null) {
            synchronized (c) {
                h k3 = k();
                i0 n = h0Var.n();
                com.amazon.aps.iva.yb0.j.d(n, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
                t2 = (T) t(n, k3.d(), k3.e());
                if (t2 == null) {
                    s();
                    throw null;
                }
            }
            return t2;
        }
        return t3;
    }

    public static final void v(int i2) {
        int i3;
        j jVar = f;
        int i4 = jVar.d[i2];
        jVar.b(i4, jVar.a - 1);
        jVar.a--;
        int[] iArr = jVar.b;
        int i5 = iArr[i4];
        int i6 = i4;
        while (i6 > 0) {
            int i7 = ((i6 + 1) >> 1) - 1;
            if (iArr[i7] <= i5) {
                break;
            }
            jVar.b(i7, i6);
            i6 = i7;
        }
        int[] iArr2 = jVar.b;
        int i8 = jVar.a >> 1;
        while (i4 < i8) {
            int i9 = (i4 + 1) << 1;
            int i10 = i9 - 1;
            if (i9 < jVar.a && (i3 = iArr2[i9]) < iArr2[i10]) {
                if (i3 >= iArr2[i4]) {
                    break;
                }
                jVar.b(i9, i4);
                i4 = i9;
            } else if (iArr2[i10] >= iArr2[i4]) {
                break;
            } else {
                jVar.b(i10, i4);
                i4 = i10;
            }
        }
        jVar.d[i2] = jVar.e;
        jVar.e = i2;
    }

    public static final <T> T w(h hVar, com.amazon.aps.iva.xb0.l<? super k, ? extends T> lVar) {
        T invoke = lVar.invoke(d.d(hVar.d()));
        synchronized (c) {
            int i2 = e;
            e = i2 + 1;
            k d2 = d.d(hVar.d());
            d = d2;
            j.set(new com.amazon.aps.iva.y0.a(i2, d2));
            hVar.c();
            d = d.j(i2);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
        return invoke;
    }

    public static final <T extends i0> T x(T t, h0 h0Var, h hVar) {
        com.amazon.aps.iva.yb0.j.f(h0Var, "state");
        if (hVar.g()) {
            hVar.n(h0Var);
        }
        T t2 = (T) t(t, hVar.d(), hVar.e());
        if (t2 != null) {
            if (t2.a == hVar.d()) {
                return t2;
            }
            T t3 = (T) n(t2, h0Var, hVar);
            hVar.n(h0Var);
            return t3;
        }
        s();
        throw null;
    }
}
