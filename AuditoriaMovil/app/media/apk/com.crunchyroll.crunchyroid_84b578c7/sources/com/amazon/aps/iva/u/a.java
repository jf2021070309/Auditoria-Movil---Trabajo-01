package com.amazon.aps.iva.u;

import android.os.LocaleList;
/* compiled from: CustomTabsIntent.java */
/* loaded from: classes.dex */
public final class a {
    public static String a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
