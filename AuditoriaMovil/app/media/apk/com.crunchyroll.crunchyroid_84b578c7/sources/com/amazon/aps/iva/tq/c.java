package com.amazon.aps.iva.tq;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.br.a;
import com.amazon.aps.iva.dr.e;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e1.d;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.er.g;
import com.amazon.aps.iva.er.j;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.gr.o;
import com.amazon.aps.iva.gr.q;
import com.amazon.aps.iva.kp.b;
import com.amazon.aps.iva.kp.i;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: RumFeature.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.lp.c<Object, b.d.c> {
    public static float g;
    public static float h;
    public static boolean i;
    public static ExecutorService q;
    public static com.amazon.aps.iva.uq.a r;
    public static final c f = new c();
    public static q j = new z();
    public static e k = new com.amazon.aps.iva.cq.b();
    public static o l = new n();
    public static g m = new d();
    public static g n = new d();
    public static g o = new d();
    public static ScheduledExecutorService p = new com.amazon.aps.iva.bq.a();

    @Override // com.amazon.aps.iva.lp.c
    public final com.amazon.aps.iva.sp.g<Object> a(Context context, b.d.c cVar) {
        com.amazon.aps.iva.xp.a aVar = com.amazon.aps.iva.lp.a.j;
        com.amazon.aps.iva.gq.a<Object> aVar2 = cVar.h;
        ExecutorService c = com.amazon.aps.iva.lp.a.c();
        com.amazon.aps.iva.iq.a aVar3 = com.amazon.aps.iva.dq.c.a;
        int i2 = com.amazon.aps.iva.br.a.r;
        return new com.amazon.aps.iva.vq.c(aVar, context, aVar2, c, aVar3, new File(a.C0152a.a(context), "last_view_event"));
    }

    @Override // com.amazon.aps.iva.lp.c
    public final com.amazon.aps.iva.qp.c b(b.d.c cVar) {
        return new com.amazon.aps.iva.cr.a(cVar.a, com.amazon.aps.iva.lp.a.n, com.amazon.aps.iva.lp.a.r, com.amazon.aps.iva.lp.a.s, com.amazon.aps.iva.lp.a.b(), com.amazon.aps.iva.lp.a.a(), com.amazon.aps.iva.lp.a.p);
    }

    @Override // com.amazon.aps.iva.lp.c
    public final void f(Context context, b.d.c cVar) {
        b.d.c cVar2 = cVar;
        g = cVar2.c;
        h = cVar2.d;
        i = cVar2.i;
        com.amazon.aps.iva.gq.a<Object> aVar = cVar2.h;
        c cVar3 = f;
        q qVar = cVar2.f;
        if (qVar != null) {
            cVar3.getClass();
            j = qVar;
        }
        e eVar = cVar2.e;
        if (eVar != null) {
            cVar3.getClass();
            k = eVar;
        }
        o oVar = cVar2.g;
        if (oVar != null) {
            cVar3.getClass();
            l = oVar;
        }
        i iVar = i.NEVER;
        i iVar2 = cVar2.j;
        if (iVar2 != iVar) {
            m = new com.amazon.aps.iva.er.a();
            n = new com.amazon.aps.iva.er.a();
            o = new com.amazon.aps.iva.er.a();
            long periodInMs$dd_sdk_android_release = iVar2.getPeriodInMs$dd_sdk_android_release();
            p = new ScheduledThreadPoolExecutor(1);
            j jVar = new j(new com.amazon.aps.iva.er.b(), m, p, periodInMs$dd_sdk_android_release);
            ScheduledExecutorService scheduledExecutorService = p;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            k.C(scheduledExecutorService, "Vitals monitoring", periodInMs$dd_sdk_android_release, timeUnit, jVar);
            k.C(p, "Vitals monitoring", periodInMs$dd_sdk_android_release, timeUnit, new j(new com.amazon.aps.iva.er.c(), n, p, periodInMs$dd_sdk_android_release));
            try {
                Choreographer.getInstance().postFrameCallback(new com.amazon.aps.iva.er.d(o, b.h));
            } catch (IllegalStateException e) {
                com.amazon.aps.iva.iq.a.a(com.amazon.aps.iva.dq.c.a, "Unable to initialize the Choreographer FrameCallback", e, 4);
                com.amazon.aps.iva.iq.a.e(com.amazon.aps.iva.dq.c.b, "It seems you initialized the SDK on a thread without a Looper: we won't be able to track your Views' refresh rate.", null, 6);
            }
        }
        r = new com.amazon.aps.iva.uq.a(new Handler(Looper.getMainLooper()));
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        com.amazon.aps.iva.yb0.j.e(newSingleThreadExecutor, "newSingleThreadExecutor()");
        q = newSingleThreadExecutor;
        com.amazon.aps.iva.uq.a aVar2 = r;
        if (aVar2 != null) {
            try {
                newSingleThreadExecutor.execute(aVar2);
            } catch (RejectedExecutionException e2) {
                com.amazon.aps.iva.iq.a aVar3 = com.amazon.aps.iva.dq.c.a;
                String format = String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{"ANR detection"}, 1));
                com.amazon.aps.iva.yb0.j.e(format, "format(locale, this, *args)");
                l1.z(aVar3, format, e2, 4);
            }
            k.d(context);
            j.d(context);
            l.d(context);
            com.amazon.aps.iva.yb0.j.e(context.getApplicationContext(), "context.applicationContext");
            return;
        }
        com.amazon.aps.iva.yb0.j.m("anrDetectorRunnable");
        throw null;
    }

    @Override // com.amazon.aps.iva.lp.c
    public final void g(Context context) {
        com.amazon.aps.iva.lp.c.e(context, "rum", com.amazon.aps.iva.dq.c.a);
    }

    @Override // com.amazon.aps.iva.lp.c
    public final void h() {
        Context context = com.amazon.aps.iva.lp.a.e.get();
        k.a(context);
        j.a(context);
        l.a(context);
        j = new z();
        k = new com.amazon.aps.iva.cq.b();
        l = new n();
        m = new d();
        n = new d();
        o = new d();
        p.shutdownNow();
        ExecutorService executorService = q;
        if (executorService != null) {
            executorService.shutdownNow();
            com.amazon.aps.iva.uq.a aVar = r;
            if (aVar != null) {
                aVar.e = true;
                p = new com.amazon.aps.iva.bq.a();
                return;
            }
            com.amazon.aps.iva.yb0.j.m("anrDetectorRunnable");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("anrDetectorExecutorService");
        throw null;
    }
}
