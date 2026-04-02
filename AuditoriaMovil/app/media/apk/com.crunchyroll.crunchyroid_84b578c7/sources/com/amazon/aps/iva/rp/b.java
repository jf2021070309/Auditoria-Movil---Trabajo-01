package com.amazon.aps.iva.rp;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.eq.a;
import com.amazon.aps.iva.sp.d;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonParseException;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: NetworkInfoDeserializer.kt */
/* loaded from: classes2.dex */
public final class b implements d<com.amazon.aps.iva.eq.a> {
    public final com.amazon.aps.iva.iq.a a;

    public b(com.amazon.aps.iva.iq.a aVar) {
        j.f(aVar, "internalLogger");
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.sp.d
    public final com.amazon.aps.iva.eq.a a(String str) {
        try {
            return a.C0228a.a(str);
        } catch (JsonParseException e) {
            String format = String.format(Locale.US, "Error while trying to deserialize the serialized NetworkInfo: %s", Arrays.copyOf(new Object[]{str}, 1));
            j.e(format, "format(locale, this, *args)");
            l1.z(this.a, format, e, 4);
            return null;
        }
    }
}
