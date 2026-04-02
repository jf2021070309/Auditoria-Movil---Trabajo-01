package c.c0.d0.p.b;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c.c0.d0.l;
import c.c0.d0.t.j;
import c.c0.d0.t.m;
import c.c0.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class e implements c.c0.d0.b {
    public static final String a = r.e("SystemAlarmDispatcher");

    /* renamed from: b  reason: collision with root package name */
    public final Context f1431b;

    /* renamed from: c  reason: collision with root package name */
    public final c.c0.d0.t.t.a f1432c;

    /* renamed from: d  reason: collision with root package name */
    public final c.c0.d0.t.r f1433d;

    /* renamed from: e  reason: collision with root package name */
    public final c.c0.d0.d f1434e;

    /* renamed from: f  reason: collision with root package name */
    public final l f1435f;

    /* renamed from: g  reason: collision with root package name */
    public final c.c0.d0.p.b.b f1436g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f1437h;

    /* renamed from: i  reason: collision with root package name */
    public final List<Intent> f1438i;

    /* renamed from: j  reason: collision with root package name */
    public Intent f1439j;

    /* renamed from: k  reason: collision with root package name */
    public c f1440k;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f1438i) {
                e eVar2 = e.this;
                eVar2.f1439j = eVar2.f1438i.get(0);
            }
            Intent intent = e.this.f1439j;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f1439j.getIntExtra("KEY_START_ID", 0);
                r c2 = r.c();
                String str = e.a;
                c2.a(str, String.format("Processing command %s, %s", e.this.f1439j, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock a = m.a(e.this.f1431b, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    r.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, a), new Throwable[0]);
                    a.acquire();
                    e eVar3 = e.this;
                    eVar3.f1436g.e(eVar3.f1439j, intExtra, eVar3);
                    r.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, a), new Throwable[0]);
                    a.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        r c3 = r.c();
                        String str2 = e.a;
                        c3.b(str2, "Unexpected error in onHandleIntent", th);
                        r.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, a), new Throwable[0]);
                        a.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        r.c().a(e.a, String.format("Releasing operation wake lock (%s) %s", action, a), new Throwable[0]);
                        a.release();
                        e eVar4 = e.this;
                        eVar4.f1437h.post(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.f1437h.post(dVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {
        public final e a;

        /* renamed from: b  reason: collision with root package name */
        public final Intent f1441b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1442c;

        public b(e eVar, Intent intent, int i2) {
            this.a = eVar;
            this.f1441b = intent;
            this.f1442c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.f1441b, this.f1442c);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public static class d implements Runnable {
        public final e a;

        public d(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            e eVar = this.a;
            Objects.requireNonNull(eVar);
            r c2 = r.c();
            String str = e.a;
            c2.a(str, "Checking if commands are complete.", new Throwable[0]);
            eVar.b();
            synchronized (eVar.f1438i) {
                boolean z2 = true;
                if (eVar.f1439j != null) {
                    r.c().a(str, String.format("Removing command %s", eVar.f1439j), new Throwable[0]);
                    if (!eVar.f1438i.remove(0).equals(eVar.f1439j)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    eVar.f1439j = null;
                }
                j jVar = ((c.c0.d0.t.t.b) eVar.f1432c).a;
                c.c0.d0.p.b.b bVar = eVar.f1436g;
                synchronized (bVar.f1417d) {
                    z = !bVar.f1416c.isEmpty();
                }
                if (!z && eVar.f1438i.isEmpty()) {
                    synchronized (jVar.f1541c) {
                        if (jVar.a.isEmpty()) {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                        r.c().a(str, "No more commands & intents.", new Throwable[0]);
                        c cVar = eVar.f1440k;
                        if (cVar != null) {
                            ((SystemAlarmService) cVar).b();
                        }
                    }
                }
                if (!eVar.f1438i.isEmpty()) {
                    eVar.e();
                }
            }
        }
    }

    public e(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f1431b = applicationContext;
        this.f1436g = new c.c0.d0.p.b.b(applicationContext);
        this.f1433d = new c.c0.d0.t.r();
        l c2 = l.c(context);
        this.f1435f = c2;
        c.c0.d0.d dVar = c2.f1375i;
        this.f1434e = dVar;
        this.f1432c = c2.f1373g;
        dVar.a(this);
        this.f1438i = new ArrayList();
        this.f1439j = null;
        this.f1437h = new Handler(Looper.getMainLooper());
    }

    public boolean a(Intent intent, int i2) {
        boolean z;
        r c2 = r.c();
        String str = a;
        c2.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i2)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            r.c().f(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.f1438i) {
                Iterator<Intent> it = this.f1438i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if ("ACTION_CONSTRAINTS_CHANGED".equals(it.next().getAction())) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                return false;
            }
        }
        intent.putExtra("KEY_START_ID", i2);
        synchronized (this.f1438i) {
            boolean z2 = this.f1438i.isEmpty() ? false : true;
            this.f1438i.add(intent);
            if (!z2) {
                e();
            }
        }
        return true;
    }

    public final void b() {
        if (this.f1437h.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public void c() {
        r.c().a(a, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f1434e.e(this);
        c.c0.d0.t.r rVar = this.f1433d;
        if (!rVar.f1570c.isShutdown()) {
            rVar.f1570c.shutdownNow();
        }
        this.f1440k = null;
    }

    @Override // c.c0.d0.b
    public void d(String str, boolean z) {
        Context context = this.f1431b;
        String str2 = c.c0.d0.p.b.b.a;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        this.f1437h.post(new b(this, intent, 0));
    }

    public final void e() {
        b();
        PowerManager.WakeLock a2 = m.a(this.f1431b, "ProcessCommand");
        try {
            a2.acquire();
            c.c0.d0.t.t.a aVar = this.f1435f.f1373g;
            ((c.c0.d0.t.t.b) aVar).a.execute(new a());
        } finally {
            a2.release();
        }
    }
}
