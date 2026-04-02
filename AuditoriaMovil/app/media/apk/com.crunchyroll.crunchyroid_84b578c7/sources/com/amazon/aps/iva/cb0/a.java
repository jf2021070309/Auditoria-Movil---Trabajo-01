package com.amazon.aps.iva.cb0;

import com.amazon.aps.iva.db0.b;
import com.amazon.aps.iva.eb0.c;
import com.amazon.aps.iva.eb0.e;
import com.amazon.aps.iva.eb0.i;
import com.amazon.aps.iva.w5.s;
/* compiled from: DefaultMetadataDependenciesProvider.java */
/* loaded from: classes4.dex */
public final class a {
    public final b a;
    public final i b;

    static {
        new a(new com.amazon.aps.iva.db0.a());
    }

    public a(com.amazon.aps.iva.ab0.a aVar) {
        b bVar = new b();
        this.a = bVar;
        this.b = new i("/io/michaelrocks/libphonenumber/android/data/PhoneNumberMetadataProto");
        new i("/io/michaelrocks/libphonenumber/android/data/ShortNumberMetadataProto");
        i iVar = new i("/io/michaelrocks/libphonenumber/android/data/PhoneNumberAlternateFormatsProto");
        new com.amazon.aps.iva.eb0.a(aVar, bVar, new com.amazon.aps.iva.eb0.b());
        new com.amazon.aps.iva.eb0.a(aVar, bVar, new e(new c()));
        new s(iVar, aVar, bVar);
    }
}
