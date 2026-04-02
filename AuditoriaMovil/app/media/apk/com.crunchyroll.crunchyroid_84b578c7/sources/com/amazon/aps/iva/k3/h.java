package com.amazon.aps.iva.k3;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: ExecutorCompat.java */
/* loaded from: classes.dex */
public final class h implements Executor {
    public final Handler b;

    public h(Handler handler) {
        handler.getClass();
        this.b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Handler handler = this.b;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
