package k;

import java.security.MessageDigest;
/* loaded from: classes2.dex */
public final class u extends h {

    /* renamed from: f  reason: collision with root package name */
    public final transient byte[][] f9648f;

    /* renamed from: g  reason: collision with root package name */
    public final transient int[] f9649g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(byte[][] bArr, int[] iArr) {
        super(h.f9621b.f9622c);
        h.o.c.j.e(bArr, "segments");
        h.o.c.j.e(iArr, "directory");
        this.f9648f = bArr;
        this.f9649g = iArr;
    }

    @Override // k.h
    public boolean B(int i2, byte[] bArr, int i3, int i4) {
        h.o.c.j.e(bArr, "other");
        if (i2 < 0 || i2 > i() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int t0 = e.j.d.w.t0(this, i2);
        while (i2 < i5) {
            int i6 = t0 == 0 ? 0 : this.f9649g[t0 - 1];
            int[] iArr = this.f9649g;
            int i7 = iArr[this.f9648f.length + t0];
            int min = Math.min(i5, (iArr[t0] - i6) + i6) - i2;
            if (!a0.a(this.f9648f[t0], (i2 - i6) + i7, bArr, i3, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            t0++;
        }
        return true;
    }

    @Override // k.h
    public h G() {
        return P().G();
    }

    @Override // k.h
    public byte[] I() {
        byte[] bArr = new byte[i()];
        int length = this.f9648f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f9649g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = i6 - i3;
            h.l.c.b(this.f9648f[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // k.h
    public void M(d dVar, int i2, int i3) {
        h.o.c.j.e(dVar, "buffer");
        int i4 = i2 + i3;
        int t0 = e.j.d.w.t0(this, i2);
        while (i2 < i4) {
            int i5 = t0 == 0 ? 0 : this.f9649g[t0 - 1];
            int[] iArr = this.f9649g;
            int i6 = iArr[this.f9648f.length + t0];
            int min = Math.min(i4, (iArr[t0] - i5) + i5) - i2;
            int i7 = (i2 - i5) + i6;
            s sVar = new s(this.f9648f[t0], i7, i7 + min, true, false);
            s sVar2 = dVar.a;
            if (sVar2 == null) {
                sVar.f9644g = sVar;
                sVar.f9643f = sVar;
                dVar.a = sVar;
            } else {
                h.o.c.j.c(sVar2);
                s sVar3 = sVar2.f9644g;
                h.o.c.j.c(sVar3);
                sVar3.b(sVar);
            }
            i2 += min;
            t0++;
        }
        dVar.f9620b += i3;
    }

    public final h P() {
        return new h(I());
    }

    @Override // k.h
    public String a() {
        return P().a();
    }

    @Override // k.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.i() == i() && z(0, hVar, 0, i())) {
                return true;
            }
        }
        return false;
    }

    @Override // k.h
    public h f(String str) {
        h.o.c.j.e(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = this.f9648f.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f9649g;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            messageDigest.update(this.f9648f[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] digest = messageDigest.digest();
        h.o.c.j.d(digest, "digestBytes");
        return new h(digest);
    }

    @Override // k.h
    public int hashCode() {
        int i2 = this.f9623d;
        if (i2 != 0) {
            return i2;
        }
        int length = this.f9648f.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.f9649g;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            byte[] bArr = this.f9648f[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.f9623d = i4;
        return i4;
    }

    @Override // k.h
    public int i() {
        return this.f9649g[this.f9648f.length - 1];
    }

    @Override // k.h
    public String t() {
        return P().t();
    }

    @Override // k.h
    public String toString() {
        return P().toString();
    }

    @Override // k.h
    public byte[] u() {
        return I();
    }

    @Override // k.h
    public byte v(int i2) {
        a0.b(this.f9649g[this.f9648f.length - 1], i2, 1L);
        int t0 = e.j.d.w.t0(this, i2);
        int i3 = t0 == 0 ? 0 : this.f9649g[t0 - 1];
        int[] iArr = this.f9649g;
        byte[][] bArr = this.f9648f;
        return bArr[t0][(i2 - i3) + iArr[bArr.length + t0]];
    }

    @Override // k.h
    public boolean z(int i2, h hVar, int i3, int i4) {
        h.o.c.j.e(hVar, "other");
        if (i2 < 0 || i2 > i() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int t0 = e.j.d.w.t0(this, i2);
        while (i2 < i5) {
            int i6 = t0 == 0 ? 0 : this.f9649g[t0 - 1];
            int[] iArr = this.f9649g;
            int i7 = iArr[this.f9648f.length + t0];
            int min = Math.min(i5, (iArr[t0] - i6) + i6) - i2;
            if (!hVar.B(i3, this.f9648f[t0], (i2 - i6) + i7, min)) {
                return false;
            }
            i3 += min;
            i2 += min;
            t0++;
        }
        return true;
    }
}
