package com.amazon.aps.iva.nr;

import com.amazon.aps.iva.yb0.j;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: SpanEventMapperWrapper.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.gq.a<com.amazon.aps.iva.qr.a> {
    public final com.amazon.aps.iva.gq.c a;

    public b(com.amazon.aps.iva.gq.c cVar) {
        j.f(cVar, "wrappedEventMapper");
        this.a = cVar;
    }

    @Override // com.amazon.aps.iva.gq.a
    public final com.amazon.aps.iva.qr.a a(com.amazon.aps.iva.qr.a aVar) {
        com.amazon.aps.iva.qr.a aVar2 = aVar;
        j.f(aVar2, "event");
        com.amazon.aps.iva.qr.a b = this.a.b(aVar2);
        if (b != aVar2) {
            com.amazon.aps.iva.iq.a aVar3 = com.amazon.aps.iva.dq.c.b;
            String format = String.format(Locale.US, "SpanEventMapper: the returned mapped object was not the same instance as the original object. This event will be dropped: %s", Arrays.copyOf(new Object[]{aVar2}, 1));
            j.e(format, "format(locale, this, *args)");
            com.amazon.aps.iva.iq.a.e(aVar3, format, null, 6);
            return null;
        }
        return b;
    }
}
