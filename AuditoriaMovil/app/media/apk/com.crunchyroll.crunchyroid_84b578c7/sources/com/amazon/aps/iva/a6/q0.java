package com.amazon.aps.iva.a6;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.amazon.aps.iva.a6.j;
import com.amazon.aps.iva.a6.j1;
import com.amazon.aps.iva.a6.l1;
import com.amazon.aps.iva.a6.p1;
import com.amazon.aps.iva.g6.d;
import com.amazon.aps.iva.o6.u;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.s6.w;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ExoPlayerImplInternal.java */
/* loaded from: classes.dex */
public final class q0 implements Handler.Callback, u.a, w.a, j1.d, j.a, l1.a {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public g L;
    public long M;
    public int N;
    public boolean O;
    public l P;
    public long Q = -9223372036854775807L;
    public final o1[] b;
    public final Set<o1> c;
    public final p1[] d;
    public final com.amazon.aps.iva.s6.w e;
    public final com.amazon.aps.iva.s6.x f;
    public final t0 g;
    public final com.amazon.aps.iva.t6.d h;
    public final com.amazon.aps.iva.t5.l i;
    public final HandlerThread j;
    public final Looper k;
    public final r0.d l;
    public final r0.b m;
    public final long n;
    public final boolean o;
    public final j p;
    public final ArrayList<c> q;
    public final com.amazon.aps.iva.t5.d r;
    public final e s;
    public final y0 t;
    public final j1 u;
    public final s0 v;
    public final long w;
    public s1 x;
    public k1 y;
    public d z;

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final List<j1.c> a;
        public final com.amazon.aps.iva.o6.j0 b;
        public final int c;
        public final long d;

        public a(ArrayList arrayList, com.amazon.aps.iva.o6.j0 j0Var, int i, long j) {
            this.a = arrayList;
            this.b = j0Var;
            this.c = i;
            this.d = j;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static class b {
        public final int a;
        public final int b;
        public final int c;
        public final com.amazon.aps.iva.o6.j0 d;

        public b(int i, int i2, int i3, com.amazon.aps.iva.o6.j0 j0Var) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = j0Var;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {
        public c() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            cVar.getClass();
            return 0;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class d {
        public boolean a;
        public k1 b;
        public int c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;

        public d(k1 k1Var) {
            this.b = k1Var;
        }

        public final void a(int i) {
            boolean z;
            boolean z2 = this.a;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            this.a = z2 | z;
            this.c += i;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public interface e {
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class f {
        public final v.b a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public f(v.b bVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.a = bVar;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes.dex */
    public static final class g {
        public final com.amazon.aps.iva.q5.r0 a;
        public final int b;
        public final long c;

        public g(com.amazon.aps.iva.q5.r0 r0Var, int i, long j) {
            this.a = r0Var;
            this.b = i;
            this.c = j;
        }
    }

    public q0(o1[] o1VarArr, com.amazon.aps.iva.s6.w wVar, com.amazon.aps.iva.s6.x xVar, t0 t0Var, com.amazon.aps.iva.t6.d dVar, int i, boolean z, com.amazon.aps.iva.b6.a aVar, s1 s1Var, h hVar, long j, boolean z2, Looper looper, com.amazon.aps.iva.t5.y yVar, com.amazon.aps.iva.g1.m mVar, com.amazon.aps.iva.b6.p1 p1Var) {
        this.s = mVar;
        this.b = o1VarArr;
        this.e = wVar;
        this.f = xVar;
        this.g = t0Var;
        this.h = dVar;
        this.F = i;
        this.G = z;
        this.x = s1Var;
        this.v = hVar;
        this.w = j;
        this.B = z2;
        this.r = yVar;
        this.n = t0Var.e();
        this.o = t0Var.c();
        k1 i2 = k1.i(xVar);
        this.y = i2;
        this.z = new d(i2);
        this.d = new p1[o1VarArr.length];
        p1.a K = wVar.K();
        for (int i3 = 0; i3 < o1VarArr.length; i3++) {
            o1VarArr[i3].y(i3, p1Var);
            this.d[i3] = o1VarArr[i3].r();
            if (K != null) {
                com.amazon.aps.iva.a6.e eVar = (com.amazon.aps.iva.a6.e) this.d[i3];
                synchronized (eVar.b) {
                    eVar.o = K;
                }
            }
        }
        this.p = new j(this, yVar);
        this.q = new ArrayList<>();
        this.c = Sets.newIdentityHashSet();
        this.l = new r0.d();
        this.m = new r0.b();
        wVar.N(this, dVar);
        this.O = true;
        com.amazon.aps.iva.t5.z b2 = yVar.b(looper, null);
        this.t = new y0(aVar, b2);
        this.u = new j1(this, aVar, b2, p1Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.k = looper2;
        this.i = yVar.b(looper2, this);
    }

    public static Pair<Object, Long> H(com.amazon.aps.iva.q5.r0 r0Var, g gVar, boolean z, int i, boolean z2, r0.d dVar, r0.b bVar) {
        com.amazon.aps.iva.q5.r0 r0Var2;
        Pair<Object, Long> k;
        Object I;
        com.amazon.aps.iva.q5.r0 r0Var3 = gVar.a;
        if (r0Var.r()) {
            return null;
        }
        if (r0Var3.r()) {
            r0Var2 = r0Var;
        } else {
            r0Var2 = r0Var3;
        }
        try {
            k = r0Var2.k(dVar, bVar, gVar.b, gVar.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (r0Var.equals(r0Var2)) {
            return k;
        }
        if (r0Var.c(k.first) != -1) {
            if (r0Var2.i(k.first, bVar).g && r0Var2.o(bVar.d, dVar).p == r0Var2.c(k.first)) {
                return r0Var.k(dVar, bVar, r0Var.i(k.first, bVar).d, gVar.c);
            }
            return k;
        }
        if (z && (I = I(dVar, bVar, i, z2, k.first, r0Var2, r0Var)) != null) {
            return r0Var.k(dVar, bVar, r0Var.i(I, bVar).d, -9223372036854775807L);
        }
        return null;
    }

    public static Object I(r0.d dVar, r0.b bVar, int i, boolean z, Object obj, com.amazon.aps.iva.q5.r0 r0Var, com.amazon.aps.iva.q5.r0 r0Var2) {
        int c2 = r0Var.c(obj);
        int j = r0Var.j();
        int i2 = c2;
        int i3 = -1;
        for (int i4 = 0; i4 < j && i3 == -1; i4++) {
            i2 = r0Var.e(i2, bVar, dVar, i, z);
            if (i2 == -1) {
                break;
            }
            i3 = r0Var2.c(r0Var.n(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return r0Var2.n(i3);
    }

    public static void O(o1 o1Var, long j) {
        o1Var.k();
        if (o1Var instanceof com.amazon.aps.iva.r6.d) {
            com.amazon.aps.iva.r6.d dVar = (com.amazon.aps.iva.r6.d) o1Var;
            com.amazon.aps.iva.cq.b.C(dVar.m);
            dVar.D = j;
        }
    }

    public static boolean t(o1 o1Var) {
        if (o1Var.getState() != 0) {
            return true;
        }
        return false;
    }

    public final void A() {
        D(true, false, true, false);
        for (int i = 0; i < this.b.length; i++) {
            com.amazon.aps.iva.a6.e eVar = (com.amazon.aps.iva.a6.e) this.d[i];
            synchronized (eVar.b) {
                eVar.o = null;
            }
            this.b[i].release();
        }
        this.g.k();
        Y(1);
        HandlerThread handlerThread = this.j;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    public final void B(int i, int i2, com.amazon.aps.iva.o6.j0 j0Var) throws l {
        boolean z = true;
        this.z.a(1);
        j1 j1Var = this.u;
        j1Var.getClass();
        if (i < 0 || i > i2 || i2 > j1Var.b.size()) {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        j1Var.j = j0Var;
        j1Var.g(i, i2);
        o(j1Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0046 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() throws com.amazon.aps.iva.a6.l {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.q0.C():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
        if (r4.equals(r31.y.b) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.q0.D(boolean, boolean, boolean, boolean):void");
    }

    public final void E() {
        boolean z;
        v0 v0Var = this.t.h;
        if (v0Var != null && v0Var.f.h && this.B) {
            z = true;
        } else {
            z = false;
        }
        this.C = z;
    }

    public final void F(long j) throws l {
        y0 y0Var;
        long j2;
        o1[] o1VarArr;
        com.amazon.aps.iva.s6.r[] rVarArr;
        v0 v0Var = this.t.h;
        if (v0Var == null) {
            j2 = 1000000000000L;
        } else {
            j2 = v0Var.o;
        }
        long j3 = j + j2;
        this.M = j3;
        this.p.b.a(j3);
        for (o1 o1Var : this.b) {
            if (t(o1Var)) {
                o1Var.z(this.M);
            }
        }
        for (v0 v0Var2 = y0Var.h; v0Var2 != null; v0Var2 = v0Var2.l) {
            for (com.amazon.aps.iva.s6.r rVar : v0Var2.n.c) {
                if (rVar != null) {
                    rVar.k();
                }
            }
        }
    }

    public final void G(com.amazon.aps.iva.q5.r0 r0Var, com.amazon.aps.iva.q5.r0 r0Var2) {
        if (r0Var.r() && r0Var2.r()) {
            return;
        }
        ArrayList<c> arrayList = this.q;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    public final void J(boolean z) throws l {
        v.b bVar = this.t.h.f.a;
        long L = L(bVar, this.y.r, true, false);
        if (L != this.y.r) {
            k1 k1Var = this.y;
            this.y = r(bVar, L, k1Var.c, k1Var.d, z, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7 A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:22:0x009d, B:24:0x00a7, B:27:0x00ad, B:29:0x00b3, B:30:0x00b6, B:32:0x00bb, B:34:0x00c5, B:36:0x00cb, B:40:0x00d3, B:42:0x00dd, B:44:0x00ed, B:48:0x00f7, B:53:0x010b, B:57:0x0114, B:61:0x011f), top: B:75:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(com.amazon.aps.iva.a6.q0.g r20) throws com.amazon.aps.iva.a6.l {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.q0.K(com.amazon.aps.iva.a6.q0$g):void");
    }

    public final long L(v.b bVar, long j, boolean z, boolean z2) throws l {
        d0();
        this.D = false;
        if (z2 || this.y.e == 3) {
            Y(2);
        }
        y0 y0Var = this.t;
        v0 v0Var = y0Var.h;
        v0 v0Var2 = v0Var;
        while (v0Var2 != null && !bVar.equals(v0Var2.f.a)) {
            v0Var2 = v0Var2.l;
        }
        if (z || v0Var != v0Var2 || (v0Var2 != null && v0Var2.o + j < 0)) {
            o1[] o1VarArr = this.b;
            for (o1 o1Var : o1VarArr) {
                f(o1Var);
            }
            if (v0Var2 != null) {
                while (y0Var.h != v0Var2) {
                    y0Var.a();
                }
                y0Var.l(v0Var2);
                v0Var2.o = 1000000000000L;
                h(new boolean[o1VarArr.length]);
            }
        }
        if (v0Var2 != null) {
            y0Var.l(v0Var2);
            if (!v0Var2.d) {
                v0Var2.f = v0Var2.f.b(j);
            } else if (v0Var2.e) {
                com.amazon.aps.iva.o6.u uVar = v0Var2.a;
                j = uVar.e(j);
                uVar.t(j - this.n, this.o);
            }
            F(j);
            v();
        } else {
            y0Var.b();
            F(j);
        }
        n(false);
        this.i.k(2);
        return j;
    }

    public final void M(l1 l1Var) throws l {
        Looper looper = l1Var.f;
        Looper looper2 = this.k;
        com.amazon.aps.iva.t5.l lVar = this.i;
        if (looper == looper2) {
            synchronized (l1Var) {
            }
            try {
                l1Var.a.l(l1Var.d, l1Var.e);
                l1Var.b(true);
                int i = this.y.e;
                if (i == 3 || i == 2) {
                    lVar.k(2);
                    return;
                }
                return;
            } catch (Throwable th) {
                l1Var.b(true);
                throw th;
            }
        }
        lVar.d(15, l1Var).a();
    }

    public final void N(l1 l1Var) {
        Looper looper = l1Var.f;
        if (!looper.getThread().isAlive()) {
            com.amazon.aps.iva.t5.p.g();
            l1Var.b(false);
            return;
        }
        this.r.b(looper, null).i(new com.amazon.aps.iva.k.t(1, this, l1Var));
    }

    public final void P(boolean z, AtomicBoolean atomicBoolean) {
        o1[] o1VarArr;
        if (this.H != z) {
            this.H = z;
            if (!z) {
                for (o1 o1Var : this.b) {
                    if (!t(o1Var) && this.c.remove(o1Var)) {
                        o1Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void Q(a aVar) throws l {
        this.z.a(1);
        int i = aVar.c;
        com.amazon.aps.iva.o6.j0 j0Var = aVar.b;
        List<j1.c> list = aVar.a;
        if (i != -1) {
            this.L = new g(new n1(list, j0Var), aVar.c, aVar.d);
        }
        j1 j1Var = this.u;
        ArrayList arrayList = j1Var.b;
        j1Var.g(0, arrayList.size());
        o(j1Var.a(arrayList.size(), list, j0Var), false);
    }

    public final void R(boolean z) {
        if (z == this.J) {
            return;
        }
        this.J = z;
        if (!z && this.y.o) {
            this.i.k(2);
        }
    }

    public final void S(boolean z) throws l {
        this.B = z;
        E();
        if (this.C) {
            y0 y0Var = this.t;
            if (y0Var.i != y0Var.h) {
                J(true);
                n(false);
            }
        }
    }

    public final void T(int i, int i2, boolean z, boolean z2) throws l {
        int i3;
        com.amazon.aps.iva.s6.r[] rVarArr;
        d dVar = this.z;
        if (z2) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        dVar.a(i3);
        d dVar2 = this.z;
        dVar2.a = true;
        dVar2.f = true;
        dVar2.g = i2;
        this.y = this.y.d(i, z);
        this.D = false;
        for (v0 v0Var = this.t.h; v0Var != null; v0Var = v0Var.l) {
            for (com.amazon.aps.iva.s6.r rVar : v0Var.n.c) {
                if (rVar != null) {
                    rVar.n(z);
                }
            }
        }
        if (!Z()) {
            d0();
            f0();
            return;
        }
        int i4 = this.y.e;
        com.amazon.aps.iva.t5.l lVar = this.i;
        if (i4 == 3) {
            b0();
            lVar.k(2);
        } else if (i4 == 2) {
            lVar.k(2);
        }
    }

    public final void U(com.amazon.aps.iva.q5.k0 k0Var) throws l {
        this.i.l(16);
        j jVar = this.p;
        jVar.f(k0Var);
        com.amazon.aps.iva.q5.k0 e2 = jVar.e();
        q(e2, e2.b, true, true);
    }

    public final void V(int i) throws l {
        this.F = i;
        com.amazon.aps.iva.q5.r0 r0Var = this.y.a;
        y0 y0Var = this.t;
        y0Var.f = i;
        if (!y0Var.o(r0Var)) {
            J(true);
        }
        n(false);
    }

    public final void W(boolean z) throws l {
        this.G = z;
        com.amazon.aps.iva.q5.r0 r0Var = this.y.a;
        y0 y0Var = this.t;
        y0Var.g = z;
        if (!y0Var.o(r0Var)) {
            J(true);
        }
        n(false);
    }

    public final void X(com.amazon.aps.iva.o6.j0 j0Var) throws l {
        this.z.a(1);
        j1 j1Var = this.u;
        int size = j1Var.b.size();
        if (j0Var.a() != size) {
            j0Var = j0Var.f().h(0, size);
        }
        j1Var.j = j0Var;
        o(j1Var.b(), false);
    }

    public final void Y(int i) {
        k1 k1Var = this.y;
        if (k1Var.e != i) {
            if (i != 2) {
                this.Q = -9223372036854775807L;
            }
            this.y = k1Var.g(i);
        }
    }

    public final boolean Z() {
        k1 k1Var = this.y;
        if (k1Var.l && k1Var.m == 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.o6.i0.a
    public final void a(com.amazon.aps.iva.o6.u uVar) {
        this.i.d(9, uVar).a();
    }

    public final boolean a0(com.amazon.aps.iva.q5.r0 r0Var, v.b bVar) {
        if (bVar.a() || r0Var.r()) {
            return false;
        }
        int i = r0Var.i(bVar.a, this.m).d;
        r0.d dVar = this.l;
        r0Var.o(i, dVar);
        if (!dVar.b() || !dVar.j || dVar.g == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.s6.w.a
    public final void b() {
        this.i.k(10);
    }

    public final void b0() throws l {
        o1[] o1VarArr;
        this.D = false;
        j jVar = this.p;
        jVar.g = true;
        t1 t1Var = jVar.b;
        if (!t1Var.c) {
            t1Var.e = t1Var.b.elapsedRealtime();
            t1Var.c = true;
        }
        for (o1 o1Var : this.b) {
            if (t(o1Var)) {
                o1Var.start();
            }
        }
    }

    @Override // com.amazon.aps.iva.s6.w.a
    public final void c() {
        this.i.k(26);
    }

    public final void c0(boolean z, boolean z2) {
        boolean z3;
        if (!z && this.H) {
            z3 = false;
        } else {
            z3 = true;
        }
        D(z3, false, true, false);
        this.z.a(z2 ? 1 : 0);
        this.g.b();
        Y(1);
    }

    @Override // com.amazon.aps.iva.o6.u.a
    public final void d(com.amazon.aps.iva.o6.u uVar) {
        this.i.d(8, uVar).a();
    }

    public final void d0() throws l {
        o1[] o1VarArr;
        j jVar = this.p;
        jVar.g = false;
        t1 t1Var = jVar.b;
        if (t1Var.c) {
            t1Var.a(t1Var.t());
            t1Var.c = false;
        }
        for (o1 o1Var : this.b) {
            if (t(o1Var) && o1Var.getState() == 2) {
                o1Var.stop();
            }
        }
    }

    public final void e(a aVar, int i) throws l {
        this.z.a(1);
        j1 j1Var = this.u;
        if (i == -1) {
            i = j1Var.b.size();
        }
        o(j1Var.a(i, aVar.a, aVar.b), false);
    }

    public final void e0() {
        boolean z;
        v0 v0Var = this.t.j;
        if (!this.E && (v0Var == null || !v0Var.a.isLoading())) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        k1 k1Var = this.y;
        if (z2 != k1Var.g) {
            this.y = new k1(k1Var.a, k1Var.b, k1Var.c, k1Var.d, k1Var.e, k1Var.f, z2, k1Var.h, k1Var.i, k1Var.j, k1Var.k, k1Var.l, k1Var.m, k1Var.n, k1Var.p, k1Var.q, k1Var.r, k1Var.s, k1Var.o);
        }
    }

    public final void f(o1 o1Var) throws l {
        boolean z;
        if (o1Var.getState() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        j jVar = this.p;
        if (o1Var == jVar.d) {
            jVar.e = null;
            jVar.d = null;
            jVar.f = true;
        }
        if (o1Var.getState() == 2) {
            o1Var.stop();
        }
        o1Var.a();
        this.K--;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0178  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0135 -> B:66:0x013a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0() throws com.amazon.aps.iva.a6.l {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.q0.f0():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        if (r0.k < 100) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x053e, code lost:
        if (r5.m(r8, r7, r30, r1.p.e().b, r1.D, r34) != false) goto L414;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x039d A[EDGE_INSN: B:469:0x039d->B:233:0x039d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() throws com.amazon.aps.iva.a6.l, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.q0.g():void");
    }

    public final void g0(com.amazon.aps.iva.q5.r0 r0Var, v.b bVar, com.amazon.aps.iva.q5.r0 r0Var2, v.b bVar2, long j, boolean z) throws l {
        Object obj;
        com.amazon.aps.iva.q5.k0 k0Var;
        if (!a0(r0Var, bVar)) {
            if (bVar.a()) {
                k0Var = com.amazon.aps.iva.q5.k0.e;
            } else {
                k0Var = this.y.n;
            }
            j jVar = this.p;
            if (!jVar.e().equals(k0Var)) {
                this.i.l(16);
                jVar.f(k0Var);
                q(this.y.n, k0Var.b, false, false);
                return;
            }
            return;
        }
        Object obj2 = bVar.a;
        r0.b bVar3 = this.m;
        int i = r0Var.i(obj2, bVar3).d;
        r0.d dVar = this.l;
        r0Var.o(i, dVar);
        b0.f fVar = dVar.l;
        h hVar = (h) this.v;
        hVar.getClass();
        hVar.d = com.amazon.aps.iva.t5.g0.Q(fVar.b);
        hVar.g = com.amazon.aps.iva.t5.g0.Q(fVar.c);
        hVar.h = com.amazon.aps.iva.t5.g0.Q(fVar.d);
        float f2 = fVar.e;
        if (f2 == -3.4028235E38f) {
            f2 = 0.97f;
        }
        hVar.k = f2;
        float f3 = fVar.f;
        if (f3 == -3.4028235E38f) {
            f3 = 1.03f;
        }
        hVar.j = f3;
        if (f2 == 1.0f && f3 == 1.0f) {
            hVar.d = -9223372036854775807L;
        }
        hVar.a();
        if (j != -9223372036854775807L) {
            hVar.e = i(r0Var, obj2, j);
            hVar.a();
            return;
        }
        Object obj3 = dVar.b;
        if (!r0Var2.r()) {
            obj = r0Var2.o(r0Var2.i(bVar2.a, bVar3).d, dVar).b;
        } else {
            obj = null;
        }
        if (!com.amazon.aps.iva.t5.g0.a(obj, obj3) || z) {
            hVar.e = -9223372036854775807L;
            hVar.a();
        }
    }

    public final void h(boolean[] zArr) throws l {
        o1[] o1VarArr;
        Set<o1> set;
        o1[] o1VarArr2;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        u0 u0Var;
        y0 y0Var = this.t;
        v0 v0Var = y0Var.i;
        com.amazon.aps.iva.s6.x xVar = v0Var.n;
        int i2 = 0;
        while (true) {
            o1VarArr = this.b;
            int length = o1VarArr.length;
            set = this.c;
            if (i2 >= length) {
                break;
            }
            if (!xVar.b(i2) && set.remove(o1VarArr[i2])) {
                o1VarArr[i2].reset();
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < o1VarArr.length) {
            if (xVar.b(i3)) {
                boolean z4 = zArr[i3];
                o1 o1Var = o1VarArr[i3];
                if (!t(o1Var)) {
                    v0 v0Var2 = y0Var.i;
                    if (v0Var2 == y0Var.h) {
                        z = true;
                    } else {
                        z = false;
                    }
                    com.amazon.aps.iva.s6.x xVar2 = v0Var2.n;
                    q1 q1Var = xVar2.b[i3];
                    com.amazon.aps.iva.s6.r rVar = xVar2.c[i3];
                    if (rVar != null) {
                        i = rVar.length();
                    } else {
                        i = 0;
                    }
                    com.amazon.aps.iva.q5.v[] vVarArr = new com.amazon.aps.iva.q5.v[i];
                    for (int i4 = 0; i4 < i; i4++) {
                        vVarArr[i4] = rVar.e(i4);
                    }
                    if (Z() && this.y.e == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z4 && z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.K++;
                    set.add(o1Var);
                    o1VarArr2 = o1VarArr;
                    o1Var.j(q1Var, vVarArr, v0Var2.c[i3], this.M, z3, z, v0Var2.e(), v0Var2.o);
                    o1Var.l(11, new p0(this));
                    j jVar = this.p;
                    jVar.getClass();
                    u0 A = o1Var.A();
                    if (A != null && A != (u0Var = jVar.e)) {
                        if (u0Var == null) {
                            jVar.e = A;
                            jVar.d = o1Var;
                            A.f(jVar.b.f);
                        } else {
                            throw new l(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z2) {
                        o1Var.start();
                    }
                    i3++;
                    o1VarArr = o1VarArr2;
                }
            }
            o1VarArr2 = o1VarArr;
            i3++;
            o1VarArr = o1VarArr2;
        }
        v0Var.g = true;
    }

    public final synchronized void h0(o oVar, long j) {
        long elapsedRealtime = this.r.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) oVar.get()).booleanValue() && j > 0) {
            try {
                this.r.c();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - this.r.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        v0 v0Var;
        v0 v0Var2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2 = 1000;
        try {
            switch (message.what) {
                case 0:
                    z();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    T(message.arg2, 1, z, true);
                    break;
                case 2:
                    g();
                    break;
                case 3:
                    K((g) message.obj);
                    break;
                case 4:
                    U((com.amazon.aps.iva.q5.k0) message.obj);
                    break;
                case 5:
                    this.x = (s1) message.obj;
                    break;
                case 6:
                    c0(false, true);
                    break;
                case 7:
                    A();
                    return true;
                case 8:
                    p((com.amazon.aps.iva.o6.u) message.obj);
                    break;
                case 9:
                    l((com.amazon.aps.iva.o6.u) message.obj);
                    break;
                case 10:
                    C();
                    break;
                case 11:
                    V(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    W(z2);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    P(z3, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    l1 l1Var = (l1) message.obj;
                    l1Var.getClass();
                    M(l1Var);
                    break;
                case 15:
                    N((l1) message.obj);
                    break;
                case 16:
                    com.amazon.aps.iva.q5.k0 k0Var = (com.amazon.aps.iva.q5.k0) message.obj;
                    q(k0Var, k0Var.b, true, false);
                    break;
                case 17:
                    Q((a) message.obj);
                    break;
                case 18:
                    e((a) message.obj, message.arg1);
                    break;
                case 19:
                    y((b) message.obj);
                    break;
                case 20:
                    B(message.arg1, message.arg2, (com.amazon.aps.iva.o6.j0) message.obj);
                    break;
                case 21:
                    X((com.amazon.aps.iva.o6.j0) message.obj);
                    break;
                case 22:
                    x();
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    S(z4);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    R(z5);
                    break;
                case 25:
                    C();
                    J(true);
                    break;
                case 26:
                    C();
                    J(true);
                    break;
                default:
                    return false;
            }
        } catch (l e2) {
            e = e2;
            int i3 = e.j;
            y0 y0Var = this.t;
            if (i3 == 1 && (v0Var2 = y0Var.i) != null) {
                e = e.a(v0Var2.f.a);
            }
            if (e.p && this.P == null) {
                com.amazon.aps.iva.t5.p.h("Recoverable renderer error", e);
                this.P = e;
                com.amazon.aps.iva.t5.l lVar = this.i;
                lVar.g(lVar.d(25, e));
            } else {
                l lVar2 = this.P;
                if (lVar2 != null) {
                    lVar2.addSuppressed(e);
                    e = this.P;
                }
                com.amazon.aps.iva.t5.p.d("Playback error", e);
                if (e.j == 1 && y0Var.h != y0Var.i) {
                    while (true) {
                        v0Var = y0Var.h;
                        if (v0Var == y0Var.i) {
                            break;
                        }
                        y0Var.a();
                    }
                    v0Var.getClass();
                    w0 w0Var = v0Var.f;
                    v.b bVar = w0Var.a;
                    long j = w0Var.b;
                    this.y = r(bVar, j, w0Var.c, j, true, 0);
                }
                c0(true, false);
                this.y = this.y.e(e);
            }
        } catch (d.a e3) {
            m(e3, e3.b);
        } catch (com.amazon.aps.iva.o6.b e4) {
            m(e4, 1002);
        } catch (com.amazon.aps.iva.q5.h0 e5) {
            boolean z6 = e5.b;
            int i4 = e5.c;
            if (i4 == 1) {
                if (z6) {
                    i = 3001;
                } else {
                    i = 3003;
                }
            } else {
                if (i4 == 4) {
                    if (z6) {
                        i = 3002;
                    } else {
                        i = 3004;
                    }
                }
                m(e5, i2);
            }
            i2 = i;
            m(e5, i2);
        } catch (com.amazon.aps.iva.w5.g e6) {
            m(e6, e6.b);
        } catch (IOException e7) {
            m(e7, CastStatusCodes.AUTHENTICATION_FAILED);
        } catch (RuntimeException e8) {
            l lVar3 = new l(2, e8, ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) ? 1004 : 1004);
            com.amazon.aps.iva.t5.p.d("Playback error", lVar3);
            c0(true, false);
            this.y = this.y.e(lVar3);
        }
        w();
        return true;
    }

    public final long i(com.amazon.aps.iva.q5.r0 r0Var, Object obj, long j) {
        r0.b bVar = this.m;
        int i = r0Var.i(obj, bVar).d;
        r0.d dVar = this.l;
        r0Var.o(i, dVar);
        if (dVar.g == -9223372036854775807L || !dVar.b() || !dVar.j) {
            return -9223372036854775807L;
        }
        return com.amazon.aps.iva.t5.g0.Q(com.amazon.aps.iva.t5.g0.y(dVar.h) - dVar.g) - (j + bVar.f);
    }

    public final long j() {
        v0 v0Var = this.t.i;
        if (v0Var == null) {
            return 0L;
        }
        long j = v0Var.o;
        if (!v0Var.d) {
            return j;
        }
        int i = 0;
        while (true) {
            o1[] o1VarArr = this.b;
            if (i < o1VarArr.length) {
                if (t(o1VarArr[i]) && o1VarArr[i].getStream() == v0Var.c[i]) {
                    long x = o1VarArr[i].x();
                    if (x == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j = Math.max(x, j);
                }
                i++;
            } else {
                return j;
            }
        }
    }

    public final Pair<v.b, Long> k(com.amazon.aps.iva.q5.r0 r0Var) {
        long j = 0;
        if (r0Var.r()) {
            return Pair.create(k1.t, 0L);
        }
        Pair<Object, Long> k = r0Var.k(this.l, this.m, r0Var.b(this.G), -9223372036854775807L);
        v.b n = this.t.n(r0Var, k.first, 0L);
        long longValue = ((Long) k.second).longValue();
        if (n.a()) {
            Object obj = n.a;
            r0.b bVar = this.m;
            r0Var.i(obj, bVar);
            if (n.c == bVar.f(n.b)) {
                j = bVar.h.d;
            }
            longValue = j;
        }
        return Pair.create(n, Long.valueOf(longValue));
    }

    public final void l(com.amazon.aps.iva.o6.u uVar) {
        boolean z;
        v0 v0Var = this.t.j;
        boolean z2 = true;
        if (v0Var != null && v0Var.a == uVar) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        long j = this.M;
        if (v0Var != null) {
            if (v0Var.l != null) {
                z2 = false;
            }
            com.amazon.aps.iva.cq.b.C(z2);
            if (v0Var.d) {
                v0Var.a.v(j - v0Var.o);
            }
        }
        v();
    }

    public final void m(IOException iOException, int i) {
        l lVar = new l(0, iOException, i);
        v0 v0Var = this.t.h;
        if (v0Var != null) {
            lVar = lVar.a(v0Var.f.a);
        }
        com.amazon.aps.iva.t5.p.d("Playback error", lVar);
        c0(false, false);
        this.y = this.y.e(lVar);
    }

    public final void n(boolean z) {
        v.b bVar;
        long d2;
        v0 v0Var = this.t.j;
        if (v0Var == null) {
            bVar = this.y.b;
        } else {
            bVar = v0Var.f.a;
        }
        boolean z2 = !this.y.k.equals(bVar);
        if (z2) {
            this.y = this.y.b(bVar);
        }
        k1 k1Var = this.y;
        if (v0Var == null) {
            d2 = k1Var.r;
        } else {
            d2 = v0Var.d();
        }
        k1Var.p = d2;
        k1 k1Var2 = this.y;
        long j = k1Var2.p;
        v0 v0Var2 = this.t.j;
        long j2 = 0;
        if (v0Var2 != null) {
            j2 = Math.max(0L, j - (this.M - v0Var2.o));
        }
        k1Var2.q = j2;
        if ((z2 || z) && v0Var != null && v0Var.d) {
            this.g.d(this.y.a, v0Var.f.a, this.b, v0Var.m, v0Var.n.c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e9, code lost:
        if (r2.e(r5, r8) != 2) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f8, code lost:
        if (r2.i(r1.b) != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01fa, code lost:
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.amazon.aps.iva.q5.r0 r38, boolean r39) throws com.amazon.aps.iva.a6.l {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.q0.o(com.amazon.aps.iva.q5.r0, boolean):void");
    }

    public final void p(com.amazon.aps.iva.o6.u uVar) throws l {
        boolean z;
        y0 y0Var = this.t;
        v0 v0Var = y0Var.j;
        if (v0Var != null && v0Var.a == uVar) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        float f2 = this.p.e().b;
        com.amazon.aps.iva.q5.r0 r0Var = this.y.a;
        v0Var.d = true;
        v0Var.m = v0Var.a.q();
        com.amazon.aps.iva.s6.x g2 = v0Var.g(f2, r0Var);
        w0 w0Var = v0Var.f;
        long j = w0Var.b;
        long j2 = w0Var.e;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long a2 = v0Var.a(g2, j, false, new boolean[v0Var.i.length]);
        long j3 = v0Var.o;
        w0 w0Var2 = v0Var.f;
        v0Var.o = (w0Var2.b - a2) + j3;
        w0 b2 = w0Var2.b(a2);
        v0Var.f = b2;
        this.g.d(this.y.a, b2.a, this.b, v0Var.m, v0Var.n.c);
        if (v0Var == y0Var.h) {
            F(v0Var.f.b);
            h(new boolean[this.b.length]);
            k1 k1Var = this.y;
            v.b bVar = k1Var.b;
            long j4 = v0Var.f.b;
            this.y = r(bVar, j4, k1Var.c, j4, false, 5);
        }
        v();
    }

    public final void q(com.amazon.aps.iva.q5.k0 k0Var, float f2, boolean z, boolean z2) throws l {
        int i;
        if (z) {
            if (z2) {
                this.z.a(1);
            }
            this.y = this.y.f(k0Var);
        }
        float f3 = k0Var.b;
        v0 v0Var = this.t.h;
        while (true) {
            i = 0;
            if (v0Var == null) {
                break;
            }
            com.amazon.aps.iva.s6.r[] rVarArr = v0Var.n.c;
            int length = rVarArr.length;
            while (i < length) {
                com.amazon.aps.iva.s6.r rVar = rVarArr[i];
                if (rVar != null) {
                    rVar.i(f3);
                }
                i++;
            }
            v0Var = v0Var.l;
        }
        o1[] o1VarArr = this.b;
        int length2 = o1VarArr.length;
        while (i < length2) {
            o1 o1Var = o1VarArr[i];
            if (o1Var != null) {
                o1Var.u(f2, k0Var.b);
            }
            i++;
        }
    }

    public final k1 r(v.b bVar, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        com.amazon.aps.iva.o6.o0 o0Var;
        com.amazon.aps.iva.s6.x xVar;
        ImmutableList immutableList;
        long max;
        boolean z3;
        com.amazon.aps.iva.o6.o0 o0Var2;
        com.amazon.aps.iva.s6.x xVar2;
        ImmutableList of;
        if (!this.O && j == this.y.r && bVar.equals(this.y.b)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.O = z2;
        E();
        k1 k1Var = this.y;
        com.amazon.aps.iva.o6.o0 o0Var3 = k1Var.h;
        com.amazon.aps.iva.s6.x xVar3 = k1Var.i;
        List<com.amazon.aps.iva.q5.f0> list = k1Var.j;
        if (this.u.k) {
            v0 v0Var = this.t.h;
            if (v0Var == null) {
                o0Var2 = com.amazon.aps.iva.o6.o0.e;
            } else {
                o0Var2 = v0Var.m;
            }
            if (v0Var == null) {
                xVar2 = this.f;
            } else {
                xVar2 = v0Var.n;
            }
            com.amazon.aps.iva.s6.r[] rVarArr = xVar2.c;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            boolean z4 = false;
            for (com.amazon.aps.iva.s6.r rVar : rVarArr) {
                if (rVar != null) {
                    com.amazon.aps.iva.q5.f0 f0Var = rVar.e(0).k;
                    if (f0Var == null) {
                        builder.add((ImmutableList.Builder) new com.amazon.aps.iva.q5.f0(new f0.b[0]));
                    } else {
                        builder.add((ImmutableList.Builder) f0Var);
                        z4 = true;
                    }
                }
            }
            if (z4) {
                of = builder.build();
            } else {
                of = ImmutableList.of();
            }
            if (v0Var != null) {
                w0 w0Var = v0Var.f;
                if (w0Var.c != j2) {
                    v0Var.f = w0Var.a(j2);
                }
            }
            immutableList = of;
            o0Var = o0Var2;
            xVar = xVar2;
        } else if (!bVar.equals(k1Var.b)) {
            o0Var = com.amazon.aps.iva.o6.o0.e;
            xVar = this.f;
            immutableList = ImmutableList.of();
        } else {
            o0Var = o0Var3;
            xVar = xVar3;
            immutableList = list;
        }
        if (z) {
            d dVar = this.z;
            if (dVar.d && dVar.e != 5) {
                if (i == 5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                com.amazon.aps.iva.cq.b.t(z3);
            } else {
                dVar.a = true;
                dVar.d = true;
                dVar.e = i;
            }
        }
        k1 k1Var2 = this.y;
        long j4 = k1Var2.p;
        v0 v0Var2 = this.t.j;
        if (v0Var2 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j4 - (this.M - v0Var2.o));
        }
        return k1Var2.c(bVar, j, j2, j3, max, o0Var, xVar, immutableList);
    }

    public final boolean s() {
        long c2;
        v0 v0Var = this.t.j;
        if (v0Var == null) {
            return false;
        }
        if (!v0Var.d) {
            c2 = 0;
        } else {
            c2 = v0Var.a.c();
        }
        if (c2 == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean u() {
        v0 v0Var = this.t.h;
        long j = v0Var.f.e;
        if (v0Var.d && (j == -9223372036854775807L || this.y.r < j || !Z())) {
            return true;
        }
        return false;
    }

    public final void v() {
        long c2;
        long max;
        long j;
        long j2;
        boolean l;
        boolean z = false;
        if (!s()) {
            l = false;
        } else {
            v0 v0Var = this.t.j;
            if (!v0Var.d) {
                c2 = 0;
            } else {
                c2 = v0Var.a.c();
            }
            v0 v0Var2 = this.t.j;
            if (v0Var2 == null) {
                max = 0;
            } else {
                max = Math.max(0L, c2 - (this.M - v0Var2.o));
            }
            if (v0Var == this.t.h) {
                j = this.M;
                j2 = v0Var.o;
            } else {
                j = this.M - v0Var.o;
                j2 = v0Var.f.b;
            }
            long j3 = j - j2;
            l = this.g.l(j3, max, this.p.e().b);
            if (!l && max < 500000 && (this.n > 0 || this.o)) {
                this.t.h.a.t(this.y.r, false);
                l = this.g.l(j3, max, this.p.e().b);
            }
        }
        this.E = l;
        if (l) {
            v0 v0Var3 = this.t.j;
            long j4 = this.M;
            if (v0Var3.l == null) {
                z = true;
            }
            com.amazon.aps.iva.cq.b.C(z);
            v0Var3.a.p(j4 - v0Var3.o);
        }
        e0();
    }

    public final void w() {
        boolean z;
        d dVar = this.z;
        k1 k1Var = this.y;
        boolean z2 = dVar.a;
        if (dVar.b != k1Var) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        dVar.a = z3;
        dVar.b = k1Var;
        if (z3) {
            m0 m0Var = (m0) ((com.amazon.aps.iva.g1.m) this.s).b;
            int i = m0.o0;
            m0Var.getClass();
            m0Var.i.i(new com.amazon.aps.iva.n4.d(3, m0Var, dVar));
            this.z = new d(this.y);
        }
    }

    public final void x() throws l {
        o(this.u.b(), true);
    }

    public final void y(b bVar) throws l {
        boolean z;
        com.amazon.aps.iva.q5.r0 b2;
        this.z.a(1);
        int i = bVar.a;
        j1 j1Var = this.u;
        j1Var.getClass();
        ArrayList arrayList = j1Var.b;
        int i2 = bVar.b;
        int i3 = bVar.c;
        if (i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        j1Var.j = bVar.d;
        if (i != i2 && i != i3) {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = ((j1.c) arrayList.get(min)).d;
            com.amazon.aps.iva.t5.g0.P(i, i2, i3, arrayList);
            while (min <= max) {
                j1.c cVar = (j1.c) arrayList.get(min);
                cVar.d = i4;
                i4 += cVar.a.o.q();
                min++;
            }
            b2 = j1Var.b();
        } else {
            b2 = j1Var.b();
        }
        o(b2, false);
    }

    public final void z() {
        int i;
        this.z.a(1);
        int i2 = 0;
        D(false, false, false, true);
        this.g.f();
        if (this.y.a.r()) {
            i = 4;
        } else {
            i = 2;
        }
        Y(i);
        com.amazon.aps.iva.w5.y c2 = this.h.c();
        j1 j1Var = this.u;
        com.amazon.aps.iva.cq.b.C(!j1Var.k);
        j1Var.l = c2;
        while (true) {
            ArrayList arrayList = j1Var.b;
            if (i2 < arrayList.size()) {
                j1.c cVar = (j1.c) arrayList.get(i2);
                j1Var.e(cVar);
                j1Var.g.add(cVar);
                i2++;
            } else {
                j1Var.k = true;
                this.i.k(2);
                return;
            }
        }
    }
}
