package com.amazon.aps.iva.h6;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.h6.o;
import com.amazon.aps.iva.q5.f0;
import com.amazon.aps.iva.q5.g0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.b0;
import com.amazon.aps.iva.z7.d0;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Http2;
/* compiled from: HlsMediaChunk.java */
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.q6.m {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public final long C;
    public l D;
    public o E;
    public int F;
    public boolean G;
    public volatile boolean H;
    public boolean I;
    public ImmutableList<Integer> J;
    public boolean K;
    public boolean L;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final com.amazon.aps.iva.w5.f p;
    public final com.amazon.aps.iva.w5.i q;
    public final l r;
    public final boolean s;
    public final boolean t;
    public final b0 u;
    public final i v;
    public final List<v> w;
    public final com.amazon.aps.iva.q5.r x;
    public final com.amazon.aps.iva.i7.g y;
    public final com.amazon.aps.iva.t5.v z;

    public k(i iVar, com.amazon.aps.iva.w5.f fVar, com.amazon.aps.iva.w5.i iVar2, v vVar, boolean z, com.amazon.aps.iva.w5.f fVar2, com.amazon.aps.iva.w5.i iVar3, boolean z2, Uri uri, List<v> list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, b0 b0Var, long j4, com.amazon.aps.iva.q5.r rVar, l lVar, com.amazon.aps.iva.i7.g gVar, com.amazon.aps.iva.t5.v vVar2, boolean z6, p1 p1Var) {
        super(fVar, iVar2, vVar, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.L = z3;
        this.l = i3;
        this.q = iVar3;
        this.p = fVar2;
        this.G = iVar3 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = b0Var;
        this.C = j4;
        this.t = z4;
        this.v = iVar;
        this.w = list;
        this.x = rVar;
        this.r = lVar;
        this.y = gVar;
        this.z = vVar2;
        this.n = z6;
        this.J = ImmutableList.of();
        this.k = M.getAndIncrement();
    }

    public static byte[] f(String str) {
        int i;
        if (Ascii.toLowerCase(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i = byteArray.length - 16;
        } else {
            i = 0;
        }
        System.arraycopy(byteArray, i, bArr, (16 - byteArray.length) + i, byteArray.length - i);
        return bArr;
    }

    @Override // com.amazon.aps.iva.t6.k.d
    public final void a() throws IOException {
        l lVar;
        boolean z;
        this.E.getClass();
        if (this.D == null && (lVar = this.r) != null) {
            com.amazon.aps.iva.x6.n nVar = ((b) lVar).a;
            if (!(nVar instanceof d0) && !(nVar instanceof com.amazon.aps.iva.o7.e)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.D = lVar;
                this.G = false;
            }
        }
        if (this.G) {
            com.amazon.aps.iva.w5.f fVar = this.p;
            fVar.getClass();
            com.amazon.aps.iva.w5.i iVar = this.q;
            iVar.getClass();
            e(fVar, iVar, this.B, false);
            this.F = 0;
            this.G = false;
        }
        if (!this.H) {
            if (!this.t) {
                e(this.i, this.b, this.A, true);
            }
            this.I = !this.H;
        }
    }

    @Override // com.amazon.aps.iva.t6.k.d
    public final void b() {
        this.H = true;
    }

    @Override // com.amazon.aps.iva.q6.m
    public final boolean d() {
        throw null;
    }

    public final void e(com.amazon.aps.iva.w5.f fVar, com.amazon.aps.iva.w5.i iVar, boolean z, boolean z2) throws IOException {
        com.amazon.aps.iva.w5.i a;
        boolean z3;
        long j;
        long j2;
        boolean z4;
        boolean z5;
        if (z) {
            if (this.F != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            z3 = z5;
            a = iVar;
        } else {
            a = iVar.a(this.F);
            z3 = false;
        }
        try {
            com.amazon.aps.iva.x6.i h = h(fVar, a, z2);
            if (z3) {
                h.k(this.F);
            }
            do {
                try {
                    if (this.H) {
                        break;
                    }
                    if (((b) this.D).a.h(h, b.d) == 0) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                } catch (EOFException e) {
                    if ((this.d.f & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                        ((b) this.D).a.c(0L, 0L);
                        j = h.d;
                        j2 = iVar.f;
                    } else {
                        throw e;
                    }
                }
            } while (z4);
            j = h.d;
            j2 = iVar.f;
            this.F = (int) (j - j2);
        } finally {
            com.amazon.aps.iva.n1.c.g(fVar);
        }
    }

    public final int g(int i) {
        com.amazon.aps.iva.cq.b.C(!this.n);
        if (i >= this.J.size()) {
            return 0;
        }
        return this.J.get(i).intValue();
    }

    public final com.amazon.aps.iva.x6.i h(com.amazon.aps.iva.w5.f fVar, com.amazon.aps.iva.w5.i iVar, boolean z) throws IOException {
        int i;
        long j;
        b bVar;
        b bVar2;
        ArrayList arrayList;
        com.amazon.aps.iva.x6.n aVar;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        long j2;
        boolean z6;
        com.amazon.aps.iva.x6.n dVar;
        f0.b[] bVarArr;
        long b = fVar.b(iVar);
        if (z) {
            try {
                this.u.f(this.g, this.C, this.s);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        com.amazon.aps.iva.x6.i iVar2 = new com.amazon.aps.iva.x6.i(fVar, iVar.f, b);
        int i5 = 1;
        if (this.D == null) {
            com.amazon.aps.iva.t5.v vVar = this.z;
            iVar2.f = 0;
            int i6 = 8;
            try {
                vVar.C(10);
                iVar2.c(vVar.a, 0, 10, false);
                if (vVar.w() == 4801587) {
                    vVar.G(3);
                    int t = vVar.t();
                    int i7 = t + 10;
                    byte[] bArr = vVar.a;
                    if (i7 > bArr.length) {
                        vVar.C(i7);
                        System.arraycopy(bArr, 0, vVar.a, 0, 10);
                    }
                    iVar2.c(vVar.a, 10, t, false);
                    f0 s = this.y.s(t, vVar.a);
                    if (s != null) {
                        for (f0.b bVar3 : s.b) {
                            if (bVar3 instanceof com.amazon.aps.iva.i7.k) {
                                com.amazon.aps.iva.i7.k kVar = (com.amazon.aps.iva.i7.k) bVar3;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(kVar.c)) {
                                    System.arraycopy(kVar.d, 0, vVar.a, 0, 8);
                                    vVar.F(0);
                                    vVar.E(8);
                                    j = vVar.n() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (EOFException unused2) {
            }
            j = -9223372036854775807L;
            iVar2.f = 0;
            b0 b0Var = this.u;
            l lVar = this.r;
            if (lVar != null) {
                b bVar4 = (b) lVar;
                com.amazon.aps.iva.x6.n nVar = bVar4.a;
                if (!(nVar instanceof d0) && !(nVar instanceof com.amazon.aps.iva.o7.e)) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                com.amazon.aps.iva.cq.b.C(!z6);
                com.amazon.aps.iva.x6.n nVar2 = bVar4.a;
                boolean z7 = nVar2 instanceof s;
                b0 b0Var2 = bVar4.c;
                v vVar2 = bVar4.b;
                if (z7) {
                    dVar = new s(vVar2.d, b0Var2);
                } else if (nVar2 instanceof com.amazon.aps.iva.z7.e) {
                    dVar = new com.amazon.aps.iva.z7.e(0);
                } else if (nVar2 instanceof com.amazon.aps.iva.z7.a) {
                    dVar = new com.amazon.aps.iva.z7.a();
                } else if (nVar2 instanceof com.amazon.aps.iva.z7.c) {
                    dVar = new com.amazon.aps.iva.z7.c();
                } else if (nVar2 instanceof com.amazon.aps.iva.n7.d) {
                    dVar = new com.amazon.aps.iva.n7.d();
                } else {
                    throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(nVar2.getClass().getSimpleName()));
                }
                bVar2 = new b(dVar, vVar2, b0Var2);
                i = 0;
            } else {
                Map<String, List<String>> d = fVar.d();
                ((d) this.v).getClass();
                v vVar3 = this.d;
                int A = z.A(vVar3.m);
                int B = z.B(d);
                int C = z.C(iVar.a);
                int i8 = 7;
                ArrayList arrayList2 = new ArrayList(7);
                d.a(A, arrayList2);
                d.a(B, arrayList2);
                d.a(C, arrayList2);
                int[] iArr = d.b;
                for (int i9 = 0; i9 < 7; i9++) {
                    d.a(iArr[i9], arrayList2);
                }
                iVar2.f = 0;
                int i10 = 0;
                com.amazon.aps.iva.x6.n nVar3 = null;
                while (true) {
                    if (i10 < arrayList2.size()) {
                        int intValue = ((Integer) arrayList2.get(i10)).intValue();
                        if (intValue != 0) {
                            if (intValue != i5) {
                                if (intValue != 2) {
                                    if (intValue != i8) {
                                        List<v> list = this.w;
                                        if (intValue != i6) {
                                            if (intValue != 11) {
                                                if (intValue != 13) {
                                                    aVar = null;
                                                } else {
                                                    aVar = new s(vVar3.d, b0Var);
                                                }
                                            } else {
                                                if (list != null) {
                                                    i3 = 48;
                                                } else {
                                                    v.a aVar2 = new v.a();
                                                    aVar2.k = "application/cea-608";
                                                    list = Collections.singletonList(new v(aVar2));
                                                    i3 = 16;
                                                }
                                                String str = vVar3.j;
                                                if (!TextUtils.isEmpty(str)) {
                                                    if (g0.c(str, "audio/mp4a-latm") != null) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    if (!z4) {
                                                        i3 |= 2;
                                                    }
                                                    if (g0.c(str, "video/avc") != null) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (!z5) {
                                                        i3 |= 4;
                                                    }
                                                }
                                                aVar = new d0(2, b0Var, new com.amazon.aps.iva.z7.g(i3, list));
                                            }
                                            arrayList = arrayList2;
                                        } else {
                                            f0 f0Var = vVar3.k;
                                            arrayList = arrayList2;
                                            if (f0Var != null) {
                                                int i11 = 0;
                                                while (true) {
                                                    f0.b[] bVarArr2 = f0Var.b;
                                                    f0 f0Var2 = f0Var;
                                                    if (i11 >= bVarArr2.length) {
                                                        break;
                                                    }
                                                    f0.b bVar5 = bVarArr2[i11];
                                                    if (bVar5 instanceof p) {
                                                        z3 = !((p) bVar5).d.isEmpty();
                                                        break;
                                                    }
                                                    i11++;
                                                    f0Var = f0Var2;
                                                }
                                            }
                                            z3 = false;
                                            if (z3) {
                                                i2 = 4;
                                            } else {
                                                i2 = 0;
                                            }
                                            if (list == null) {
                                                list = Collections.emptyList();
                                            }
                                            aVar = new com.amazon.aps.iva.o7.e(i2, b0Var, list, null);
                                        }
                                    } else {
                                        arrayList = arrayList2;
                                        aVar = new com.amazon.aps.iva.n7.d(0L);
                                    }
                                } else {
                                    arrayList = arrayList2;
                                    aVar = new com.amazon.aps.iva.z7.e(0);
                                }
                            } else {
                                arrayList = arrayList2;
                                aVar = new com.amazon.aps.iva.z7.c();
                            }
                        } else {
                            arrayList = arrayList2;
                            aVar = new com.amazon.aps.iva.z7.a();
                        }
                        aVar.getClass();
                        try {
                            z2 = aVar.b(iVar2);
                            i = 0;
                            iVar2.f = 0;
                        } catch (EOFException unused3) {
                            i = 0;
                            iVar2.f = 0;
                            z2 = false;
                        } catch (Throwable th) {
                            iVar2.f = 0;
                            throw th;
                        }
                        if (z2) {
                            bVar = new b(aVar, vVar3, b0Var);
                            break;
                        }
                        com.amazon.aps.iva.x6.n nVar4 = nVar3;
                        if (nVar4 == null && (intValue == A || intValue == B || intValue == C || intValue == 11)) {
                            nVar3 = aVar;
                        } else {
                            nVar3 = nVar4;
                        }
                        i10++;
                        arrayList2 = arrayList;
                        i5 = 1;
                        i8 = 7;
                        i6 = 8;
                    } else {
                        com.amazon.aps.iva.x6.n nVar5 = nVar3;
                        i = 0;
                        nVar5.getClass();
                        bVar = new b(nVar5, vVar3, b0Var);
                        break;
                    }
                }
                bVar2 = bVar;
            }
            this.D = bVar2;
            com.amazon.aps.iva.x6.n nVar6 = bVar2.a;
            if (!(nVar6 instanceof com.amazon.aps.iva.z7.e) && !(nVar6 instanceof com.amazon.aps.iva.z7.a) && !(nVar6 instanceof com.amazon.aps.iva.z7.c) && !(nVar6 instanceof com.amazon.aps.iva.n7.d)) {
                i4 = i;
            } else {
                i4 = 1;
            }
            if (i4 != 0) {
                o oVar = this.E;
                if (j != -9223372036854775807L) {
                    j2 = b0Var.b(j);
                } else {
                    j2 = this.g;
                }
                if (oVar.W != j2) {
                    oVar.W = j2;
                    o.c[] cVarArr = oVar.w;
                    int length = cVarArr.length;
                    for (int i12 = i; i12 < length; i12++) {
                        o.c cVar = cVarArr[i12];
                        if (cVar.F != j2) {
                            cVar.F = j2;
                            cVar.z = true;
                        }
                    }
                }
            } else {
                o oVar2 = this.E;
                if (oVar2.W != 0) {
                    oVar2.W = 0L;
                    o.c[] cVarArr2 = oVar2.w;
                    int length2 = cVarArr2.length;
                    for (int i13 = i; i13 < length2; i13++) {
                        o.c cVar2 = cVarArr2[i13];
                        if (cVar2.F != 0) {
                            cVar2.F = 0L;
                            cVar2.z = true;
                        }
                    }
                }
            }
            this.E.y.clear();
            ((b) this.D).a.g(this.E);
        } else {
            i = 0;
        }
        o oVar3 = this.E;
        com.amazon.aps.iva.q5.r rVar = oVar3.X;
        com.amazon.aps.iva.q5.r rVar2 = this.x;
        if (!com.amazon.aps.iva.t5.g0.a(rVar, rVar2)) {
            oVar3.X = rVar2;
            int i14 = i;
            while (true) {
                o.c[] cVarArr3 = oVar3.w;
                if (i14 >= cVarArr3.length) {
                    break;
                }
                if (oVar3.P[i14]) {
                    o.c cVar3 = cVarArr3[i14];
                    cVar3.I = rVar2;
                    cVar3.z = true;
                }
                i14++;
            }
        }
        return iVar2;
    }
}
