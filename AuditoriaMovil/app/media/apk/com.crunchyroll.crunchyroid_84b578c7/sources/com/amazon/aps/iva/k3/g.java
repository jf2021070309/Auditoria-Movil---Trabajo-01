package com.amazon.aps.iva.k3;

import android.content.res.Configuration;
import android.os.LocaleList;
/* compiled from: ConfigurationCompat.java */
/* loaded from: classes.dex */
public final class g {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, j jVar) {
        configuration.setLocales((LocaleList) jVar.a.b());
    }
}
