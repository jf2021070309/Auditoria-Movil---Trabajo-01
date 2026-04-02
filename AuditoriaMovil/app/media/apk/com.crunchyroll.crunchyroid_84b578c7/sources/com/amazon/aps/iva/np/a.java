package com.amazon.aps.iva.np;

import com.amazon.aps.iva.aq.m;
import com.amazon.aps.iva.kp.h;
import com.amazon.aps.iva.yb0.j;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* compiled from: DataUploadRunnable.kt */
/* loaded from: classes2.dex */
public final class a implements Runnable {
    public final ScheduledThreadPoolExecutor b;
    public final com.amazon.aps.iva.sp.b c;
    public final com.amazon.aps.iva.qp.c d;
    public final com.amazon.aps.iva.rp.c e;
    public final m f;
    public long g;
    public final long h;
    public final long i;

    public a(h hVar, com.amazon.aps.iva.qp.c cVar, com.amazon.aps.iva.rp.c cVar2, com.amazon.aps.iva.sp.b bVar, m mVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        j.f(bVar, "reader");
        j.f(cVar, "dataUploader");
        j.f(cVar2, "networkInfoProvider");
        j.f(mVar, "systemInfoProvider");
        j.f(hVar, "uploadFrequency");
        this.b = scheduledThreadPoolExecutor;
        this.c = bVar;
        this.d = cVar;
        this.e = cVar2;
        this.f = mVar;
        this.g = hVar.getBaseStepMs$dd_sdk_android_release() * 5;
        this.h = hVar.getBaseStepMs$dd_sdk_android_release() * 1;
        this.i = hVar.getBaseStepMs$dd_sdk_android_release() * 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            com.amazon.aps.iva.rp.c r0 = r8.e
            com.amazon.aps.iva.eq.a r0 = r0.g()
            com.amazon.aps.iva.eq.a$b r0 = r0.a
            com.amazon.aps.iva.eq.a$b r1 = com.amazon.aps.iva.eq.a.b.NETWORK_NOT_CONNECTED
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r3
        L11:
            com.amazon.aps.iva.sp.b r1 = r8.c
            if (r0 == 0) goto L3c
            com.amazon.aps.iva.aq.m r0 = r8.f
            com.amazon.aps.iva.aq.l r0 = r0.d()
            boolean r4 = r0.a
            if (r4 != 0) goto L2c
            boolean r4 = r0.d
            if (r4 != 0) goto L2c
            r4 = 10
            int r5 = r0.b
            if (r5 <= r4) goto L2a
            goto L2c
        L2a:
            r4 = r3
            goto L2d
        L2c:
            r4 = r2
        L2d:
            if (r4 == 0) goto L34
            boolean r0 = r0.c
            if (r0 != 0) goto L34
            goto L35
        L34:
            r2 = r3
        L35:
            if (r2 == 0) goto L3c
            com.amazon.aps.iva.sp.a r0 = r1.d()
            goto L3d
        L3c:
            r0 = 0
        L3d:
            long r2 = r8.i
            r4 = 110(0x6e, float:1.54E-43)
            r5 = 100
            if (r0 == 0) goto L77
            byte[] r6 = r0.b
            com.amazon.aps.iva.qp.c r7 = r8.d
            com.amazon.aps.iva.qp.f r6 = r7.c(r6)
            boolean r6 = r6.getShouldRetry()
            if (r6 == 0) goto L63
            r1.c(r0)
            long r0 = r8.g
            long r6 = (long) r4
            long r0 = r0 * r6
            long r4 = (long) r5
            long r0 = r0 / r4
            long r0 = java.lang.Math.min(r2, r0)
            r8.g = r0
            goto L83
        L63:
            r1.b(r0)
            long r0 = r8.g
            r2 = 90
            long r2 = (long) r2
            long r0 = r0 * r2
            long r2 = (long) r5
            long r0 = r0 / r2
            long r2 = r8.h
            long r0 = java.lang.Math.max(r2, r0)
            r8.g = r0
            goto L83
        L77:
            long r0 = r8.g
            long r6 = (long) r4
            long r0 = r0 * r6
            long r4 = (long) r5
            long r0 = r0 / r4
            long r0 = java.lang.Math.min(r2, r0)
            r8.g = r0
        L83:
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r8.b
            r0.remove(r8)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r8.b
            java.lang.String r2 = "Data upload"
            long r3 = r8.g
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6 = r8
            com.amazon.aps.iva.aq.k.C(r1, r2, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.np.a.run():void");
    }
}
