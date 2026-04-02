package com.amazon.aps.iva.j2;

import android.os.LocaleList;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Locale;
/* compiled from: AndroidLocaleDelegate.android.kt */
/* loaded from: classes.dex */
public final class b {
    public LocaleList a;
    public d b;
    public final com.amazon.aps.iva.u0.b c = new com.amazon.aps.iva.u0.b(1);

    public final d a() {
        LocaleList localeList = LocaleList.getDefault();
        j.e(localeList, "getDefault()");
        synchronized (this.c) {
            d dVar = this.b;
            if (dVar != null && localeList == this.a) {
                return dVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Locale locale = localeList.get(i);
                j.e(locale, "platformLocaleList[position]");
                arrayList.add(new c(new a(locale)));
            }
            d dVar2 = new d(arrayList);
            this.a = localeList;
            this.b = dVar2;
            return dVar2;
        }
    }
}
