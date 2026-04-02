package com.kwad.sdk.crash;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.kwad.sdk.crash.g;
import com.kwad.sdk.crash.handler.AnrHandler;
import com.kwad.sdk.crash.handler.NativeCrashHandler;
import com.kwad.sdk.crash.model.message.ExceptionMessage;
import com.kwad.sdk.utils.y;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class b {
    private static volatile boolean azz = false;
    private static volatile boolean azA = false;
    private static Handler TW = new Handler(Looper.getMainLooper());
    private static final AtomicBoolean ISLOADED = new AtomicBoolean(false);
    private static final String[] azB = {"c++_shared", "kscutils", "exception-handler"};
    private static boolean azC = false;
    private static boolean azD = false;

    public static boolean El() {
        if (ISLOADED.get()) {
            return true;
        }
        try {
            for (String str : azB) {
                System.loadLibrary(str);
            }
            ISLOADED.set(true);
            return true;
        } catch (Throwable th) {
            ISLOADED.set(false);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Em() {
        AnrHandler.getInstance().init(com.kwad.sdk.crash.a.a.EN(), new f() { // from class: com.kwad.sdk.crash.b.5
            @Override // com.kwad.sdk.crash.f
            public final void a(int i, ExceptionMessage exceptionMessage) {
                e.EB().b(i, exceptionMessage);
            }
        }, new com.kwad.sdk.crash.report.c() { // from class: com.kwad.sdk.crash.b.6
            @Override // com.kwad.sdk.crash.report.e
            public final File Ex() {
                return new File(com.kwad.sdk.crash.a.a.EL(), "anr_log/upload");
            }

            @Override // com.kwad.sdk.crash.report.e
            public final void a(ExceptionMessage exceptionMessage, CountDownLatch countDownLatch) {
                com.kwad.sdk.core.e.c.d("ExceptionCollector", "ANR upload");
                a(exceptionMessage, 3, countDownLatch);
            }
        });
    }

    private static synchronized void En() {
        synchronized (b.class) {
            if (!azz) {
                azz = true;
                com.kwad.sdk.core.threads.a.CM().postDelayed(new Runnable() { // from class: com.kwad.sdk.crash.b.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            b.Eo();
                        } catch (Throwable th) {
                        }
                    }
                }, TimeUnit.SECONDS.toMillis(d.aAb));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Eo() {
        Ep();
        if (azC) {
            Eq();
        }
        if (azD) {
            Er();
        }
    }

    private static void Ep() {
        com.kwad.sdk.core.e.c.d("ExceptionCollector", "reportJavaException");
        com.kwad.sdk.crash.report.f fVar = new com.kwad.sdk.crash.report.f();
        fVar.a(com.kwad.sdk.crash.handler.c.ER().getUploader());
        fVar.C(com.kwad.sdk.crash.a.a.EM());
    }

    private static void Eq() {
        com.kwad.sdk.core.e.c.d("ExceptionCollector", "reportAnrException");
        com.kwad.sdk.crash.report.b bVar = new com.kwad.sdk.crash.report.b();
        bVar.a(AnrHandler.getInstance().getUploader());
        bVar.C(com.kwad.sdk.crash.a.a.EN());
    }

    private static void Er() {
        com.kwad.sdk.core.e.c.d("ExceptionCollector", "reportNativeException");
        com.kwad.sdk.crash.report.g gVar = new com.kwad.sdk.crash.report.g();
        gVar.a(NativeCrashHandler.getInstance().getUploader());
        gVar.C(com.kwad.sdk.crash.a.a.EO());
    }

    public static void a(c cVar) {
        if (cVar.context == null || azA) {
            return;
        }
        azA = true;
        azC = cVar.azC;
        azD = cVar.azD;
        try {
            com.kwad.sdk.crash.utils.e.init(cVar.context);
            com.kwad.sdk.crash.a.a.init(cVar.context, cVar.azO);
            e.EB().a(cVar);
            bw(cVar.context);
            if (!bv(cVar.context) && (azC || azD)) {
                g.a(cVar, new g.a() { // from class: com.kwad.sdk.crash.b.1
                    @Override // com.kwad.sdk.crash.g.a
                    public final void Ew() {
                        b.TW.post(new Runnable() { // from class: com.kwad.sdk.crash.b.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (b.azC) {
                                    b.Em();
                                }
                                if (b.azD) {
                                    b.c(false, "/sdcard/");
                                }
                            }
                        });
                    }
                });
            }
            En();
        } catch (Throwable th) {
        }
    }

    private static boolean bv(Context context) {
        return context == null || y.cc(context) >= 3;
    }

    private static void bw(Context context) {
        com.kwad.sdk.crash.handler.c.ER().init(com.kwad.sdk.crash.a.a.EM(), new f() { // from class: com.kwad.sdk.crash.b.3
            @Override // com.kwad.sdk.crash.f
            public final void a(int i, ExceptionMessage exceptionMessage) {
                e.EB().b(i, exceptionMessage);
            }
        }, new com.kwad.sdk.crash.report.c() { // from class: com.kwad.sdk.crash.b.4
            @Override // com.kwad.sdk.crash.report.e
            public final File Ex() {
                return new File(com.kwad.sdk.crash.a.a.EL(), "java_crash/upload");
            }

            @Override // com.kwad.sdk.crash.report.e
            public final void a(ExceptionMessage exceptionMessage, CountDownLatch countDownLatch) {
                a(exceptionMessage, 1, countDownLatch);
            }
        });
        Thread.setDefaultUncaughtExceptionHandler(new com.kwad.sdk.crash.handler.d(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(boolean z, String str) {
        if (com.kwad.sdk.crash.a.a.A(com.kwad.sdk.crash.a.a.EO())) {
            NativeCrashHandler.getInstance().init(com.kwad.sdk.crash.a.a.EO(), z, str, new com.kwad.sdk.crash.report.c() { // from class: com.kwad.sdk.crash.b.7
                @Override // com.kwad.sdk.crash.report.e
                public final File Ex() {
                    return new File(com.kwad.sdk.crash.a.a.EL(), "native_crash_log/upload");
                }

                @Override // com.kwad.sdk.crash.report.e
                public final void a(ExceptionMessage exceptionMessage, CountDownLatch countDownLatch) {
                    com.kwad.sdk.core.e.c.d("ExceptionCollector", "Native upload");
                    a(exceptionMessage, 4, countDownLatch);
                }
            });
        }
    }

    public static void l(final Throwable th) {
        com.kwad.sdk.utils.g.execute(new Runnable() { // from class: com.kwad.sdk.crash.b.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (com.kwad.sdk.crash.b.a.m(th)) {
                        com.kwad.sdk.crash.handler.a.n(th);
                    }
                } catch (Throwable th2) {
                    com.kwad.sdk.core.e.c.printStackTrace(th2);
                }
            }
        });
    }
}
