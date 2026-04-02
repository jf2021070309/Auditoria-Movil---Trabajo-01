package com.amazon.aps.iva.t6;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.t5.d0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.p;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: Loader.java */
/* loaded from: classes.dex */
public final class k implements l {
    public static final b d = new b(0, -9223372036854775807L);
    public static final b e = new b(2, -9223372036854775807L);
    public static final b f = new b(3, -9223372036854775807L);
    public final ExecutorService a;
    public c<? extends d> b;
    public IOException c;

    /* compiled from: Loader.java */
    /* loaded from: classes.dex */
    public interface a<T extends d> {
        b d(T t, long j, long j2, IOException iOException, int i);

        void i(T t, long j, long j2, boolean z);

        void u(T t, long j, long j2);
    }

    /* compiled from: Loader.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public final boolean a() {
            int i = this.a;
            if (i == 0 || i == 1) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Loader.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public final class c<T extends d> extends Handler implements Runnable {
        public final int b;
        public final T c;
        public final long d;
        public a<T> e;
        public IOException f;
        public int g;
        public Thread h;
        public boolean i;
        public volatile boolean j;

        public c(Looper looper, T t, a<T> aVar, int i, long j) {
            super(looper);
            this.c = t;
            this.e = aVar;
            this.b = i;
            this.d = j;
        }

        public final void a(boolean z) {
            this.j = z;
            this.f = null;
            if (hasMessages(0)) {
                this.i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.i = true;
                    this.c.b();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                k.this.b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a<T> aVar = this.e;
                aVar.getClass();
                aVar.i(this.c, elapsedRealtime, elapsedRealtime - this.d, true);
                this.e = null;
            }
        }

        public final void b(long j) {
            boolean z;
            k kVar = k.this;
            if (kVar.b == null) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.C(z);
            kVar.b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
                return;
            }
            this.f = null;
            ExecutorService executorService = kVar.a;
            c<? extends d> cVar = kVar.b;
            cVar.getClass();
            executorService.execute(cVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.j) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                this.f = null;
                k kVar = k.this;
                ExecutorService executorService = kVar.a;
                c<? extends d> cVar = kVar.b;
                cVar.getClass();
                executorService.execute(cVar);
            } else if (i != 3) {
                k.this.b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.d;
                a<T> aVar = this.e;
                aVar.getClass();
                if (this.i) {
                    aVar.i(this.c, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f = iOException;
                        int i3 = this.g + 1;
                        this.g = i3;
                        b d = aVar.d(this.c, elapsedRealtime, j, iOException, i3);
                        int i4 = d.a;
                        if (i4 == 3) {
                            k.this.c = this.f;
                            return;
                        } else if (i4 != 2) {
                            if (i4 == 1) {
                                this.g = 1;
                            }
                            long j2 = d.b;
                            if (j2 == -9223372036854775807L) {
                                j2 = Math.min((this.g - 1) * 1000, 5000);
                            }
                            b(j2);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                try {
                    aVar.u(this.c, elapsedRealtime, j);
                } catch (RuntimeException e) {
                    p.d("Unexpected exception handling load completed", e);
                    k.this.c = new g(e);
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    if (!this.i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.h = Thread.currentThread();
                }
                if (z) {
                    x.u("load:".concat(this.c.getClass().getSimpleName()));
                    this.c.a();
                    x.I();
                }
                synchronized (this) {
                    this.h = null;
                    Thread.interrupted();
                }
                if (!this.j) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.j) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (Exception e2) {
                if (!this.j) {
                    p.d("Unexpected exception loading stream", e2);
                    obtainMessage(2, new g(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                if (!this.j) {
                    p.d("OutOfMemory error loading stream", e3);
                    obtainMessage(2, new g(e3)).sendToTarget();
                }
            } catch (Error e4) {
                if (!this.j) {
                    p.d("Unexpected error loading stream", e4);
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    /* compiled from: Loader.java */
    /* loaded from: classes.dex */
    public interface d {
        void a() throws IOException;

        void b();
    }

    /* compiled from: Loader.java */
    /* loaded from: classes.dex */
    public interface e {
        void l();
    }

    /* compiled from: Loader.java */
    /* loaded from: classes.dex */
    public static final class f implements Runnable {
        public final e b;

        public f(e eVar) {
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.l();
        }
    }

    /* compiled from: Loader.java */
    /* loaded from: classes.dex */
    public static final class g extends IOException {
        public g(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public k(String str) {
        String concat = "ExoPlayer:Loader:".concat(str);
        int i = g0.a;
        this.a = Executors.newSingleThreadExecutor(new d0(concat));
    }

    @Override // com.amazon.aps.iva.t6.l
    public final void a() throws IOException {
        IOException iOException;
        IOException iOException2 = this.c;
        if (iOException2 == null) {
            c<? extends d> cVar = this.b;
            if (cVar != null && (iOException = cVar.f) != null && cVar.g > cVar.b) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public final void b() {
        c<? extends d> cVar = this.b;
        com.amazon.aps.iva.cq.b.D(cVar);
        cVar.a(false);
    }

    public final boolean c() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public final void e(e eVar) {
        c<? extends d> cVar = this.b;
        if (cVar != null) {
            cVar.a(true);
        }
        ExecutorService executorService = this.a;
        if (eVar != null) {
            executorService.execute(new f(eVar));
        }
        executorService.shutdown();
    }

    public final <T extends d> long f(T t, a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        com.amazon.aps.iva.cq.b.D(myLooper);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new c(myLooper, t, aVar, i, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }
}
