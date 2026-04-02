package com.fyber.inneractive.sdk.player.c.l;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.WindowManager;
/* loaded from: classes.dex */
public final class e {
    final a a;
    final boolean b;
    final long c;
    final long d;
    long e;
    long f;
    long g;
    boolean h;
    long i;
    long j;
    long k;

    public e() {
        this(-1.0d, false);
    }

    private e(double d, boolean z) {
        this.b = z;
        if (z) {
            this.a = a.a();
            long j = (long) (1.0E9d / d);
            this.c = j;
            this.d = (j * 80) / 100;
            return;
        }
        this.a = null;
        this.c = -1L;
        this.d = -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(long j, long j2) {
        return Math.abs((j2 - this.i) - (j - this.j)) > 20000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements Handler.Callback, Choreographer.FrameCallback {
        private static final a c = new a();
        public volatile long a;
        final Handler b;
        private final HandlerThread d;
        private Choreographer e;
        private int f;

        public static a a() {
            return c;
        }

        private a() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.d = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(this.d.getLooper(), this);
            this.b = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            this.a = j;
            this.e.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.e = Choreographer.getInstance();
                return true;
            } else if (i == 1) {
                int i2 = this.f + 1;
                this.f = i2;
                if (i2 == 1) {
                    this.e.postFrameCallback(this);
                }
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int i3 = this.f - 1;
                this.f = i3;
                if (i3 == 0) {
                    this.e.removeFrameCallback(this);
                    this.a = 0L;
                }
                return true;
            }
        }
    }

    public e(Context context) {
        this(((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate(), true);
    }
}
