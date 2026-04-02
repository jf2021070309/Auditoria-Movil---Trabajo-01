package com.amazon.aps.iva.fq;

import android.content.Context;
import com.amazon.aps.iva.kp.b;
import com.amazon.aps.iva.sp.g;
import com.google.android.gms.measurement.AppMeasurement;
import java.lang.Thread;
/* compiled from: CrashReportsFeature.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.lp.c<com.amazon.aps.iva.pq.a, b.d.a> {
    public static final b f = new b();
    public static Thread.UncaughtExceptionHandler g = Thread.getDefaultUncaughtExceptionHandler();

    @Override // com.amazon.aps.iva.lp.c
    public final g<com.amazon.aps.iva.pq.a> a(Context context, b.d.a aVar) {
        return new a(com.amazon.aps.iva.lp.a.j, context, com.amazon.aps.iva.lp.a.c(), com.amazon.aps.iva.dq.c.a);
    }

    @Override // com.amazon.aps.iva.lp.c
    public final com.amazon.aps.iva.qp.c b(b.d.a aVar) {
        return new com.amazon.aps.iva.nq.a(aVar.a, com.amazon.aps.iva.lp.a.n, com.amazon.aps.iva.lp.a.r, com.amazon.aps.iva.lp.a.s, com.amazon.aps.iva.lp.a.b(), com.amazon.aps.iva.lp.a.a(), com.amazon.aps.iva.dq.c.a);
    }

    @Override // com.amazon.aps.iva.lp.c
    public final void f(Context context, b.d.a aVar) {
        g = Thread.getDefaultUncaughtExceptionHandler();
        c cVar = new c(new com.amazon.aps.iva.kq.b(com.amazon.aps.iva.lp.a.q, AppMeasurement.CRASH_ORIGIN, com.amazon.aps.iva.lp.a.g, com.amazon.aps.iva.lp.a.k, com.amazon.aps.iva.lp.a.i, com.amazon.aps.iva.lp.a.s, com.amazon.aps.iva.lp.a.w, com.amazon.aps.iva.lp.a.x, com.amazon.aps.iva.lp.a.p), this.b.b(), context);
        cVar.d = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(cVar);
    }

    @Override // com.amazon.aps.iva.lp.c
    public final void g(Context context) {
        com.amazon.aps.iva.lp.c.e(context, AppMeasurement.CRASH_ORIGIN, com.amazon.aps.iva.dq.c.a);
    }

    @Override // com.amazon.aps.iva.lp.c
    public final void h() {
        Thread.setDefaultUncaughtExceptionHandler(g);
    }
}
