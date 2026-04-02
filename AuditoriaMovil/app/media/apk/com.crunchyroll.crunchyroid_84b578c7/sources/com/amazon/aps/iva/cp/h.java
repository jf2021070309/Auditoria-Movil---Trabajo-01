package com.amazon.aps.iva.cp;

import android.annotation.SuppressLint;
import android.content.Context;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: LanguageUnavailableFormatter.kt */
/* loaded from: classes2.dex */
public final class h implements d {
    public final Context a;
    public final com.amazon.aps.iva.kh.e b;

    public h(Context context, com.amazon.aps.iva.kh.e eVar) {
        this.a = context;
        this.b = eVar;
    }

    @Override // com.amazon.aps.iva.cp.d
    public final String a(String str) {
        j.f(str, "languageTag");
        String string = this.a.getString(R.string.language_unavailable_dialog_title, d(str, "language_unavailable_dialog_title"));
        j.e(string, "context.getString(R.stri…log_title, languageTitle)");
        return string;
    }

    @Override // com.amazon.aps.iva.cp.d
    public final String b(String str) {
        j.f(str, "languageTag");
        String string = this.a.getString(R.string.language_unavailable_dialog_subtitle, d(str, "language_unavailable_dialog_subtitle"));
        j.e(string, "context.getString(R.stri…_subtitle, languageTitle)");
        return string;
    }

    @Override // com.amazon.aps.iva.cp.d
    public final String c(String str) {
        j.f(str, "languageTag");
        String string = this.a.getString(R.string.language_unavailable_dialog_positive_button_text, d(str, "language_unavailable_dialog_subtitle"));
        j.e(string, "context.getString(\n     …, languageTitle\n        )");
        return string;
    }

    @SuppressLint({"DiscouragedApi"})
    public final String d(String str, String str2) {
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
