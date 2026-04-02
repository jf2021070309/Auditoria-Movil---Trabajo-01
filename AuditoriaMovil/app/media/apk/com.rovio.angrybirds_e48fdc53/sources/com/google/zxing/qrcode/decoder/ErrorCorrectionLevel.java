package com.google.zxing.qrcode.decoder;
/* loaded from: classes2.dex */
public enum ErrorCorrectionLevel {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    private final int b;
    private static final ErrorCorrectionLevel[] a = {M, L, H, Q};

    ErrorCorrectionLevel(int i) {
        this.b = i;
    }

    public int getBits() {
        return this.b;
    }

    public static ErrorCorrectionLevel forBits(int i) {
        if (i < 0 || i >= a.length) {
            throw new IllegalArgumentException();
        }
        return a[i];
    }
}
