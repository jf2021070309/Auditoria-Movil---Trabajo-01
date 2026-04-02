package com.amazon.aps.iva.sl;

import android.content.Context;
import com.amazon.aps.iva.xb0.p;
import com.crunchyroll.crunchyroid.R;
import java.util.Locale;
/* compiled from: QualityTitleFormatter.kt */
/* loaded from: classes2.dex */
public final class n implements m {
    public final Context a;
    public final p<String, String, CharSequence> b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(Context context, p<? super String, ? super String, ? extends CharSequence> pVar) {
        this.a = context;
        this.b = pVar;
    }

    @Override // com.amazon.aps.iva.sl.m
    public final CharSequence a(g gVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(gVar, "quality");
        String str = gVar.c + "P";
        Context context = this.a;
        if (gVar.a) {
            String string = context.getString(R.string.quality_auto);
            com.amazon.aps.iva.yb0.j.e(string, "context.getString(R.string.quality_auto)");
            return string;
        }
        Locale locale = Locale.ENGLISH;
        com.amazon.aps.iva.yb0.j.e(locale, "ENGLISH");
        String lowerCase = str.toLowerCase(locale);
        com.amazon.aps.iva.yb0.j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!com.amazon.aps.iva.yb0.j.a(lowerCase, "720p") && !com.amazon.aps.iva.yb0.j.a(lowerCase, "1080p")) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            String string2 = context.getString(R.string.quality_hd_suffix);
            com.amazon.aps.iva.yb0.j.e(string2, "context.getString(R.string.quality_hd_suffix)");
            return this.b.invoke(str + " " + string2, string2);
        }
        return str;
    }
}
