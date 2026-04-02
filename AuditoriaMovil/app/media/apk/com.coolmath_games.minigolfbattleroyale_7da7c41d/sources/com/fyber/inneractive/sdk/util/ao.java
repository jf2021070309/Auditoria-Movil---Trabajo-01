package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ao {
    boolean a;
    public b b;
    public long c;
    private final TimeUnit d;
    private final long e;
    private Handler f;

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public ao(TimeUnit timeUnit, long j) {
        this.a = false;
        this.c = 0L;
        this.e = j;
        this.d = timeUnit;
        IAlog.b("Visible time counter init - time %d", Long.valueOf(j));
    }

    public ao(TimeUnit timeUnit, long j, long j2) {
        this.a = false;
        this.c = 0L;
        this.e = j;
        this.d = timeUnit;
        this.c = j2;
        IAlog.b("Visible time counter init - time %d", Long.valueOf(j));
    }

    public final void a() {
        a aVar = new a(this, (byte) 0);
        this.f = aVar;
        this.a = false;
        aVar.sendEmptyMessage(1932593528);
    }

    public final void b() {
        this.a = true;
        Handler handler = this.f;
        if (handler != null) {
            handler.removeMessages(1932593528);
        }
    }

    public final void c() {
        this.a = false;
        a(SystemClock.uptimeMillis());
    }

    /* loaded from: classes.dex */
    private static class a extends Handler {
        private final WeakReference<ao> a;

        /* synthetic */ a(ao aoVar, byte b) {
            this(aoVar);
        }

        private a(ao aoVar) {
            super(Looper.getMainLooper());
            this.a = new WeakReference<>(aoVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            ao aoVar = this.a.get();
            if (aoVar == null || message.what != 1932593528 || aoVar.a) {
                return;
            }
            aoVar.a(message.getWhen());
        }
    }

    final void a(long j) {
        long uptimeMillis = this.c + (SystemClock.uptimeMillis() - j) + 50;
        this.c = uptimeMillis;
        if (this.b != null && uptimeMillis > this.d.toMillis(this.e)) {
            this.b.a();
            return;
        }
        Handler handler = this.f;
        if (handler == null || this.b == null) {
            return;
        }
        handler.removeMessages(1932593528);
        this.f.sendEmptyMessageDelayed(1932593528, 50L);
    }

    public final void d() {
        this.a = false;
        this.c = 0L;
        Handler handler = this.f;
        if (handler != null) {
            handler.removeMessages(1932593528);
        }
    }
}
