package com.amazon.aps.iva.ef0;
/* compiled from: Segment.kt */
/* loaded from: classes4.dex */
public final class y {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public y f;
    public y g;

    public y() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final y a() {
        y yVar = this.f;
        if (yVar == this) {
            yVar = null;
        }
        y yVar2 = this.g;
        com.amazon.aps.iva.yb0.j.c(yVar2);
        yVar2.f = this.f;
        y yVar3 = this.f;
        com.amazon.aps.iva.yb0.j.c(yVar3);
        yVar3.g = this.g;
        this.f = null;
        this.g = null;
        return yVar;
    }

    public final void b(y yVar) {
        yVar.g = this;
        yVar.f = this.f;
        y yVar2 = this.f;
        com.amazon.aps.iva.yb0.j.c(yVar2);
        yVar2.g = yVar;
        this.f = yVar;
    }

    public final y c() {
        this.d = true;
        return new y(this.a, this.b, this.c, true, false);
    }

    public final void d(y yVar, int i) {
        if (yVar.e) {
            int i2 = yVar.c;
            int i3 = i2 + i;
            byte[] bArr = yVar.a;
            if (i3 > 8192) {
                if (!yVar.d) {
                    int i4 = yVar.b;
                    if (i3 - i4 <= 8192) {
                        com.amazon.aps.iva.lb0.m.D(bArr, 0, bArr, i4, i2);
                        yVar.c -= yVar.b;
                        yVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i5 = yVar.c;
            int i6 = this.b;
            com.amazon.aps.iva.lb0.m.D(this.a, i5, bArr, i6, i6 + i);
            yVar.c += i;
            this.b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public y(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        com.amazon.aps.iva.yb0.j.f(bArr, "data");
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
