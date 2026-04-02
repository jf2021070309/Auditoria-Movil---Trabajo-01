package com.amazon.aps.iva.te0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.k;
/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes4.dex */
public final class h {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object H;
        try {
            H = new f(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            H = x.H(th);
        }
        if (H instanceof k.a) {
            H = null;
        }
        g gVar = (g) H;
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
