package de.greenrobot.event;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class b implements Runnable {
    private final e a = new e();
    private volatile boolean b;
    private final EventBus c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(EventBus eventBus) {
        this.c = eventBus;
    }

    public void a(h hVar, Object obj) {
        d a = d.a(hVar, obj);
        synchronized (this) {
            this.a.a(a);
            if (!this.b) {
                this.b = true;
                EventBus.a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                d a = this.a.a(1000);
                if (a == null) {
                    synchronized (this) {
                        a = this.a.a();
                        if (a == null) {
                            this.b = false;
                            return;
                        }
                    }
                }
                this.c.a(a);
            } catch (InterruptedException e) {
                Log.w("Event", Thread.currentThread().getName() + " was interruppted", e);
                return;
            } finally {
                this.b = false;
            }
        }
    }
}
