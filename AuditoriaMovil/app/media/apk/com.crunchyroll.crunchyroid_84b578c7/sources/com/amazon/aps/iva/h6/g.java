package com.amazon.aps.iva.h6;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.j6.d;
import com.amazon.aps.iva.q5.s0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.c0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.w5.y;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;
/* compiled from: HlsChunkSource.java */
/* loaded from: classes.dex */
public final class g {
    public final i a;
    public final com.amazon.aps.iva.w5.f b;
    public final com.amazon.aps.iva.w5.f c;
    public final r d;
    public final Uri[] e;
    public final v[] f;
    public final com.amazon.aps.iva.j6.i g;
    public final s0 h;
    public final List<v> i;
    public final p1 k;
    public final long l;
    public boolean m;
    public com.amazon.aps.iva.o6.b o;
    public Uri p;
    public boolean q;
    public com.amazon.aps.iva.s6.r r;
    public boolean t;
    public final f j = new f();
    public byte[] n = g0.e;
    public long s = -9223372036854775807L;

    /* compiled from: HlsChunkSource.java */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.q6.k {
        public byte[] l;
    }

    /* compiled from: HlsChunkSource.java */
    /* loaded from: classes.dex */
    public static final class b {
        public com.amazon.aps.iva.q6.e a = null;
        public boolean b = false;
        public Uri c = null;
    }

    /* compiled from: HlsChunkSource.java */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.q6.b {
        public final List<d.C0402d> e;
        public final long f;

        public c(long j, List list) {
            super(0L, list.size() - 1);
            this.f = j;
            this.e = list;
        }

        @Override // com.amazon.aps.iva.q6.n
        public final long a() {
            c();
            return this.f + this.e.get((int) this.d).f;
        }

        @Override // com.amazon.aps.iva.q6.n
        public final long b() {
            c();
            d.C0402d c0402d = this.e.get((int) this.d);
            return this.f + c0402d.f + c0402d.d;
        }
    }

    /* compiled from: HlsChunkSource.java */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.s6.c {
        public int g;

        public d(s0 s0Var, int[] iArr) {
            super(s0Var, iArr);
            this.g = d(s0Var.e[iArr[0]]);
        }

        @Override // com.amazon.aps.iva.s6.r
        public final int c() {
            return this.g;
        }

        @Override // com.amazon.aps.iva.s6.r
        public final void g(long j, long j2, long j3, List<? extends com.amazon.aps.iva.q6.m> list, com.amazon.aps.iva.q6.n[] nVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!b(this.g, elapsedRealtime)) {
                return;
            }
            int i = this.b;
            do {
                i--;
                if (i < 0) {
                    throw new IllegalStateException();
                }
            } while (b(i, elapsedRealtime));
            this.g = i;
        }

        @Override // com.amazon.aps.iva.s6.r
        public final Object j() {
            return null;
        }

        @Override // com.amazon.aps.iva.s6.r
        public final int s() {
            return 0;
        }
    }

    /* compiled from: HlsChunkSource.java */
    /* loaded from: classes.dex */
    public static final class e {
        public final d.C0402d a;
        public final long b;
        public final int c;
        public final boolean d;

        public e(d.C0402d c0402d, long j, int i) {
            boolean z;
            this.a = c0402d;
            this.b = j;
            this.c = i;
            if ((c0402d instanceof d.a) && ((d.a) c0402d).n) {
                z = true;
            } else {
                z = false;
            }
            this.d = z;
        }
    }

    public g(i iVar, com.amazon.aps.iva.j6.i iVar2, Uri[] uriArr, v[] vVarArr, h hVar, y yVar, r rVar, long j, List list, p1 p1Var) {
        this.a = iVar;
        this.g = iVar2;
        this.e = uriArr;
        this.f = vVarArr;
        this.d = rVar;
        this.l = j;
        this.i = list;
        this.k = p1Var;
        com.amazon.aps.iva.w5.f a2 = hVar.a();
        this.b = a2;
        if (yVar != null) {
            a2.j(yVar);
        }
        this.c = hVar.a();
        this.h = new s0("", vVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((vVarArr[i].f & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.r = new d(this.h, Ints.toArray(arrayList));
    }

    public final com.amazon.aps.iva.q6.n[] a(k kVar, long j) {
        int b2;
        boolean z;
        List of;
        if (kVar == null) {
            b2 = -1;
        } else {
            b2 = this.h.b(kVar.d);
        }
        int length = this.r.length();
        com.amazon.aps.iva.q6.n[] nVarArr = new com.amazon.aps.iva.q6.n[length];
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            int f = this.r.f(i);
            Uri uri = this.e[f];
            com.amazon.aps.iva.j6.i iVar = this.g;
            if (!iVar.g(uri)) {
                nVarArr[i] = com.amazon.aps.iva.q6.n.a;
            } else {
                com.amazon.aps.iva.j6.d m = iVar.m(uri, z2);
                m.getClass();
                long c2 = m.h - iVar.c();
                if (f != b2) {
                    z = true;
                } else {
                    z = z2;
                }
                Pair<Long, Integer> c3 = c(kVar, z, m, c2, j);
                long longValue = ((Long) c3.first).longValue();
                int intValue = ((Integer) c3.second).intValue();
                int i2 = (int) (longValue - m.k);
                if (i2 >= 0) {
                    ImmutableList immutableList = m.r;
                    if (immutableList.size() >= i2) {
                        ArrayList arrayList = new ArrayList();
                        if (i2 < immutableList.size()) {
                            if (intValue != -1) {
                                d.c cVar = (d.c) immutableList.get(i2);
                                if (intValue == 0) {
                                    arrayList.add(cVar);
                                } else if (intValue < cVar.n.size()) {
                                    ImmutableList immutableList2 = cVar.n;
                                    arrayList.addAll(immutableList2.subList(intValue, immutableList2.size()));
                                }
                                i2++;
                            }
                            arrayList.addAll(immutableList.subList(i2, immutableList.size()));
                            intValue = 0;
                        }
                        if (m.n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            ImmutableList immutableList3 = m.s;
                            if (intValue < immutableList3.size()) {
                                arrayList.addAll(immutableList3.subList(intValue, immutableList3.size()));
                            }
                        }
                        of = Collections.unmodifiableList(arrayList);
                        nVarArr[i] = new c(c2, of);
                    }
                }
                of = ImmutableList.of();
                nVarArr[i] = new c(c2, of);
            }
            i++;
            z2 = false;
        }
        return nVarArr;
    }

    public final int b(k kVar) {
        ImmutableList immutableList;
        if (kVar.o == -1) {
            return 1;
        }
        com.amazon.aps.iva.j6.d m = this.g.m(this.e[this.h.b(kVar.d)], false);
        m.getClass();
        int i = (int) (kVar.j - m.k);
        if (i < 0) {
            return 1;
        }
        ImmutableList immutableList2 = m.r;
        if (i < immutableList2.size()) {
            immutableList = ((d.c) immutableList2.get(i)).n;
        } else {
            immutableList = m.s;
        }
        int size = immutableList.size();
        int i2 = kVar.o;
        if (i2 >= size) {
            return 2;
        }
        d.a aVar = (d.a) immutableList.get(i2);
        if (aVar.n) {
            return 0;
        }
        if (g0.a(Uri.parse(c0.c(m.a, aVar.b)), kVar.b.a)) {
            return 1;
        }
        return 2;
    }

    public final Pair<Long, Integer> c(k kVar, boolean z, com.amazon.aps.iva.j6.d dVar, long j, long j2) {
        ImmutableList immutableList;
        long j3;
        boolean z2 = true;
        int i = -1;
        if (kVar != null && !z) {
            boolean z3 = kVar.I;
            long j4 = kVar.j;
            int i2 = kVar.o;
            if (z3) {
                if (i2 == -1) {
                    j4 = kVar.c();
                }
                Long valueOf = Long.valueOf(j4);
                if (i2 != -1) {
                    i = i2 + 1;
                }
                return new Pair<>(valueOf, Integer.valueOf(i));
            }
            return new Pair<>(Long.valueOf(j4), Integer.valueOf(i2));
        }
        long j5 = dVar.u + j;
        if (kVar != null && !this.q) {
            j2 = kVar.g;
        }
        boolean z4 = dVar.o;
        long j6 = dVar.k;
        ImmutableList immutableList2 = dVar.r;
        if (!z4 && j2 >= j5) {
            return new Pair<>(Long.valueOf(j6 + immutableList2.size()), -1);
        }
        long j7 = j2 - j;
        Long valueOf2 = Long.valueOf(j7);
        int i3 = 0;
        if (this.g.h() && kVar != null) {
            z2 = false;
        }
        int d2 = g0.d(immutableList2, valueOf2, z2);
        long j8 = d2 + j6;
        if (d2 >= 0) {
            d.c cVar = (d.c) immutableList2.get(d2);
            int i4 = (j7 > (cVar.f + cVar.d) ? 1 : (j7 == (cVar.f + cVar.d) ? 0 : -1));
            ImmutableList immutableList3 = dVar.s;
            if (i4 < 0) {
                immutableList = cVar.n;
            } else {
                immutableList = immutableList3;
            }
            while (true) {
                if (i3 >= immutableList.size()) {
                    break;
                }
                d.a aVar = (d.a) immutableList.get(i3);
                if (j7 < aVar.f + aVar.d) {
                    if (aVar.m) {
                        if (immutableList == immutableList3) {
                            j3 = 1;
                        } else {
                            j3 = 0;
                        }
                        j8 += j3;
                        i = i3;
                    }
                } else {
                    i3++;
                }
            }
        }
        return new Pair<>(Long.valueOf(j8), Integer.valueOf(i));
    }

    public final a d(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        f fVar = this.j;
        byte[] remove = fVar.a.remove(uri);
        if (remove != null) {
            fVar.a.put(uri, remove);
            return null;
        }
        ImmutableMap of = ImmutableMap.of();
        Collections.emptyMap();
        return new a(this.c, new com.amazon.aps.iva.w5.i(uri, 0L, 1, null, of, 0L, -1L, null, 1, null), this.f[i], this.r.s(), this.r.j(), this.n);
    }
}
