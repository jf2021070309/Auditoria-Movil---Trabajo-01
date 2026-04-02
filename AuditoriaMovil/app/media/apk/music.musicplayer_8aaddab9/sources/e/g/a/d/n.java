package e.g.a.d;

import android.os.Handler;
import e.h.g.s1;
import e.h.g.x0;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes2.dex */
public abstract class n {
    public Thread a;

    /* renamed from: b  reason: collision with root package name */
    public Object f8027b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public boolean f8028c = false;

    /* renamed from: d  reason: collision with root package name */
    public final BlockingQueue<Object> f8029d = new LinkedBlockingQueue();

    public n() {
        Thread thread = new Thread(new Runnable() { // from class: e.g.a.d.h
            @Override // java.lang.Runnable
            public final void run() {
                n nVar = n.this;
                Objects.requireNonNull(nVar);
                Thread.currentThread().setPriority(1);
                while (!nVar.f8028c) {
                    try {
                        Object take = nVar.f8029d.take();
                        Handler handler = x0.a;
                        if (take == nVar.f8027b) {
                            take = null;
                        }
                        nVar.a(take);
                    } catch (InterruptedException unused) {
                    } catch (Exception e2) {
                        s1.l(e2, true);
                    }
                }
            }
        });
        this.a = thread;
        thread.setName("ReloadThread");
        this.a.start();
    }

    public abstract void a(Object obj);

    public void b(Object obj) {
        if (obj == null) {
            obj = this.f8027b;
        }
        try {
            if (this.f8029d.contains(obj)) {
                return;
            }
            this.f8029d.put(obj);
        } catch (Throwable th) {
            s1.l(th, true);
        }
    }
}
