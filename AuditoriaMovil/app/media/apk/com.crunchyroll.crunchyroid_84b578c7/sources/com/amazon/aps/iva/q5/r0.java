package com.amazon.aps.iva.q5;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.c;
import com.amazon.aps.iva.q5.k;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
/* compiled from: Timeline.java */
/* loaded from: classes.dex */
public abstract class r0 implements k {
    public static final a b = new a();
    public static final String c = com.amazon.aps.iva.t5.g0.L(0);
    public static final String d = com.amazon.aps.iva.t5.g0.L(1);
    public static final String e = com.amazon.aps.iva.t5.g0.L(2);
    public static final z f = new z(2);

    /* compiled from: Timeline.java */
    /* loaded from: classes.dex */
    public class a extends r0 {
        @Override // com.amazon.aps.iva.q5.r0
        public final int c(Object obj) {
            return -1;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final b h(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int j() {
            return 0;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final Object n(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final d p(int i, d dVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int q() {
            return 0;
        }
    }

    /* compiled from: Timeline.java */
    /* loaded from: classes.dex */
    public static final class b implements k {
        public static final String i = com.amazon.aps.iva.t5.g0.L(0);
        public static final String j = com.amazon.aps.iva.t5.g0.L(1);
        public static final String k = com.amazon.aps.iva.t5.g0.L(2);
        public static final String l = com.amazon.aps.iva.t5.g0.L(3);
        public static final String m = com.amazon.aps.iva.t5.g0.L(4);
        public static final a0 n = new a0(2);
        public Object b;
        public Object c;
        public int d;
        public long e;
        public long f;
        public boolean g;
        public com.amazon.aps.iva.q5.c h = com.amazon.aps.iva.q5.c.h;

        public final long b(int i2, int i3) {
            c.a a = this.h.a(i2);
            if (a.c != -1) {
                return a.g[i3];
            }
            return -9223372036854775807L;
        }

        public final int c(long j2) {
            return this.h.b(j2, this.e);
        }

        public final long d(int i2) {
            return this.h.a(i2).b;
        }

        public final int e(int i2, int i3) {
            c.a a = this.h.a(i2);
            if (a.c != -1) {
                return a.f[i3];
            }
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            if (com.amazon.aps.iva.t5.g0.a(this.b, bVar.b) && com.amazon.aps.iva.t5.g0.a(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && com.amazon.aps.iva.t5.g0.a(this.h, bVar.h)) {
                return true;
            }
            return false;
        }

        public final int f(int i2) {
            return this.h.a(i2).b(-1);
        }

        public final long g() {
            return this.f;
        }

        public final boolean h(int i2) {
            com.amazon.aps.iva.q5.c cVar = this.h;
            if (i2 == cVar.c - 1 && cVar.d(i2)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            Object obj = this.b;
            int i2 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i3 = (217 + hashCode) * 31;
            Object obj2 = this.c;
            if (obj2 != null) {
                i2 = obj2.hashCode();
            }
            long j2 = this.e;
            long j3 = this.f;
            return this.h.hashCode() + ((((((((((i3 + i2) * 31) + this.d) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31);
        }

        public final boolean i(int i2) {
            return this.h.a(i2).i;
        }

        @CanIgnoreReturnValue
        public final void j(Object obj, Object obj2, int i2, long j2, long j3, com.amazon.aps.iva.q5.c cVar, boolean z) {
            this.b = obj;
            this.c = obj2;
            this.d = i2;
            this.e = j2;
            this.f = j3;
            this.h = cVar;
            this.g = z;
        }

        @CanIgnoreReturnValue
        public final void k(Object obj, Object obj2, long j2, long j3) {
            j(obj, obj2, 0, j2, j3, com.amazon.aps.iva.q5.c.h, false);
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            int i2 = this.d;
            if (i2 != 0) {
                bundle.putInt(i, i2);
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                bundle.putLong(j, j2);
            }
            long j3 = this.f;
            if (j3 != 0) {
                bundle.putLong(k, j3);
            }
            boolean z = this.g;
            if (z) {
                bundle.putBoolean(l, z);
            }
            if (!this.h.equals(com.amazon.aps.iva.q5.c.h)) {
                bundle.putBundle(m, this.h.toBundle());
            }
            return bundle;
        }
    }

    /* compiled from: Timeline.java */
    /* loaded from: classes.dex */
    public static final class c extends r0 {
        public final ImmutableList<d> g;
        public final ImmutableList<b> h;
        public final int[] i;
        public final int[] j;

        public c(ImmutableList<d> immutableList, ImmutableList<b> immutableList2, int[] iArr) {
            boolean z;
            if (immutableList.size() == iArr.length) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.t(z);
            this.g = immutableList;
            this.h = immutableList2;
            this.i = iArr;
            this.j = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.j[iArr[i]] = i;
            }
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int b(boolean z) {
            if (r()) {
                return -1;
            }
            if (!z) {
                return 0;
            }
            return this.i[0];
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int c(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int d(boolean z) {
            if (r()) {
                return -1;
            }
            if (z) {
                return this.i[q() - 1];
            }
            return q() - 1;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int f(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i == d(z)) {
                if (i2 == 2) {
                    return b(z);
                }
                return -1;
            } else if (z) {
                return this.i[this.j[i] + 1];
            } else {
                return i + 1;
            }
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final b h(int i, b bVar, boolean z) {
            b bVar2 = this.h.get(i);
            bVar.j(bVar2.b, bVar2.c, bVar2.d, bVar2.e, bVar2.f, bVar2.h, bVar2.g);
            return bVar;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int j() {
            return this.h.size();
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int m(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i == b(z)) {
                if (i2 == 2) {
                    return d(z);
                }
                return -1;
            } else if (z) {
                return this.i[this.j[i] - 1];
            } else {
                return i - 1;
            }
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final Object n(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final d p(int i, d dVar, long j) {
            d dVar2 = this.g.get(i);
            dVar.c(dVar2.b, dVar2.d, dVar2.e, dVar2.f, dVar2.g, dVar2.h, dVar2.i, dVar2.j, dVar2.l, dVar2.n, dVar2.o, dVar2.p, dVar2.q, dVar2.r);
            dVar.m = dVar2.m;
            return dVar;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int q() {
            return this.g.size();
        }
    }

    /* compiled from: Timeline.java */
    /* loaded from: classes.dex */
    public static final class d implements k {
        public static final String A;
        public static final String B;
        public static final String C;
        public static final String D;
        public static final String E;
        public static final String F;
        public static final String G;
        public static final String H;
        public static final m I;
        public static final Object s = new Object();
        public static final Object t = new Object();
        public static final b0 u;
        public static final String v;
        public static final String w;
        public static final String x;
        public static final String y;
        public static final String z;
        @Deprecated
        public Object c;
        public Object e;
        public long f;
        public long g;
        public long h;
        public boolean i;
        public boolean j;
        @Deprecated
        public boolean k;
        public b0.f l;
        public boolean m;
        public long n;
        public long o;
        public int p;
        public int q;
        public long r;
        public Object b = s;
        public b0 d = u;

        static {
            b0.b bVar = new b0.b();
            bVar.a = "androidx.media3.common.Timeline";
            bVar.b = Uri.EMPTY;
            u = bVar.a();
            v = com.amazon.aps.iva.t5.g0.L(1);
            w = com.amazon.aps.iva.t5.g0.L(2);
            x = com.amazon.aps.iva.t5.g0.L(3);
            y = com.amazon.aps.iva.t5.g0.L(4);
            z = com.amazon.aps.iva.t5.g0.L(5);
            A = com.amazon.aps.iva.t5.g0.L(6);
            B = com.amazon.aps.iva.t5.g0.L(7);
            C = com.amazon.aps.iva.t5.g0.L(8);
            D = com.amazon.aps.iva.t5.g0.L(9);
            E = com.amazon.aps.iva.t5.g0.L(10);
            F = com.amazon.aps.iva.t5.g0.L(11);
            G = com.amazon.aps.iva.t5.g0.L(12);
            H = com.amazon.aps.iva.t5.g0.L(13);
            I = new m(3);
        }

        public final long a() {
            return com.amazon.aps.iva.t5.g0.e0(this.o);
        }

        public final boolean b() {
            boolean z2;
            boolean z3;
            boolean z4 = this.k;
            if (this.l != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z4 == z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.amazon.aps.iva.cq.b.C(z3);
            if (this.l != null) {
                return true;
            }
            return false;
        }

        @CanIgnoreReturnValue
        public final void c(Object obj, b0 b0Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, b0.f fVar, long j4, long j5, int i, int i2, long j6) {
            b0 b0Var2;
            Object obj3;
            boolean z4;
            b0.g gVar;
            this.b = obj;
            if (b0Var != null) {
                b0Var2 = b0Var;
            } else {
                b0Var2 = u;
            }
            this.d = b0Var2;
            if (b0Var != null && (gVar = b0Var.c) != null) {
                obj3 = gVar.i;
            } else {
                obj3 = null;
            }
            this.c = obj3;
            this.e = obj2;
            this.f = j;
            this.g = j2;
            this.h = j3;
            this.i = z2;
            this.j = z3;
            if (fVar != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.k = z4;
            this.l = fVar;
            this.n = j4;
            this.o = j5;
            this.p = i;
            this.q = i2;
            this.r = j6;
            this.m = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            if (com.amazon.aps.iva.t5.g0.a(this.b, dVar.b) && com.amazon.aps.iva.t5.g0.a(this.d, dVar.d) && com.amazon.aps.iva.t5.g0.a(this.e, dVar.e) && com.amazon.aps.iva.t5.g0.a(this.l, dVar.l) && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h && this.i == dVar.i && this.j == dVar.j && this.m == dVar.m && this.n == dVar.n && this.o == dVar.o && this.p == dVar.p && this.q == dVar.q && this.r == dVar.r) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.d.hashCode() + ((this.b.hashCode() + 217) * 31)) * 31;
            Object obj = this.e;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            b0.f fVar = this.l;
            if (fVar != null) {
                i = fVar.hashCode();
            }
            long j = this.f;
            long j2 = this.g;
            long j3 = this.h;
            long j4 = this.n;
            long j5 = this.o;
            long j6 = this.r;
            return ((((((((((((((((((((((i2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.p) * 31) + this.q) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (!b0.h.equals(this.d)) {
                bundle.putBundle(v, this.d.toBundle());
            }
            long j = this.f;
            if (j != -9223372036854775807L) {
                bundle.putLong(w, j);
            }
            long j2 = this.g;
            if (j2 != -9223372036854775807L) {
                bundle.putLong(x, j2);
            }
            long j3 = this.h;
            if (j3 != -9223372036854775807L) {
                bundle.putLong(y, j3);
            }
            boolean z2 = this.i;
            if (z2) {
                bundle.putBoolean(z, z2);
            }
            boolean z3 = this.j;
            if (z3) {
                bundle.putBoolean(A, z3);
            }
            b0.f fVar = this.l;
            if (fVar != null) {
                bundle.putBundle(B, fVar.toBundle());
            }
            boolean z4 = this.m;
            if (z4) {
                bundle.putBoolean(C, z4);
            }
            long j4 = this.n;
            if (j4 != 0) {
                bundle.putLong(D, j4);
            }
            long j5 = this.o;
            if (j5 != -9223372036854775807L) {
                bundle.putLong(E, j5);
            }
            int i = this.p;
            if (i != 0) {
                bundle.putInt(F, i);
            }
            int i2 = this.q;
            if (i2 != 0) {
                bundle.putInt(G, i2);
            }
            long j6 = this.r;
            if (j6 != 0) {
                bundle.putLong(H, j6);
            }
            return bundle;
        }
    }

    public static <T extends k> ImmutableList<T> a(k.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList<Bundle> a2 = j.a(iBinder);
        for (int i = 0; i < a2.size(); i++) {
            builder.add((ImmutableList.Builder) aVar.e(a2.get(i)));
        }
        return builder.build();
    }

    public int b(boolean z) {
        if (r()) {
            return -1;
        }
        return 0;
    }

    public abstract int c(Object obj);

    public int d(boolean z) {
        if (r()) {
            return -1;
        }
        return q() - 1;
    }

    public final int e(int i, b bVar, d dVar, int i2, boolean z) {
        int i3 = h(i, bVar, false).d;
        if (o(i3, dVar).q == i) {
            int f2 = f(i3, i2, z);
            if (f2 == -1) {
                return -1;
            }
            return o(f2, dVar).p;
        }
        return i + 1;
    }

    public final boolean equals(Object obj) {
        int d2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (r0Var.q() != q() || r0Var.j() != j()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i = 0; i < q(); i++) {
            if (!o(i, dVar).equals(r0Var.o(i, dVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < j(); i2++) {
            if (!h(i2, bVar, true).equals(r0Var.h(i2, bVar2, true))) {
                return false;
            }
        }
        int b2 = b(true);
        if (b2 != r0Var.b(true) || (d2 = d(true)) != r0Var.d(true)) {
            return false;
        }
        while (b2 != d2) {
            int f2 = f(b2, 0, true);
            if (f2 != r0Var.f(b2, 0, true)) {
                return false;
            }
            b2 = f2;
        }
        return true;
    }

    public int f(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == d(z)) {
                        return b(z);
                    }
                    return i + 1;
                }
                throw new IllegalStateException();
            }
            return i;
        } else if (i == d(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final b g(int i, b bVar) {
        return h(i, bVar, false);
    }

    public abstract b h(int i, b bVar, boolean z);

    public final int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int q = q() + 217;
        for (int i = 0; i < q(); i++) {
            q = (q * 31) + o(i, dVar).hashCode();
        }
        int j = j() + (q * 31);
        for (int i2 = 0; i2 < j(); i2++) {
            j = (j * 31) + h(i2, bVar, true).hashCode();
        }
        int b2 = b(true);
        while (b2 != -1) {
            j = (j * 31) + b2;
            b2 = f(b2, 0, true);
        }
        return j;
    }

    public b i(Object obj, b bVar) {
        return h(c(obj), bVar, true);
    }

    public abstract int j();

    public final Pair<Object, Long> k(d dVar, b bVar, int i, long j) {
        Pair<Object, Long> l = l(dVar, bVar, i, j, 0L);
        l.getClass();
        return l;
    }

    public final Pair<Object, Long> l(d dVar, b bVar, int i, long j, long j2) {
        com.amazon.aps.iva.cq.b.x(i, q());
        p(i, dVar, j2);
        if (j == -9223372036854775807L) {
            j = dVar.n;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = dVar.p;
        g(i2, bVar);
        while (i2 < dVar.q && bVar.f != j) {
            int i3 = i2 + 1;
            if (h(i3, bVar, false).f > j) {
                break;
            }
            i2 = i3;
        }
        h(i2, bVar, true);
        long j3 = j - bVar.f;
        long j4 = bVar.e;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = bVar.c;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int m(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == b(z)) {
                        return d(z);
                    }
                    return i - 1;
                }
                throw new IllegalStateException();
            }
            return i;
        } else if (i == b(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    public abstract Object n(int i);

    public final d o(int i, d dVar) {
        return p(i, dVar, 0L);
    }

    public abstract d p(int i, d dVar, long j);

    public abstract int q();

    public final boolean r() {
        if (q() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int q = q();
        d dVar = new d();
        for (int i = 0; i < q; i++) {
            arrayList.add(p(i, dVar, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int j = j();
        b bVar = new b();
        for (int i2 = 0; i2 < j; i2++) {
            arrayList2.add(h(i2, bVar, false).toBundle());
        }
        int[] iArr = new int[q];
        if (q > 0) {
            iArr[0] = b(true);
        }
        for (int i3 = 1; i3 < q; i3++) {
            iArr[i3] = f(iArr[i3 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        com.amazon.aps.iva.e.z.M(bundle, c, new j(arrayList));
        com.amazon.aps.iva.e.z.M(bundle, d, new j(arrayList2));
        bundle.putIntArray(e, iArr);
        return bundle;
    }
}
