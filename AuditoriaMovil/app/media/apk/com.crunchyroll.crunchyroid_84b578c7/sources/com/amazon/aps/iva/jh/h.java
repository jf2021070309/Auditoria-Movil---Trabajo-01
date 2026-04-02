package com.amazon.aps.iva.jh;

import android.content.Context;
import com.crunchyroll.crunchyroid.R;
import java.util.Locale;
/* compiled from: LanguageOptionFormatter.kt */
/* loaded from: classes.dex */
public final class h implements g {
    public final Context b;

    public h(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.b = context;
    }

    @Override // com.amazon.aps.iva.jh.g
    public final String a(f fVar) {
        String string = this.b.getString(R.string.closed_caption_language_title, b(fVar));
        com.amazon.aps.iva.yb0.j.e(string, "context.getString(R.stri…tle, formatTitle(option))");
        return string;
    }

    @Override // com.amazon.aps.iva.jh.g
    public final String b(f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "option");
        boolean z = fVar instanceof d;
        Context context = this.b;
        if (z) {
            String string = context.getString(R.string.subtitles_none);
            com.amazon.aps.iva.yb0.j.e(string, "context.getString(R.string.subtitles_none)");
            return string;
        } else if (com.amazon.aps.iva.yb0.j.a(fVar.a(), Locale.JAPAN.toLanguageTag())) {
            String string2 = context.getString(R.string.japanese);
            com.amazon.aps.iva.yb0.j.e(string2, "context.getString(R.string.japanese)");
            return string2;
        } else {
            String str = fVar.b;
            com.amazon.aps.iva.yb0.j.d(str, "null cannot be cast to non-null type kotlin.CharSequence");
            return str;
        }
    }
}
