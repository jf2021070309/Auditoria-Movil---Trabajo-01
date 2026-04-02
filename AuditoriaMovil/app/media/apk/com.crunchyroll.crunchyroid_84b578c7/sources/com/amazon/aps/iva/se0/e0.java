package com.amazon.aps.iva.se0;

import java.lang.Thread;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes4.dex */
public final class e0 {
    public static final List<CoroutineExceptionHandler> a = com.amazon.aps.iva.ne0.s.f0(com.amazon.aps.iva.ne0.k.O(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    public static final void a(com.amazon.aps.iva.ob0.g gVar, Throwable th) {
        Throwable runtimeException;
        for (CoroutineExceptionHandler coroutineExceptionHandler : a) {
            try {
                coroutineExceptionHandler.handleException(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    com.amazon.aps.iva.aq.k.f(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, runtimeException);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            com.amazon.aps.iva.aq.k.f(th, new com.amazon.aps.iva.od0.v(gVar));
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } catch (Throwable th3) {
            com.amazon.aps.iva.ab.x.H(th3);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
