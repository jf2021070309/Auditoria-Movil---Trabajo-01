package com.amazon.aps.iva.t9;

import android.database.Cursor;
/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes.dex */
public final class f implements e {
    public final com.amazon.aps.iva.p8.g a;
    public final a b;

    /* compiled from: PreferenceDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends com.amazon.aps.iva.p8.b<d> {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // com.amazon.aps.iva.p8.b
        public final void d(com.amazon.aps.iva.v8.e eVar, d dVar) {
            d dVar2 = dVar;
            String str = dVar2.a;
            if (str == null) {
                eVar.h(1);
            } else {
                eVar.i(1, str);
            }
            Long l = dVar2.b;
            if (l == null) {
                eVar.h(2);
            } else {
                eVar.f(2, l.longValue());
            }
        }
    }

    public f(com.amazon.aps.iva.p8.g gVar) {
        this.a = gVar;
        this.b = new a(gVar);
    }

    public final Long a(String str) {
        Long l;
        com.amazon.aps.iva.p8.i f = com.amazon.aps.iva.p8.i.f(1, "SELECT long_value FROM Preference where `key`=?");
        f.k(1, str);
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        Cursor g = gVar.g(f);
        try {
            if (g.moveToFirst() && !g.isNull(0)) {
                l = Long.valueOf(g.getLong(0));
                return l;
            }
            l = null;
            return l;
        } finally {
            g.close();
            f.release();
        }
    }

    public final void b(d dVar) {
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        gVar.c();
        try {
            this.b.e(dVar);
            gVar.h();
        } finally {
            gVar.f();
        }
    }
}
