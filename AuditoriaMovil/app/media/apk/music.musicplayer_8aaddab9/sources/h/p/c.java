package h.p;

import h.o.c.f;
import h.o.c.j;
import java.io.Serializable;
/* loaded from: classes2.dex */
public abstract class c {
    public static final a a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final c f8949b = h.n.b.a.b();

    /* loaded from: classes2.dex */
    public static final class a extends c implements Serializable {
        public a(f fVar) {
        }

        @Override // h.p.c
        public int a(int i2) {
            return c.f8949b.a(i2);
        }

        @Override // h.p.c
        public int b() {
            return c.f8949b.b();
        }

        @Override // h.p.c
        public int f(int i2, int i3) {
            return c.f8949b.f(i2, i3);
        }
    }

    public abstract int a(int i2);

    public abstract int b();

    public int f(int i2, int i3) {
        int b2;
        int i4;
        int i5;
        int b3;
        boolean z;
        if (!(i3 > i2)) {
            Integer valueOf = Integer.valueOf(i2);
            Integer valueOf2 = Integer.valueOf(i3);
            j.e(valueOf, "from");
            j.e(valueOf2, "until");
            throw new IllegalArgumentException(("Random range is empty: [" + valueOf + ", " + valueOf2 + ").").toString());
        }
        int i6 = i3 - i2;
        if (i6 > 0 || i6 == Integer.MIN_VALUE) {
            if (((-i6) & i6) == i6) {
                i5 = a(31 - Integer.numberOfLeadingZeros(i6));
            } else {
                do {
                    b2 = b() >>> 1;
                    i4 = b2 % i6;
                } while ((i6 - 1) + (b2 - i4) < 0);
                i5 = i4;
            }
            return i2 + i5;
        }
        do {
            b3 = b();
            if (i2 > b3 || b3 >= i3) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
        } while (!z);
        return b3;
    }
}
