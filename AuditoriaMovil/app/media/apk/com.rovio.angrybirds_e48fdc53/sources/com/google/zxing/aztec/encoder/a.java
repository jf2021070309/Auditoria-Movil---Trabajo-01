package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
/* loaded from: classes2.dex */
final class a extends d {
    private final short b;
    private final short c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(d dVar, int i, int i2) {
        super(dVar);
        this.b = (short) i;
        this.c = (short) i2;
    }

    @Override // com.google.zxing.aztec.encoder.d
    public void a(BitArray bitArray, byte[] bArr) {
        for (int i = 0; i < this.c; i++) {
            if (i == 0 || (i == 31 && this.c <= 62)) {
                bitArray.appendBits(31, 5);
                if (this.c > 62) {
                    bitArray.appendBits(this.c - 31, 16);
                } else if (i == 0) {
                    bitArray.appendBits(Math.min((int) this.c, 31), 5);
                } else {
                    bitArray.appendBits(this.c - 31, 5);
                }
            }
            bitArray.appendBits(bArr[this.b + i], 8);
        }
    }

    public String toString() {
        return "<" + ((int) this.b) + "::" + ((this.b + this.c) - 1) + '>';
    }
}
