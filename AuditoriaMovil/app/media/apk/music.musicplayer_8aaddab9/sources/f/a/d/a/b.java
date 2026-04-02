package f.a.d.a;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import e.j.d.w;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class b extends f.a.a {
    public final Handler a;

    /* loaded from: classes2.dex */
    public static final class a implements Runnable, f.a.e.b {
        public final Handler a;

        /* renamed from: b  reason: collision with root package name */
        public final Runnable f8910b;

        public a(Handler handler, Runnable runnable) {
            this.a = handler;
            this.f8910b = runnable;
        }

        @Override // f.a.e.b
        public void dispose() {
            this.a.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f8910b.run();
            } catch (Throwable th) {
                w.e0(th);
            }
        }
    }

    public b(Handler handler, boolean z) {
        this.a = handler;
    }

    @Override // f.a.a
    @SuppressLint({"NewApi"})
    public f.a.e.b a(Runnable runnable, long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        Handler handler = this.a;
        a aVar = new a(handler, runnable);
        this.a.sendMessageDelayed(Message.obtain(handler, aVar), timeUnit.toMillis(j2));
        return aVar;
    }
}
