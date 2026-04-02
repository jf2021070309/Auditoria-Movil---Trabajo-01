package com.google.zxing.common.reedsolomon;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a {
    private final GenericGF a;
    private final int[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(GenericGF genericGF, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = genericGF;
        int length = iArr.length;
        if (length > 1 && iArr[0] == 0) {
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i != length) {
                this.b = new int[length - i];
                System.arraycopy(iArr, i, this.b, 0, this.b.length);
                return;
            }
            this.b = new int[]{0};
            return;
        }
        this.b = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.b[0] == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i) {
        return this.b[(this.b.length - 1) - i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i) {
        int i2 = 0;
        if (i == 0) {
            return a(0);
        }
        if (i == 1) {
            int[] iArr = this.b;
            int length = iArr.length;
            int i3 = 0;
            while (i2 < length) {
                int b = GenericGF.b(i3, iArr[i2]);
                i2++;
                i3 = b;
            }
            return i3;
        }
        int i4 = this.b[0];
        int length2 = this.b.length;
        int i5 = i4;
        int i6 = 1;
        while (i6 < length2) {
            int b2 = GenericGF.b(this.a.c(i, i5), this.b[i6]);
            i6++;
            i5 = b2;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a(a aVar) {
        if (!this.a.equals(aVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (!c()) {
            if (aVar.c()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = aVar.b;
            if (iArr.length <= iArr2.length) {
                iArr2 = iArr;
                iArr = iArr2;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = GenericGF.b(iArr2[i - length], iArr[i]);
            }
            return new a(this.a, iArr3);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a b(a aVar) {
        if (!this.a.equals(aVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c() || aVar.c()) {
            return this.a.a();
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = aVar.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                iArr3[i + i3] = GenericGF.b(iArr3[i + i3], this.a.c(i2, iArr2[i3]));
            }
        }
        return new a(this.a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a c(int i) {
        if (i == 0) {
            return this.a.a();
        }
        if (i != 1) {
            int length = this.b.length;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = this.a.c(this.b[i2], i);
            }
            return new a(this.a, iArr);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.a.a();
        }
        int length = this.b.length;
        int[] iArr = new int[length + i];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.a.c(this.b[i3], i2);
        }
        return new a(this.a, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a[] c(a aVar) {
        if (!this.a.equals(aVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (aVar.c()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        a a = this.a.a();
        int c = this.a.c(aVar.a(aVar.b()));
        a aVar2 = a;
        a aVar3 = this;
        while (aVar3.b() >= aVar.b() && !aVar3.c()) {
            int b = aVar3.b() - aVar.b();
            int c2 = this.a.c(aVar3.a(aVar3.b()), c);
            a a2 = aVar.a(b, c2);
            aVar2 = aVar2.a(this.a.a(b, c2));
            aVar3 = aVar3.a(a2);
        }
        return new a[]{aVar2, aVar3};
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int b = b(); b >= 0; b--) {
            int a = a(b);
            if (a != 0) {
                if (a < 0) {
                    sb.append(" - ");
                    a = -a;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || a != 1) {
                    int b2 = this.a.b(a);
                    if (b2 == 0) {
                        sb.append('1');
                    } else if (b2 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(b2);
                    }
                }
                if (b != 0) {
                    if (b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b);
                    }
                }
            }
        }
        return sb.toString();
    }
}
