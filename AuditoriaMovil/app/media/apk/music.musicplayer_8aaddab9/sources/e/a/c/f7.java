package e.a.c;

import e.h.g.p1;
/* loaded from: classes.dex */
public class f7 {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static p1.b f5069b;

    public static p1.b a() {
        p1.b c2;
        p1.b bVar;
        e.h.g.x0 x0Var = e.h.g.x0.f8405d;
        synchronized (a) {
            if (f5069b == null) {
                String[] strArr = e.h.g.p1.a;
                synchronized (e.h.g.p1.class) {
                    c2 = e.h.g.p1.c(e.h.g.x0.f8405d, e.h.g.v0.g());
                }
                f5069b = c2;
            }
            bVar = f5069b;
        }
        return bVar;
    }
}
