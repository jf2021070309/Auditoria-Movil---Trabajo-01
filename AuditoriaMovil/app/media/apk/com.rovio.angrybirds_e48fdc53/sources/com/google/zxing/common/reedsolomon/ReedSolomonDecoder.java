package com.google.zxing.common.reedsolomon;
/* loaded from: classes2.dex */
public final class ReedSolomonDecoder {
    private final GenericGF a;

    public ReedSolomonDecoder(GenericGF genericGF) {
        this.a = genericGF;
    }

    public void decode(int[] iArr, int i) {
        a aVar = new a(this.a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            int b = aVar.b(this.a.a(this.a.getGeneratorBase() + i2));
            iArr2[(i - 1) - i2] = b;
            if (b != 0) {
                z = false;
            }
        }
        if (!z) {
            a[] a = a(this.a.a(i, 1), new a(this.a, iArr2), i);
            a aVar2 = a[0];
            a aVar3 = a[1];
            int[] a2 = a(aVar2);
            int[] a3 = a(aVar3, a2);
            for (int i3 = 0; i3 < a2.length; i3++) {
                int length = (iArr.length - 1) - this.a.b(a2[i3]);
                if (length < 0) {
                    throw new ReedSolomonException("Bad error location");
                }
                iArr[length] = GenericGF.b(iArr[length], a3[i3]);
            }
        }
    }

    private a[] a(a aVar, a aVar2, int i) {
        if (aVar.b() >= aVar2.b()) {
            aVar2 = aVar;
            aVar = aVar2;
        }
        a a = this.a.a();
        a b = this.a.b();
        while (aVar.b() >= i / 2) {
            if (aVar.c()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            a a2 = this.a.a();
            int c = this.a.c(aVar.a(aVar.b()));
            a aVar3 = a2;
            a aVar4 = aVar2;
            while (aVar4.b() >= aVar.b() && !aVar4.c()) {
                int b2 = aVar4.b() - aVar.b();
                int c2 = this.a.c(aVar4.a(aVar4.b()), c);
                aVar3 = aVar3.a(this.a.a(b2, c2));
                aVar4 = aVar4.a(aVar.a(b2, c2));
            }
            a a3 = aVar3.b(b).a(a);
            if (aVar4.b() >= aVar.b()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
            }
            aVar2 = aVar;
            aVar = aVar4;
            a aVar5 = b;
            b = a3;
            a = aVar5;
        }
        int a4 = b.a(0);
        if (a4 == 0) {
            throw new ReedSolomonException("sigmaTilde(0) was zero");
        }
        int c3 = this.a.c(a4);
        return new a[]{b.c(c3), aVar.c(c3)};
    }

    private int[] a(a aVar) {
        int i = 0;
        int b = aVar.b();
        if (b == 1) {
            return new int[]{aVar.a(1)};
        }
        int[] iArr = new int[b];
        for (int i2 = 1; i2 < this.a.getSize() && i < b; i2++) {
            if (aVar.b(i2) == 0) {
                iArr[i] = this.a.c(i2);
                i++;
            }
        }
        if (i != b) {
            throw new ReedSolomonException("Error locator degree does not match number of roots");
        }
        return iArr;
    }

    private int[] a(a aVar, int[] iArr) {
        int i;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int c = this.a.c(iArr[i2]);
            int i3 = 1;
            int i4 = 0;
            while (i4 < length) {
                if (i2 != i4) {
                    int c2 = this.a.c(iArr[i4], c);
                    i = this.a.c(i3, (c2 & 1) == 0 ? c2 | 1 : c2 & (-2));
                } else {
                    i = i3;
                }
                i4++;
                i3 = i;
            }
            iArr2[i2] = this.a.c(aVar.b(c), this.a.c(i3));
            if (this.a.getGeneratorBase() != 0) {
                iArr2[i2] = this.a.c(iArr2[i2], c);
            }
        }
        return iArr2;
    }
}
