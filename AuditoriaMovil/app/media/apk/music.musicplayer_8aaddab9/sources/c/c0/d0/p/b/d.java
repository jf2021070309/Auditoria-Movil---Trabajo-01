package c.c0.d0.p.b;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c.c0.d0.p.b.e;
import c.c0.d0.s.p;
import c.c0.d0.t.m;
import c.c0.d0.t.r;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class d implements c.c0.d0.q.c, c.c0.d0.b, r.b {
    public static final String a = c.c0.r.e("DelayMetCommandHandler");

    /* renamed from: b  reason: collision with root package name */
    public final Context f1422b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1423c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1424d;

    /* renamed from: e  reason: collision with root package name */
    public final e f1425e;

    /* renamed from: f  reason: collision with root package name */
    public final c.c0.d0.q.d f1426f;

    /* renamed from: i  reason: collision with root package name */
    public PowerManager.WakeLock f1429i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1430j = false;

    /* renamed from: h  reason: collision with root package name */
    public int f1428h = 0;

    /* renamed from: g  reason: collision with root package name */
    public final Object f1427g = new Object();

    public d(Context context, int i2, String str, e eVar) {
        this.f1422b = context;
        this.f1423c = i2;
        this.f1425e = eVar;
        this.f1424d = str;
        this.f1426f = new c.c0.d0.q.d(context, eVar.f1432c, this);
    }

    @Override // c.c0.d0.t.r.b
    public void a(String str) {
        c.c0.r.c().a(a, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // c.c0.d0.q.c
    public void b(List<String> list) {
        g();
    }

    public final void c() {
        synchronized (this.f1427g) {
            this.f1426f.c();
            this.f1425e.f1433d.b(this.f1424d);
            PowerManager.WakeLock wakeLock = this.f1429i;
            if (wakeLock != null && wakeLock.isHeld()) {
                c.c0.r.c().a(a, String.format("Releasing wakelock %s for WorkSpec %s", this.f1429i, this.f1424d), new Throwable[0]);
                this.f1429i.release();
            }
        }
    }

    @Override // c.c0.d0.b
    public void d(String str, boolean z) {
        c.c0.r.c().a(a, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        c();
        if (z) {
            Intent c2 = b.c(this.f1422b, this.f1424d);
            e eVar = this.f1425e;
            eVar.f1437h.post(new e.b(eVar, c2, this.f1423c));
        }
        if (this.f1430j) {
            Intent a2 = b.a(this.f1422b);
            e eVar2 = this.f1425e;
            eVar2.f1437h.post(new e.b(eVar2, a2, this.f1423c));
        }
    }

    public void e() {
        this.f1429i = m.a(this.f1422b, String.format("%s (%s)", this.f1424d, Integer.valueOf(this.f1423c)));
        c.c0.r c2 = c.c0.r.c();
        String str = a;
        c2.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f1429i, this.f1424d), new Throwable[0]);
        this.f1429i.acquire();
        p i2 = ((c.c0.d0.s.r) this.f1425e.f1435f.f1372f.q()).i(this.f1424d);
        if (i2 == null) {
            g();
            return;
        }
        boolean b2 = i2.b();
        this.f1430j = b2;
        if (b2) {
            this.f1426f.b(Collections.singletonList(i2));
            return;
        }
        c.c0.r.c().a(str, String.format("No constraints for %s", this.f1424d), new Throwable[0]);
        f(Collections.singletonList(this.f1424d));
    }

    @Override // c.c0.d0.q.c
    public void f(List<String> list) {
        if (list.contains(this.f1424d)) {
            synchronized (this.f1427g) {
                if (this.f1428h == 0) {
                    this.f1428h = 1;
                    c.c0.r.c().a(a, String.format("onAllConstraintsMet for %s", this.f1424d), new Throwable[0]);
                    if (this.f1425e.f1434e.g(this.f1424d, null)) {
                        this.f1425e.f1433d.a(this.f1424d, 600000L, this);
                    } else {
                        c();
                    }
                } else {
                    c.c0.r.c().a(a, String.format("Already started work for %s", this.f1424d), new Throwable[0]);
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f1427g) {
            if (this.f1428h < 2) {
                this.f1428h = 2;
                c.c0.r c2 = c.c0.r.c();
                String str = a;
                c2.a(str, String.format("Stopping work for WorkSpec %s", this.f1424d), new Throwable[0]);
                Context context = this.f1422b;
                String str2 = this.f1424d;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                e eVar = this.f1425e;
                eVar.f1437h.post(new e.b(eVar, intent, this.f1423c));
                if (this.f1425e.f1434e.c(this.f1424d)) {
                    c.c0.r.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f1424d), new Throwable[0]);
                    Intent c3 = b.c(this.f1422b, this.f1424d);
                    e eVar2 = this.f1425e;
                    eVar2.f1437h.post(new e.b(eVar2, c3, this.f1423c));
                } else {
                    c.c0.r.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f1424d), new Throwable[0]);
                }
            } else {
                c.c0.r.c().a(a, String.format("Already stopped work for %s", this.f1424d), new Throwable[0]);
            }
        }
    }
}
