package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class d {
    static final d a = new b(null, 0, 0);
    private final d b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(BitArray bitArray, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(d dVar) {
        this.b = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d a(int i, int i2) {
        return new b(this, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d b(int i, int i2) {
        return new a(this, i, i2);
    }
}
