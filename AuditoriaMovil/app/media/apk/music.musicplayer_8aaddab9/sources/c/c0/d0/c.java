package c.c0.d0;

import c.c0.u;
import c.p.w;
/* loaded from: classes.dex */
public class c implements u {

    /* renamed from: c  reason: collision with root package name */
    public final w<u.b> f1335c = new w<>();

    /* renamed from: d  reason: collision with root package name */
    public final c.c0.d0.t.s.c<u.b.c> f1336d = new c.c0.d0.t.s.c<>();

    public c() {
        a(u.f1606b);
    }

    public void a(u.b bVar) {
        this.f1335c.i(bVar);
        if (bVar instanceof u.b.c) {
            this.f1336d.j((u.b.c) bVar);
        } else if (bVar instanceof u.b.a) {
            this.f1336d.k(((u.b.a) bVar).a);
        }
    }
}
