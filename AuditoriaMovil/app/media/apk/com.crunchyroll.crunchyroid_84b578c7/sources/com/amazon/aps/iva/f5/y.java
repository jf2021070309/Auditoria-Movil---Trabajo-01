package com.amazon.aps.iva.f5;

import com.amazon.aps.iva.f5.f;
import com.amazon.aps.iva.f5.x;
/* compiled from: StaggeredGridDefault.java */
/* loaded from: classes.dex */
public final class y extends x {
    @Override // com.amazon.aps.iva.f5.e
    public final int f(int[] iArr, int i, boolean z) {
        int i2;
        int d = ((f.b) this.b).d(i);
        x.a j = j(i);
        int i3 = j.a;
        if (this.c) {
            i2 = i3;
            int i4 = i2;
            int i5 = 1;
            int i6 = d;
            for (int i7 = i + 1; i5 < this.e && i7 <= this.g; i7++) {
                x.a j2 = j(i7);
                i6 += j2.b;
                int i8 = j2.a;
                if (i8 != i4) {
                    i5++;
                    if (!z ? i6 < d : i6 > d) {
                        d = i6;
                        i = i7;
                        i2 = i8;
                        i4 = i2;
                    } else {
                        i4 = i8;
                    }
                }
            }
        } else {
            int i9 = 1;
            int i10 = i3;
            x.a aVar = j;
            int i11 = d;
            d = ((f.b) this.b).e(i) + d;
            i2 = i10;
            for (int i12 = i - 1; i9 < this.e && i12 >= this.f; i12--) {
                i11 -= aVar.b;
                aVar = j(i12);
                int i13 = aVar.a;
                if (i13 != i10) {
                    i9++;
                    int e = ((f.b) this.b).e(i12) + i11;
                    if (!z ? e < d : e > d) {
                        d = e;
                        i = i12;
                        i2 = i13;
                        i10 = i2;
                    } else {
                        i10 = i13;
                    }
                }
            }
        }
        if (iArr != null) {
            iArr[0] = i2;
            iArr[1] = i;
        }
        return d;
    }

    @Override // com.amazon.aps.iva.f5.e
    public final int h(int[] iArr, int i, boolean z) {
        int i2;
        int d = ((f.b) this.b).d(i);
        x.a j = j(i);
        int i3 = j.a;
        if (this.c) {
            int i4 = 1;
            i2 = d - ((f.b) this.b).e(i);
            int i5 = i3;
            for (int i6 = i - 1; i4 < this.e && i6 >= this.f; i6--) {
                d -= j.b;
                j = j(i6);
                int i7 = j.a;
                if (i7 != i5) {
                    i4++;
                    int e = d - ((f.b) this.b).e(i6);
                    if (!z ? e < i2 : e > i2) {
                        i2 = e;
                        i = i6;
                        i3 = i7;
                        i5 = i3;
                    } else {
                        i5 = i7;
                    }
                }
            }
        } else {
            int i8 = i3;
            int i9 = i8;
            int i10 = 1;
            int i11 = d;
            for (int i12 = i + 1; i10 < this.e && i12 <= this.g; i12++) {
                x.a j2 = j(i12);
                i11 += j2.b;
                int i13 = j2.a;
                if (i13 != i9) {
                    i10++;
                    if (!z ? i11 < d : i11 > d) {
                        d = i11;
                        i = i12;
                        i8 = i13;
                        i9 = i8;
                    } else {
                        i9 = i13;
                    }
                }
            }
            i2 = d;
            i3 = i8;
        }
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0136, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x014e, code lost:
        return r9;
     */
    @Override // com.amazon.aps.iva.f5.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f5.y.p(int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0128, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0140, code lost:
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9 A[LOOP:2: B:86:0x00f9->B:102:0x011d, LOOP_START, PHI: r5 r8 r9 
      PHI: (r5v12 int) = (r5v6 int), (r5v17 int) binds: [B:85:0x00f7, B:102:0x011d] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r8v19 int) = (r8v17 int), (r8v20 int) binds: [B:85:0x00f7, B:102:0x011d] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v8 int) = (r9v6 int), (r9v10 int) binds: [B:85:0x00f7, B:102:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.amazon.aps.iva.f5.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f5.y.u(int, boolean):boolean");
    }

    public final int v(boolean z) {
        boolean z2 = false;
        if (z) {
            for (int i = this.g; i >= this.f; i--) {
                int i2 = j(i).a;
                if (i2 == 0) {
                    z2 = true;
                } else if (z2 && i2 == this.e - 1) {
                    return i;
                }
            }
            return -1;
        }
        for (int i3 = this.f; i3 <= this.g; i3++) {
            int i4 = j(i3).a;
            if (i4 == this.e - 1) {
                z2 = true;
            } else if (z2 && i4 == 0) {
                return i3;
            }
        }
        return -1;
    }

    public final int w(int i) {
        int i2;
        x.a j;
        int i3 = this.f;
        if (i3 < 0) {
            return Integer.MIN_VALUE;
        }
        if (this.c) {
            int d = ((f.b) this.b).d(i3);
            if (j(this.f).a == i) {
                return d;
            }
            int i4 = this.f;
            do {
                i4++;
                if (i4 <= q()) {
                    j = j(i4);
                    d += j.b;
                }
            } while (j.a != i);
            return d;
        }
        int d2 = ((f.b) this.b).d(this.g);
        x.a j2 = j(this.g);
        if (j2.a == i) {
            i2 = j2.c;
        } else {
            int i5 = this.g;
            while (true) {
                i5--;
                if (i5 < this.k) {
                    break;
                }
                d2 -= j2.b;
                j2 = j(i5);
                if (j2.a == i) {
                    i2 = j2.c;
                    break;
                }
            }
        }
        return d2 + i2;
        return Integer.MIN_VALUE;
    }

    public final int x(int i) {
        x.a j;
        int i2;
        int i3 = this.f;
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        if (this.c) {
            int d = ((f.b) this.b).d(this.g);
            x.a j2 = j(this.g);
            if (j2.a == i) {
                i2 = j2.c;
            } else {
                int i4 = this.g;
                while (true) {
                    i4--;
                    if (i4 < this.k) {
                        break;
                    }
                    d -= j2.b;
                    j2 = j(i4);
                    if (j2.a == i) {
                        i2 = j2.c;
                        break;
                    }
                }
            }
            return d - i2;
        }
        int d2 = ((f.b) this.b).d(i3);
        if (j(this.f).a == i) {
            return d2;
        }
        int i5 = this.f;
        do {
            i5++;
            if (i5 <= q()) {
                j = j(i5);
                d2 += j.b;
            }
        } while (j.a != i);
        return d2;
        return Integer.MAX_VALUE;
    }
}
