package com.amazon.aps.iva.k6;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: classes.dex */
public final class f {
    public static final ArrayDeque<a> g = new ArrayDeque<>();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public e c;
    public final AtomicReference<RuntimeException> d;
    public final com.amazon.aps.iva.t5.f e;
    public boolean f;

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public int b;
        public int c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
        public long e;
        public int f;
    }

    public f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        com.amazon.aps.iva.t5.f fVar = new com.amazon.aps.iva.t5.f();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = fVar;
        this.d = new AtomicReference<>();
    }

    public final void a() {
        if (this.f) {
            try {
                e eVar = this.c;
                eVar.getClass();
                eVar.removeCallbacksAndMessages(null);
                com.amazon.aps.iva.t5.f fVar = this.e;
                synchronized (fVar) {
                    fVar.a = false;
                }
                e eVar2 = this.c;
                eVar2.getClass();
                eVar2.obtainMessage(2).sendToTarget();
                fVar.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void b() {
        RuntimeException andSet = this.d.getAndSet(null);
        if (andSet == null) {
            return;
        }
        throw andSet;
    }
}
