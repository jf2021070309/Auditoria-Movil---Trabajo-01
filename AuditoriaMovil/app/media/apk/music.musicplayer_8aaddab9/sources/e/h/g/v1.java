package e.h.g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public abstract class v1 {
    public Handler a;

    /* renamed from: b  reason: collision with root package name */
    public b f8398b;

    /* loaded from: classes2.dex */
    public static class a extends Handler {
        public WeakReference<v1> a;

        public a(Looper looper, v1 v1Var) {
            super(looper);
            this.a = new WeakReference<>(v1Var);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            v1 v1Var = this.a.get();
            if (v1Var != null) {
                try {
                    v1Var.b(message);
                } catch (Exception e2) {
                    s1.l(e2, true);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Runnable {
        public final Object a;

        /* renamed from: b  reason: collision with root package name */
        public Looper f8399b;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<v1> f8400c;

        public b(v1 v1Var, String str) {
            Object obj = new Object();
            this.a = obj;
            this.f8400c = new WeakReference<>(v1Var);
            Thread thread = new Thread(null, this, str);
            thread.setPriority(1);
            thread.start();
            synchronized (obj) {
                while (this.f8399b == null) {
                    try {
                        this.a.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            synchronized (this.a) {
                Looper.prepare();
                this.f8399b = Looper.myLooper();
                this.a.notifyAll();
            }
            try {
                Looper.loop();
            } catch (IllegalStateException | NullPointerException | OutOfMemoryError e2) {
                if (this.f8400c.get() != null) {
                    s1.l(e2, true);
                }
            }
        }
    }

    public v1(String str) {
        try {
            this.f8398b = new b(this, str);
            this.a = new a(this.f8398b.f8399b, this);
        } catch (Throwable unused) {
        }
    }

    public void a(int i2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.removeMessages(i2);
        }
    }

    public abstract void b(Message message);

    public Message c(int i2, Object obj) {
        Handler handler = this.a;
        if (handler != null) {
            return handler.obtainMessage(i2, obj);
        }
        return null;
    }

    public void d() {
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        b bVar = this.f8398b;
        if (bVar != null) {
            bVar.f8399b.quit();
        }
    }

    public void e(Message message, int i2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.sendMessageDelayed(message, i2);
        }
    }

    public void f(Message message) {
        Handler handler = this.a;
        if (handler != null) {
            handler.sendMessage(message);
        }
    }

    public void g(int i2) {
        Handler handler = this.a;
        if (handler != null) {
            handler.obtainMessage(i2).sendToTarget();
        }
    }
}
