package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q extends f {
    final transient byte[][] f;
    final transient int[] g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(c cVar, int i) {
        super(null);
        u.a(cVar.b, 0L, i);
        o oVar = cVar.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = oVar.c;
            int i6 = oVar.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            oVar = oVar.f;
        }
        this.f = new byte[i4];
        this.g = new int[i4 * 2];
        o oVar2 = cVar.a;
        int i7 = 0;
        while (i2 < i) {
            this.f[i7] = oVar2.a;
            int i8 = (oVar2.c - oVar2.b) + i2;
            i2 = i8 > i ? i : i8;
            int[] iArr = this.g;
            iArr[i7] = i2;
            iArr[this.f.length + i7] = oVar2.b;
            oVar2.d = true;
            i7++;
            oVar2 = oVar2.f;
        }
    }

    private int b(int i) {
        int binarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private f i() {
        return new f(g());
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public byte a(int i) {
        u.a(this.g[this.f.length - 1], i, 1L);
        int b = b(i);
        int i2 = b == 0 ? 0 : this.g[b - 1];
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public f a(int i, int i2) {
        return i().a(i, i2);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public String a() {
        return i().a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public void a(c cVar) {
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            o oVar = new o(this.f[i], i3, (i3 + i4) - i2, true, false);
            o oVar2 = cVar.a;
            if (oVar2 == null) {
                oVar.g = oVar;
                oVar.f = oVar;
                cVar.a = oVar;
            } else {
                oVar2.g.a(oVar);
            }
            i++;
            i2 = i4;
        }
        cVar.b += i2;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public boolean a(int i, f fVar, int i2, int i3) {
        if (i < 0 || i > e() - i3) {
            return false;
        }
        int b = b(i);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.g[b - 1];
            int min = Math.min(i3, ((this.g[b] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr = this.f;
            if (!fVar.a(i2, bArr[b], (i - i4) + iArr[bArr.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > e() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = b(i);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.g[b - 1];
            int min = Math.min(i3, ((this.g[b] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr2 = this.f;
            if (!u.a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public String b() {
        return i().b();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public f c() {
        return i().c();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public f d() {
        return i().d();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public int e() {
        return this.g[this.f.length - 1];
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (fVar.e() != e() || !a(0, fVar, 0, e())) {
                return false;
            }
        }
        return true;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public f f() {
        return i().f();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public byte[] g() {
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public String h() {
        return i().h();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int length = this.f.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f[i2];
            int[] iArr = this.g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            for (int i7 = i5; i7 < (i6 - i4) + i5; i7++) {
                i3 = (i3 * 31) + bArr[i7];
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.f
    public String toString() {
        return i().toString();
    }
}
