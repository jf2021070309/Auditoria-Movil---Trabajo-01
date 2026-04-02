package com.amazon.aps.iva.k3;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
/* compiled from: BuildCompat.kt */
/* loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ int a = 0;

    /* compiled from: BuildCompat.kt */
    /* renamed from: com.amazon.aps.iva.k3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0429a {
        public static final C0429a a = new C0429a();

        public final int a(int i) {
            return SdkExtensions.getExtensionVersion(i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        C0429a c0429a = C0429a.a;
        if (i >= 30) {
            c0429a.a(30);
        }
        if (i >= 30) {
            c0429a.a(31);
        }
        if (i >= 30) {
            c0429a.a(33);
        }
        if (i >= 30) {
            c0429a.a(1000000);
        }
    }

    public static final boolean a(String str, String str2) {
        if (com.amazon.aps.iva.yb0.j.a("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        com.amazon.aps.iva.yb0.j.e(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.compareTo(upperCase2) < 0) {
            return false;
        }
        return true;
    }

    public static final boolean b() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                com.amazon.aps.iva.yb0.j.e(str, "CODENAME");
                if (a("S", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                com.amazon.aps.iva.yb0.j.e(str, "CODENAME");
                if (a("Tiramisu", str)) {
                }
            }
            return false;
        }
        return true;
    }
}
