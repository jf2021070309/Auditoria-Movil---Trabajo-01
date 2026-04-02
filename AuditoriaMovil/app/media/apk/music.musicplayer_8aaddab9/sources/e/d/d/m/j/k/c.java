package e.d.d.m.j.k;
/* loaded from: classes.dex */
public class c {
    public static final b a = new b(null);

    /* renamed from: b  reason: collision with root package name */
    public final e.d.d.m.j.n.f f7237b;

    /* renamed from: c  reason: collision with root package name */
    public e.d.d.m.j.k.a f7238c = a;

    /* loaded from: classes2.dex */
    public static final class b implements e.d.d.m.j.k.a {
        public b(a aVar) {
        }

        @Override // e.d.d.m.j.k.a
        public void a() {
        }

        @Override // e.d.d.m.j.k.a
        public String b() {
            return null;
        }

        @Override // e.d.d.m.j.k.a
        public void c(long j2, String str) {
        }
    }

    public c(e.d.d.m.j.n.f fVar) {
        this.f7237b = fVar;
    }

    public c(e.d.d.m.j.n.f fVar, String str) {
        this.f7237b = fVar;
        a(str);
    }

    public final void a(String str) {
        this.f7238c.a();
        this.f7238c = a;
        if (str == null) {
            return;
        }
        this.f7238c = new g(this.f7237b.f(str, "userlog"), 65536);
    }
}
