package com.kuaishou.weapon.p0;

import android.content.Context;
/* loaded from: classes.dex */
public class db {
    private static volatile db b;
    private Context a;

    private db(Context context) {
        this.a = context;
    }

    public static db a(Context context) {
        if (b == null) {
            synchronized (db.class) {
                if (b == null) {
                    b = new db(context);
                }
            }
        }
        return b;
    }

    public void a(final int i) {
        n.a().a(new Runnable() { // from class: com.kuaishou.weapon.p0.db.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    h a = h.a(db.this.a, "re_po_rt");
                    if (a.b(de.aj, 1) == 1) {
                        long a2 = de.a(db.this.a).a(de.bf);
                        long currentTimeMillis = System.currentTimeMillis();
                        int b2 = a.b(de.am, 0);
                        long j = currentTimeMillis - a2;
                        if (j >= a.b(de.al, 6) * 3600000 || (i == 100 && b2 == 1 && j >= 14400000)) {
                            cf.a(db.this.a, new bv(db.this.a, i, false).a(cj.e), cj.e, true);
                            de.a(db.this.a).a(de.bf, currentTimeMillis);
                        }
                    }
                } catch (Throwable th) {
                }
            }
        });
    }
}
