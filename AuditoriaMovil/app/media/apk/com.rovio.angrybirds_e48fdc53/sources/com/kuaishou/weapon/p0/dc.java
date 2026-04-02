package com.kuaishou.weapon.p0;

import android.content.Context;
import java.util.Date;
import java.util.List;
/* loaded from: classes.dex */
public class dc {
    private static volatile dc b;
    private Context a;

    private dc(Context context) {
        this.a = context;
    }

    public static dc a(Context context) {
        if (b == null) {
            synchronized (dc.class) {
                if (b == null) {
                    b = new dc(context);
                }
            }
        }
        return b;
    }

    public void a(final int i) {
        n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.dc.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    h a = h.a(dc.this.a, "re_po_rt");
                    if (a.b(de.aw, 1) == 1) {
                        long a2 = de.a(dc.this.a).a();
                        long currentTimeMillis = System.currentTimeMillis();
                        long b2 = a.b(de.ay, 8) * 3600000;
                        if (a2 > 0 && currentTimeMillis - a2 < WeaponHI.ii * 3600000 && WeaponHI.isList != null) {
                            int hours = new Date(currentTimeMillis).getHours();
                            List<Integer> list = WeaponHI.isList;
                            StringBuilder sb = new StringBuilder();
                            sb.append(hours);
                            if (list.contains(sb.toString())) {
                                return;
                            }
                        }
                        if (currentTimeMillis - a2 >= b2 || i == 106) {
                            co.a(dc.this.a, new cm(dc.this.a, i).a(cj.b), cj.b, true, true);
                        }
                    }
                } catch (Throwable th) {
                }
            }
        });
    }
}
