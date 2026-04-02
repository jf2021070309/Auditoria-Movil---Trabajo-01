package com.moat.analytics.mobile.vng;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class w {
    private static w g;
    private static final Queue<c> h = new ConcurrentLinkedQueue();
    private Handler i;
    private long e = 1800000;
    private long f = 60000;
    volatile d a = d.OFF;
    volatile boolean b = false;
    volatile boolean c = false;
    volatile int d = 200;
    private final AtomicBoolean j = new AtomicBoolean(false);
    private volatile long k = 0;
    private final AtomicInteger l = new AtomicInteger(0);
    private final AtomicBoolean m = new AtomicBoolean(false);

    /* loaded from: classes2.dex */
    private class a implements Runnable {
        private final Handler b;
        private final String c;
        private final e d;

        private a(String str, Handler handler, e eVar) {
            this.d = eVar;
            this.b = handler;
            this.c = "https://z.moatadr.com/" + str + "/android/" + "3f2ae9c1894282b5e0222f0d06bbf457191f816f".substring(0, 7) + "/status.json";
        }

        private void a() {
            String b = b();
            final l lVar = new l(b);
            w.this.b = lVar.a();
            w.this.c = lVar.b();
            w.this.d = lVar.c();
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.moat.analytics.mobile.vng.w.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        a.this.d.a(lVar);
                    } catch (Exception e) {
                        m.a(e);
                    }
                }
            });
            w.this.k = System.currentTimeMillis();
            w.this.m.compareAndSet(true, false);
            if (b != null) {
                w.this.l.set(0);
            } else if (w.this.l.incrementAndGet() < 10) {
                w.this.a(w.this.f);
            }
        }

        private String b() {
            try {
                return q.a(this.c + "?ts=" + System.currentTimeMillis() + "&v=2.2.0").b();
            } catch (Exception e) {
                return null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Exception e) {
                m.a(e);
            }
            this.b.removeCallbacks(this);
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                myLooper.quit();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface b {
        void b();

        void c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c {
        final Long a;
        final b b;

        c(Long l, b bVar) {
            this.a = l;
            this.b = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum d {
        OFF,
        ON
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface e {
        void a(l lVar);
    }

    private w() {
        try {
            this.i = new Handler(Looper.getMainLooper());
        } catch (Exception e2) {
            m.a(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized w a() {
        w wVar;
        synchronized (w.class) {
            if (g == null) {
                g = new w();
            }
            wVar = g;
        }
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final long j) {
        if (this.m.compareAndSet(false, true)) {
            p.a(3, "OnOff", this, "Performing status check.");
            new Thread() { // from class: com.moat.analytics.mobile.vng.w.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    Looper.prepare();
                    Handler handler = new Handler();
                    handler.postDelayed(new a("VNG", handler, new e() { // from class: com.moat.analytics.mobile.vng.w.1.1
                        @Override // com.moat.analytics.mobile.vng.w.e
                        public void a(l lVar) {
                            synchronized (w.h) {
                                boolean z = ((k) MoatAnalytics.getInstance()).a;
                                if (w.this.a != lVar.d() || (w.this.a == d.OFF && z)) {
                                    w.this.a = lVar.d();
                                    if (w.this.a == d.OFF && z) {
                                        w.this.a = d.ON;
                                    }
                                    if (w.this.a == d.ON) {
                                        p.a(3, "OnOff", this, "Moat enabled - Version 2.2.0");
                                    }
                                    for (c cVar : w.h) {
                                        if (w.this.a == d.ON) {
                                            cVar.b.b();
                                        } else {
                                            cVar.b.c();
                                        }
                                    }
                                }
                                while (!w.h.isEmpty()) {
                                    w.h.remove();
                                }
                            }
                        }
                    }), j);
                    Looper.loop();
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (h) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<c> it = h.iterator();
            while (it.hasNext()) {
                if (currentTimeMillis - it.next().a.longValue() >= 60000) {
                    it.remove();
                }
            }
            if (h.size() >= 15) {
                for (int i = 0; i < 5; i++) {
                    h.remove();
                }
            }
        }
    }

    private void e() {
        if (this.j.compareAndSet(false, true)) {
            this.i.postDelayed(new Runnable() { // from class: com.moat.analytics.mobile.vng.w.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (w.h.size() > 0) {
                            w.this.d();
                            w.this.i.postDelayed(this, 60000L);
                        } else {
                            w.this.j.compareAndSet(true, false);
                            w.this.i.removeCallbacks(this);
                        }
                    } catch (Exception e2) {
                        m.a(e2);
                    }
                }
            }, 60000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar) {
        if (this.a == d.ON) {
            bVar.b();
            return;
        }
        d();
        h.add(new c(Long.valueOf(System.currentTimeMillis()), bVar));
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (System.currentTimeMillis() - this.k > this.e) {
            a(0L);
        }
    }
}
