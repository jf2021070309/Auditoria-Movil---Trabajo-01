package i.a.i2;

import e.j.d.w;
/* loaded from: classes2.dex */
public final class p {
    public static final String a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f9080b;

    static {
        Object y;
        Object y2;
        try {
            y = Class.forName("h.m.i.a.a").getCanonicalName();
        } catch (Throwable th) {
            y = w.y(th);
        }
        if (h.g.a(y) != null) {
            y = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String) y;
        try {
            y2 = Class.forName("i.a.i2.p").getCanonicalName();
        } catch (Throwable th2) {
            y2 = w.y(th2);
        }
        if (h.g.a(y2) != null) {
            y2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f9080b = (String) y2;
    }
}
