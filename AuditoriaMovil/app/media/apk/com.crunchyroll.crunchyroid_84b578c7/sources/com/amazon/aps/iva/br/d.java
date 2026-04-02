package com.amazon.aps.iva.br;

import com.amazon.aps.iva.br.c;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonParseException;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: NdkCrashLogDeserializer.kt */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.sp.d<c> {
    public final com.amazon.aps.iva.iq.a a;

    public d(com.amazon.aps.iva.iq.a aVar) {
        j.f(aVar, "internalLogger");
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.sp.d
    public final c a(String str) {
        com.amazon.aps.iva.iq.a aVar = this.a;
        try {
            return c.a.a(str);
        } catch (JsonParseException e) {
            String format = String.format(Locale.US, "Error while trying to deserialize the serialized NDK Crash info: %s", Arrays.copyOf(new Object[]{str}, 1));
            j.e(format, "format(locale, this, *args)");
            l1.z(aVar, format, e, 4);
            return null;
        } catch (IllegalStateException e2) {
            String format2 = String.format(Locale.US, "Error while trying to deserialize the serialized NDK Crash info: %s", Arrays.copyOf(new Object[]{str}, 1));
            j.e(format2, "format(locale, this, *args)");
            l1.z(aVar, format2, e2, 4);
            return null;
        }
    }
}
