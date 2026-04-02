package com.ironsource.environment;

import android.os.Build;
import java.lang.Thread;
/* loaded from: classes2.dex */
public final class d implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT >= 19) {
            StackTraceElement[] stackTrace2 = th.getStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append(th.toString());
            sb.append(System.lineSeparator());
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace2) {
                sb.append(stackTraceElement.toString());
                sb.append(";" + System.lineSeparator());
                if (stackTraceElement.toString().contains(e.a().b)) {
                    z = true;
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                sb.append("--CAUSE");
                sb.append(System.lineSeparator());
                sb.append(cause.toString());
                sb.append(System.lineSeparator());
                for (StackTraceElement stackTraceElement2 : cause.getStackTrace()) {
                    sb.append(stackTraceElement2.toString());
                    sb.append(";" + System.lineSeparator());
                    if (stackTraceElement2.toString().contains(e.a().b)) {
                        z = true;
                    }
                }
            }
            if (z) {
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(System.currentTimeMillis());
                new c(sb2, sb3.toString(), "Crash").d();
            }
            this.a.uncaughtException(thread, th);
        }
    }
}
