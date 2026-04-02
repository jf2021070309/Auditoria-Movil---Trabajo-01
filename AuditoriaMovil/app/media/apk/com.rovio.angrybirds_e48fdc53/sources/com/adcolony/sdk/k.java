package com.adcolony.sdk;

import com.adcolony.sdk.q;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.facebook.login.widget.ToolTipPopup;
import com.umeng.analytics.pro.bg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executors;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class k implements Runnable {
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    final long a = 30000;
    final long b = PushUIConfig.dismissTime;
    final int c = 17;
    final int d = 15000;
    final int e = 1000;
    private boolean n = true;
    private boolean o = true;

    public void a() {
        a.a("SessionInfo.stopped", new f() { // from class: com.adcolony.sdk.k.1
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                k.this.u = true;
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            if (this.s) {
                break;
            }
            this.i = System.currentTimeMillis();
            a.f();
            if (this.g >= 30000) {
                au.d.a("Ending session due to excessive suspend time: ").b(this.g);
                break;
            }
            if (!this.n) {
                if (this.p && !this.o) {
                    this.p = false;
                    c();
                }
                if (!this.t && a.d() && a.c().isFinishing()) {
                    this.t = true;
                    this.k = 0L;
                }
                if (this.t) {
                    this.k += this.h;
                    if (this.k > PushUIConfig.dismissTime) {
                        au.d.b("Ending session due to excessive time between an Activity finishing and an onResume() event.");
                        break;
                    }
                }
                this.g += this.h;
            } else {
                if (this.p && this.o) {
                    this.p = false;
                    this.t = false;
                    d();
                }
                this.g = 0L;
            }
            this.h = 17L;
            a(this.h);
            this.j = System.currentTimeMillis() - this.i;
            if (this.j > 0 && this.j < ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME) {
                this.f += this.j;
            }
            af a = a.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.m > 15000 && a.y()) {
                a.h().e();
                this.m = currentTimeMillis;
            }
            if (a.d() && currentTimeMillis - this.l > 1000) {
                this.l = currentTimeMillis;
                String c = a.b.c();
                if (!c.equals(a.s())) {
                    a.a(c);
                    JSONObject a2 = as.a();
                    as.a(a2, bg.T, a.s());
                    new d("Network.on_status_change", 1, a2).a();
                }
            }
        }
        au.c.b("AdColony session ending, releasing Activity reference.");
        a.a().b(true);
        a.a(null);
        this.r = true;
        this.v = true;
        b();
        q.a aVar = new q.a(10.0d);
        while (!this.u && !aVar.a() && this.v) {
            a.f();
            a(100L);
        }
        au.d.b("SessionInfo.stopped message received, ending ADC.update_module() spam.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        if (!this.q) {
            if (this.r) {
                a.a().b(false);
                this.r = false;
            }
            this.f = 0L;
            this.g = 0L;
            this.q = true;
            this.n = true;
            this.u = false;
            new Thread(this).start();
            if (z) {
                JSONObject a = as.a();
                as.a(a, "id", q.e());
                new d("SessionInfo.on_start", 1, a).a();
            }
            if (AdColony.a.isShutdown()) {
                AdColony.a = Executors.newSingleThreadExecutor();
            }
        }
    }

    void b() {
        this.q = false;
        this.n = false;
        if (b.e != null) {
            b.e.a();
        }
        JSONObject a = as.a();
        as.a(a, "session_length", this.f / 1000.0d);
        new d("SessionInfo.on_stop", 1, a).a();
        a.f();
        AdColony.a.shutdown();
        au.d.b("SESSION STOP");
    }

    void c() {
        b(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        ArrayList<g> c = a.a().n().c();
        synchronized (c) {
            Iterator<g> it = c.iterator();
            while (it.hasNext()) {
                JSONObject a = as.a();
                as.a(a, "from_window_focus", z);
                new d("SessionInfo.on_pause", it.next().a(), a).a();
            }
        }
        this.o = true;
        a.f();
    }

    void d() {
        c(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z) {
        ArrayList<g> c = a.a().n().c();
        synchronized (c) {
            Iterator<g> it = c.iterator();
            while (it.hasNext()) {
                JSONObject a = as.a();
                as.a(a, "from_window_focus", z);
                new d("SessionInfo.on_resume", it.next().a(), a).a();
            }
        }
        this.o = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(boolean z) {
        this.n = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(boolean z) {
        this.p = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(boolean z) {
        this.v = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.q;
    }

    void a(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
        }
    }
}
