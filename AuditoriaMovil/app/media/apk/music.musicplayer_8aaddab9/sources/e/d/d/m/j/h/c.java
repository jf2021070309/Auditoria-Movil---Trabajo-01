package e.d.d.m.j.h;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class c implements b, a {
    public final e a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7145b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public CountDownLatch f7146c;

    public c(e eVar, int i2, TimeUnit timeUnit) {
        this.a = eVar;
    }

    @Override // e.d.d.m.j.h.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f7145b) {
            e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
            String str2 = "Logging event " + str + " to Firebase Analytics with params " + bundle;
            fVar.a(2);
            this.f7146c = new CountDownLatch(1);
            this.a.a.c("clx", str, bundle);
            fVar.a(2);
            try {
                if (this.f7146c.await(500, TimeUnit.MILLISECONDS)) {
                    fVar.a(2);
                } else {
                    fVar.d("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                e.d.d.m.j.f.a.b("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f7146c = null;
        }
    }

    @Override // e.d.d.m.j.h.b
    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f7146c;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
