package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.util.LinkedList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c {
    static final c a = new c(d.a, 0, 0, 0);
    private final int b;
    private final d c;
    private final int d;
    private final int e;

    private c(d dVar, int i, int i2, int i3) {
        this.c = dVar;
        this.b = i;
        this.d = i2;
        this.e = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c a(int i, int i2) {
        int i3;
        d dVar;
        int i4 = this.e;
        d dVar2 = this.c;
        if (i != this.b) {
            int i5 = HighLevelEncoder.b[this.b][i];
            i3 = i4 + (i5 >> 16);
            dVar = dVar2.a(65535 & i5, i5 >> 16);
        } else {
            i3 = i4;
            dVar = dVar2;
        }
        int i6 = i == 2 ? 4 : 5;
        return new c(dVar.a(i2, i6), i, 0, i6 + i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c b(int i, int i2) {
        d dVar = this.c;
        int i3 = this.b == 2 ? 4 : 5;
        return new c(dVar.a(HighLevelEncoder.c[this.b][i], i3).a(i2, 5), this.b, 0, i3 + this.e + 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c a(int i) {
        d a2;
        int i2;
        d dVar = this.c;
        int i3 = this.b;
        int i4 = this.e;
        if (this.b == 4 || this.b == 2) {
            int i5 = HighLevelEncoder.b[i3][0];
            i4 += i5 >> 16;
            a2 = dVar.a(65535 & i5, i5 >> 16);
            i3 = 0;
        } else {
            a2 = dVar;
        }
        if (this.d == 0 || this.d == 31) {
            i2 = 18;
        } else {
            i2 = this.d == 62 ? 9 : 8;
        }
        c cVar = new c(a2, i3, this.d + 1, i4 + i2);
        return cVar.d == 2078 ? cVar.b(i + 1) : cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c b(int i) {
        return this.d == 0 ? this : new c(this.c.b(i - this.d, this.d), this.b, 0, this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(c cVar) {
        int i = this.e + (HighLevelEncoder.b[this.b][cVar.b] >> 16);
        if (cVar.d > 0 && (this.d == 0 || this.d > cVar.d)) {
            i += 10;
        }
        return i <= cVar.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BitArray a(byte[] bArr) {
        LinkedList<d> linkedList = new LinkedList();
        for (d dVar = b(bArr.length).c; dVar != null; dVar = dVar.a()) {
            linkedList.addFirst(dVar);
        }
        BitArray bitArray = new BitArray();
        for (d dVar2 : linkedList) {
            dVar2.a(bitArray, bArr);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.a[this.b], Integer.valueOf(this.e), Integer.valueOf(this.d));
    }
}
