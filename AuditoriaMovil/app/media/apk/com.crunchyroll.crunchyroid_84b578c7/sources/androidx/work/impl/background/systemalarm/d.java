package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.l9.k;
import com.amazon.aps.iva.u9.j;
import com.amazon.aps.iva.u9.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: SystemAlarmDispatcher.java */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.l9.b {
    public static final /* synthetic */ int l = 0;
    public final Context b;
    public final com.amazon.aps.iva.w9.a c;
    public final s d;
    public final com.amazon.aps.iva.l9.d e;
    public final k f;
    public final androidx.work.impl.background.systemalarm.a g;
    public final Handler h;
    public final ArrayList i;
    public Intent j;
    public c k;

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar;
            RunnableC0063d runnableC0063d;
            synchronized (d.this.i) {
                d dVar2 = d.this;
                dVar2.j = (Intent) dVar2.i.get(0);
            }
            Intent intent = d.this.j;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.j.getIntExtra("KEY_START_ID", 0);
                m c = m.c();
                int i = d.l;
                String.format("Processing command %s, %s", d.this.j, Integer.valueOf(intExtra));
                c.a(new Throwable[0]);
                PowerManager.WakeLock a = com.amazon.aps.iva.u9.m.a(d.this.b, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    m c2 = m.c();
                    String.format("Acquiring operation wake lock (%s) %s", action, a);
                    c2.a(new Throwable[0]);
                    a.acquire();
                    d dVar3 = d.this;
                    dVar3.g.c(intExtra, dVar3.j, dVar3);
                    m c3 = m.c();
                    String.format("Releasing operation wake lock (%s) %s", action, a);
                    c3.a(new Throwable[0]);
                    a.release();
                    dVar = d.this;
                    runnableC0063d = new RunnableC0063d(dVar);
                } catch (Throwable th) {
                    try {
                        m c4 = m.c();
                        int i2 = d.l;
                        c4.b(th);
                        m c5 = m.c();
                        String.format("Releasing operation wake lock (%s) %s", action, a);
                        c5.a(new Throwable[0]);
                        a.release();
                        dVar = d.this;
                        runnableC0063d = new RunnableC0063d(dVar);
                    } catch (Throwable th2) {
                        m c6 = m.c();
                        int i3 = d.l;
                        String.format("Releasing operation wake lock (%s) %s", action, a);
                        c6.a(new Throwable[0]);
                        a.release();
                        d dVar4 = d.this;
                        dVar4.d(new RunnableC0063d(dVar4));
                        throw th2;
                    }
                }
                dVar.d(runnableC0063d);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {
        public final d b;
        public final Intent c;
        public final int d;

        public b(int i, Intent intent, d dVar) {
            this.b = dVar;
            this.c = intent;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.a(this.d, this.c);
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* renamed from: androidx.work.impl.background.systemalarm.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0063d implements Runnable {
        public final d b;

        public RunnableC0063d(d dVar) {
            this.b = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            d dVar = this.b;
            dVar.getClass();
            m c = m.c();
            int i = d.l;
            c.a(new Throwable[0]);
            dVar.b();
            synchronized (dVar.i) {
                boolean z2 = true;
                if (dVar.j != null) {
                    m c2 = m.c();
                    String.format("Removing command %s", dVar.j);
                    c2.a(new Throwable[0]);
                    if (((Intent) dVar.i.remove(0)).equals(dVar.j)) {
                        dVar.j = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                j jVar = ((com.amazon.aps.iva.w9.b) dVar.c).a;
                androidx.work.impl.background.systemalarm.a aVar = dVar.g;
                synchronized (aVar.d) {
                    if (!aVar.c.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z && dVar.i.isEmpty()) {
                    synchronized (jVar.d) {
                        if (jVar.b.isEmpty()) {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                        m.c().a(new Throwable[0]);
                        c cVar = dVar.k;
                        if (cVar != null) {
                            ((SystemAlarmService) cVar).r();
                        }
                    }
                }
                if (!dVar.i.isEmpty()) {
                    dVar.e();
                }
            }
        }
    }

    static {
        m.e("SystemAlarmDispatcher");
    }

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.g = new androidx.work.impl.background.systemalarm.a(applicationContext);
        this.d = new s();
        k c2 = k.c(context);
        this.f = c2;
        com.amazon.aps.iva.l9.d dVar = c2.f;
        this.e = dVar;
        this.c = c2.d;
        dVar.a(this);
        this.i = new ArrayList();
        this.j = null;
        this.h = new Handler(Looper.getMainLooper());
    }

    public final void a(int i, Intent intent) {
        m c2 = m.c();
        String.format("Adding command %s (%s)", intent, Integer.valueOf(i));
        boolean z = false;
        c2.a(new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            m.c().f(new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.i) {
                Iterator it = this.i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.i) {
            boolean z2 = !this.i.isEmpty();
            this.i.add(intent);
            if (!z2) {
                e();
            }
        }
    }

    public final void b() {
        if (this.h.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    public final void c() {
        m.c().a(new Throwable[0]);
        com.amazon.aps.iva.l9.d dVar = this.e;
        synchronized (dVar.l) {
            dVar.k.remove(this);
        }
        ScheduledExecutorService scheduledExecutorService = this.d.a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.k = null;
    }

    public final void d(Runnable runnable) {
        this.h.post(runnable);
    }

    public final void e() {
        b();
        PowerManager.WakeLock a2 = com.amazon.aps.iva.u9.m.a(this.b, "ProcessCommand");
        try {
            a2.acquire();
            ((com.amazon.aps.iva.w9.b) this.f.d).a(new a());
        } finally {
            a2.release();
        }
    }

    @Override // com.amazon.aps.iva.l9.b
    public final void f(String str, boolean z) {
        int i = androidx.work.impl.background.systemalarm.a.e;
        Intent intent = new Intent(this.b, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        d(new b(0, intent, this));
    }
}
