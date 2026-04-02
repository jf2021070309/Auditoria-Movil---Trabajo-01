package e.h.g.o1;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import e.h.g.j0;
import e.h.g.j1;
import e.h.g.r0;
import e.h.g.s1;
import e.h.g.u1;
import e.h.g.x;
import e.h.g.x0;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public abstract class c extends Service {
    public static final ReentrantLock a = new ReentrantLock(true);

    /* renamed from: b  reason: collision with root package name */
    public static final ReentrantLock f8340b = new ReentrantLock(true);

    /* renamed from: c  reason: collision with root package name */
    public String f8341c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8344f;

    /* renamed from: i  reason: collision with root package name */
    public volatile b f8347i;

    /* renamed from: j  reason: collision with root package name */
    public volatile Looper f8348j;

    /* renamed from: k  reason: collision with root package name */
    public u1 f8349k;

    /* renamed from: d  reason: collision with root package name */
    public int f8342d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final SparseIntArray f8343e = new SparseIntArray();

    /* renamed from: g  reason: collision with root package name */
    public boolean f8345g = false;

    /* renamed from: h  reason: collision with root package name */
    public a f8346h = new a(this);

    /* loaded from: classes2.dex */
    public static class a {
        public RunnableC0178a a = new RunnableC0178a(this);

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<c> f8350b;

        /* renamed from: e.h.g.o1.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class RunnableC0178a implements Runnable {
            public final WeakReference<a> a;

            public RunnableC0178a(a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar;
                b bVar;
                Message obtainMessage;
                a aVar = this.a.get();
                if (aVar == null || (cVar = aVar.f8350b.get()) == null || (bVar = cVar.f8347i) == null || (obtainMessage = bVar.obtainMessage()) == null) {
                    return;
                }
                obtainMessage.arg2 = 1;
                try {
                    bVar.sendMessage(obtainMessage);
                } catch (Throwable unused) {
                    c.d(cVar, obtainMessage);
                }
            }
        }

        public a(c cVar) {
            this.f8350b = new WeakReference<>(cVar);
        }

        public final void a() {
            if (this.f8350b.get() != null) {
                Handler handler = x0.a;
                synchronized (handler) {
                    handler.removeCallbacks(this.a);
                }
            }
        }

        public final void b() {
            a();
            if (this.f8350b.get() != null) {
                Handler handler = x0.a;
                synchronized (handler) {
                    handler.removeCallbacks(this.a);
                    handler.postDelayed(this.a, 3000L);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends Handler {
        public WeakReference<c> a;

        public b(Looper looper, c cVar) {
            super(looper);
            this.a = new WeakReference<>(cVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                c.d(this.a.get(), message);
            } catch (Throwable th) {
                s1.l(th, true);
            }
        }
    }

    public c(String str, boolean z) {
        this.f8344f = false;
        this.f8341c = str;
        this.f8349k = new u1(str);
        this.f8344f = z;
    }

    public static void d(c cVar, Message message) {
        b bVar = cVar.f8347i;
        if (bVar == null) {
            return;
        }
        x0 x0Var = x0.f8405d;
        if (x0Var != null) {
            try {
                x0Var.u();
            } catch (Throwable th) {
                s1.l(th, true);
                cVar.stopSelf();
                return;
            }
        }
        int i2 = message.arg2;
        if (i2 == 1) {
            if (cVar.f8342d > 0 || bVar.hasMessages(0) || cVar.f8345g) {
                return;
            }
            cVar.c();
            cVar.i();
        } else if (i2 == 2) {
            cVar.f8346h.b();
            Intent intent = (Intent) message.obj;
            if (cVar.f8344f) {
                cVar.e();
            }
            cVar.h(intent);
        } else {
            cVar.f8346h.a();
            Intent intent2 = (Intent) message.obj;
            if (cVar.f8344f) {
                cVar.e();
            }
            cVar.h(intent2);
            if (cVar.f8342d > 0 || cVar.f8345g) {
                return;
            }
            cVar.stopSelf(message.arg1);
            cVar.i();
        }
    }

    public abstract IBinder a(Intent intent);

    public abstract boolean b(Intent intent);

    public void c() {
        stopSelf();
    }

    public boolean e() {
        boolean z;
        ReentrantLock reentrantLock = f8340b;
        reentrantLock.lock();
        try {
            if (this.f8348j != null) {
                try {
                    this.f8349k.a(TimeUnit.MINUTES.toMillis(1L));
                    z = true;
                } catch (NullPointerException unused) {
                }
                reentrantLock.unlock();
                return z;
            }
            z = false;
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void f() {
        try {
            ReentrantLock reentrantLock = f8340b;
            reentrantLock.lock();
            u1 u1Var = this.f8349k;
            if (u1Var != null) {
                u1Var.b();
                this.f8349k = null;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            s1.l(th, true);
        }
    }

    public void g(int i2) {
        synchronized (this.f8343e) {
            if (this.f8343e.indexOfKey(i2) < 0) {
                this.f8343e.put(i2, i2);
                this.f8345g = true;
            }
        }
    }

    public abstract void h(Intent intent);

    public final void i() {
        j0.c(new j0.b() { // from class: e.h.g.o1.b
            @Override // e.h.g.j0.b
            public final void a() {
                c cVar = c.this;
                Objects.requireNonNull(cVar);
                j1.o(TimeUnit.SECONDS.toMillis(5L), new r0());
                cVar.f();
            }
        });
    }

    public void j(Integer num) {
        synchronized (this.f8343e) {
            if (this.f8343e.size() > 0) {
                if (this.f8343e.indexOfKey(num.intValue()) >= 0) {
                    this.f8343e.delete(num.intValue());
                }
                if (this.f8343e.size() <= 0) {
                    this.f8345g = false;
                    this.f8346h.b();
                }
            }
        }
    }

    public void k(Intent intent) {
        Message obtainMessage;
        b bVar = this.f8347i;
        if (bVar == null || (obtainMessage = bVar.obtainMessage(0)) == null) {
            return;
        }
        obtainMessage.arg2 = 2;
        obtainMessage.obj = intent;
        try {
            bVar.sendMessage(obtainMessage);
        } catch (RuntimeException unused) {
            this.f8346h.b();
        }
    }

    public abstract void l(String str);

    public final void m() {
        if (this.f8348j != null) {
            try {
                Intent intent = new Intent();
                ComponentName componentName = new ComponentName(this, getClass());
                intent.setAction(null);
                intent.setComponent(componentName);
                startService(intent);
            } catch (IllegalStateException e2) {
                s1.l(e2, false);
                j0.c cVar = new j0.c() { // from class: e.h.g.o1.a
                    @Override // e.h.g.j0.c
                    public final void a() {
                        c.this.m();
                    }
                };
                ExecutorService executorService = j0.a;
                x0.a.postDelayed(new x(cVar), 1000L);
            } catch (RuntimeException e3) {
                s1.l(e3, true);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            this.f8342d++;
            this.f8346h.b();
            m();
            IBinder a2 = a(intent);
            reentrantLock.unlock();
            return a2;
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (getApplicationContext() instanceof x0) {
            ((x0) getApplicationContext()).B(false);
        }
        HandlerThread handlerThread = new HandlerThread(e.a.d.a.a.r(e.a.d.a.a.y("IntentService["), this.f8341c, "]"));
        handlerThread.start();
        this.f8348j = handlerThread.getLooper();
        this.f8347i = new b(this.f8348j, this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.f8346h.a();
            this.f8348j.quit();
            this.f8348j = null;
            this.f8347i = null;
            super.onDestroy();
        } finally {
            f();
        }
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        onBind(intent);
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        super.onStart(intent, i2);
        if (intent != null) {
            String action = intent.getAction();
            l(action);
            if (action != null) {
                if (action.equals("com.jrtstudio.cancel")) {
                    c();
                    i();
                    return;
                } else if (action.equals("com.jrtstudio.hold")) {
                    return;
                }
            }
            Message obtainMessage = this.f8347i.obtainMessage(0);
            if (obtainMessage != null) {
                obtainMessage.arg1 = i2;
                obtainMessage.arg2 = 0;
                intent.putExtra("intentreceivetime", System.currentTimeMillis());
                obtainMessage.obj = intent;
                this.f8347i.sendMessage(obtainMessage);
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        onStart(intent, i3);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        ReentrantLock reentrantLock = a;
        reentrantLock.lock();
        try {
            this.f8342d--;
            boolean b2 = b(intent);
            if (this.f8342d <= 0) {
                this.f8346h.b();
            }
            reentrantLock.unlock();
            return b2;
        } catch (Throwable th) {
            try {
                reentrantLock.unlock();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
