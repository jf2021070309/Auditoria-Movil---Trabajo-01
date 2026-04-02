package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.ChecksumException;
/* loaded from: classes2.dex */
public final class ErrorCorrection {
    private final ModulusGF a = ModulusGF.PDF417_GF;

    public int decode(int[] iArr, int i, int[] iArr2) {
        a aVar = new a(this.a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int b = aVar.b(this.a.a(i2));
            iArr3[i - i2] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (z) {
            a b2 = this.a.b();
            if (iArr2 != null) {
                a aVar2 = b2;
                for (int i3 : iArr2) {
                    aVar2 = aVar2.c(new a(this.a, new int[]{this.a.c(0, this.a.a((iArr.length - 1) - i3)), 1}));
                }
            }
            a[] a = a(this.a.a(i, 1), new a(this.a, iArr3), i);
            a aVar3 = a[0];
            a aVar4 = a[1];
            int[] a2 = a(aVar3);
            int[] a3 = a(aVar4, aVar3, a2);
            for (int i4 = 0; i4 < a2.length; i4++) {
                int length = (iArr.length - 1) - this.a.b(a2[i4]);
                if (length < 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                iArr[length] = this.a.c(iArr[length], a3[i4]);
            }
            return a2.length;
        }
        return 0;
    }

    private a[] a(a aVar, a aVar2, int i) {
        if (aVar.a() >= aVar2.a()) {
            aVar2 = aVar;
            aVar = aVar2;
        }
        a a = this.a.a();
        a b = this.a.b();
        while (aVar.a() >= i / 2) {
            if (aVar.b()) {
                throw ChecksumException.getChecksumInstance();
            }
            a a2 = this.a.a();
            int c = this.a.c(aVar.a(aVar.a()));
            a aVar3 = a2;
            a aVar4 = aVar2;
            while (aVar4.a() >= aVar.a() && !aVar4.b()) {
                int a3 = aVar4.a() - aVar.a();
                int d = this.a.d(aVar4.a(aVar4.a()), c);
                aVar3 = aVar3.a(this.a.a(a3, d));
                aVar4 = aVar4.b(aVar.a(a3, d));
            }
            aVar2 = aVar;
            aVar = aVar4;
            a aVar5 = b;
            b = aVar3.c(b).b(a).c();
            a = aVar5;
        }
        int a4 = b.a(0);
        if (a4 == 0) {
            throw ChecksumException.getChecksumInstance();
        }
        int c2 = this.a.c(a4);
        return new a[]{b.c(c2), aVar.c(c2)};
    }

    private int[] a(a aVar) {
        int a = aVar.a();
        int[] iArr = new int[a];
        int i = 0;
        for (int i2 = 1; i2 < this.a.c() && i < a; i2++) {
            if (aVar.b(i2) == 0) {
                iArr[i] = this.a.c(i2);
                i++;
            }
        }
        if (i != a) {
            throw ChecksumException.getChecksumInstance();
        }
        return iArr;
    }

    private int[] a(a aVar, a aVar2, int[] iArr) {
        int a = aVar2.a();
        int[] iArr2 = new int[a];
        for (int i = 1; i <= a; i++) {
            iArr2[a - i] = this.a.d(i, aVar2.a(i));
        }
        a aVar3 = new a(this.a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int c = this.a.c(iArr[i2]);
            iArr3[i2] = this.a.d(this.a.c(0, aVar.b(c)), this.a.c(aVar3.b(c)));
        }
        return iArr3;
    }
}
