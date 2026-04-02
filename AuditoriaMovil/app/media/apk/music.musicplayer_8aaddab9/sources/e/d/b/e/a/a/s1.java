package e.d.b.e.a.a;

import java.util.Arrays;
/* loaded from: classes2.dex */
public final class s1 {
    public byte[] a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    public int f6933b;

    /* renamed from: c  reason: collision with root package name */
    public long f6934c;

    /* renamed from: d  reason: collision with root package name */
    public long f6935d;

    /* renamed from: e  reason: collision with root package name */
    public int f6936e;

    /* renamed from: f  reason: collision with root package name */
    public int f6937f;

    /* renamed from: g  reason: collision with root package name */
    public int f6938g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6939h;

    /* renamed from: i  reason: collision with root package name */
    public String f6940i;

    public s1() {
        d();
    }

    public final int a(int i2, byte[] bArr, int i3, int i4) {
        int i5 = this.f6933b;
        if (i5 < i2) {
            int min = Math.min(i4, i2 - i5);
            System.arraycopy(bArr, i3, this.a, this.f6933b, min);
            int i6 = this.f6933b + min;
            this.f6933b = i6;
            if (i6 < i2) {
                return -1;
            }
            return min;
        }
        return 0;
    }

    public final int b(byte[] bArr, int i2, int i3) {
        int a = a(30, bArr, i2, i3);
        if (a != -1) {
            if (this.f6934c == -1) {
                long l2 = e.d.b.d.a.l(this.a, 0);
                this.f6934c = l2;
                if (l2 == 67324752) {
                    this.f6939h = false;
                    this.f6935d = e.d.b.d.a.l(this.a, 18);
                    this.f6938g = e.d.b.d.a.n(this.a, 8);
                    this.f6936e = e.d.b.d.a.n(this.a, 26);
                    int n2 = this.f6936e + 30 + e.d.b.d.a.n(this.a, 28);
                    this.f6937f = n2;
                    int length = this.a.length;
                    if (length < n2) {
                        do {
                            length += length;
                        } while (length < n2);
                        this.a = Arrays.copyOf(this.a, length);
                    }
                } else {
                    this.f6939h = true;
                }
            }
            int a2 = a(this.f6937f, bArr, i2 + a, i3 - a);
            if (a2 == -1) {
                return -1;
            }
            int i4 = a + a2;
            if (!this.f6939h && this.f6940i == null) {
                this.f6940i = new String(this.a, 30, this.f6936e);
            }
            return i4;
        }
        return -1;
    }

    public final m2 c() {
        int i2 = this.f6933b;
        int i3 = this.f6937f;
        if (i2 < i3) {
            return new m2(this.f6940i, this.f6935d, this.f6938g, true, this.f6939h, Arrays.copyOf(this.a, i2));
        }
        m2 m2Var = new m2(this.f6940i, this.f6935d, this.f6938g, false, this.f6939h, Arrays.copyOf(this.a, i3));
        d();
        return m2Var;
    }

    public final void d() {
        this.f6933b = 0;
        this.f6936e = -1;
        this.f6934c = -1L;
        this.f6939h = false;
        this.f6937f = 30;
        this.f6935d = -1L;
        this.f6938g = -1;
        this.f6940i = null;
    }
}
