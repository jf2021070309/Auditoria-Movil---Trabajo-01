package com.amazon.aps.iva.w9;

import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.u9.j;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* compiled from: WorkManagerTaskExecutor.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.w9.a {
    public final j a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final a c = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    /* loaded from: classes.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            b.this.b.post(runnable);
        }
    }

    public b(ExecutorService executorService) {
        this.a = new j(executorService);
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
