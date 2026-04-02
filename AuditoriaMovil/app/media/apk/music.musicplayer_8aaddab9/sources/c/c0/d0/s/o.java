package c.c0.d0.s;
/* loaded from: classes.dex */
public final class o implements n {
    public final c.v.f a;

    /* renamed from: b  reason: collision with root package name */
    public final c.v.b<m> f1504b;

    /* renamed from: c  reason: collision with root package name */
    public final c.v.j f1505c;

    /* renamed from: d  reason: collision with root package name */
    public final c.v.j f1506d;

    /* loaded from: classes.dex */
    public class a extends c.v.b<m> {
        public a(o oVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // c.v.b
        public void d(c.x.a.f.f fVar, m mVar) {
            m mVar2 = mVar;
            String str = mVar2.a;
            if (str == null) {
                fVar.a.bindNull(1);
            } else {
                fVar.a.bindString(1, str);
            }
            byte[] c2 = c.c0.f.c(mVar2.f1503b);
            if (c2 == null) {
                fVar.a.bindNull(2);
            } else {
                fVar.a.bindBlob(2, c2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends c.v.j {
        public b(o oVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* loaded from: classes.dex */
    public class c extends c.v.j {
        public c(o oVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(c.v.f fVar) {
        this.a = fVar;
        this.f1504b = new a(this, fVar);
        this.f1505c = new b(this, fVar);
        this.f1506d = new c(this, fVar);
    }

    public void a(String str) {
        this.a.b();
        c.x.a.f.f a2 = this.f1505c.a();
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
            c.v.j jVar = this.f1505c;
            if (a2 == jVar.f2803c) {
                jVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.g();
            this.f1505c.c(a2);
            throw th;
        }
    }

    public void b() {
        this.a.b();
        c.x.a.f.f a2 = this.f1506d.a();
        this.a.c();
        try {
            a2.a();
            this.a.k();
            this.a.g();
            c.v.j jVar = this.f1506d;
            if (a2 == jVar.f2803c) {
                jVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.g();
            this.f1506d.c(a2);
            throw th;
        }
    }
}
