package com.google.zxing.common.reedsolomon;

import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
/* loaded from: classes2.dex */
public final class GenericGF {
    public static final GenericGF AZTEC_DATA_8;
    public static final GenericGF DATA_MATRIX_FIELD_256;
    public static final GenericGF MAXICODE_FIELD_64;
    private final int[] a;
    private final int[] b;
    private final a c;
    private final a d;
    private final int e;
    private final int f;
    private final int g;
    public static final GenericGF AZTEC_DATA_12 = new GenericGF(4201, 4096, 1);
    public static final GenericGF AZTEC_DATA_10 = new GenericGF(DownloadErrorCode.ERROR_CHUNK_NOT_EQUALS_CACHE, 1024, 1);
    public static final GenericGF AZTEC_DATA_6 = new GenericGF(67, 64, 1);
    public static final GenericGF AZTEC_PARAM = new GenericGF(19, 16, 1);
    public static final GenericGF QR_CODE_FIELD_256 = new GenericGF(285, 256, 0);

    static {
        GenericGF genericGF = new GenericGF(301, 256, 1);
        DATA_MATRIX_FIELD_256 = genericGF;
        AZTEC_DATA_8 = genericGF;
        MAXICODE_FIELD_64 = AZTEC_DATA_6;
    }

    public GenericGF(int i, int i2, int i3) {
        this.f = i;
        this.e = i2;
        this.g = i3;
        this.a = new int[i2];
        this.b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.b[this.a[i6]] = i6;
        }
        this.c = new a(this, new int[]{0});
        this.d = new a(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.c;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new a(this, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, int i2) {
        return i ^ i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i) {
        return this.a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i) {
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        return this.b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.a[(this.e - this.b[i]) - 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        return this.a[(this.b[i] + this.b[i2]) % (this.e - 1)];
    }

    public int getSize() {
        return this.e;
    }

    public int getGeneratorBase() {
        return this.g;
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f) + ',' + this.e + ')';
    }
}
