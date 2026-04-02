package i.a.h2.w;

import h.k;
import i.a.h2.w.d;
import java.util.Arrays;
/* loaded from: classes2.dex */
public abstract class b<S extends d<?>> {
    public S[] a;

    /* renamed from: b  reason: collision with root package name */
    public int f9050b;

    /* renamed from: c  reason: collision with root package name */
    public int f9051c;

    public final S c() {
        S s;
        synchronized (this) {
            S[] sArr = this.a;
            if (sArr == null) {
                sArr = e(2);
                this.a = sArr;
            } else if (this.f9050b >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                h.o.c.j.d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                this.a = (S[]) ((d[]) copyOf);
                sArr = (S[]) ((d[]) copyOf);
            }
            int i2 = this.f9051c;
            do {
                s = sArr[i2];
                if (s == null) {
                    s = d();
                    sArr[i2] = s;
                }
                i2++;
                if (i2 >= sArr.length) {
                    i2 = 0;
                }
            } while (!s.a(this));
            this.f9051c = i2;
            this.f9050b++;
        }
        return s;
    }

    public abstract S d();

    public abstract S[] e(int i2);

    public final void f(S s) {
        int i2;
        h.m.d<k>[] b2;
        synchronized (this) {
            int i3 = this.f9050b - 1;
            this.f9050b = i3;
            i2 = 0;
            if (i3 == 0) {
                this.f9051c = 0;
            }
            b2 = s.b(this);
        }
        int length = b2.length;
        while (i2 < length) {
            h.m.d<k> dVar = b2[i2];
            i2++;
            if (dVar != null) {
                dVar.resumeWith(k.a);
            }
        }
    }
}
