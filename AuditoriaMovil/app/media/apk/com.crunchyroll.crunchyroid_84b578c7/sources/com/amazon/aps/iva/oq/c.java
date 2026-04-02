package com.amazon.aps.iva.oq;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.eq.b;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonParseException;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: UserInfoDeserializer.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.sp.d<com.amazon.aps.iva.eq.b> {
    public final com.amazon.aps.iva.iq.a a;

    public c(com.amazon.aps.iva.iq.a aVar) {
        j.f(aVar, "internalLogger");
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.sp.d
    public final com.amazon.aps.iva.eq.b a(String str) {
        try {
            return b.a.a(str);
        } catch (JsonParseException e) {
            String format = String.format(Locale.US, "Error while trying to deserialize the serialized UserInfo: %s", Arrays.copyOf(new Object[]{str}, 1));
            j.e(format, "format(locale, this, *args)");
            l1.z(this.a, format, e, 4);
            return null;
        }
    }
}
