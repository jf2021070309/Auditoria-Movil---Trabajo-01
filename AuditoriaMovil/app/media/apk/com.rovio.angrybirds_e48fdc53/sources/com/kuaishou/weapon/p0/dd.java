package com.kuaishou.weapon.p0;

import android.content.Context;
/* loaded from: classes.dex */
public class dd {
    private static volatile dd b;
    private Context a;

    private dd(Context context) {
        this.a = context;
    }

    public static dd a(Context context) {
        if (b == null) {
            synchronized (dd.class) {
                if (b == null) {
                    b = new dd(context);
                }
            }
        }
        return b;
    }

    public void a(final int i) {
        n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.dd.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    h a = h.a(dd.this.a, "re_po_rt");
                    if (a.b(de.B, 0) == 1) {
                        long a2 = de.a(dd.this.a).a(de.bh);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - a2 >= a.b(de.E, 2) * 3600000 || i == 106) {
                            try {
                                String a3 = new cn(dd.this.a).a(cj.h);
                                int intValue = Integer.valueOf(cj.h).intValue();
                                if (a3 != null && a3.length() > 10) {
                                    new bb(dd.this.a, a3, intValue).a("1000");
                                }
                            } catch (Throwable th) {
                            }
                            de.a(dd.this.a).a(de.bh, currentTimeMillis);
                        }
                    }
                } catch (Throwable th2) {
                }
            }
        });
    }
}
