package com.amazon.aps.iva.z7;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.z7.e0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: TsExtractor.java */
/* loaded from: classes.dex */
public final class d0 implements com.amazon.aps.iva.x6.n {
    public final int a;
    public final List<com.amazon.aps.iva.t5.b0> b;
    public final com.amazon.aps.iva.t5.v c;
    public final SparseIntArray d;
    public final e0.c e;
    public final SparseArray<e0> f;
    public final SparseBooleanArray g;
    public final SparseBooleanArray h;
    public final c0 i;
    public b0 j;
    public com.amazon.aps.iva.x6.p k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public e0 p;
    public int q;
    public int r;

    public d0(int i, com.amazon.aps.iva.t5.b0 b0Var, g gVar) {
        this.e = gVar;
        this.a = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(b0Var);
        } else {
            this.b = Collections.singletonList(b0Var);
        }
        this.c = new com.amazon.aps.iva.t5.v(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray<e0> sparseArray = new SparseArray<>();
        this.f = sparseArray;
        this.d = new SparseIntArray();
        this.i = new c0();
        this.k = com.amazon.aps.iva.x6.p.t0;
        this.r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), (e0) sparseArray2.valueAt(i2));
        }
        sparseArray.put(0, new z(new a()));
        this.p = null;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final boolean b(com.amazon.aps.iva.x6.o oVar) throws IOException {
        boolean z;
        byte[] bArr = this.c.a;
        com.amazon.aps.iva.x6.i iVar = (com.amazon.aps.iva.x6.i) oVar;
        iVar.c(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 < 5) {
                    if (bArr[(i2 * 188) + i] != 71) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                iVar.k(i);
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void c(long j, long j2) {
        boolean z;
        b0 b0Var;
        long j3;
        boolean z2;
        if (this.a != 2) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        List<com.amazon.aps.iva.t5.b0> list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.amazon.aps.iva.t5.b0 b0Var2 = list.get(i);
            synchronized (b0Var2) {
                j3 = b0Var2.b;
            }
            if (j3 == -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                long c = b0Var2.c();
                if (c != -9223372036854775807L && c != 0 && c != j2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                b0Var2.e(j2);
            }
        }
        if (j2 != 0 && (b0Var = this.j) != null) {
            b0Var.c(j2);
        }
        this.c.C(0);
        this.d.clear();
        int i2 = 0;
        while (true) {
            SparseArray<e0> sparseArray = this.f;
            if (i2 < sparseArray.size()) {
                sparseArray.valueAt(i2).b();
                i2++;
            } else {
                this.q = 0;
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void g(com.amazon.aps.iva.x6.p pVar) {
        this.k = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    @Override // com.amazon.aps.iva.x6.n
    public final int h(com.amazon.aps.iva.x6.o oVar, com.amazon.aps.iva.x6.c0 c0Var) throws IOException {
        com.amazon.aps.iva.x6.i iVar;
        ?? r3;
        int i;
        ?? r15;
        ?? r2;
        int i2;
        int i3;
        ?? r13;
        ?? r14;
        ?? r7;
        int i4;
        ?? r32;
        com.amazon.aps.iva.x6.i iVar2;
        long j;
        com.amazon.aps.iva.x6.c0 c0Var2;
        ?? r9;
        long j2;
        long j3;
        ?? r6;
        com.amazon.aps.iva.x6.i iVar3 = (com.amazon.aps.iva.x6.i) oVar;
        long j4 = iVar3.c;
        boolean z = this.m;
        int i5 = this.a;
        if (z) {
            if (j4 != -1 && i5 != 2) {
                r32 = true;
            } else {
                r32 = false;
            }
            c0 c0Var3 = this.i;
            if (r32 != false && !c0Var3.d) {
                int i6 = this.r;
                if (i6 <= 0) {
                    c0Var3.a(iVar3);
                    return 0;
                }
                boolean z2 = c0Var3.f;
                com.amazon.aps.iva.t5.v vVar = c0Var3.c;
                int i7 = c0Var3.a;
                if (!z2) {
                    int min = (int) Math.min(i7, j4);
                    long j5 = j4 - min;
                    if (iVar3.d != j5) {
                        c0Var.a = j5;
                    } else {
                        vVar.C(min);
                        iVar3.f = 0;
                        iVar3.c(vVar.a, 0, min, false);
                        int i8 = vVar.b;
                        int i9 = vVar.c;
                        int i10 = i9 - 188;
                        while (true) {
                            if (i10 >= i8) {
                                byte[] bArr = vVar.a;
                                int i11 = -4;
                                int i12 = 0;
                                while (true) {
                                    if (i11 <= 4) {
                                        int i13 = (i11 * 188) + i10;
                                        if (i13 >= i8 && i13 < i9 && bArr[i13] == 71) {
                                            i12++;
                                            if (i12 == 5) {
                                                r6 = true;
                                                break;
                                            }
                                        } else {
                                            i12 = 0;
                                        }
                                        i11++;
                                    } else {
                                        r6 = false;
                                        break;
                                    }
                                }
                                if (r6 != false) {
                                    long B = com.amazon.aps.iva.ff0.b.B(i10, i6, vVar);
                                    if (B != -9223372036854775807L) {
                                        j3 = B;
                                        break;
                                    }
                                }
                                i10--;
                            } else {
                                j3 = -9223372036854775807L;
                                break;
                            }
                        }
                        c0Var3.h = j3;
                        c0Var3.f = true;
                        return 0;
                    }
                } else if (c0Var3.h == -9223372036854775807L) {
                    c0Var3.a(iVar3);
                    return 0;
                } else if (!c0Var3.e) {
                    int min2 = (int) Math.min(i7, j4);
                    long j6 = 0;
                    if (iVar3.d != j6) {
                        c0Var.a = j6;
                    } else {
                        vVar.C(min2);
                        iVar3.f = 0;
                        iVar3.c(vVar.a, 0, min2, false);
                        int i14 = vVar.b;
                        int i15 = vVar.c;
                        while (true) {
                            if (i14 < i15) {
                                if (vVar.a[i14] == 71) {
                                    long B2 = com.amazon.aps.iva.ff0.b.B(i14, i6, vVar);
                                    if (B2 != -9223372036854775807L) {
                                        j2 = B2;
                                        break;
                                    }
                                }
                                i14++;
                            } else {
                                j2 = -9223372036854775807L;
                                break;
                            }
                        }
                        c0Var3.g = j2;
                        c0Var3.e = true;
                        return 0;
                    }
                } else {
                    long j7 = c0Var3.g;
                    if (j7 == -9223372036854775807L) {
                        c0Var3.a(iVar3);
                        return 0;
                    }
                    com.amazon.aps.iva.t5.b0 b0Var = c0Var3.b;
                    long b2 = b0Var.b(c0Var3.h) - b0Var.b(j7);
                    c0Var3.i = b2;
                    if (b2 < 0) {
                        com.amazon.aps.iva.t5.p.g();
                        c0Var3.i = -9223372036854775807L;
                    }
                    c0Var3.a(iVar3);
                    return 0;
                }
                return 1;
            }
            if (!this.n) {
                this.n = true;
                long j8 = c0Var3.i;
                if (j8 != -9223372036854775807L) {
                    iVar2 = iVar3;
                    j = 0;
                    r15 = 0;
                    b0 b0Var2 = new b0(c0Var3.b, j8, j4, this.r, 112800);
                    this.j = b0Var2;
                    this.k.m(b0Var2.a);
                    r3 = 1;
                    i = i5;
                } else {
                    iVar2 = iVar3;
                    j = 0;
                    r3 = 1;
                    i = i5;
                    r15 = 0;
                    this.k.m(new d0.b(j8));
                }
            } else {
                iVar2 = iVar3;
                j = 0;
                r3 = 1;
                i = i5;
                r15 = 0;
            }
            if (this.o) {
                this.o = r15;
                c(j, j);
                iVar = iVar2;
                if (iVar.d != j) {
                    c0Var.a = j;
                    return r3 == true ? 1 : 0;
                }
                c0Var2 = c0Var;
            } else {
                c0Var2 = c0Var;
                iVar = iVar2;
            }
            b0 b0Var3 = this.j;
            if (b0Var3 != null) {
                if (b0Var3.c != null) {
                    r9 = r3 == true ? 1 : 0;
                } else {
                    r9 = r15 == true ? 1 : 0;
                }
                if (r9 != false) {
                    return b0Var3.a(iVar, c0Var2);
                }
            }
        } else {
            iVar = iVar3;
            r3 = 1;
            i = i5;
            r15 = 0;
        }
        com.amazon.aps.iva.t5.v vVar2 = this.c;
        byte[] bArr2 = vVar2.a;
        int i16 = vVar2.b;
        if (9400 - i16 < 188) {
            int i17 = vVar2.c - i16;
            if (i17 > 0) {
                System.arraycopy(bArr2, i16, bArr2, r15, i17);
            }
            vVar2.D(i17, bArr2);
        }
        while (true) {
            int i18 = vVar2.c;
            if (i18 - vVar2.b < 188) {
                int l = iVar.l(bArr2, i18, 9400 - i18);
                if (l == -1) {
                    r2 = r15;
                    break;
                }
                vVar2.E(i18 + l);
            } else {
                r2 = r3;
                break;
            }
        }
        if (r2 == false) {
            return -1;
        }
        int i19 = vVar2.b;
        int i20 = vVar2.c;
        byte[] bArr3 = vVar2.a;
        int i21 = i19;
        while (i21 < i20 && bArr3[i21] != 71) {
            i21++;
        }
        vVar2.F(i21);
        int i22 = i21 + 188;
        e0 e0Var = null;
        if (i22 > i20) {
            int i23 = (i21 - i19) + this.q;
            this.q = i23;
            i2 = 2;
            if (i == 2 && i23 > 376) {
                throw h0.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i2 = 2;
            this.q = r15;
        }
        int i24 = vVar2.c;
        if (i22 > i24) {
            return r15;
        }
        int e = vVar2.e();
        if ((8388608 & e) != 0) {
            vVar2.F(i22);
            return r15;
        }
        if ((4194304 & e) != 0) {
            i3 = r3;
        } else {
            i3 = r15;
        }
        int i25 = i3 | r15;
        int i26 = (2096896 & e) >> 8;
        if ((e & 32) != 0) {
            r13 = r3;
        } else {
            r13 = r15;
        }
        if ((e & 16) != 0) {
            r14 = r3;
        } else {
            r14 = r15;
        }
        if (r14 != false) {
            e0Var = this.f.get(i26);
        }
        if (e0Var == null) {
            vVar2.F(i22);
            return r15;
        }
        if (i != i2) {
            int i27 = e & 15;
            SparseIntArray sparseIntArray = this.d;
            int i28 = sparseIntArray.get(i26, i27 - 1);
            sparseIntArray.put(i26, i27);
            if (i28 == i27) {
                vVar2.F(i22);
                return r15;
            } else if (i27 != ((i28 + r3) & 15)) {
                e0Var.b();
            }
        }
        if (r13 != false) {
            int u = vVar2.u();
            if ((vVar2.u() & 64) != 0) {
                i4 = 2;
            } else {
                i4 = r15;
            }
            i25 |= i4;
            vVar2.G(u - r3);
        }
        boolean z3 = this.m;
        if (i != 2 && !z3 && this.h.get(i26, r15)) {
            r7 = r15;
        } else {
            r7 = r3;
        }
        if (r7 != false) {
            vVar2.E(i22);
            e0Var.a(i25, vVar2);
            vVar2.E(i24);
        }
        if (i != 2 && !z3 && this.m && j4 != -1) {
            this.o = r3;
        }
        vVar2.F(i22);
        return r15;
    }

    @Override // com.amazon.aps.iva.x6.n
    public final void release() {
    }

    /* compiled from: TsExtractor.java */
    /* loaded from: classes.dex */
    public class a implements y {
        public final com.amazon.aps.iva.t5.u a = new com.amazon.aps.iva.t5.u(new byte[4]);

        public a() {
        }

        @Override // com.amazon.aps.iva.z7.y
        public final void a(com.amazon.aps.iva.t5.v vVar) {
            d0 d0Var;
            if (vVar.u() != 0 || (vVar.u() & 128) == 0) {
                return;
            }
            vVar.G(6);
            int i = (vVar.c - vVar.b) / 4;
            int i2 = 0;
            while (true) {
                d0Var = d0.this;
                if (i2 >= i) {
                    break;
                }
                com.amazon.aps.iva.t5.u uVar = this.a;
                vVar.d(0, uVar.b, 4);
                uVar.o(0);
                int i3 = uVar.i(16);
                uVar.r(3);
                if (i3 == 0) {
                    uVar.r(13);
                } else {
                    int i4 = uVar.i(13);
                    if (d0Var.f.get(i4) == null) {
                        d0Var.f.put(i4, new z(new b(i4)));
                        d0Var.l++;
                    }
                }
                i2++;
            }
            if (d0Var.a != 2) {
                d0Var.f.remove(0);
            }
        }

        @Override // com.amazon.aps.iva.z7.y
        public final void c(com.amazon.aps.iva.t5.b0 b0Var, com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        }
    }

    /* compiled from: TsExtractor.java */
    /* loaded from: classes.dex */
    public class b implements y {
        public final com.amazon.aps.iva.t5.u a = new com.amazon.aps.iva.t5.u(new byte[5]);
        public final SparseArray<e0> b = new SparseArray<>();
        public final SparseIntArray c = new SparseIntArray();
        public final int d;

        public b(int i) {
            this.d = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0138, code lost:
            if (r27.u() == 21) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:101:0x01f7  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01e7  */
        @Override // com.amazon.aps.iva.z7.y
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(com.amazon.aps.iva.t5.v r27) {
            /*
                Method dump skipped, instructions count: 667
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z7.d0.b.a(com.amazon.aps.iva.t5.v):void");
        }

        @Override // com.amazon.aps.iva.z7.y
        public final void c(com.amazon.aps.iva.t5.b0 b0Var, com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        }
    }
}
