package com.amazon.aps.iva.xt;

import com.amazon.aps.iva.us.r;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CommentsAnalytics.kt */
/* loaded from: classes2.dex */
public interface b extends r {

    /* compiled from: CommentsAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static c a(com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.xb0.a aVar2) {
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            j.f(aVar, "screen");
            com.amazon.aps.iva.xt.a aVar3 = com.amazon.aps.iva.xt.a.h;
            j.f(aVar3, "createTimer");
            return new c(aVar, aVar2, aVar3);
        }
    }

    void a(Throwable th);
}
