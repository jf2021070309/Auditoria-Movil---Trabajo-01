package com.amazon.aps.iva.l9;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.amazon.aps.iva.l9.n;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
/* compiled from: Processor.java */
/* loaded from: classes.dex */
public final class d implements b, com.amazon.aps.iva.s9.a {
    public static final /* synthetic */ int m = 0;
    public final Context c;
    public final androidx.work.a d;
    public final com.amazon.aps.iva.w9.a e;
    public final WorkDatabase f;
    public final List<e> i;
    public final HashMap h = new HashMap();
    public final HashMap g = new HashMap();
    public final HashSet j = new HashSet();
    public final ArrayList k = new ArrayList();
    public PowerManager.WakeLock b = null;
    public final Object l = new Object();

    /* compiled from: Processor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public final b b;
        public final String c;
        public final ListenableFuture<Boolean> d;

        public a(b bVar, String str, com.amazon.aps.iva.v9.c cVar) {
            this.b = bVar;
            this.c = str;
            this.d = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                z = this.d.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.b.f(this.c, z);
        }
    }

    static {
        com.amazon.aps.iva.k9.m.e("Processor");
    }

    public d(Context context, androidx.work.a aVar, com.amazon.aps.iva.w9.b bVar, WorkDatabase workDatabase, List list) {
        this.c = context;
        this.d = aVar;
        this.e = bVar;
        this.f = workDatabase;
        this.i = list;
    }

    public static boolean b(String str, n nVar) {
        boolean z;
        if (nVar != null) {
            nVar.t = true;
            nVar.i();
            ListenableFuture<ListenableWorker.a> listenableFuture = nVar.s;
            if (listenableFuture != null) {
                z = listenableFuture.isDone();
                nVar.s.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = nVar.g;
            if (listenableWorker != null && !z) {
                listenableWorker.stop();
            } else {
                String.format("WorkSpec %s is already done. Not interrupting.", nVar.f);
                com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
                int i = n.u;
                c.a(new Throwable[0]);
            }
            com.amazon.aps.iva.k9.m c2 = com.amazon.aps.iva.k9.m.c();
            String.format("WorkerWrapper interrupted for %s", str);
            c2.a(new Throwable[0]);
            return true;
        }
        com.amazon.aps.iva.k9.m c3 = com.amazon.aps.iva.k9.m.c();
        String.format("WorkerWrapper could not be found for %s", str);
        c3.a(new Throwable[0]);
        return false;
    }

    public final void a(b bVar) {
        synchronized (this.l) {
            this.k.add(bVar);
        }
    }

    public final boolean c(String str) {
        boolean z;
        synchronized (this.l) {
            if (!this.h.containsKey(str) && !this.g.containsKey(str)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    public final void d(String str, com.amazon.aps.iva.k9.g gVar) {
        synchronized (this.l) {
            com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
            String.format("Moving WorkSpec (%s) to the foreground", str);
            c.d(new Throwable[0]);
            n nVar = (n) this.h.remove(str);
            if (nVar != null) {
                if (this.b == null) {
                    PowerManager.WakeLock a2 = com.amazon.aps.iva.u9.m.a(this.c, "ProcessorForegroundLck");
                    this.b = a2;
                    a2.acquire();
                }
                this.g.put(str, nVar);
                com.amazon.aps.iva.d3.a.startForegroundService(this.c, androidx.work.impl.foreground.a.b(this.c, str, gVar));
            }
        }
    }

    public final boolean e(String str, WorkerParameters.a aVar) {
        synchronized (this.l) {
            if (c(str)) {
                com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
                String.format("Work %s is already enqueued for processing", str);
                c.a(new Throwable[0]);
                return false;
            }
            n.a aVar2 = new n.a(this.c, this.d, this.e, this, this.f, str);
            aVar2.g = this.i;
            if (aVar != null) {
                aVar2.h = aVar;
            }
            n nVar = new n(aVar2);
            com.amazon.aps.iva.v9.c<Boolean> cVar = nVar.r;
            cVar.addListener(new a(this, str, cVar), ((com.amazon.aps.iva.w9.b) this.e).c);
            this.h.put(str, nVar);
            ((com.amazon.aps.iva.w9.b) this.e).a.execute(nVar);
            com.amazon.aps.iva.k9.m c2 = com.amazon.aps.iva.k9.m.c();
            String.format("%s: processing %s", d.class.getSimpleName(), str);
            c2.a(new Throwable[0]);
            return true;
        }
    }

    @Override // com.amazon.aps.iva.l9.b
    public final void f(String str, boolean z) {
        synchronized (this.l) {
            this.h.remove(str);
            com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
            String.format("%s %s executed; reschedule = %s", d.class.getSimpleName(), str, Boolean.valueOf(z));
            c.a(new Throwable[0]);
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((b) it.next()).f(str, z);
            }
        }
    }

    public final void g() {
        synchronized (this.l) {
            if (!(!this.g.isEmpty())) {
                Context context = this.c;
                int i = androidx.work.impl.foreground.a.k;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                this.c.startService(intent);
                PowerManager.WakeLock wakeLock = this.b;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.b = null;
                }
            }
        }
    }

    public final boolean h(String str) {
        boolean b;
        synchronized (this.l) {
            com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
            String.format("Processor stopping foreground work %s", str);
            c.a(new Throwable[0]);
            b = b(str, (n) this.g.remove(str));
        }
        return b;
    }

    public final boolean i(String str) {
        boolean b;
        synchronized (this.l) {
            com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
            String.format("Processor stopping background work %s", str);
            c.a(new Throwable[0]);
            b = b(str, (n) this.h.remove(str));
        }
        return b;
    }
}
