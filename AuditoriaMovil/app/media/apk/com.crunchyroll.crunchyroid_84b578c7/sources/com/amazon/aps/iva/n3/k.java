package com.amazon.aps.iva.n3;

import android.text.TextUtils;
import java.util.Locale;
/* compiled from: TextUtilsCompat.java */
/* loaded from: classes.dex */
public final class k {
    public static final /* synthetic */ int a = 0;

    /* compiled from: TextUtilsCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    static {
        new Locale("", "");
    }
}
