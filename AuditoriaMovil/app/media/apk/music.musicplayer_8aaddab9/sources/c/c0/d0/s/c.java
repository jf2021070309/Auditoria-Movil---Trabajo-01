package c.c0.d0.s;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class c implements b {
    public final c.v.f a;

    /* renamed from: b  reason: collision with root package name */
    public final c.v.b<c.c0.d0.s.a> f1495b;

    /* loaded from: classes.dex */
    public class a extends c.v.b<c.c0.d0.s.a> {
        public a(c cVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // c.v.b
        public void d(c.x.a.f.f fVar, c.c0.d0.s.a aVar) {
            c.c0.d0.s.a aVar2 = aVar;
            String str = aVar2.a;
            if (str == null) {
                fVar.a.bindNull(1);
            } else {
                fVar.a.bindString(1, str);
            }
            String str2 = aVar2.f1494b;
            if (str2 == null) {
                fVar.a.bindNull(2);
            } else {
                fVar.a.bindString(2, str2);
            }
        }
    }

    public c(c.v.f fVar) {
        this.a = fVar;
        this.f1495b = new a(this, fVar);
    }

    public List<String> a(String str) {
        c.v.h h2 = c.v.h.h("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            h2.m(1);
        } else {
            h2.r(1, str);
        }
        this.a.b();
        Cursor a2 = c.v.l.b.a(this.a, h2, false, null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            h2.release();
        }
    }

    public boolean b(String str) {
        c.v.h h2 = c.v.h.h("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            h2.m(1);
        } else {
            h2.r(1, str);
        }
        this.a.b();
        boolean z = false;
        Cursor a2 = c.v.l.b.a(this.a, h2, false, null);
        try {
            if (a2.moveToFirst()) {
                z = a2.getInt(0) != 0;
            }
            return z;
        } finally {
            a2.close();
            h2.release();
        }
    }
}
