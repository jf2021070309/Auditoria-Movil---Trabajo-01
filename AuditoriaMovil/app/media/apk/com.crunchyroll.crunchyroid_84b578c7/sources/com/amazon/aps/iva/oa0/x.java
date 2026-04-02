package com.amazon.aps.iva.oa0;

import java.text.SimpleDateFormat;
import java.util.Locale;
/* compiled from: Constants.java */
/* loaded from: classes4.dex */
public interface x {
    public static final String a;
    public static final String b;

    static {
        Locale locale = Locale.US;
        int i = f1.b;
        String.format(locale, "%s; %s", "df4fbbcd.master", new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z").format((Object) 1699445287428L));
        a = String.format(locale, "Singular/v%s", "12.4.0");
        b = String.format(locale, "Singular/SDK-v%s.%s", "12.4.0", "PROD");
    }
}
