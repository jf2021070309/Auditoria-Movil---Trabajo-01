package com.amazon.aps.iva.aq;

import android.content.Context;
import android.os.Build;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.q;
import java.util.Locale;
/* compiled from: DefaultAndroidInfoProvider.kt */
/* loaded from: classes2.dex */
public final class f implements a {
    public final com.amazon.aps.iva.kb0.m a;
    public final String b = "Android";

    public f(Context context) {
        this.a = com.amazon.aps.iva.kb0.f.b(new e(context, new r()));
    }

    @Override // com.amazon.aps.iva.aq.a
    public final String a() {
        String property = System.getProperty("os.arch");
        if (property == null) {
            return "unknown";
        }
        return property;
    }

    @Override // com.amazon.aps.iva.aq.a
    public final String b() {
        String str = Build.ID;
        com.amazon.aps.iva.yb0.j.e(str, "ID");
        return str;
    }

    @Override // com.amazon.aps.iva.aq.a
    public final String c() {
        String str = Build.MODEL;
        com.amazon.aps.iva.yb0.j.e(str, "MODEL");
        return str;
    }

    @Override // com.amazon.aps.iva.aq.a
    public final String d() {
        String str = Build.VERSION.RELEASE;
        com.amazon.aps.iva.yb0.j.e(str, "RELEASE");
        return str;
    }

    @Override // com.amazon.aps.iva.aq.a
    public final h e() {
        return (h) this.a.getValue();
    }

    @Override // com.amazon.aps.iva.aq.a
    public final String f() {
        boolean z;
        String valueOf;
        String str = Build.BRAND;
        com.amazon.aps.iva.yb0.j.e(str, "BRAND");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale locale = Locale.US;
                com.amazon.aps.iva.yb0.j.e(locale, "US");
                String valueOf2 = String.valueOf(charAt);
                com.amazon.aps.iva.yb0.j.d(valueOf2, "null cannot be cast to non-null type java.lang.String");
                valueOf = valueOf2.toUpperCase(locale);
                com.amazon.aps.iva.yb0.j.e(valueOf, "this as java.lang.String).toUpperCase(locale)");
                if (valueOf.length() > 1) {
                    if (charAt != 329) {
                        char charAt2 = valueOf.charAt(0);
                        String substring = valueOf.substring(1);
                        com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String).substring(startIndex)");
                        String lowerCase = substring.toLowerCase(Locale.ROOT);
                        com.amazon.aps.iva.yb0.j.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        valueOf = charAt2 + lowerCase;
                    }
                } else {
                    String valueOf3 = String.valueOf(charAt);
                    com.amazon.aps.iva.yb0.j.d(valueOf3, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = valueOf3.toUpperCase(Locale.ROOT);
                    com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (com.amazon.aps.iva.yb0.j.a(valueOf, upperCase)) {
                        valueOf = String.valueOf(Character.toTitleCase(charAt));
                    }
                }
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            String substring2 = str.substring(1);
            com.amazon.aps.iva.yb0.j.e(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        return str;
    }

    @Override // com.amazon.aps.iva.aq.a
    public final String g() {
        return (String) x.t0(q.D0(d(), new char[]{'.'}));
    }

    @Override // com.amazon.aps.iva.aq.a
    public final String getDeviceName() {
        boolean z;
        if (f().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return c();
        }
        if (q.i0(c(), f(), false)) {
            return c();
        }
        return com.amazon.aps.iva.k.q.b(f(), " ", c());
    }

    @Override // com.amazon.aps.iva.aq.a
    public final String h() {
        return this.b;
    }
}
