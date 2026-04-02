package e.h.g;

import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.ArrayList;
import java.util.Locale;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class a1 {
    public static a1[] a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8247b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8248c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8249d;

    public a1(String str, int i2) {
        this.f8248c = str;
        this.f8249d = i2;
        this.f8247b = false;
    }

    public a1(String str, int i2, boolean z) {
        this.f8248c = str;
        this.f8249d = i2;
        this.f8247b = z;
    }

    public static void a() {
        a1[] a1VarArr = a;
        if (a1VarArr == null || a1VarArr.length == 1) {
            x0 x0Var = x0.f8405d;
            a = x0Var != null ? x0Var.o() : new a1[]{new a1("en", R.string.close)};
        }
    }

    public static a1 b(int i2) {
        a();
        if (i2 >= 0) {
            a1[] a1VarArr = a;
            if (i2 < a1VarArr.length) {
                return a1VarArr[i2];
            }
        }
        return a[0];
    }

    public static int c(Locale locale) {
        return v0.g() ? d(locale.getLanguage(), locale.getCountry(), locale.getScript()) : d(locale.getLanguage(), locale.getCountry(), "");
    }

    public static int d(String str, String str2, String str3) {
        a();
        if (FacebookAdapter.KEY_ID.equals(str)) {
            str = "in";
        }
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        for (a1 a1Var : a) {
            int i5 = a1Var.f8248c.equalsIgnoreCase(str) ? 5 : 0;
            if ("".equalsIgnoreCase(str2)) {
                i5 += 2;
            }
            if ("".equalsIgnoreCase(str3)) {
                i5++;
            }
            if (i5 > i3) {
                i2 = i4;
                i3 = i5;
            }
            i4++;
        }
        return i2;
    }

    public static a1[] f(c.i.g.c cVar) {
        ArrayList arrayList = new ArrayList(cVar.c());
        for (int i2 = 0; i2 < cVar.c(); i2++) {
            int c2 = c(cVar.b(i2));
            if (c2 > -1) {
                a1 b2 = b(c2);
                if (!arrayList.contains(b2)) {
                    arrayList.add(b2);
                }
            }
        }
        return arrayList.size() == 0 ? new a1[0] : (a1[]) arrayList.toArray(new a1[arrayList.size()]);
    }

    public static a1[] g(c.i.g.c cVar) {
        ArrayList arrayList = new ArrayList(cVar.c());
        int i2 = 0;
        while (i2 < cVar.c() + 1) {
            int c2 = i2 < cVar.c() ? c(cVar.b(i2)) : c(new Locale("en"));
            if (c2 > -1) {
                a1 b2 = b(c2);
                if (!arrayList.contains(b2)) {
                    arrayList.add(b2);
                }
            }
            i2++;
        }
        return arrayList.size() == 0 ? new a1[0] : (a1[]) arrayList.toArray(new a1[arrayList.size()]);
    }

    public Locale e() {
        if (v0.g()) {
            Locale.Builder builder = new Locale.Builder();
            builder.setLanguage(this.f8248c);
            return builder.build();
        }
        return new Locale(this.f8248c, "");
    }
}
