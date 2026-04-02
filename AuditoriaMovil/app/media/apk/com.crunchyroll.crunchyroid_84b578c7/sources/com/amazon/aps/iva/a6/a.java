package com.amazon.aps.iva.a6;

import android.util.Pair;
import com.amazon.aps.iva.q5.r0;
/* compiled from: AbstractConcatenatedTimeline.java */
/* loaded from: classes.dex */
public abstract class a extends com.amazon.aps.iva.q5.r0 {
    public static final /* synthetic */ int j = 0;
    public final int g;
    public final com.amazon.aps.iva.o6.j0 h;
    public final boolean i = false;

    public a(com.amazon.aps.iva.o6.j0 j0Var) {
        this.h = j0Var;
        this.g = j0Var.a();
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final int b(boolean z) {
        if (this.g == 0) {
            return -1;
        }
        int i = 0;
        if (this.i) {
            z = false;
        }
        if (z) {
            i = this.h.g();
        }
        do {
            n1 n1Var = (n1) this;
            com.amazon.aps.iva.q5.r0[] r0VarArr = n1Var.o;
            if (r0VarArr[i].r()) {
                i = s(i, z);
            } else {
                return r0VarArr[i].b(z) + n1Var.n[i];
            }
        } while (i != -1);
        return -1;
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final int c(Object obj) {
        int intValue;
        int c;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        n1 n1Var = (n1) this;
        Integer num = n1Var.q.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 || (c = n1Var.o[intValue].c(obj3)) == -1) {
            return -1;
        }
        return n1Var.m[intValue] + c;
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final int d(boolean z) {
        int i;
        int i2 = this.g;
        if (i2 == 0) {
            return -1;
        }
        if (this.i) {
            z = false;
        }
        com.amazon.aps.iva.o6.j0 j0Var = this.h;
        if (z) {
            i = j0Var.e();
        } else {
            i = i2 - 1;
        }
        do {
            n1 n1Var = (n1) this;
            com.amazon.aps.iva.q5.r0[] r0VarArr = n1Var.o;
            if (r0VarArr[i].r()) {
                if (z) {
                    i = j0Var.c(i);
                    continue;
                } else if (i > 0) {
                    i--;
                    continue;
                } else {
                    i = -1;
                    continue;
                }
            } else {
                return r0VarArr[i].d(z) + n1Var.n[i];
            }
        } while (i != -1);
        return -1;
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final int f(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.i) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        n1 n1Var = (n1) this;
        int[] iArr = n1Var.n;
        int e = com.amazon.aps.iva.t5.g0.e(iArr, i + 1, false, false);
        int i4 = iArr[e];
        com.amazon.aps.iva.q5.r0[] r0VarArr = n1Var.o;
        com.amazon.aps.iva.q5.r0 r0Var = r0VarArr[e];
        int i5 = i - i4;
        if (i2 != 2) {
            i3 = i2;
        }
        int f = r0Var.f(i5, i3, z);
        if (f != -1) {
            return i4 + f;
        }
        int s = s(e, z);
        while (s != -1 && r0VarArr[s].r()) {
            s = s(s, z);
        }
        if (s != -1) {
            return r0VarArr[s].b(z) + iArr[s];
        } else if (i2 != 2) {
            return -1;
        } else {
            return b(z);
        }
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final r0.b h(int i, r0.b bVar, boolean z) {
        n1 n1Var = (n1) this;
        int[] iArr = n1Var.m;
        int e = com.amazon.aps.iva.t5.g0.e(iArr, i + 1, false, false);
        int i2 = n1Var.n[e];
        n1Var.o[e].h(i - iArr[e], bVar, z);
        bVar.d += i2;
        if (z) {
            Object obj = n1Var.p[e];
            Object obj2 = bVar.c;
            obj2.getClass();
            bVar.c = Pair.create(obj, obj2);
        }
        return bVar;
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final r0.b i(Object obj, r0.b bVar) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        n1 n1Var = (n1) this;
        Integer num = n1Var.q.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i = n1Var.n[intValue];
        n1Var.o[intValue].i(obj3, bVar);
        bVar.d += i;
        bVar.c = obj;
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0037 -> B:22:0x0038). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.q5.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r7.i
            r1 = 0
            r2 = 2
            if (r0 == 0) goto Lb
            r10 = 1
            if (r9 != r10) goto La
            r9 = r2
        La:
            r10 = r1
        Lb:
            r0 = r7
            com.amazon.aps.iva.a6.n1 r0 = (com.amazon.aps.iva.a6.n1) r0
            int r3 = r8 + 1
            int[] r4 = r0.n
            int r3 = com.amazon.aps.iva.t5.g0.e(r4, r3, r1, r1)
            r5 = r4[r3]
            com.amazon.aps.iva.q5.r0[] r0 = r0.o
            r6 = r0[r3]
            int r8 = r8 - r5
            if (r9 != r2) goto L20
            goto L21
        L20:
            r1 = r9
        L21:
            int r8 = r6.m(r8, r1, r10)
            r1 = -1
            if (r8 == r1) goto L2a
            int r5 = r5 + r8
            return r5
        L2a:
            com.amazon.aps.iva.o6.j0 r8 = r7.h
            if (r10 == 0) goto L33
            int r3 = r8.c(r3)
            goto L38
        L33:
            if (r3 <= 0) goto L37
            int r3 = r3 + r1
            goto L38
        L37:
            r3 = r1
        L38:
            if (r3 == r1) goto L4e
            r5 = r0[r3]
            boolean r5 = r5.r()
            if (r5 == 0) goto L4e
            if (r10 == 0) goto L49
            int r3 = r8.c(r3)
            goto L38
        L49:
            if (r3 <= 0) goto L37
            int r3 = r3 + (-1)
            goto L38
        L4e:
            if (r3 == r1) goto L5a
            r8 = r4[r3]
            r9 = r0[r3]
            int r9 = r9.d(r10)
            int r9 = r9 + r8
            return r9
        L5a:
            if (r9 != r2) goto L61
            int r8 = r7.d(r10)
            return r8
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.a6.a.m(int, int, boolean):int");
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final Object n(int i) {
        n1 n1Var = (n1) this;
        int[] iArr = n1Var.m;
        int e = com.amazon.aps.iva.t5.g0.e(iArr, i + 1, false, false);
        return Pair.create(n1Var.p[e], n1Var.o[e].n(i - iArr[e]));
    }

    @Override // com.amazon.aps.iva.q5.r0
    public final r0.d p(int i, r0.d dVar, long j2) {
        n1 n1Var = (n1) this;
        int[] iArr = n1Var.n;
        int e = com.amazon.aps.iva.t5.g0.e(iArr, i + 1, false, false);
        int i2 = iArr[e];
        int i3 = n1Var.m[e];
        n1Var.o[e].p(i - i2, dVar, j2);
        Object obj = n1Var.p[e];
        if (!r0.d.s.equals(dVar.b)) {
            obj = Pair.create(obj, dVar.b);
        }
        dVar.b = obj;
        dVar.p += i3;
        dVar.q += i3;
        return dVar;
    }

    public final int s(int i, boolean z) {
        if (z) {
            return this.h.d(i);
        }
        if (i < this.g - 1) {
            return i + 1;
        }
        return -1;
    }
}
