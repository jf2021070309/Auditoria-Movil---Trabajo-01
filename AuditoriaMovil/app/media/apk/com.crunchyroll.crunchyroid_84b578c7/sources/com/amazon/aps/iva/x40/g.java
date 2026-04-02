package com.amazon.aps.iva.x40;

import com.amazon.aps.iva.t50.c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: StartupAnalytics.kt */
/* loaded from: classes2.dex */
public final class g implements f {
    public final com.amazon.aps.iva.ds.a a;
    public final com.amazon.aps.iva.t50.c b;
    public final AtomicBoolean c;
    public long d;

    public g() {
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        c.a aVar = c.a.a;
        this.a = cVar;
        this.b = aVar;
        this.c = new AtomicBoolean(true);
    }

    @Override // com.amazon.aps.iva.x40.f
    public final void a() {
        if (this.c.getAndSet(false)) {
            this.a.c(new com.amazon.aps.iva.es.j("Splash", defpackage.i.t(defpackage.i.d, ((float) (this.b.a() - this.d)) / ((float) TimeUnit.SECONDS.toMillis(1L)), null, null, null, null, 50)));
        }
    }

    @Override // com.amazon.aps.iva.x40.f
    public final void b() {
        this.a.c(new com.amazon.aps.iva.es.j(com.amazon.aps.iva.ls.a.LAUNCH_DOWNLOADS, new com.amazon.aps.iva.is.a[0]));
    }

    @Override // com.amazon.aps.iva.x40.f
    public final void c() {
        this.d = this.b.a();
    }
}
