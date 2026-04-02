package c.c0.d0.s;

import android.database.Cursor;
/* loaded from: classes.dex */
public final class i implements h {
    public final c.v.f a;

    /* renamed from: b  reason: collision with root package name */
    public final c.v.b<g> f1499b;

    /* renamed from: c  reason: collision with root package name */
    public final c.v.j f1500c;

    /* loaded from: classes.dex */
    public class a extends c.v.b<g> {
        public a(i iVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // c.v.b
        public void d(c.x.a.f.f fVar, g gVar) {
            g gVar2 = gVar;
            String str = gVar2.a;
            if (str == null) {
                fVar.a.bindNull(1);
            } else {
                fVar.a.bindString(1, str);
            }
            fVar.a.bindLong(2, gVar2.f1498b);
        }
    }

    /* loaded from: classes.dex */
    public class b extends c.v.j {
        public b(i iVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(c.v.f fVar) {
        this.a = fVar;
        this.f1499b = new a(this, fVar);
        this.f1500c = new b(this, fVar);
    }

    public g a(String str) {
        c.v.h h2 = c.v.h.h("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            h2.m(1);
        } else {
            h2.r(1, str);
        }
        this.a.b();
        Cursor a2 = c.v.l.b.a(this.a, h2, false, null);
        try {
            return a2.moveToFirst() ? new g(a2.getString(c.t.m.i(a2, "work_spec_id")), a2.getInt(c.t.m.i(a2, "system_id"))) : null;
        } finally {
            a2.close();
            h2.release();
        }
    }

    public void b(g gVar) {
        this.a.b();
        this.a.c();
        try {
            this.f1499b.e(gVar);
            this.a.k();
        } finally {
            this.a.g();
        }
    }

    public void c(String str) {
        this.a.b();
        c.x.a.f.f a2 = this.f1500c.a();
        if (str == null) {
            a2.a.bindNull(1);
        } else {
            a2.a.bindString(1, str);
        }
        this.a.c();
        try {
            a2.a();
            this.a.k();
            this.a.g();
            c.v.j jVar = this.f1500c;
            if (a2 == jVar.f2803c) {
                jVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.g();
            this.f1500c.c(a2);
            throw th;
        }
    }
}
