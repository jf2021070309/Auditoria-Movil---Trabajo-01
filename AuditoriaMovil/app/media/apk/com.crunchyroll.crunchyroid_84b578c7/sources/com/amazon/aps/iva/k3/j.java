package com.amazon.aps.iva.k3;

import android.os.LocaleList;
import java.util.Locale;
/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class j {
    public static final j b = new j(new l(b.a(new Locale[0])));
    public final k a;

    /* compiled from: LocaleListCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale, Locale locale2) {
            boolean z;
            boolean z2;
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = a;
            int length = localeArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (localeArr[i].equals(locale)) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                int length2 = localeArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        if (localeArr[i2].equals(locale2)) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    String c = com.amazon.aps.iva.n3.b.c(com.amazon.aps.iva.n3.b.a(com.amazon.aps.iva.n3.b.b(locale)));
                    if (c.isEmpty()) {
                        String country = locale.getCountry();
                        if (country.isEmpty() || country.equals(locale2.getCountry())) {
                            return true;
                        }
                        return false;
                    }
                    return c.equals(com.amazon.aps.iva.n3.b.c(com.amazon.aps.iva.n3.b.a(com.amazon.aps.iva.n3.b.b(locale2))));
                }
            }
            return false;
        }
    }

    /* compiled from: LocaleListCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public j(l lVar) {
        this.a = lVar;
    }

    public static j a(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = a.a(split[i]);
            }
            return new j(new l(b.a(localeArr)));
        }
        return b;
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (this.a.equals(((j) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
