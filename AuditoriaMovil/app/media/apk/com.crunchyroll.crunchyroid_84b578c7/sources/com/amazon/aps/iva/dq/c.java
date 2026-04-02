package com.amazon.aps.iva.dq;

import com.amazon.aps.iva.mq.d;
import com.amazon.aps.iva.mq.e;
import com.amazon.aps.iva.mq.f;
import com.amazon.aps.iva.mq.g;
import com.amazon.aps.iva.o6.h;
import com.amazon.aps.iva.yb0.j;
/* compiled from: RuntimeUtils.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final com.amazon.aps.iva.iq.a a;
    public static final com.amazon.aps.iva.iq.a b;

    static {
        e bVar;
        h hVar = new h(4);
        Boolean bool = com.amazon.aps.iva.jp.a.a;
        j.e(bool, "LOGCAT_ENABLED");
        if (bool.booleanValue()) {
            bVar = new f("DD_LOG", true);
        } else {
            bVar = new com.amazon.aps.iva.cq.b();
        }
        a = new com.amazon.aps.iva.iq.a(new d(bVar, new g(hVar)));
        b = new com.amazon.aps.iva.iq.a(new com.amazon.aps.iva.mq.b(new f("Datadog", false), b.h));
    }
}
