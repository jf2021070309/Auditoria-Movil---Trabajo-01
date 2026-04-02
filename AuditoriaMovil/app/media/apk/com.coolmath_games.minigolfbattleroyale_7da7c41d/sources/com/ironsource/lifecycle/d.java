package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.ironsource.lifecycle.b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    Handler b;
    private static d k = new d();
    static AtomicBoolean a = new AtomicBoolean(false);
    private String j = "IronsourceLifecycleManager";
    int c = 0;
    int d = 0;
    boolean e = true;
    boolean f = true;
    int g = e.a;
    List<c> h = new CopyOnWriteArrayList();
    Runnable i = new Runnable() { // from class: com.ironsource.lifecycle.d.1
        @Override // java.lang.Runnable
        public final void run() {
            d.a(d.this);
            d.this.c();
        }
    };
    private b.a l = new b.a() { // from class: com.ironsource.lifecycle.d.2
        @Override // com.ironsource.lifecycle.b.a
        public final void a(Activity activity) {
            d dVar = d.this;
            dVar.c++;
            if (dVar.c == 1 && dVar.f) {
                for (c cVar : dVar.h) {
                    cVar.a();
                }
                dVar.f = false;
                dVar.g = e.b;
            }
        }

        @Override // com.ironsource.lifecycle.b.a
        public final void b(Activity activity) {
            d dVar = d.this;
            dVar.d++;
            if (dVar.d == 1) {
                if (!dVar.e) {
                    dVar.b.removeCallbacks(dVar.i);
                    return;
                }
                Iterator<c> it = dVar.h.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                dVar.e = false;
                dVar.g = e.c;
            }
        }
    };

    public static d a() {
        return k;
    }

    static /* synthetic */ void a(d dVar) {
        if (dVar.d == 0) {
            dVar.e = true;
            Iterator<c> it = dVar.h.iterator();
            while (it.hasNext()) {
                it.next();
            }
            dVar.g = e.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.c == 0 && this.e) {
            for (c cVar : this.h) {
                cVar.b();
            }
            this.f = true;
            this.g = e.e;
        }
    }

    public final void a(c cVar) {
        if (!IronsourceLifecycleProvider.a() || this.h.contains(cVar)) {
            return;
        }
        this.h.add(cVar);
    }

    public final boolean b() {
        return this.g == e.e;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b.b(activity);
        b a2 = b.a(activity);
        if (a2 != null) {
            a2.a = this.l;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.postDelayed(this.i, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.c--;
        c();
    }
}
