package com.amazon.aps.iva.lp;

import android.content.Context;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.aq.m;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kp.b;
import com.amazon.aps.iva.kp.b.d;
import com.amazon.aps.iva.kp.h;
import com.amazon.aps.iva.sp.g;
import com.amazon.aps.iva.tp.n;
import com.amazon.aps.iva.vp.e;
import com.amazon.aps.iva.vp.f;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: SdkFeature.kt */
/* loaded from: classes2.dex */
public abstract class c<T, C extends b.d> {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public g<T> b = new x();
    public com.amazon.aps.iva.qp.c c = new f1();
    public com.amazon.aps.iva.np.c d = new k();
    public final ArrayList e = new ArrayList();

    public static void e(Context context, String str, com.amazon.aps.iva.iq.a aVar) {
        j.f(aVar, "internalLogger");
        e eVar = new e(aVar);
        n nVar = new n(0);
        ExecutorService c = a.c();
        File filesDir = context.getFilesDir();
        Locale locale = Locale.US;
        String format = String.format(locale, "dd-%s-v2", Arrays.copyOf(new Object[]{str}, 1));
        j.e(format, "format(locale, this, *args)");
        f fVar = new f(new File(filesDir, format), nVar, aVar);
        File cacheDir = context.getCacheDir();
        String format2 = String.format(locale, "dd-%s-v2", Arrays.copyOf(new Object[]{str}, 1));
        j.e(format2, "format(locale, this, *args)");
        f fVar2 = new f(new File(cacheDir, format2), nVar, aVar);
        File b = fVar.b();
        com.amazon.aps.iva.up.d dVar = new com.amazon.aps.iva.up.d(b, fVar2.b(), eVar, aVar);
        com.amazon.aps.iva.up.g gVar = new com.amazon.aps.iva.up.g(b, eVar, aVar);
        try {
            c.submit(dVar);
        } catch (RejectedExecutionException e) {
            com.amazon.aps.iva.iq.a.a(aVar, "Unable to schedule migration on the executor", e, 4);
        }
        try {
            c.submit(gVar);
        } catch (RejectedExecutionException e2) {
            com.amazon.aps.iva.iq.a.a(aVar, "Unable to schedule migration on the executor", e2, 4);
        }
    }

    public abstract g<T> a(Context context, C c);

    public abstract com.amazon.aps.iva.qp.c b(C c);

    public final void c(Context context, C c) {
        com.amazon.aps.iva.np.c kVar;
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.get()) {
            return;
        }
        this.b = a(context, c);
        if (a.u) {
            this.c = b(c);
            com.amazon.aps.iva.sp.b reader = this.b.getReader();
            com.amazon.aps.iva.qp.c cVar = this.c;
            com.amazon.aps.iva.rp.c cVar2 = a.g;
            m mVar = a.h;
            h hVar = a.y;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = a.A;
            if (scheduledThreadPoolExecutor != null) {
                kVar = new com.amazon.aps.iva.np.b(hVar, cVar, cVar2, reader, mVar, scheduledThreadPoolExecutor);
            } else {
                j.m("uploadExecutorService");
                throw null;
            }
        } else {
            kVar = new k();
        }
        this.d = kVar;
        kVar.c();
        List<com.amazon.aps.iva.qq.b> a = c.a();
        String str = a.w;
        String str2 = a.q;
        com.amazon.aps.iva.rq.a f = a.j.f();
        j.f(str, "envName");
        j.f(str2, "serviceName");
        j.f(f, "trackingConsent");
        com.amazon.aps.iva.xp.a aVar = a.j;
        for (com.amazon.aps.iva.qq.b bVar : a) {
            this.e.add(bVar);
            bVar.d();
            aVar.d(bVar);
        }
        f(context, c);
        atomicBoolean.set(true);
        g(context);
    }

    public final boolean d() {
        return this.a.get();
    }

    public void f(Context context, C c) {
    }

    public void g(Context context) {
    }

    public void h() {
    }

    public final void i() {
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.get()) {
            ArrayList arrayList = this.e;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.amazon.aps.iva.qq.b) it.next()).unregister();
            }
            arrayList.clear();
            this.d.b();
            this.b = new x();
            this.d = new k();
            h();
            atomicBoolean.set(false);
        }
    }
}
