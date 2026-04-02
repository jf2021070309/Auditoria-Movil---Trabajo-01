package e.d.d.u.r;

import e.d.d.u.o;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class e {
    public static final long a = TimeUnit.HOURS.toMillis(24);

    /* renamed from: b  reason: collision with root package name */
    public static final long f7622b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c  reason: collision with root package name */
    public final o f7623c = o.c();

    /* renamed from: d  reason: collision with root package name */
    public long f7624d;

    /* renamed from: e  reason: collision with root package name */
    public int f7625e;

    public synchronized boolean a() {
        boolean z;
        if (this.f7625e != 0) {
            z = this.f7623c.a() > this.f7624d;
        }
        return z;
    }

    public synchronized void b(int i2) {
        long min;
        boolean z = false;
        if ((i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404) {
            synchronized (this) {
                this.f7625e = 0;
            }
            return;
        }
        this.f7625e++;
        synchronized (this) {
            if (i2 == 429 || (i2 >= 500 && i2 < 600)) {
                z = true;
            }
            if (z) {
                double pow = Math.pow(2.0d, this.f7625e);
                Objects.requireNonNull(this.f7623c);
                double random = (long) (Math.random() * 1000.0d);
                Double.isNaN(random);
                Double.isNaN(random);
                min = (long) Math.min(pow + random, f7622b);
            } else {
                min = a;
            }
            this.f7624d = this.f7623c.a() + min;
        }
    }
}
