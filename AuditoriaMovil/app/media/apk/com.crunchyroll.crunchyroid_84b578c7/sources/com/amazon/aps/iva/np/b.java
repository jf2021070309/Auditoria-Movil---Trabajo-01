package com.amazon.aps.iva.np;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.aq.m;
import com.amazon.aps.iva.kp.h;
import com.amazon.aps.iva.yb0.j;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: DataUploadScheduler.kt */
/* loaded from: classes2.dex */
public final class b implements c {
    public final ScheduledThreadPoolExecutor b;
    public final a c;

    public b(h hVar, com.amazon.aps.iva.qp.c cVar, com.amazon.aps.iva.rp.c cVar2, com.amazon.aps.iva.sp.b bVar, m mVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        j.f(bVar, "reader");
        j.f(cVar, "dataUploader");
        j.f(cVar2, "networkInfoProvider");
        j.f(mVar, "systemInfoProvider");
        j.f(hVar, "uploadFrequency");
        this.b = scheduledThreadPoolExecutor;
        this.c = new a(hVar, cVar, cVar2, bVar, mVar, scheduledThreadPoolExecutor);
    }

    @Override // com.amazon.aps.iva.np.c
    public final void b() {
        this.b.remove(this.c);
    }

    @Override // com.amazon.aps.iva.np.c
    public final void c() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.b;
        a aVar = this.c;
        k.C(scheduledThreadPoolExecutor, "Data upload", aVar.g, TimeUnit.MILLISECONDS, aVar);
    }
}
