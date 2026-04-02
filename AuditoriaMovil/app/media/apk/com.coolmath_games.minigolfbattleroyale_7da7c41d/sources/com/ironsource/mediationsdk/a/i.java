package com.ironsource.mediationsdk.a;

import android.os.Handler;
import android.os.HandlerThread;
/* loaded from: classes2.dex */
public final class i extends Thread {
    private static i b;
    private a a;

    /* loaded from: classes2.dex */
    class a extends HandlerThread {
        Handler a;

        a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }
    }

    private i() {
        a aVar = new a(getClass().getSimpleName());
        this.a = aVar;
        aVar.start();
        a aVar2 = this.a;
        aVar2.a = new Handler(aVar2.getLooper());
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (b == null) {
                b = new i();
            }
            iVar = b;
        }
        return iVar;
    }

    public final synchronized void a(Runnable runnable) {
        if (this.a == null) {
            return;
        }
        Handler handler = this.a.a;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
