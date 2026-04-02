package com.amazon.aps.iva.uq;

import android.os.Handler;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.sq.c;
import com.amazon.aps.iva.sq.e;
import com.amazon.aps.iva.sq.f;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ANRDetectorRunnable.kt */
/* loaded from: classes2.dex */
public final class a implements Runnable {
    public final Handler b;
    public final long c = 5000;
    public final long d = 500;
    public boolean e;

    /* compiled from: ANRDetectorRunnable.kt */
    /* renamed from: com.amazon.aps.iva.uq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class RunnableC0771a implements Runnable {
        public boolean b;

        @Override // java.lang.Runnable
        public final synchronized void run() {
            this.b = true;
            notifyAll();
        }
    }

    public a(Handler handler) {
        this.b = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!Thread.interrupted() && !this.e) {
            try {
                RunnableC0771a runnableC0771a = new RunnableC0771a();
                synchronized (runnableC0771a) {
                    if (!this.b.post(runnableC0771a)) {
                        return;
                    }
                    runnableC0771a.wait(this.c);
                    if (!runnableC0771a.b) {
                        f fVar = c.c;
                        e eVar = e.SOURCE;
                        Thread thread = this.b.getLooper().getThread();
                        j.e(thread, "handler.looper.thread");
                        fVar.r("Application Not Responding", eVar, new b(thread), a0.b);
                        runnableC0771a.wait();
                    }
                    q qVar = q.a;
                }
                long j = this.d;
                if (j > 0) {
                    Thread.sleep(j);
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
