package com.amazon.aps.iva.lq;

import com.amazon.aps.iva.dq.c;
import com.amazon.aps.iva.yb0.j;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: LogEventMapperWrapper.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.gq.a<com.amazon.aps.iva.pq.a> {
    public final com.amazon.aps.iva.gq.a<com.amazon.aps.iva.pq.a> a;

    public a(com.amazon.aps.iva.gq.a<com.amazon.aps.iva.pq.a> aVar) {
        j.f(aVar, "wrappedEventMapper");
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.gq.a
    public final com.amazon.aps.iva.pq.a a(com.amazon.aps.iva.pq.a aVar) {
        com.amazon.aps.iva.pq.a aVar2 = aVar;
        j.f(aVar2, "event");
        com.amazon.aps.iva.pq.a a = this.a.a(aVar2);
        if (a == null) {
            com.amazon.aps.iva.iq.a aVar3 = c.b;
            String format = String.format(Locale.US, "LogEventMapper: the returned mapped object was null. This event will be dropped: %s", Arrays.copyOf(new Object[]{aVar2}, 1));
            j.e(format, "format(locale, this, *args)");
            com.amazon.aps.iva.iq.a.e(aVar3, format, null, 6);
        } else if (a != aVar2) {
            com.amazon.aps.iva.iq.a aVar4 = c.b;
            String format2 = String.format(Locale.US, "LogEventMapper: the returned mapped object was not the same instance as the original object. This event will be dropped: %s", Arrays.copyOf(new Object[]{aVar2}, 1));
            j.e(format2, "format(locale, this, *args)");
            com.amazon.aps.iva.iq.a.e(aVar4, format2, null, 6);
        } else {
            return a;
        }
        return null;
    }
}
