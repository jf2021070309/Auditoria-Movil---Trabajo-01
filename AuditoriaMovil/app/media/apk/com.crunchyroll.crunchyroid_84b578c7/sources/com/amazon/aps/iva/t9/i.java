package com.amazon.aps.iva.t9;

import android.database.Cursor;
/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class i implements h {
    public final com.amazon.aps.iva.p8.g a;
    public final a b;
    public final b c;

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends com.amazon.aps.iva.p8.b<g> {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // com.amazon.aps.iva.p8.b
        public final void d(com.amazon.aps.iva.v8.e eVar, g gVar) {
            g gVar2 = gVar;
            String str = gVar2.a;
            if (str == null) {
                eVar.h(1);
            } else {
                eVar.i(1, str);
            }
            eVar.f(2, gVar2.b);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends com.amazon.aps.iva.p8.k {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(com.amazon.aps.iva.p8.g gVar) {
        this.a = gVar;
        this.b = new a(gVar);
        this.c = new b(gVar);
    }

    public final g a(String str) {
        g gVar;
        com.amazon.aps.iva.p8.i f = com.amazon.aps.iva.p8.i.f(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            f.i(1);
        } else {
            f.k(1, str);
        }
        com.amazon.aps.iva.p8.g gVar2 = this.a;
        gVar2.b();
        Cursor g = gVar2.g(f);
        try {
            int R = com.amazon.aps.iva.cq.b.R(g, "work_spec_id");
            int R2 = com.amazon.aps.iva.cq.b.R(g, "system_id");
            if (g.moveToFirst()) {
                gVar = new g(g.getString(R), g.getInt(R2));
            } else {
                gVar = null;
            }
            return gVar;
        } finally {
            g.close();
            f.release();
        }
    }

    public final void b(String str) {
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        b bVar = this.c;
        com.amazon.aps.iva.v8.e a2 = bVar.a();
        if (str == null) {
            a2.h(1);
        } else {
            a2.i(1, str);
        }
        gVar.c();
        try {
            a2.k();
            gVar.h();
        } finally {
            gVar.f();
            bVar.c(a2);
        }
    }
}
