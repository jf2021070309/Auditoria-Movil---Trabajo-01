package com.me.game.pm_tools;

import java.util.Locale;
/* loaded from: classes5.dex */
public class l0 {
    private static final String d = "l0";
    private static volatile l0 e;
    private f a;
    private e b;
    private String c = "";

    public l0() {
        a();
    }

    public static l0 c() {
        if (e == null) {
            synchronized (l0.class) {
                if (e == null) {
                    e = new l0();
                }
            }
        }
        return e;
    }

    public void a() {
        try {
            String language = Locale.getDefault().getLanguage();
            if (this.c.equals(language)) {
                return;
            }
            this.c = language;
            this.a = f.b(k0.b().c(this.c));
        } catch (Exception unused) {
            this.a = new f();
        }
    }

    public e b() {
        if (this.b == null) {
            try {
                String e2 = a0.e(b.d.getResources().getAssets().open("pm_sdk/config.json"));
                y.e(d, e2);
                this.b = e.a(e2);
            } catch (Exception unused) {
                this.b = new e();
            }
        }
        return this.b;
    }

    public f d() {
        return this.a;
    }
}
