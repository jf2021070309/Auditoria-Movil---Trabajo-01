package com.flurry.sdk;

import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes2.dex */
public class kv {
    private static final String a = kv.class.getSimpleName();
    private Timer b;
    private a c;
    private kw d;

    public kv(kw kwVar) {
        this.d = kwVar;
    }

    public final synchronized void a(long j) {
        synchronized (this) {
            if (this.b != null) {
                a();
            }
            this.b = new Timer("HttpRequestTimeoutTimer");
            this.c = new a(this, (byte) 0);
            this.b.schedule(this.c, j);
            ko.a(3, a, "HttpRequestTimeoutTimer started: " + j + "MS");
        }
    }

    public final synchronized void a() {
        if (this.b != null) {
            this.b.cancel();
            this.b = null;
            ko.a(3, a, "HttpRequestTimeoutTimer stopped.");
        }
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        private a() {
        }

        /* synthetic */ a(kv kvVar, byte b) {
            this();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ko.a(3, kv.a, "HttpRequest timed out. Cancelling.");
            kw kwVar = kv.this.d;
            ko.a(3, kw.e, "Timeout (" + (System.currentTimeMillis() - kwVar.n) + "MS) for url: " + kwVar.g);
            kwVar.q = 629;
            kwVar.t = true;
            kwVar.e();
            kwVar.f();
        }
    }
}
