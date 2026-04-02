package com.google.zxing.pdf417.decoder.ec;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a {
    private final ModulusGF a;
    private final int[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(ModulusGF modulusGF, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = modulusGF;
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
    public int a() {
        return this.b.length - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
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
                i2++;
                i3 = this.a.b(i3, iArr[i2]);
            }
            return i3;
        }
        int i4 = this.b[0];
        int length2 = this.b.length;
        int i5 = i4;
        int i6 = 1;
        while (i6 < length2) {
            int b = this.a.b(this.a.d(i, i5), this.b[i6]);
            i6++;
            i5 = b;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a(a aVar) {
        if (!this.a.equals(aVar.a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (!b()) {
            if (aVar.b()) {
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
                iArr3[i] = this.a.b(iArr2[i - length], iArr[i]);
            }
            return new a(this.a, iArr3);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a b(a aVar) {
        if (this.a.equals(aVar.a)) {
            return aVar.b() ? this : a(aVar.c());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a c(a aVar) {
        if (!this.a.equals(aVar.a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (b() || aVar.b()) {
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
                iArr3[i + i3] = this.a.b(iArr3[i + i3], this.a.d(i2, iArr2[i3]));
            }
        }
        return new a(this.a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a c() {
        int length = this.b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.a.c(0, this.b[i]);
        }
        return new a(this.a, iArr);
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
                iArr[i2] = this.a.d(this.b[i2], i);
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
            iArr[i3] = this.a.d(this.b[i3], i2);
        }
        return new a(this.a, iArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(a() * 8);
        for (int a = a(); a >= 0; a--) {
            int a2 = a(a);
            if (a2 != 0) {
                if (a2 < 0) {
                    sb.append(" - ");
                    a2 = -a2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (a == 0 || a2 != 1) {
                    sb.append(a2);
                }
                if (a != 0) {
                    if (a == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(a);
                    }
                }
            }
        }
        return sb.toString();
    }
}
