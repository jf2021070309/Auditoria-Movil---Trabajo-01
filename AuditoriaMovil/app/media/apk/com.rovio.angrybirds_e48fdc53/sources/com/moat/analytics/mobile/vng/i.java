package com.moat.analytics.mobile.vng;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class i {
    private static final i a = new i();
    private ScheduledFuture<?> e;
    private ScheduledFuture<?> f;
    private final ScheduledExecutorService d = Executors.newScheduledThreadPool(1);
    private final Map<j, String> b = new WeakHashMap();
    private final Map<b, String> c = new WeakHashMap();

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i a() {
        return a;
    }

    private void a(final Context context) {
        if (this.f == null || this.f.isDone()) {
            p.a(3, "JSUpdateLooper", this, "Starting metadata reporting loop");
            this.f = this.d.scheduleWithFixedDelay(new Runnable() { // from class: com.moat.analytics.mobile.vng.i.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(new Intent("UPDATE_METADATA"));
                        if (i.this.b.isEmpty()) {
                            i.this.f.cancel(true);
                        }
                    } catch (Exception e) {
                        m.a(e);
                    }
                }
            }, 0L, 50L, TimeUnit.MILLISECONDS);
        }
    }

    private void b(final Context context) {
        if (this.e == null || this.e.isDone()) {
            p.a(3, "JSUpdateLooper", this, "Starting view update loop");
            this.e = this.d.scheduleWithFixedDelay(new Runnable() { // from class: com.moat.analytics.mobile.vng.i.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(new Intent("UPDATE_VIEW_INFO"));
                        if (i.this.c.isEmpty()) {
                            p.a(3, "JSUpdateLooper", i.this, "No more active trackers");
                            i.this.e.cancel(true);
                        }
                    } catch (Exception e) {
                        m.a(e);
                    }
                }
            }, 0L, w.a().d, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, b bVar) {
        if (bVar != null) {
            p.a(3, "JSUpdateLooper", this, "addActiveTracker" + bVar.hashCode());
            if (this.c == null || this.c.containsKey(bVar)) {
                return;
            }
            this.c.put(bVar, "");
            b(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, j jVar) {
        if (this.b == null || jVar == null) {
            return;
        }
        this.b.put(jVar, "");
        a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar) {
        if (bVar != null) {
            p.a(3, "JSUpdateLooper", this, "removeActiveTracker" + bVar.hashCode());
            if (this.c != null) {
                this.c.remove(bVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(j jVar) {
        if (jVar != null) {
            p.a(3, "JSUpdateLooper", this, "removeSetupNeededBridge" + jVar.hashCode());
            if (this.b != null) {
                this.b.remove(jVar);
            }
        }
    }
}
