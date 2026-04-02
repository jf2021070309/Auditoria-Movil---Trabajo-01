package com.amazon.aps.iva.u9;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* compiled from: WorkTimer.java */
/* loaded from: classes.dex */
public final class s {
    public final ScheduledExecutorService a;
    public final HashMap b;
    public final HashMap c;
    public final Object d;

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public int a = 0;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.a);
            this.a = this.a + 1;
            return newThread;
        }
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public static class c implements Runnable {
        public final s b;
        public final String c;

        public c(s sVar, String str) {
            this.b = sVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.b.d) {
                if (((c) this.b.b.remove(this.c)) != null) {
                    b bVar = (b) this.b.c.remove(this.c);
                    if (bVar != null) {
                        bVar.a(this.c);
                    }
                } else {
                    com.amazon.aps.iva.k9.m c = com.amazon.aps.iva.k9.m.c();
                    String.format("Timer with %s is already marked as complete.", this.c);
                    c.a(new Throwable[0]);
                }
            }
        }
    }

    static {
        com.amazon.aps.iva.k9.m.e("WorkTimer");
    }

    public s() {
        a aVar = new a();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public final void a(String str, b bVar) {
        synchronized (this.d) {
            com.amazon.aps.iva.k9.m c2 = com.amazon.aps.iva.k9.m.c();
            String.format("Starting timer for %s", str);
            c2.a(new Throwable[0]);
            b(str);
            c cVar = new c(this, str);
            this.b.put(str, cVar);
            this.c.put(str, bVar);
            this.a.schedule(cVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.d) {
            if (((c) this.b.remove(str)) != null) {
                com.amazon.aps.iva.k9.m c2 = com.amazon.aps.iva.k9.m.c();
                String.format("Stopping timer for %s", str);
                c2.a(new Throwable[0]);
                this.c.remove(str);
            }
        }
    }
}
