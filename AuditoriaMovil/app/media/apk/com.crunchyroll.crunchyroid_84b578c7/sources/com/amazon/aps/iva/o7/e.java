package com.amazon.aps.iva.o7;

import android.util.SparseArray;
import com.amazon.aps.iva.o7.a;
import com.amazon.aps.iva.o7.i;
import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.q5.r;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.b0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x6.f0;
import com.amazon.aps.iva.x6.p;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* compiled from: FragmentedMp4Extractor.java */
/* loaded from: classes.dex */
public final class e implements com.amazon.aps.iva.x6.n {
    public static final byte[] H = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final v I;
    public int A;
    public int B;
    public boolean C;
    public p D;
    public f0[] E;
    public f0[] F;
    public boolean G;
    public final int a;
    public final List<v> b;
    public final SparseArray<b> c;
    public final com.amazon.aps.iva.t5.v d;
    public final com.amazon.aps.iva.t5.v e;
    public final com.amazon.aps.iva.t5.v f;
    public final byte[] g;
    public final com.amazon.aps.iva.t5.v h;
    public final b0 i;
    public final com.amazon.aps.iva.f7.c j;
    public final com.amazon.aps.iva.t5.v k;
    public final ArrayDeque<a.C0558a> l;
    public final ArrayDeque<a> m;
    public final f0 n;
    public int o;
    public int p;
    public long q;
    public int r;
    public com.amazon.aps.iva.t5.v s;
    public long t;
    public int u;
    public long v;
    public long w;
    public long x;
    public b y;
    public int z;

    /* compiled from: FragmentedMp4Extractor.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final boolean b;
        public final int c;

        public a(int i, long j, boolean z) {
            this.a = j;
            this.b = z;
            this.c = i;
        }
    }

    /* compiled from: FragmentedMp4Extractor.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final f0 a;
        public o d;
        public c e;
        public int f;
        public int g;
        public int h;
        public int i;
        public boolean l;
        public final n b = new n();
        public final com.amazon.aps.iva.t5.v c = new com.amazon.aps.iva.t5.v();
        public final com.amazon.aps.iva.t5.v j = new com.amazon.aps.iva.t5.v(1);
        public final com.amazon.aps.iva.t5.v k = new com.amazon.aps.iva.t5.v();

        public b(f0 f0Var, o oVar, c cVar) {
            this.a = f0Var;
            this.d = oVar;
            this.e = cVar;
            this.d = oVar;
            this.e = cVar;
            f0Var.c(oVar.a.f);
            d();
        }

        public final m a() {
            if (!this.l) {
                return null;
            }
            n nVar = this.b;
            c cVar = nVar.a;
            int i = g0.a;
            int i2 = cVar.a;
            m mVar = nVar.m;
            if (mVar == null) {
                m[] mVarArr = this.d.a.k;
                if (mVarArr == null) {
                    mVar = null;
                } else {
                    mVar = mVarArr[i2];
                }
            }
            if (mVar == null || !mVar.a) {
                return null;
            }
            return mVar;
        }

        public final boolean b() {
            this.f++;
            if (!this.l) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.b.g;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public final int c(int i, int i2) {
            com.amazon.aps.iva.t5.v vVar;
            boolean z;
            boolean z2;
            int i3;
            m a = a();
            if (a == null) {
                return 0;
            }
            n nVar = this.b;
            int i4 = a.d;
            if (i4 != 0) {
                vVar = nVar.n;
            } else {
                int i5 = g0.a;
                byte[] bArr = a.e;
                int length = bArr.length;
                com.amazon.aps.iva.t5.v vVar2 = this.k;
                vVar2.D(length, bArr);
                i4 = bArr.length;
                vVar = vVar2;
            }
            int i6 = this.f;
            if (nVar.k && nVar.l[i6]) {
                z = true;
            } else {
                z = false;
            }
            if (!z && i2 == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            com.amazon.aps.iva.t5.v vVar3 = this.j;
            byte[] bArr2 = vVar3.a;
            if (z2) {
                i3 = 128;
            } else {
                i3 = 0;
            }
            bArr2[0] = (byte) (i3 | i4);
            vVar3.F(0);
            f0 f0Var = this.a;
            f0Var.f(1, vVar3);
            f0Var.f(i4, vVar);
            if (!z2) {
                return i4 + 1;
            }
            com.amazon.aps.iva.t5.v vVar4 = this.c;
            if (!z) {
                vVar4.C(8);
                byte[] bArr3 = vVar4.a;
                bArr3[0] = 0;
                bArr3[1] = 1;
                bArr3[2] = (byte) ((i2 >> 8) & 255);
                bArr3[3] = (byte) (i2 & 255);
                bArr3[4] = (byte) ((i >> 24) & 255);
                bArr3[5] = (byte) ((i >> 16) & 255);
                bArr3[6] = (byte) ((i >> 8) & 255);
                bArr3[7] = (byte) (i & 255);
                f0Var.f(8, vVar4);
                return i4 + 1 + 8;
            }
            com.amazon.aps.iva.t5.v vVar5 = nVar.n;
            int z3 = vVar5.z();
            vVar5.G(-2);
            int i7 = (z3 * 6) + 2;
            if (i2 != 0) {
                vVar4.C(i7);
                byte[] bArr4 = vVar4.a;
                vVar5.d(0, bArr4, i7);
                int i8 = (((bArr4[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr4[3] & UnsignedBytes.MAX_VALUE)) + i2;
                bArr4[2] = (byte) ((i8 >> 8) & 255);
                bArr4[3] = (byte) (i8 & 255);
            } else {
                vVar4 = vVar5;
            }
            f0Var.f(i7, vVar4);
            return i4 + 1 + i7;
        }

        public final void d() {
            n nVar = this.b;
            nVar.d = 0;
            nVar.p = 0L;
            nVar.q = false;
            nVar.k = false;
            nVar.o = false;
            nVar.m = null;
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.l = false;
        }
    }

    static {
        v.a aVar = new v.a();
        aVar.k = "application/x-emsg";
        I = aVar.a();
    }

    public e(int i) {
        this(0, null, Collections.emptyList(), null);
    }

    public static r a(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            a.b bVar = (a.b) arrayList.get(i);
            if (bVar.a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.b.a;
                i.a b2 = i.b(bArr);
                if (b2 == null) {
                    uuid = null;
                } else {
                    uuid = b2.a;
                }
                if (uuid == null) {
                    com.amazon.aps.iva.t5.p.g();
                } else {
                    arrayList2.add(new r.b(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new r(null, false, (r.b[]) arrayList2.toArray(new r.b[0]));
    }

    public static void d(com.amazon.aps.iva.t5.v vVar, int i, n nVar) throws h0 {
        boolean z;
        vVar.F(i + 8);
        int e = vVar.e() & 16777215;
        if ((e & 1) == 0) {
            if ((e & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int x = vVar.x();
            if (x == 0) {
                Arrays.fill(nVar.l, 0, nVar.e, false);
                return;
            } else if (x == nVar.e) {
                Arrays.fill(nVar.l, 0, x, z);
                int i2 = vVar.c - vVar.b;
                com.amazon.aps.iva.t5.v vVar2 = nVar.n;
                vVar2.C(i2);
                nVar.k = true;
                nVar.o = true;
                vVar.d(0, vVar2.a, vVar2.c);
                vVar2.F(0);
                nVar.o = false;
                return;
            } else {
                StringBuilder d = com.amazon.aps.iva.e4.e.d("Senc sample count ", x, " is different from fragment sample count");
                d.append(nVar.e);
                throw h0.a(d.toString(), null);
            }
        }
        throw h0.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(com.amazon.aps.iva.x6.o oVar) throws IOException {
        return k.a(oVar, true, false);
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        SparseArray<b> sparseArray = this.c;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.valueAt(i).d();
        }
        this.m.clear();
        this.u = 0;
        this.v = j2;
        this.l.clear();
        this.o = 0;
        this.r = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0370, code lost:
        if (com.amazon.aps.iva.t5.g0.X(r30 + r6[0], 1000000, r13.d) >= r13.e) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x07a2, code lost:
        r1.o = 0;
        r1.r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x07a9, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r47) throws com.amazon.aps.iva.q5.h0 {
        /*
            Method dump skipped, instructions count: 1962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o7.e.e(long):void");
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(p pVar) {
        int i;
        this.D = pVar;
        int i2 = 0;
        this.o = 0;
        this.r = 0;
        f0[] f0VarArr = new f0[2];
        this.E = f0VarArr;
        f0 f0Var = this.n;
        if (f0Var != null) {
            f0VarArr[0] = f0Var;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.a & 4) != 0) {
            f0VarArr[i] = pVar.r(100, 5);
            i3 = 101;
            i++;
        }
        f0[] f0VarArr2 = (f0[]) g0.S(this.E, i);
        this.E = f0VarArr2;
        for (f0 f0Var2 : f0VarArr2) {
            f0Var2.c(I);
        }
        List<v> list = this.b;
        this.F = new f0[list.size()];
        while (i2 < this.F.length) {
            f0 r = this.D.r(i3, 3);
            r.c(list.get(i2));
            this.F[i2] = r;
            i2++;
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e9, code lost:
        if ((r14 & com.google.common.base.Ascii.US) != 6) goto L349;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0004 A[SYNTHETIC] */
    @Override // com.amazon.aps.iva.x6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.amazon.aps.iva.x6.o r29, com.amazon.aps.iva.x6.c0 r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o7.e.h(com.amazon.aps.iva.x6.o, com.amazon.aps.iva.x6.c0):int");
    }

    public e(int i, b0 b0Var, List list, f0 f0Var) {
        this.a = i;
        this.i = b0Var;
        this.b = Collections.unmodifiableList(list);
        this.n = f0Var;
        this.j = new com.amazon.aps.iva.f7.c();
        this.k = new com.amazon.aps.iva.t5.v(16);
        this.d = new com.amazon.aps.iva.t5.v(com.amazon.aps.iva.u5.d.a);
        this.e = new com.amazon.aps.iva.t5.v(5);
        this.f = new com.amazon.aps.iva.t5.v();
        byte[] bArr = new byte[16];
        this.g = bArr;
        this.h = new com.amazon.aps.iva.t5.v(bArr);
        this.l = new ArrayDeque<>();
        this.m = new ArrayDeque<>();
        this.c = new SparseArray<>();
        this.w = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.D = p.t0;
        this.E = new f0[0];
        this.F = new f0[0];
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }
}
