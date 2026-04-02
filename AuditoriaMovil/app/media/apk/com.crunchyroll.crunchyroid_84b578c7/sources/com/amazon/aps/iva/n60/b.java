package com.amazon.aps.iva.n60;

import com.amazon.aps.iva.cx.p;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ScreenReloadDebouncer.kt */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: ScreenReloadDebouncer.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static c a(p pVar) {
            com.amazon.aps.iva.n60.a aVar = com.amazon.aps.iva.n60.a.h;
            j.f(aVar, "createDebouncedTimeExecutor");
            return new c(pVar, aVar);
        }
    }

    void a(com.amazon.aps.iva.xb0.a<q> aVar);

    void b(com.amazon.aps.iva.xb0.a<q> aVar);

    void c(com.amazon.aps.iva.xb0.a<q> aVar);
}
