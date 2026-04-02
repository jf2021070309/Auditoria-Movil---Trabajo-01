package i.a;

import java.lang.Thread;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
/* loaded from: classes2.dex */
public final class d0 {
    public static final List<CoroutineExceptionHandler> a = e.j.d.w.H0(e.j.d.w.g(defpackage.a.a()));

    public static final void a(h.m.f fVar, Throwable th) {
        Throwable runtimeException;
        for (CoroutineExceptionHandler coroutineExceptionHandler : a) {
            try {
                coroutineExceptionHandler.handleException(fVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    e.j.d.w.f(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, runtimeException);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
