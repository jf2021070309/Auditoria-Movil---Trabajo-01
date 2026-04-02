package com.amazon.aps.iva.j2;

import com.amazon.aps.iva.yb0.j;
import java.util.Locale;
/* compiled from: AndroidLocaleDelegate.android.kt */
/* loaded from: classes.dex */
public final class a implements e {
    public final Locale a;

    public a(Locale locale) {
        this.a = locale;
    }

    @Override // com.amazon.aps.iva.j2.e
    public final String a() {
        String languageTag = this.a.toLanguageTag();
        j.e(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }
}
