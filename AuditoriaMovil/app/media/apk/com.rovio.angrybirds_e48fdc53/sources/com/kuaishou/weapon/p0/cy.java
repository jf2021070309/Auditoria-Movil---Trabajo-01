package com.kuaishou.weapon.p0;

import android.content.Context;
import java.util.Date;
import java.util.List;
/* loaded from: classes.dex */
public class cy {
    private static volatile cy b;
    private Context a;

    private cy(Context context) {
        this.a = context;
    }

    public static cy a(Context context) {
        if (b == null) {
            synchronized (cy.class) {
                if (b == null) {
                    b = new cy(context);
                }
            }
        }
        return b;
    }

    public void a(final int i) {
        n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.cy.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    h a = h.a(cy.this.a, "re_po_rt");
                    if (a.b(de.G, 1) == 1) {
                        long a2 = de.a(cy.this.a).a(de.bg);
                        long currentTimeMillis = System.currentTimeMillis();
                        long b2 = a.b(de.I, 12) * 3600000;
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
                            co.a(cy.this.a, new ci(cy.this.a).a(cj.g), cj.g, true, true);
                        }
                    }
                } catch (Throwable th) {
                }
            }
        });
    }
}
