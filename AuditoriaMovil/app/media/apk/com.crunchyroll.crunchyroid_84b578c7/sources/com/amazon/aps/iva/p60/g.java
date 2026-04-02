package com.amazon.aps.iva.p60;

import com.amazon.aps.iva.yb0.j;
import java.util.Locale;
import java.util.Map;
/* compiled from: LocaleProvider.kt */
/* loaded from: classes2.dex */
public final class g implements f {
    public final com.amazon.aps.iva.xb0.a<Locale> a;
    public final c b;

    public g(com.amazon.aps.iva.xb0.a aVar, d dVar) {
        this.a = aVar;
        this.b = dVar;
    }

    @Override // com.amazon.aps.iva.p60.f
    public final Locale a() {
        Locale locale;
        c cVar = this.b;
        Map<String, a> a = cVar.a();
        com.amazon.aps.iva.xb0.a<Locale> aVar = this.a;
        a aVar2 = a.get(aVar.invoke().toLanguageTag());
        if (aVar2 == null) {
            aVar2 = cVar.a().get(aVar.invoke().getLanguage());
        }
        if (aVar2 != null) {
            locale = Locale.forLanguageTag(aVar2.a());
        } else {
            locale = null;
        }
        if (locale == null) {
            Locale locale2 = Locale.US;
            j.e(locale2, "US");
            return locale2;
        }
        return locale;
    }
}
