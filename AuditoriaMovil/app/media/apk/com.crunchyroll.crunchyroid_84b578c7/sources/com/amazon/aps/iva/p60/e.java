package com.amazon.aps.iva.p60;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.Locale;
/* compiled from: LocaleProvider.kt */
/* loaded from: classes2.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.a<Locale> {
    public static final e h = new e();

    public e() {
        super(0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Locale invoke() {
        Locale locale = Locale.getDefault();
        j.e(locale, "getDefault()");
        return locale;
    }
}
