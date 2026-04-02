package e.a.c;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
public class u6 {
    public static Boolean a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f5191b;

    public static Configuration a(Context context, Configuration configuration) {
        Locale e2 = c.i.g.b.g(context).e();
        int i2 = Build.VERSION.SDK_INT;
        if (!(i2 >= 26 ? configuration.getLocales().get(0) != null ? configuration.getLocales().get(0) : Locale.getDefault() : configuration.locale).toString().equalsIgnoreCase(e2.toString())) {
            if (i2 < 26) {
                Configuration configuration2 = new Configuration(configuration);
                configuration2.setLocale(e2);
                return configuration2;
            }
            LocaleList localeList = new LocaleList(e2);
            LocaleList.setDefault(localeList);
            Configuration configuration3 = new Configuration(configuration);
            configuration3.setLocale(e2);
            configuration3.setLocales(localeList);
            context.getResources().updateConfiguration(configuration3, context.getResources().getDisplayMetrics());
            return configuration3;
        }
        return configuration;
    }

    public static boolean b() {
        if (f5191b == null) {
            if (e.h.g.v0.i()) {
                f5191b = Boolean.FALSE;
            } else {
                c.i.g.c h2 = c.i.g.b.h(Resources.getSystem().getConfiguration());
                if (h2.c() == 1) {
                    e.h.g.a1[] f2 = e.h.g.a1.f(h2);
                    if (f2 == null || f2.length != 1) {
                        f5191b = Boolean.FALSE;
                    } else {
                        f5191b = Boolean.valueOf(f2[0].f8247b);
                    }
                } else {
                    f5191b = Boolean.FALSE;
                }
            }
        }
        return f5191b.booleanValue();
    }

    public static boolean c() {
        if (a == null) {
            a = Boolean.valueOf(e.h.g.a1.f(c.i.g.b.h(Resources.getSystem().getConfiguration())).length > 1);
        }
        return a.booleanValue();
    }
}
