package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import com.flurry.sdk.kd;
import com.flurry.sdk.ln;
import com.flurry.sdk.ls;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public class lo implements ls.a {
    private static final String b = lo.class.getSimpleName();
    private static lo c;
    public long a;
    private long g;
    private lm h;
    private final Map<Context, lm> d = new WeakHashMap();
    private final lp e = new lp();
    private final Object f = new Object();
    private kj<lq> i = new kj<lq>() { // from class: com.flurry.sdk.lo.1
        @Override // com.flurry.sdk.kj
        public final /* bridge */ /* synthetic */ void a(lq lqVar) {
            lo.this.g();
        }
    };
    private kj<kd> j = new kj<kd>() { // from class: com.flurry.sdk.lo.2
        @Override // com.flurry.sdk.kj
        public final /* synthetic */ void a(kd kdVar) {
            kd kdVar2 = kdVar;
            Activity activity = kdVar2.a.get();
            if (activity == null) {
                ko.a(lo.b, "Activity has been destroyed, can't pass ActivityLifecycleEvent to adobject.");
                return;
            }
            switch (AnonymousClass5.a[kdVar2.b.ordinal()]) {
                case 1:
                    ko.a(3, lo.b, "Automatic onStartSession for context:" + kdVar2.a);
                    lo.this.e(activity);
                    return;
                case 2:
                    ko.a(3, lo.b, "Automatic onEndSession for context:" + kdVar2.a);
                    lo.this.d(activity);
                    return;
                case 3:
                    ko.a(3, lo.b, "Automatic onEndSession (destroyed) for context:" + kdVar2.a);
                    lo.this.d(activity);
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: com.flurry.sdk.lo$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a = new int[kd.a.values().length];

        static {
            try {
                a[kd.a.kStarted.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[kd.a.kStopped.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[kd.a.kDestroyed.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    private lo() {
        lr a = lr.a();
        this.a = 0L;
        this.g = ((Long) a.a("ContinueSessionMillis")).longValue();
        a.a("ContinueSessionMillis", (ls.a) this);
        ko.a(4, b, "initSettings, ContinueSessionMillis = " + this.g);
        kk.a().a("com.flurry.android.sdk.ActivityLifecycleEvent", this.j);
        kk.a().a("com.flurry.android.sdk.FlurrySessionTimerEvent", this.i);
    }

    public static synchronized lo a() {
        lo loVar;
        synchronized (lo.class) {
            if (c == null) {
                c = new lo();
            }
            loVar = c;
        }
        return loVar;
    }

    public final synchronized void a(Context context) {
        if ((context instanceof Activity) && ke.a().b()) {
            ko.a(3, b, "bootstrap for context:" + context);
            e(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e(Context context) {
        if (this.d.get(context) != null) {
            if (ke.a().b()) {
                ko.a(3, b, "Session already started with context:" + context);
            } else {
                ko.e(b, "Session already started with context:" + context);
            }
        } else {
            this.e.a();
            lm b2 = b();
            if (b2 == null) {
                b2 = new lm();
                ko.e(b, "Flurry session started for context:" + context);
                ln lnVar = new ln();
                lnVar.a = new WeakReference<>(context);
                lnVar.b = b2;
                lnVar.c = ln.a.a;
                lnVar.b();
            }
            this.d.put(context, b2);
            synchronized (this.f) {
                this.h = b2;
            }
            ko.e(b, "Flurry session resumed for context:" + context);
            ln lnVar2 = new ln();
            lnVar2.a = new WeakReference<>(context);
            lnVar2.b = b2;
            lnVar2.c = ln.a.c;
            lnVar2.b();
            this.a = 0L;
        }
    }

    public final lm b() {
        lm lmVar;
        synchronized (this.f) {
            lmVar = this.h;
        }
        return lmVar;
    }

    public final synchronized void b(Context context) {
        if (!ke.a().b() || !(context instanceof Activity)) {
            ko.a(3, b, "Manual onStartSession for context:" + context);
            e(context);
        }
    }

    public final synchronized void c(Context context) {
        if (!ke.a().b() || !(context instanceof Activity)) {
            ko.a(3, b, "Manual onEndSession for context:" + context);
            d(context);
        }
    }

    final synchronized void d(Context context) {
        lm remove = this.d.remove(context);
        if (remove == null) {
            if (ke.a().b()) {
                ko.a(3, b, "Session cannot be ended, session not found for context:" + context);
            } else {
                ko.e(b, "Session cannot be ended, session not found for context:" + context);
            }
        } else {
            ko.e(b, "Flurry session paused for context:" + context);
            ln lnVar = new ln();
            lnVar.a = new WeakReference<>(context);
            lnVar.b = remove;
            jm.a();
            lnVar.d = jm.d();
            lnVar.c = ln.a.d;
            lnVar.b();
            if (f() == 0) {
                this.e.a(this.g);
                this.a = System.currentTimeMillis();
            } else {
                this.a = 0L;
            }
        }
    }

    private synchronized int f() {
        return this.d.size();
    }

    public final synchronized boolean c() {
        boolean z;
        if (b() == null) {
            ko.a(2, b, "Session not found. No active session");
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public final synchronized void d() {
        for (Map.Entry<Context, lm> entry : this.d.entrySet()) {
            ln lnVar = new ln();
            lnVar.a = new WeakReference<>(entry.getKey());
            lnVar.b = entry.getValue();
            lnVar.c = ln.a.d;
            jm.a();
            lnVar.d = jm.d();
            lnVar.b();
        }
        this.d.clear();
        ka.a().b(new mc() { // from class: com.flurry.sdk.lo.3
            @Override // com.flurry.sdk.mc
            public final void a() {
                lo.this.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g() {
        int f = f();
        if (f > 0) {
            ko.a(5, b, "Session cannot be finalized, sessionContextCount:" + f);
        } else {
            final lm b2 = b();
            if (b2 == null) {
                ko.a(5, b, "Session cannot be finalized, current session not found");
            } else {
                ko.e(b, "Flurry session ended");
                ln lnVar = new ln();
                lnVar.b = b2;
                lnVar.c = ln.a.e;
                jm.a();
                lnVar.d = jm.d();
                lnVar.b();
                ka.a().b(new mc() { // from class: com.flurry.sdk.lo.4
                    @Override // com.flurry.sdk.mc
                    public final void a() {
                        lo.a(lo.this, b2);
                    }
                });
            }
        }
    }

    @Override // com.flurry.sdk.ls.a
    public final void a(String str, Object obj) {
        if (str.equals("ContinueSessionMillis")) {
            this.g = ((Long) obj).longValue();
            ko.a(4, b, "onSettingUpdate, ContinueSessionMillis = " + this.g);
            return;
        }
        ko.a(6, b, "onSettingUpdate internal error!");
    }

    static /* synthetic */ void a(lo loVar, lm lmVar) {
        synchronized (loVar.f) {
            if (loVar.h == lmVar) {
                loVar.h = null;
            }
        }
    }
}
