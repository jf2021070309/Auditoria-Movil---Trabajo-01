package com.fyber.inneractive.sdk.h;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Comparator;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class t implements s {
    private static final ThreadFactory g = new ThreadFactory() { // from class: com.fyber.inneractive.sdk.h.t.1
        private final AtomicInteger a = new AtomicInteger(100);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format(Locale.ENGLISH, "FyberMarketplace-Network-%02d", Integer.valueOf(this.a.getAndIncrement())));
        }
    };
    private final a e = new a((byte) 0);
    BlockingQueue<y<?>> a = new PriorityBlockingQueue(100, this.e);
    public volatile boolean b = false;
    private final Handler f = new Handler(Looper.getMainLooper());
    public final ThreadPoolExecutor c = new ThreadPoolExecutor(6, 6, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue(100), g);
    public final Runnable d = new Runnable() { // from class: com.fyber.inneractive.sdk.h.t.2
        @Override // java.lang.Runnable
        public final void run() {
            t.a(t.this);
        }
    };

    @Override // com.fyber.inneractive.sdk.h.s
    public final void a(y<?> yVar) {
        this.a.offer(yVar);
        yVar.a(ai.b);
    }

    private static <T> com.fyber.inneractive.sdk.h.a<T> b(y<T> yVar) {
        try {
            if (yVar.l() || yVar.i() == null) {
                return null;
            }
            return yVar.j();
        } catch (Exception e) {
            IAlog.a("failed fetching cache data", e, new Object[0]);
            yVar.a((y<T>) null, e, true);
            return null;
        }
    }

    private static void c(y<?> yVar) {
        try {
            yVar.n();
        } catch (Exception unused) {
        }
        yVar.a(ai.d);
    }

    private static <T> void a(y<T> yVar, w<T> wVar) {
        try {
            if (yVar.l() || wVar == null) {
                return;
            }
            yVar.a((y<T>) wVar.a(), (Exception) null, false);
        } catch (Exception e) {
            IAlog.a("failed notifying the listener request complete", e, new Object[0]);
            yVar.a((y<T>) null, e, false);
        }
    }

    private static <T> w<T> a(y<T> yVar, g gVar) throws Exception {
        w<T> wVar = null;
        if (gVar != null) {
            try {
                if (!yVar.l()) {
                    if (gVar.a == 200) {
                        wVar = yVar.a(gVar.b, gVar.c, gVar.a);
                    } else if (gVar.a == 304) {
                        yVar.a((y<T>) null, (Exception) new d(), false);
                    } else {
                        yVar.a((y<T>) null, (Exception) new aj(gVar.a), false);
                    }
                }
            } catch (Exception e) {
                IAlog.a("failed parsing network request", e, new Object[0]);
                throw e;
            }
        }
        return wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.fyber.inneractive.sdk.h.g a(final com.fyber.inneractive.sdk.h.y<?> r5, com.fyber.inneractive.sdk.h.a<?> r6) throws java.lang.Exception {
        /*
            r4 = this;
            java.lang.String r0 = "failed sending network request"
            r1 = 0
            boolean r2 = r5.l()     // Catch: java.lang.Exception -> L3e com.fyber.inneractive.sdk.h.b -> L45 java.net.UnknownHostException -> L47
            if (r2 != 0) goto L3c
            if (r6 == 0) goto Le
            java.lang.String r6 = r6.a     // Catch: java.lang.Exception -> L3e com.fyber.inneractive.sdk.h.b -> L45 java.net.UnknownHostException -> L47
            goto L10
        Le:
            java.lang.String r6 = ""
        L10:
            com.fyber.inneractive.sdk.config.a.s r2 = r5.o()     // Catch: java.lang.Exception -> L3e com.fyber.inneractive.sdk.h.b -> L45 java.net.UnknownHostException -> L47
            if (r2 == 0) goto L37
            java.lang.Class<com.fyber.inneractive.sdk.config.a.a.e> r3 = com.fyber.inneractive.sdk.config.a.a.e.class
            com.fyber.inneractive.sdk.config.a.a.d r2 = r2.a(r3)     // Catch: java.lang.Exception -> L3e com.fyber.inneractive.sdk.h.b -> L45 java.net.UnknownHostException -> L47
            com.fyber.inneractive.sdk.config.a.a.e r2 = (com.fyber.inneractive.sdk.config.a.a.e) r2     // Catch: java.lang.Exception -> L3e com.fyber.inneractive.sdk.h.b -> L45 java.net.UnknownHostException -> L47
            if (r2 == 0) goto L37
            java.lang.String r3 = "should_use_is_network_connected"
            boolean r2 = r2.a(r3, r1)     // Catch: java.lang.Exception -> L3e com.fyber.inneractive.sdk.h.b -> L45 java.net.UnknownHostException -> L47
            if (r2 == 0) goto L37
            boolean r2 = com.fyber.inneractive.sdk.util.k.b()     // Catch: java.lang.Exception -> L3e com.fyber.inneractive.sdk.h.b -> L45 java.net.UnknownHostException -> L47
            if (r2 == 0) goto L2f
            goto L37
        L2f:
            com.fyber.inneractive.sdk.h.b r6 = new com.fyber.inneractive.sdk.h.b     // Catch: java.lang.Exception -> L3e com.fyber.inneractive.sdk.h.b -> L45 java.net.UnknownHostException -> L47
            java.lang.String r2 = "No network connection"
            r6.<init>(r2)     // Catch: java.lang.Exception -> L3e com.fyber.inneractive.sdk.h.b -> L45 java.net.UnknownHostException -> L47
            throw r6     // Catch: java.lang.Exception -> L3e com.fyber.inneractive.sdk.h.b -> L45 java.net.UnknownHostException -> L47
        L37:
            com.fyber.inneractive.sdk.h.g r5 = r5.a(r6)     // Catch: java.lang.Exception -> L3e com.fyber.inneractive.sdk.h.b -> L45 java.net.UnknownHostException -> L47
            goto L3d
        L3c:
            r5 = 0
        L3d:
            return r5
        L3e:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r5, r6)
            throw r5
        L45:
            r6 = move-exception
            goto L48
        L47:
            r6 = move-exception
        L48:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r6, r1)
            boolean r0 = r5.g()
            if (r0 == 0) goto L62
            android.os.Handler r0 = r4.f
            com.fyber.inneractive.sdk.h.t$3 r1 = new com.fyber.inneractive.sdk.h.t$3
            r1.<init>()
            int r5 = r5.h()
            long r2 = (long) r5
            r0.postDelayed(r1, r2)
        L62:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.h.t.a(com.fyber.inneractive.sdk.h.y, com.fyber.inneractive.sdk.h.a):com.fyber.inneractive.sdk.h.g");
    }

    /* loaded from: classes.dex */
    private static class a implements Comparator<y> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(y yVar, y yVar2) {
            return (yVar.m() - 1) - (yVar2.m() - 1);
        }
    }

    static /* synthetic */ void a(t tVar) {
        y<?> yVar;
        w<?> wVar;
        Process.setThreadPriority(10);
        while (tVar.b) {
            w<?> wVar2 = null;
            try {
                yVar = tVar.a.take();
            } catch (InterruptedException unused) {
                if (!tVar.b) {
                    Thread.currentThread().interrupt();
                }
                yVar = null;
            }
            if (yVar != null && !yVar.l()) {
                yVar.a(ai.c);
                com.fyber.inneractive.sdk.h.a<?> b = b(yVar);
                if (b != null && b.b != 0 && !yVar.l()) {
                    yVar.a((y<?>) b.b, (Exception) null, true);
                }
                try {
                    g a2 = tVar.a(yVar, b);
                    wVar = a(yVar, a2);
                    try {
                        try {
                            if (!yVar.l() && yVar.i() != null && wVar != null && a2 != null && a2.a == 200) {
                                yVar.a(wVar, yVar.i(), a2.d);
                            }
                        } catch (Throwable th) {
                            th = th;
                            wVar2 = wVar;
                            a(yVar, wVar2);
                            c(yVar);
                            throw th;
                        }
                    } catch (Exception e) {
                        try {
                            IAlog.a("Failed cache network response data", e, new Object[0]);
                        } catch (Exception e2) {
                            e = e2;
                            yVar.a((y<?>) null, e, false);
                            a(yVar, wVar);
                            c(yVar);
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    wVar = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                a(yVar, wVar);
                c(yVar);
            }
        }
    }
}
