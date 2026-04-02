package com.amazon.aps.iva.k6;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amazon.aps.iva.k6.f;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: classes.dex */
public final class e extends Handler {
    public final /* synthetic */ f a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Looper looper) {
        super(looper);
        this.a = fVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        f fVar = this.a;
        fVar.getClass();
        int i = message.what;
        f.a aVar = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    AtomicReference<RuntimeException> atomicReference = fVar.d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                    }
                } else {
                    fVar.e.c();
                }
            } else {
                f.a aVar2 = (f.a) message.obj;
                int i2 = aVar2.a;
                int i3 = aVar2.b;
                MediaCodec.CryptoInfo cryptoInfo = aVar2.d;
                long j = aVar2.e;
                int i4 = aVar2.f;
                try {
                    synchronized (f.h) {
                        fVar.a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                    }
                } catch (RuntimeException e) {
                    AtomicReference<RuntimeException> atomicReference2 = fVar.d;
                    while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
                    }
                }
                aVar = aVar2;
            }
        } else {
            f.a aVar3 = (f.a) message.obj;
            try {
                fVar.a.queueInputBuffer(aVar3.a, aVar3.b, aVar3.c, aVar3.e, aVar3.f);
            } catch (RuntimeException e2) {
                AtomicReference<RuntimeException> atomicReference3 = fVar.d;
                while (!atomicReference3.compareAndSet(null, e2) && atomicReference3.get() == null) {
                }
            }
            aVar = aVar3;
        }
        if (aVar != null) {
            ArrayDeque<f.a> arrayDeque = f.g;
            synchronized (arrayDeque) {
                arrayDeque.add(aVar);
            }
        }
    }
}
