package com.flurry.sdk;

import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes2.dex */
final class lp {
    private Timer a;
    private a b;

    public final synchronized void a(long j) {
        if (this.a != null) {
            a();
        }
        this.a = new Timer("FlurrySessionTimer");
        this.b = new a();
        this.a.schedule(this.b, j);
    }

    public final synchronized void a() {
        if (this.a != null) {
            this.a.cancel();
            this.a = null;
        }
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            lp.this.a();
            kk.a().a(new lq());
        }
    }
}
