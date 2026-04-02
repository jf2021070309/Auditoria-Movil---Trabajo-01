package i.a.f2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import e.j.d.w;
import h.g;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class c {
    private static volatile Choreographer choreographer;

    static {
        Object y;
        try {
            y = new a(a(Looper.getMainLooper(), true), null, false);
        } catch (Throwable th) {
            y = w.y(th);
        }
        b bVar = (b) (y instanceof g.a ? null : y);
    }

    public static final Handler a(Looper looper, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT < 28) {
                try {
                    return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
                } catch (NoSuchMethodException unused) {
                    return new Handler(looper);
                }
            }
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        return new Handler(looper);
    }
}
