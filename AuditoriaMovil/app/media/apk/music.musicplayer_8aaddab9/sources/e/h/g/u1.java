package e.h.g;

import android.os.PowerManager;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes2.dex */
public class u1 {
    public PowerManager.WakeLock a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8391c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8392d;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f8390b = new ReentrantLock(true);

    /* renamed from: e  reason: collision with root package name */
    public int f8393e = -1;

    public u1(String str) {
        this.f8392d = str;
    }

    public void a(long j2) {
        PowerManager powerManager;
        ReentrantLock reentrantLock = this.f8390b;
        reentrantLock.lock();
        try {
            boolean z = this.f8391c;
            if (!z) {
                if (this.a == null && !z && (powerManager = (PowerManager) x0.f8405d.getSystemService("power")) != null) {
                    int i2 = this.f8393e;
                    if (i2 == -1) {
                        i2 = 1;
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i2, this.f8392d);
                    this.a = newWakeLock;
                    if (newWakeLock != null) {
                        newWakeLock.setReferenceCounted(false);
                    }
                }
                this.a.acquire(j2);
                int i3 = t1.a;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void b() {
        ReentrantLock reentrantLock = this.f8390b;
        reentrantLock.lock();
        try {
            PowerManager.WakeLock wakeLock = this.a;
            if (!this.f8391c && wakeLock != null) {
                this.f8391c = true;
                this.a = null;
                wakeLock.release();
                int i2 = t1.a;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
