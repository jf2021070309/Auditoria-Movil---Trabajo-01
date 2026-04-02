package k;

import ch.qos.logback.core.rolling.helper.Compressor;
/* loaded from: classes2.dex */
public final class s {
    public final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public int f9639b;

    /* renamed from: c  reason: collision with root package name */
    public int f9640c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9641d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9642e;

    /* renamed from: f  reason: collision with root package name */
    public s f9643f;

    /* renamed from: g  reason: collision with root package name */
    public s f9644g;

    public s() {
        this.a = new byte[Compressor.BUFFER_SIZE];
        this.f9642e = true;
        this.f9641d = false;
    }

    public s(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        h.o.c.j.e(bArr, "data");
        this.a = bArr;
        this.f9639b = i2;
        this.f9640c = i3;
        this.f9641d = z;
        this.f9642e = z2;
    }

    public final s a() {
        s sVar = this.f9643f;
        if (sVar == this) {
            sVar = null;
        }
        s sVar2 = this.f9644g;
        h.o.c.j.c(sVar2);
        sVar2.f9643f = this.f9643f;
        s sVar3 = this.f9643f;
        h.o.c.j.c(sVar3);
        sVar3.f9644g = this.f9644g;
        this.f9643f = null;
        this.f9644g = null;
        return sVar;
    }

    public final s b(s sVar) {
        h.o.c.j.e(sVar, "segment");
        sVar.f9644g = this;
        sVar.f9643f = this.f9643f;
        s sVar2 = this.f9643f;
        h.o.c.j.c(sVar2);
        sVar2.f9644g = sVar;
        this.f9643f = sVar;
        return sVar;
    }

    public final s c() {
        this.f9641d = true;
        return new s(this.a, this.f9639b, this.f9640c, true, false);
    }

    public final void d(s sVar, int i2) {
        h.o.c.j.e(sVar, "sink");
        if (!sVar.f9642e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i3 = sVar.f9640c;
        int i4 = i3 + i2;
        if (i4 > 8192) {
            if (sVar.f9641d) {
                throw new IllegalArgumentException();
            }
            int i5 = sVar.f9639b;
            if (i4 - i5 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sVar.a;
            h.l.c.c(bArr, bArr, 0, i5, i3, 2);
            sVar.f9640c -= sVar.f9639b;
            sVar.f9639b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = sVar.a;
        int i6 = sVar.f9640c;
        int i7 = this.f9639b;
        h.l.c.b(bArr2, bArr3, i6, i7, i7 + i2);
        sVar.f9640c += i2;
        this.f9639b += i2;
    }
}
