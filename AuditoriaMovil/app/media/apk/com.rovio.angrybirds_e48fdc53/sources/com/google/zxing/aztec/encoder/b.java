package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
/* loaded from: classes2.dex */
final class b extends d {
    private final short b;
    private final short c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(d dVar, int i, int i2) {
        super(dVar);
        this.b = (short) i;
        this.c = (short) i2;
    }

    @Override // com.google.zxing.aztec.encoder.d
    void a(BitArray bitArray, byte[] bArr) {
        bitArray.appendBits(this.b, this.c);
    }

    public String toString() {
        return "<" + Integer.toBinaryString((this.b & ((1 << this.c) - 1)) | (1 << this.c) | (1 << this.c)).substring(1) + '>';
    }
}
