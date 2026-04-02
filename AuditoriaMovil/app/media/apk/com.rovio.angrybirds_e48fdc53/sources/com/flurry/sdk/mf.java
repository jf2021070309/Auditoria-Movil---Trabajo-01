package com.flurry.sdk;

import android.content.Context;
import com.flurry.sdk.ls;
import java.lang.Thread;
/* loaded from: classes2.dex */
public class mf implements kr, ls.a, Thread.UncaughtExceptionHandler {
    private static final String a = mf.class.getSimpleName();
    private boolean b;

    @Override // com.flurry.sdk.kr
    public final void a(Context context) {
        lr a2 = lr.a();
        this.b = ((Boolean) a2.a("CaptureUncaughtExceptions")).booleanValue();
        a2.a("CaptureUncaughtExceptions", (ls.a) this);
        ko.a(4, a, "initSettings, CrashReportingEnabled = " + this.b);
        mg a3 = mg.a();
        synchronized (a3.b) {
            a3.b.put(this, null);
        }
    }

    @Override // com.flurry.sdk.ls.a
    public final void a(String str, Object obj) {
        if (str.equals("CaptureUncaughtExceptions")) {
            this.b = ((Boolean) obj).booleanValue();
            ko.a(4, a, "onSettingUpdate, CrashReportingEnabled = " + this.b);
            return;
        }
        ko.a(6, a, "onSettingUpdate internal error!");
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        th.printStackTrace();
        if (this.b) {
            String str = "";
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null && stackTrace.length > 0) {
                StringBuilder sb = new StringBuilder();
                if (th.getMessage() != null) {
                    sb.append(" (").append(th.getMessage()).append(")\n");
                }
                str = sb.toString();
            } else if (th.getMessage() != null) {
                str = th.getMessage();
            }
            hs.a();
            hs.a("uncaught", str, th);
        }
        lo.a().d();
        jr.a().f();
    }
}
