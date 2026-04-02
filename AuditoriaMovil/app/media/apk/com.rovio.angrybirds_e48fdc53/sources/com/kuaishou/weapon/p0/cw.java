package com.kuaishou.weapon.p0;

import android.content.Context;
import java.util.Date;
import java.util.List;
/* loaded from: classes.dex */
public class cw {
    private static volatile cw b;
    private Context a;

    private cw(Context context) {
        this.a = context;
    }

    public static cw a(Context context) {
        if (b == null) {
            synchronized (cw.class) {
                if (b == null) {
                    b = new cw(context);
                }
            }
        }
        return b;
    }

    public void a(final int i) {
        n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.cw.1
            @Override // java.lang.Runnable
            public void run() {
                int i2;
                try {
                    h a = h.a(cw.this.a, "re_po_rt");
                    if (a.b(de.y, 0) == 1) {
                        long a2 = de.a(cw.this.a).a(de.bb);
                        long currentTimeMillis = System.currentTimeMillis();
                        long b2 = a.b(de.z, 8) * 3600000;
                        int b3 = a.b(de.q, 0);
                        if (a2 > 0 && currentTimeMillis - a2 < WeaponHI.ii * 3600000 && WeaponHI.isList != null) {
                            int hours = new Date(currentTimeMillis).getHours();
                            List<Integer> list = WeaponHI.isList;
                            StringBuilder sb = new StringBuilder();
                            sb.append(hours);
                            if (list.contains(sb.toString())) {
                                return;
                            }
                        }
                        if (currentTimeMillis - a2 >= b2 || (i2 = i) == 106 || (i2 == 100 && b3 == 1)) {
                            co.a(cw.this.a, new cg(cw.this.a, i).a(cj.i), cj.i, false, true);
                        }
                    }
                } catch (Throwable th) {
                }
            }
        });
    }
}
