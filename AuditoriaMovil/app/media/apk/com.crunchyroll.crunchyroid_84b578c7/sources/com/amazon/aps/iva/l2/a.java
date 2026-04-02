package com.amazon.aps.iva.l2;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import com.amazon.aps.iva.k2.f;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: LocaleExtensions.android.kt */
/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    public final Object a(com.amazon.aps.iva.j2.d dVar) {
        j.f(dVar, "localeList");
        ArrayList arrayList = new ArrayList(r.Y(dVar));
        Iterator<com.amazon.aps.iva.j2.c> it = dVar.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.j2.c next = it.next();
            j.f(next, "<this>");
            com.amazon.aps.iva.j2.e eVar = next.a;
            j.d(eVar, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            arrayList.add(((com.amazon.aps.iva.j2.a) eVar).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(f fVar, com.amazon.aps.iva.j2.d dVar) {
        j.f(fVar, "textPaint");
        j.f(dVar, "localeList");
        ArrayList arrayList = new ArrayList(r.Y(dVar));
        Iterator<com.amazon.aps.iva.j2.c> it = dVar.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.j2.c next = it.next();
            j.f(next, "<this>");
            com.amazon.aps.iva.j2.e eVar = next.a;
            j.d(eVar, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            arrayList.add(((com.amazon.aps.iva.j2.a) eVar).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        fVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
