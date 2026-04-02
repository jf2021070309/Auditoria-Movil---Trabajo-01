package com.amazon.aps.iva.vu;

import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.yb0.j;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: ThreadExecutors.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final ExecutorService a;
    public static final ExecutorC0809a b;

    /* compiled from: ThreadExecutors.kt */
    /* renamed from: com.amazon.aps.iva.vu.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class ExecutorC0809a implements Executor {
        public final Handler b = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            j.f(runnable, "command");
            this.b.post(runnable);
        }
    }

    static {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
        j.e(newFixedThreadPool, "newFixedThreadPool(3)");
        a = newFixedThreadPool;
        b = new ExecutorC0809a();
    }
}
