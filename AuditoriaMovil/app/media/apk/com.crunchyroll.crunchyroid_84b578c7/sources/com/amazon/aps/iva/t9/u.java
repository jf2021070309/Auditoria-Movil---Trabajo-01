package com.amazon.aps.iva.t9;

import android.database.Cursor;
import java.util.ArrayList;
/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes.dex */
public final class u implements t {
    public final com.amazon.aps.iva.p8.g a;
    public final a b;

    /* compiled from: WorkTagDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends com.amazon.aps.iva.p8.b<s> {
        @Override // com.amazon.aps.iva.p8.k
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // com.amazon.aps.iva.p8.b
        public final void d(com.amazon.aps.iva.v8.e eVar, s sVar) {
            s sVar2 = sVar;
            String str = sVar2.a;
            if (str == null) {
                eVar.h(1);
            } else {
                eVar.i(1, str);
            }
            String str2 = sVar2.b;
            if (str2 == null) {
                eVar.h(2);
            } else {
                eVar.i(2, str2);
            }
        }
    }

    public u(com.amazon.aps.iva.p8.g gVar) {
        this.a = gVar;
        this.b = new a(gVar);
    }

    public final ArrayList a(String str) {
        com.amazon.aps.iva.p8.i f = com.amazon.aps.iva.p8.i.f(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
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
}
