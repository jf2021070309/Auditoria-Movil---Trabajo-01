package com.fyber.inneractive.sdk.player.c.j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class s {
    public final ExecutorService a;
    public b<? extends c> b;
    public IOException c;

    /* loaded from: classes.dex */
    public interface a<T extends c> {
        int a(T t, IOException iOException);

        void a(T t);

        void a(T t, boolean z);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        boolean b();

        void c() throws IOException, InterruptedException;
    }

    /* loaded from: classes.dex */
    public static final class d extends IOException {
        public d(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public s(String str) {
        this.a = com.fyber.inneractive.sdk.player.c.k.t.a(str);
    }

    public final boolean a() {
        return this.b != null;
    }

    public final void b() {
        this.b.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b<T extends c> extends Handler implements Runnable {
        public final int a;
        public IOException b;
        public int c;
        private final T e;
        private final a<T> f;
        private final long g;
        private volatile Thread h;
        private volatile boolean i;

        public b(Looper looper, T t, a<T> aVar, int i, long j) {
            super(looper);
            this.e = t;
            this.f = aVar;
            this.a = i;
            this.g = j;
        }

        public final void a(long j) {
            com.fyber.inneractive.sdk.player.c.k.a.b(s.this.b == null);
            s.this.b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                a();
            }
        }

        public final void a(boolean z) {
            this.i = z;
            this.b = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.e.a();
                if (this.h != null) {
                    this.h.interrupt();
                }
            }
            if (z) {
                b();
                SystemClock.elapsedRealtime();
                this.f.a((a<T>) this.e, true);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.h = Thread.currentThread();
                if (!this.e.b()) {
                    com.fyber.inneractive.sdk.player.c.k.s.a("load:" + this.e.getClass().getSimpleName());
                    try {
                        this.e.c();
                        com.fyber.inneractive.sdk.player.c.k.s.a();
                    } catch (Throwable th) {
                        com.fyber.inneractive.sdk.player.c.k.s.a();
                        throw th;
                    }
                }
                if (this.i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.i) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (Error e2) {
                Log.e("LoadTask", "Unexpected error loading stream", e2);
                if (!this.i) {
                    obtainMessage(4, e2).sendToTarget();
                }
                throw e2;
            } catch (InterruptedException unused) {
                com.fyber.inneractive.sdk.player.c.k.a.b(this.e.b());
                if (this.i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e3) {
                Log.e("LoadTask", "Unexpected exception loading stream", e3);
                if (this.i) {
                    return;
                }
                obtainMessage(3, new d(e3)).sendToTarget();
            } catch (OutOfMemoryError e4) {
                Log.e("LoadTask", "OutOfMemory error loading stream", e4);
                if (this.i) {
                    return;
                }
                obtainMessage(3, new d(e4)).sendToTarget();
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.i) {
                return;
            }
            if (message.what == 0) {
                a();
            } else if (message.what == 4) {
                throw ((Error) message.obj);
            } else {
                b();
                SystemClock.elapsedRealtime();
                if (this.e.b()) {
                    this.f.a((a<T>) this.e, false);
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    this.f.a((a<T>) this.e, false);
                } else if (i == 2) {
                    this.f.a(this.e);
                } else if (i != 3) {
                } else {
                    IOException iOException = (IOException) message.obj;
                    this.b = iOException;
                    int a = this.f.a((a<T>) this.e, iOException);
                    if (a == 3) {
                        s.this.c = this.b;
                    } else if (a != 2) {
                        int i2 = a == 1 ? 1 : this.c + 1;
                        this.c = i2;
                        a(Math.min((i2 - 1) * 1000, 5000));
                    }
                }
            }
        }

        private void a() {
            this.b = null;
            s.this.a.execute(s.this.b);
        }

        private void b() {
            s.this.b = null;
        }
    }
}
