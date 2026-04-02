package com.kuaishou.weapon.p0;

import android.content.Context;
import java.util.Date;
import java.util.List;
/* loaded from: classes.dex */
public class cx {
    private static volatile cx b;
    private Context a;

    private cx(Context context) {
        this.a = context;
    }

    public static cx a(Context context) {
        if (b == null) {
            synchronized (cx.class) {
                if (b == null) {
                    b = new cx(context);
                }
            }
        }
        return b;
    }

    public void a(final int i) {
        try {
            h a = h.a(this.a, "re_po_rt");
            final boolean e = a.e("a1_p_s_p_s");
            final boolean e2 = a.e("a1_p_s_p_s_c_b");
            if ((e || e2) && WeaponHI.as) {
                n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.cx.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int i2;
                        try {
                            h a2 = h.a(cx.this.a, "re_po_rt");
                            if (a2.b(de.o, 0) == 1) {
                                if (e || e2) {
                                    long a3 = de.a(cx.this.a).a(de.bc);
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long b2 = a2.b(de.p, 8) * 3600000;
                                    int b3 = a2.b(de.q, 0);
                                    if (a3 > 0 && currentTimeMillis - a3 < WeaponHI.ii * 3600000 && WeaponHI.isList != null) {
                                        int hours = new Date(currentTimeMillis).getHours();
                                        List<Integer> list = WeaponHI.isList;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(hours);
                                        if (list.contains(sb.toString())) {
                                            return;
                                        }
                                    }
                                    if (currentTimeMillis - a3 >= b2 || (((i2 = i) == 100 && b3 == 1) || i2 == 106)) {
                                        co.a(cx.this.a, new ch(cx.this.a, i).a(cj.d), cj.d, true, true);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                        }
                    }
                });
            }
        } catch (Throwable th) {
        }
    }
}
