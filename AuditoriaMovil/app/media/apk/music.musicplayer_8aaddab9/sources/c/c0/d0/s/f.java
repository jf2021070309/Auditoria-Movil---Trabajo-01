package c.c0.d0.s;

import android.database.Cursor;
/* loaded from: classes.dex */
public final class f implements e {
    public final c.v.f a;

    /* renamed from: b  reason: collision with root package name */
    public final c.v.b<d> f1497b;

    /* loaded from: classes.dex */
    public class a extends c.v.b<d> {
        public a(f fVar, c.v.f fVar2) {
            super(fVar2);
        }

        @Override // c.v.j
        public String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // c.v.b
        public void d(c.x.a.f.f fVar, d dVar) {
            d dVar2 = dVar;
            String str = dVar2.a;
            if (str == null) {
                fVar.a.bindNull(1);
            } else {
                fVar.a.bindString(1, str);
            }
            Long l2 = dVar2.f1496b;
            if (l2 == null) {
                fVar.a.bindNull(2);
                return;
            }
            fVar.a.bindLong(2, l2.longValue());
        }
    }

    public f(c.v.f fVar) {
        this.a = fVar;
        this.f1497b = new a(this, fVar);
    }

    public Long a(String str) {
        c.v.h h2 = c.v.h.h("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            h2.m(1);
        } else {
            h2.r(1, str);
        }
        this.a.b();
        Long l2 = null;
        Cursor a2 = c.v.l.b.a(this.a, h2, false, null);
        try {
            if (a2.moveToFirst() && !a2.isNull(0)) {
                l2 = Long.valueOf(a2.getLong(0));
            }
            return l2;
        } finally {
            a2.close();
            h2.release();
        }
    }

    public void b(d dVar) {
        this.a.b();
        this.a.c();
        try {
            this.f1497b.e(dVar);
            this.a.k();
        } finally {
            this.a.g();
        }
    }
}
