package com.amazon.aps.iva.rf;

import android.annotation.SuppressLint;
import android.content.Context;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: PremiumDubFormatter.kt */
/* loaded from: classes.dex */
public final class d implements c {
    public final Context a;
    public final b b;

    public d(Context context, b bVar) {
        j.f(context, "context");
        this.a = context;
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.rf.c
    public final String a(String str) {
        j.f(str, "languageTag");
        String string = this.a.getString(R.string.premium_dub_overlay_title, c(str, "language_unavailable_dialog_title"));
        j.e(string, "context.getString(R.stri…lay_title, languageTitle)");
        return string;
    }

    @Override // com.amazon.aps.iva.rf.c
    public final String b(String str) {
        j.f(str, "languageTag");
        String string = this.a.getString(R.string.premium_dub_overlay_watch_in, c(str, "language_unavailable_dialog_subtitle"));
        j.e(string, "context.getString(R.stri…_watch_in, languageTitle)");
        return string;
    }

    @SuppressLint({"DiscouragedApi"})
    public final String c(String str, String str2) {
        String titleForLanguage;
        Context context = this.a;
        int identifier = context.getResources().getIdentifier(q.b(str2, "_", m.f0(str, "-", "_")), "string", context.getPackageName());
        if (identifier != 0) {
            titleForLanguage = context.getResources().getString(identifier);
        } else {
            titleForLanguage = this.b.getTitleForLanguage(str);
        }
        j.e(titleForLanguage, "if (identifier != 0) {\n …ge(languageTag)\n        }");
        return titleForLanguage;
    }
}
