package com.amazon.aps.iva.c3;

import android.app.LocaleManager;
import android.os.LocaleList;
/* compiled from: LocaleManagerCompat.java */
/* loaded from: classes.dex */
public final class j {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static LocaleList b(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }
}
