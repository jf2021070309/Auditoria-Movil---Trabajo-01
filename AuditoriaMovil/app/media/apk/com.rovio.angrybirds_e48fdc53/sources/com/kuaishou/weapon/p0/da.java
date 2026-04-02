package com.kuaishou.weapon.p0;

import android.content.Context;
import java.util.Date;
import java.util.List;
/* loaded from: classes.dex */
public class da {
    private static volatile da b;
    private Context a;

    private da(Context context) {
        this.a = context;
    }

    public static da a(Context context) {
        if (b == null) {
            synchronized (da.class) {
                if (b == null) {
                    b = new da(context);
                }
            }
        }
        return b;
    }

    public void a(final int i, final int i2) {
        n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.da.1
            @Override // java.lang.Runnable
            public void run() {
                long j;
                int i3;
                try {
                    h a = h.a(da.this.a, "re_po_rt");
                    if (a.b(de.P, 1) == 1) {
                        long a2 = de.a(da.this.a).a(de.bd);
                        long currentTimeMillis = System.currentTimeMillis();
                        long b2 = a.b(de.R, 1) * 3600000;
                        long b3 = a.b(de.S, 5) * 60000;
                        int b4 = a.b(de.T, 0);
                        if (a2 > 0) {
                            j = a2;
                            if (currentTimeMillis - a2 < WeaponHI.ii * 3600000 && WeaponHI.isList != null) {
                                int hours = new Date(currentTimeMillis).getHours();
                                List<Integer> list = WeaponHI.isList;
                                StringBuilder sb = new StringBuilder();
                                sb.append(hours);
                                if (list.contains(sb.toString())) {
                                    return;
                                }
                            }
                        } else {
                            j = a2;
                        }
                        long j2 = currentTimeMillis - j;
                        if (j2 >= b2 || (((i3 = i) == 100 && b4 == 1) || i3 == 106 || (i3 != 100 && i3 > 0 && j2 >= b3))) {
                            co.a(da.this.a, new ck(da.this.a, i, i2).a(cj.c), cj.c, true, true);
                        }
                    }
                } catch (Throwable th) {
                }
            }
        });
    }
}
