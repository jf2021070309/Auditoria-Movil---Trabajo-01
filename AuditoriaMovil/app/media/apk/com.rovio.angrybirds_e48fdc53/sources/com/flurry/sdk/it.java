package com.flurry.sdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.widget.Toast;
import com.flurry.sdk.iu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class it {
    public static final String a = it.class.getSimpleName();
    public static int b;
    public static int c;
    public static AtomicInteger d;
    static kh<List<iu>> e;
    private static it f;
    private static Map<Integer, iu> g;
    private final AtomicInteger h;
    private long i;
    private kj<js> j = new kj<js>() { // from class: com.flurry.sdk.it.1
        @Override // com.flurry.sdk.kj
        public final /* synthetic */ void a(js jsVar) {
            js jsVar2 = jsVar;
            ko.a(4, it.a, "onNetworkStateChanged : isNetworkEnable = " + jsVar2.a);
            if (!jsVar2.a) {
                return;
            }
            ka.a().b(new Runnable() { // from class: com.flurry.sdk.it.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    iv.a().b();
                }
            });
        }
    };

    private it() {
        g = new HashMap();
        this.h = new AtomicInteger(0);
        d = new AtomicInteger(0);
        if (c == 0) {
            c = 600000;
        }
        if (b == 0) {
            b = 15;
        }
        this.i = ka.a().a.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getLong("timeToSendNextPulseReport", 0L);
        if (e == null) {
            f();
        }
        kk.a().a("com.flurry.android.sdk.NetworkStateEvent", this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        e = new kh<>(ka.a().a.getFileStreamPath(".yflurryanongoingpulsecallbackreporter"), ".yflurryanongoingpulsecallbackreporter", 2, new ll<List<iu>>() { // from class: com.flurry.sdk.it.2
            @Override // com.flurry.sdk.ll
            public final li<List<iu>> a(int i) {
                return new lh(new iu.a());
            }
        });
    }

    public static void a(int i) {
        b = i;
    }

    public static void b(int i) {
        c = i;
    }

    public final synchronized void a(iu iuVar) {
        if (iuVar == null) {
            ko.a(3, a, "Must add valid PulseCallbackAsyncReportInfo");
        } else {
            ko.a(3, a, "Adding and sending " + iuVar.c + " report to PulseCallbackManager.");
            if (iuVar.a().size() != 0) {
                if (this.i == 0) {
                    this.i = System.currentTimeMillis() + c;
                    ka.a().b(new Runnable() { // from class: com.flurry.sdk.it.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            it.this.g();
                        }
                    });
                }
                int h = h();
                iuVar.b = h;
                g.put(Integer.valueOf(h), iuVar);
                for (iq iqVar : iuVar.a()) {
                    hs.a().c.b((ip) iqVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        SharedPreferences.Editor edit = ka.a().a.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
        edit.putLong("timeToSendNextPulseReport", this.i);
        edit.apply();
    }

    private synchronized int h() {
        return this.h.incrementAndGet();
    }

    public final synchronized void b(iu iuVar) {
        if (iuVar == null) {
            ko.a(3, a, "Must add valid PulseCallbackAsyncReportInfo");
        } else {
            if (this.i == 0) {
                this.i = System.currentTimeMillis() + c;
                ka.a().b(new Runnable() { // from class: com.flurry.sdk.it.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        it.this.g();
                    }
                });
            }
            int h = h();
            iuVar.b = h;
            g.put(Integer.valueOf(h), iuVar);
            for (iq iqVar : iuVar.a()) {
                Iterator<ir> it = iqVar.f.iterator();
                while (it.hasNext()) {
                    it.next();
                    d.incrementAndGet();
                    if (j()) {
                        ko.a(3, a, "Max Callback Attempts threshold reached. Sending callback logging reports");
                        l();
                    }
                }
            }
            if (k()) {
                ko.a(3, a, "Time threshold reached. Sending callback logging reports");
                l();
            }
            ko.a(3, a, "Restoring " + iuVar.c + " report to PulseCallbackManager. Number of stored completed callbacks: " + d.get());
        }
    }

    public final synchronized void a(final ir irVar) {
        ko.a(3, a, irVar.l.g.c + " report sent successfully to " + irVar.l.l);
        irVar.f = is.COMPLETE;
        irVar.g = "";
        c(irVar);
        if (ko.c() <= 3 && ko.d()) {
            ka.a().a(new Runnable() { // from class: com.flurry.sdk.it.5
                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(ka.a().a, "PulseCallbackReportInfo HTTP Response Code: " + irVar.e + " for url: " + irVar.l.r, 1).show();
                }
            });
        }
    }

    private void c(ir irVar) {
        irVar.d = true;
        irVar.a();
        d.incrementAndGet();
        irVar.l.c();
        ko.a(3, a, irVar.l.g.c + " report to " + irVar.l.l + " finalized.");
        a();
        i();
    }

    public final void a() {
        ka.a().b(new Runnable() { // from class: com.flurry.sdk.it.6
            @Override // java.lang.Runnable
            public final void run() {
                it.c();
                List<iu> b2 = it.b();
                if (it.e == null) {
                    it.f();
                }
                it.e.a(b2);
            }
        });
    }

    private void i() {
        if (j() || k()) {
            ko.a(3, a, "Threshold reached. Sending callback logging reports");
            l();
        }
    }

    public static List<iu> b() {
        return new ArrayList(g.values());
    }

    public static synchronized it c() {
        it itVar;
        synchronized (it.class) {
            if (f == null) {
                f = new it();
            }
            itVar = f;
        }
        return itVar;
    }

    private static boolean j() {
        return d.intValue() >= b;
    }

    private boolean k() {
        return System.currentTimeMillis() > this.i;
    }

    private void l() {
        for (iu iuVar : b()) {
            boolean z = false;
            for (iq iqVar : iuVar.a()) {
                Iterator<ir> it = iqVar.f.iterator();
                while (it.hasNext()) {
                    ir next = it.next();
                    if (next.j) {
                        it.remove();
                    } else if (!next.f.equals(is.PENDING_COMPLETION)) {
                        next.j = true;
                        z = true;
                    }
                }
            }
            if (z) {
                iv.a().a(iuVar);
            }
        }
        iv.a().b();
        this.i = System.currentTimeMillis() + c;
        g();
        for (iu iuVar2 : b()) {
            if (iuVar2.b()) {
                c(iuVar2.b);
            } else {
                for (iq iqVar2 : iuVar2.a()) {
                    if (iqVar2.m) {
                        iuVar2.d.remove(Long.valueOf(iqVar2.a));
                    } else {
                        Iterator<ir> it2 = iqVar2.f.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().j) {
                                it2.remove();
                            }
                        }
                    }
                }
            }
        }
        d = new AtomicInteger(0);
        a();
    }

    private synchronized void c(int i) {
        ko.a(3, a, "Removing report " + i + " from PulseCallbackManager");
        g.remove(Integer.valueOf(i));
    }

    public final synchronized boolean a(ir irVar, String str) {
        boolean z = true;
        synchronized (this) {
            irVar.h++;
            irVar.i = System.currentTimeMillis();
            if ((irVar.h > irVar.l.c) || TextUtils.isEmpty(str)) {
                ko.a(3, a, "Maximum number of redirects attempted. Aborting: " + irVar.l.g.c + " report to " + irVar.l.l);
                irVar.f = is.INVALID_RESPONSE;
                irVar.g = "";
                c(irVar);
                z = false;
            } else {
                ko.a(3, a, "Report to " + irVar.l.l + " redirecting to url: " + str);
                irVar.l.r = str;
                a();
            }
        }
        return z;
    }

    public final synchronized void b(ir irVar) {
        ko.a(3, a, "Maximum number of attempts reached. Aborting: " + irVar.l.g.c);
        irVar.f = is.TIMEOUT;
        irVar.i = System.currentTimeMillis();
        irVar.g = "";
        c(irVar);
    }

    public final synchronized boolean b(ir irVar, String str) {
        boolean z = false;
        synchronized (this) {
            irVar.f = is.INVALID_RESPONSE;
            irVar.i = System.currentTimeMillis();
            if (str == null) {
                str = "";
            }
            irVar.g = str;
            iq iqVar = irVar.l;
            if (iqVar.p >= iqVar.b) {
                ko.a(3, a, "Maximum number of attempts reached. Aborting: " + irVar.l.g.c + " report to " + irVar.l.l);
                c(irVar);
            } else if (!me.h(irVar.l.r)) {
                ko.a(3, a, "Url: " + irVar.l.r + " is invalid.");
                c(irVar);
            } else {
                ko.a(3, a, "Retrying callback to " + irVar.l.g.c + " in: " + (irVar.l.h / 1000) + " seconds.");
                irVar.a();
                d.incrementAndGet();
                a();
                i();
                z = true;
            }
        }
        return z;
    }

    public static List<iu> d() {
        if (e == null) {
            f();
        }
        return e.a();
    }
}
