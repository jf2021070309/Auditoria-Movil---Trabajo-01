package com.amazon.aps.iva.t9;

import android.database.Cursor;
import java.util.ArrayList;
/* compiled from: DependencyDao_Impl.java */
/* loaded from: classes.dex */
public final class c implements b {
    public final com.amazon.aps.iva.p8.g a;
    public final a b;

    /* compiled from: DependencyDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends com.amazon.aps.iva.p8.b<com.amazon.aps.iva.t9.a> {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // com.amazon.aps.iva.p8.b
        public final void d(com.amazon.aps.iva.v8.e eVar, com.amazon.aps.iva.t9.a aVar) {
            com.amazon.aps.iva.t9.a aVar2 = aVar;
            String str = aVar2.a;
            if (str == null) {
                eVar.h(1);
            } else {
                eVar.i(1, str);
            }
            String str2 = aVar2.b;
            if (str2 == null) {
                eVar.h(2);
            } else {
                eVar.i(2, str2);
            }
        }
    }

    public c(com.amazon.aps.iva.p8.g gVar) {
        this.a = gVar;
        this.b = new a(gVar);
    }

    public final ArrayList a(String str) {
        com.amazon.aps.iva.p8.i f = com.amazon.aps.iva.p8.i.f(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            f.i(1);
        } else {
            f.k(1, str);
        }
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        Cursor g = gVar.g(f);
        try {
            ArrayList arrayList = new ArrayList(g.getCount());
            while (g.moveToNext()) {
                arrayList.add(g.getString(0));
            }
            return arrayList;
        } finally {
            g.close();
            f.release();
        }
    }

    public final boolean b(String str) {
        boolean z = true;
        com.amazon.aps.iva.p8.i f = com.amazon.aps.iva.p8.i.f(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            f.i(1);
        } else {
            f.k(1, str);
        }
        com.amazon.aps.iva.p8.g gVar = this.a;
        gVar.b();
        Cursor g = gVar.g(f);
        try {
            boolean z2 = false;
            if (g.moveToFirst()) {
                if (g.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            g.close();
            f.release();
        }
    }
}
