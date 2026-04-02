package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.config.j;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.ao;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class b implements j.a {
    ao c;
    final z d;
    Handler e;
    final AtomicBoolean a = new AtomicBoolean(false);
    boolean b = false;
    private final String g = "session_duration";
    private final int h = 30;
    private final Application.ActivityLifecycleCallbacks i = new Application.ActivityLifecycleCallbacks() { // from class: com.fyber.inneractive.sdk.config.b.1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            b.this.e.removeMessages(123);
            b bVar = b.this;
            if (bVar.a.compareAndSet(true, false)) {
                if (bVar.b) {
                    IAlog.b("onActivityResumed: restartSession", new Object[0]);
                    bVar.b = false;
                    if (bVar.d != null) {
                        bVar.d.b();
                        bVar.d.b("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                        bVar.d.a();
                    }
                }
                if (bVar.c != null) {
                    bVar.c.d();
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (b.this.e.hasMessages(123) || b.this.a.get()) {
                return;
            }
            b.this.e.sendEmptyMessageDelayed(123, 3000L);
        }
    };
    final ao.b f = new ao.b() { // from class: com.fyber.inneractive.sdk.config.b.2
        @Override // com.fyber.inneractive.sdk.util.ao.b
        public final void a() {
            IAlog.b("onVisibleTimeReached: %s", Long.valueOf(System.currentTimeMillis()));
            b.this.b = true;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(z zVar) {
        this.d = zVar;
        Application p = com.fyber.inneractive.sdk.util.l.p();
        if (p != null) {
            p.registerActivityLifecycleCallbacks(this.i);
        }
        this.e = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.fyber.inneractive.sdk.config.b.3
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what == 123) {
                    b bVar = b.this;
                    if (bVar.a.compareAndSet(false, true)) {
                        if (bVar.a.get() && bVar.c != null) {
                            IAlog.b("startCounting", new Object[0]);
                            bVar.c.a();
                        }
                        IAlog.b("Pause signal", new Object[0]);
                    }
                    return true;
                }
                return false;
            }
        });
    }

    @Override // com.fyber.inneractive.sdk.config.j.a
    public final void onGlobalConfigChanged(j jVar, i iVar) {
        ao aoVar = this.c;
        if (aoVar != null) {
            aoVar.d();
            ao aoVar2 = new ao(TimeUnit.MINUTES, iVar.a("session_duration", 30, 1), this.c.c);
            this.c = aoVar2;
            aoVar2.b = this.f;
        }
        jVar.b(this);
    }
}
