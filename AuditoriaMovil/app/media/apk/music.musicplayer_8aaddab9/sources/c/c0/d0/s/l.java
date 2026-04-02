package c.c0.d0.s;
/* loaded from: classes.dex */
public final class l implements k {
    public final c.v.f a;

    /* renamed from: b  reason: collision with root package name */
    public final c.v.b<j> f1502b;

    /* loaded from: classes.dex */
    public class a extends c.v.b<j> {
        public a(l lVar, c.v.f fVar) {
            super(fVar);
        }

        @Override // c.v.j
        public String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // c.v.b
        public void d(c.x.a.f.f fVar, j jVar) {
            j jVar2 = jVar;
            String str = jVar2.a;
            if (str == null) {
                fVar.a.bindNull(1);
            } else {
                fVar.a.bindString(1, str);
            }
            String str2 = jVar2.f1501b;
            if (str2 == null) {
                fVar.a.bindNull(2);
            } else {
                fVar.a.bindString(2, str2);
            }
        }
    }

    public l(c.v.f fVar) {
        this.a = fVar;
        this.f1502b = new a(this, fVar);
    }
}
