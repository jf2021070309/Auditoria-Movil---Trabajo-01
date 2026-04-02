package c.c0.d0;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import c.c0.d0.o;
import c.c0.r;
import c.i.d.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public class d implements b, c.c0.d0.r.a {
    public static final String a = r.e("Processor");

    /* renamed from: c  reason: collision with root package name */
    public Context f1338c;

    /* renamed from: d  reason: collision with root package name */
    public c.c0.c f1339d;

    /* renamed from: e  reason: collision with root package name */
    public c.c0.d0.t.t.a f1340e;

    /* renamed from: f  reason: collision with root package name */
    public WorkDatabase f1341f;

    /* renamed from: i  reason: collision with root package name */
    public List<e> f1344i;

    /* renamed from: h  reason: collision with root package name */
    public Map<String, o> f1343h = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public Map<String, o> f1342g = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public Set<String> f1345j = new HashSet();

    /* renamed from: k  reason: collision with root package name */
    public final List<b> f1346k = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public PowerManager.WakeLock f1337b = null;

    /* renamed from: l  reason: collision with root package name */
    public final Object f1347l = new Object();

    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public b a;

        /* renamed from: b  reason: collision with root package name */
        public String f1348b;

        /* renamed from: c  reason: collision with root package name */
        public e.d.c.a.a.a<Boolean> f1349c;

        public a(b bVar, String str, e.d.c.a.a.a<Boolean> aVar) {
            this.a = bVar;
            this.f1348b = str;
            this.f1349c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = this.f1349c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.a.d(this.f1348b, z);
        }
    }

    public d(Context context, c.c0.c cVar, c.c0.d0.t.t.a aVar, WorkDatabase workDatabase, List<e> list) {
        this.f1338c = context;
        this.f1339d = cVar;
        this.f1340e = aVar;
        this.f1341f = workDatabase;
        this.f1344i = list;
    }

    public static boolean b(String str, o oVar) {
        boolean z;
        if (oVar == null) {
            r.c().a(a, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        oVar.t = true;
        oVar.i();
        e.d.c.a.a.a<ListenableWorker.a> aVar = oVar.s;
        if (aVar != null) {
            z = aVar.isDone();
            oVar.s.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = oVar.f1388g;
        if (listenableWorker == null || z) {
            r.c().a(o.a, String.format("WorkSpec %s is already done. Not interrupting.", oVar.f1387f), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        r.c().a(a, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    public void a(b bVar) {
        synchronized (this.f1347l) {
            this.f1346k.add(bVar);
        }
    }

    public boolean c(String str) {
        boolean z;
        synchronized (this.f1347l) {
            z = this.f1343h.containsKey(str) || this.f1342g.containsKey(str);
        }
        return z;
    }

    @Override // c.c0.d0.b
    public void d(String str, boolean z) {
        synchronized (this.f1347l) {
            this.f1343h.remove(str);
            r.c().a(a, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            for (b bVar : this.f1346k) {
                bVar.d(str, z);
            }
        }
    }

    public void e(b bVar) {
        synchronized (this.f1347l) {
            this.f1346k.remove(bVar);
        }
    }

    public void f(String str, c.c0.i iVar) {
        synchronized (this.f1347l) {
            r.c().d(a, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            o remove = this.f1343h.remove(str);
            if (remove != null) {
                if (this.f1337b == null) {
                    PowerManager.WakeLock a2 = c.c0.d0.t.m.a(this.f1338c, "ProcessorForegroundLck");
                    this.f1337b = a2;
                    a2.acquire();
                }
                this.f1342g.put(str, remove);
                Intent c2 = c.c0.d0.r.c.c(this.f1338c, str, iVar);
                Context context = this.f1338c;
                Object obj = c.i.d.a.a;
                if (Build.VERSION.SDK_INT >= 26) {
                    a.f.a(context, c2);
                } else {
                    context.startService(c2);
                }
            }
        }
    }

    public boolean g(String str, WorkerParameters.a aVar) {
        synchronized (this.f1347l) {
            if (c(str)) {
                r.c().a(a, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            o.a aVar2 = new o.a(this.f1338c, this.f1339d, this.f1340e, this, this.f1341f, str);
            aVar2.f1401g = this.f1344i;
            if (aVar != null) {
                aVar2.f1402h = aVar;
            }
            o oVar = new o(aVar2);
            c.c0.d0.t.s.c<Boolean> cVar = oVar.r;
            cVar.a(new a(this, str, cVar), ((c.c0.d0.t.t.b) this.f1340e).f1596c);
            this.f1343h.put(str, oVar);
            ((c.c0.d0.t.t.b) this.f1340e).a.execute(oVar);
            r.c().a(a, String.format("%s: processing %s", d.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public final void h() {
        synchronized (this.f1347l) {
            if (!(!this.f1342g.isEmpty())) {
                Context context = this.f1338c;
                String str = c.c0.d0.r.c.a;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                this.f1338c.startService(intent);
                PowerManager.WakeLock wakeLock = this.f1337b;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f1337b = null;
                }
            }
        }
    }

    public boolean i(String str) {
        boolean b2;
        synchronized (this.f1347l) {
            r.c().a(a, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            b2 = b(str, this.f1342g.remove(str));
        }
        return b2;
    }

    public boolean j(String str) {
        boolean b2;
        synchronized (this.f1347l) {
            r.c().a(a, String.format("Processor stopping background work %s", str), new Throwable[0]);
            b2 = b(str, this.f1343h.remove(str));
        }
        return b2;
    }
}
