package f.a.d.a;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes2.dex */
public final class a {
    public static final f.a.a a;

    /* renamed from: f.a.d.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0198a {
        public static final f.a.a a = new b(new Handler(Looper.getMainLooper()), false);
    }

    static {
        try {
            f.a.a aVar = C0198a.a;
            if (aVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            a = aVar;
        } catch (Throwable th) {
            throw f.a.h.d.a.a(th);
        }
    }
}
