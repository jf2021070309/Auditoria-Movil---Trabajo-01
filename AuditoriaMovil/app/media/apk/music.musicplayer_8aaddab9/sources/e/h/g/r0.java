package e.h.g;

import e.h.g.q0;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class r0 {
    public long a = System.nanoTime();

    /* loaded from: classes.dex */
    public interface a {
        boolean a();
    }

    public static boolean d(a aVar) {
        q0.b bVar = q0.f8373b;
        return e(aVar, 100, 300);
    }

    public static boolean e(a aVar, int i2, int i3) {
        boolean a2;
        boolean a3 = aVar.a();
        if (a3) {
            return a3;
        }
        r0 r0Var = new r0();
        int i4 = 0;
        do {
            i4++;
            r0Var.g();
            j1.n(i2, r0Var);
            a2 = aVar.a();
            if (a2) {
                break;
            }
        } while (i4 < i3);
        return a2;
    }

    public r0 a(long j2) {
        this.a = (j2 * 1000000) + this.a;
        return this;
    }

    public long b() {
        return (System.nanoTime() - this.a) / 1000000;
    }

    public long c() {
        return (System.nanoTime() - this.a) / 1000000000;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof r0) && this.a == ((r0) obj).a;
    }

    public String f() {
        return b() + "ms";
    }

    public r0 g() {
        this.a = System.nanoTime();
        return this;
    }

    public r0 h() {
        a(-TimeUnit.DAYS.toMillis(365L));
        return this;
    }
}
