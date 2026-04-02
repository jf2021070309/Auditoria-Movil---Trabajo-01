package com.ironsource.mediationsdk.adunit.e;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes2.dex */
public final class a<Smash extends c<?>> {
    private c<?> d;
    private final List<String> e;
    private final int f;
    private b h;
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> a = new ConcurrentHashMap<>();
    public String b = "";
    private String c = "";
    private final Timer g = new Timer();
    private final int i = 5;

    public a(List<String> list, int i, b bVar) {
        this.e = list;
        this.f = i;
        this.h = bVar;
    }

    private synchronized void b() {
        if (this.d != null) {
            this.d.o();
        }
    }

    private synchronized boolean c() {
        boolean z;
        if (this.d != null && this.d.p()) {
            z = this.d.n().equals(this.c);
        }
        return z;
    }

    private void d() {
        Iterator<Smash> it = a().iterator();
        while (it.hasNext()) {
            Smash next = it.next();
            if (!next.equals(this.d)) {
                next.o();
            }
        }
    }

    public final CopyOnWriteArrayList<Smash> a() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.a.get(this.b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public final void a(a.EnumC0086a enumC0086a, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("updating new  waterfall with id " + str);
        d();
        if (enumC0086a == a.EnumC0086a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.c)) {
                if (c()) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.info("ad from previous waterfall " + this.c + " is still showing - the current waterfall " + this.b + " will be deleted instead");
                    String str2 = this.b;
                    this.b = this.c;
                    this.c = str2;
                }
                final String str3 = this.c;
                this.g.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.adunit.e.a.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        try {
                            IronLog ironLog3 = IronLog.INTERNAL;
                            ironLog3.info("removing waterfall with id " + str3 + " from memory");
                            a.this.a.remove(str3);
                            IronLog ironLog4 = IronLog.INTERNAL;
                            ironLog4.info("waterfall size is currently " + a.this.a.size());
                        } finally {
                            cancel();
                        }
                    }
                }, this.f);
            }
        } else {
            this.a.clear();
            this.a.put(str, copyOnWriteArrayList);
        }
        this.c = this.b;
        this.b = str;
        if (this.a.size() > 5) {
            this.h.a(this.a.size());
        }
    }

    public final synchronized void a(c<?> cVar) {
        b();
        this.d = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        r3.info(r4 + " does not support load while show and will not be added to the auction request");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a(com.ironsource.mediationsdk.adunit.c.b.a.EnumC0086a r3, java.lang.String r4, java.lang.String r5, com.ironsource.mediationsdk.LoadWhileShowSupportState r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.ironsource.mediationsdk.adunit.c.b.a$a r0 = com.ironsource.mediationsdk.adunit.c.b.a.EnumC0086a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch: java.lang.Throwable -> L57
            r1 = 1
            if (r3 == r0) goto L7
            goto L3d
        L7:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r3 = r2.d     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L3d
            com.ironsource.mediationsdk.adunit.d.a.c<?> r3 = r2.d     // Catch: java.lang.Throwable -> L57
            boolean r3 = r3.p()     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L14
            goto L3d
        L14:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r3 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch: java.lang.Throwable -> L57
            if (r6 != r3) goto L24
            com.ironsource.mediationsdk.adunit.d.a.c<?> r3 = r2.d     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r3.k()     // Catch: java.lang.Throwable -> L57
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L3c
        L24:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r3 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch: java.lang.Throwable -> L57
            if (r6 == r3) goto L3c
            java.util.List<java.lang.String> r3 = r2.e     // Catch: java.lang.Throwable -> L57
            boolean r3 = r3.contains(r5)     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L3d
            com.ironsource.mediationsdk.adunit.d.a.c<?> r3 = r2.d     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r3.m()     // Catch: java.lang.Throwable -> L57
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L3d
        L3c:
            r1 = 0
        L3d:
            if (r1 != 0) goto L55
            com.ironsource.mediationsdk.logger.IronLog r3 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r5.<init>()     // Catch: java.lang.Throwable -> L57
            r5.append(r4)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = " does not support load while show and will not be added to the auction request"
            r5.append(r4)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L57
            r3.info(r4)     // Catch: java.lang.Throwable -> L57
        L55:
            monitor-exit(r2)
            return r1
        L57:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.e.a.a(com.ironsource.mediationsdk.adunit.c.b.a$a, java.lang.String, java.lang.String, com.ironsource.mediationsdk.LoadWhileShowSupportState):boolean");
    }
}
