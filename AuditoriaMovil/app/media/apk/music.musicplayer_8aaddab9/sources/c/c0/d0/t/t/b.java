package c.c0.d0.t.t;

import android.os.Handler;
import android.os.Looper;
import c.c0.d0.t.j;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class b implements c.c0.d0.t.t.a {
    public final j a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f1595b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final Executor f1596c = new a();

    /* loaded from: classes.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.f1595b.post(runnable);
        }
    }

    public b(Executor executor) {
        this.a = new j(executor);
    }
}
