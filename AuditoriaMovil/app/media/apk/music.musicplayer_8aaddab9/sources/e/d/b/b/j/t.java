package e.d.b.b.j;

import e.d.b.b.j.i;
import e.d.b.b.j.j;
import e.d.b.b.j.n;
import e.d.b.b.j.r;
import java.util.Objects;
/* loaded from: classes.dex */
public final class t<T> implements e.d.b.b.f<T> {
    public final r a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6283b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.b.b.b f6284c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.b.b.e<T, byte[]> f6285d;

    /* renamed from: e  reason: collision with root package name */
    public final u f6286e;

    public t(r rVar, String str, e.d.b.b.b bVar, e.d.b.b.e<T, byte[]> eVar, u uVar) {
        this.a = rVar;
        this.f6283b = str;
        this.f6284c = bVar;
        this.f6285d = eVar;
        this.f6286e = uVar;
    }

    public void a(e.d.b.b.c<T> cVar, e.d.b.b.h hVar) {
        u uVar = this.f6286e;
        r rVar = this.a;
        Objects.requireNonNull(rVar, "Null transportContext");
        Objects.requireNonNull(cVar, "Null event");
        String str = this.f6283b;
        Objects.requireNonNull(str, "Null transportName");
        e.d.b.b.e<T, byte[]> eVar = this.f6285d;
        Objects.requireNonNull(eVar, "Null transformer");
        e.d.b.b.b bVar = this.f6284c;
        Objects.requireNonNull(bVar, "Null encoding");
        v vVar = (v) uVar;
        e.d.b.b.j.c0.e eVar2 = vVar.f6289d;
        e.d.b.b.d c2 = cVar.c();
        r.a a = r.a();
        a.b(rVar.b());
        a.c(c2);
        j.b bVar2 = (j.b) a;
        bVar2.f6266b = rVar.c();
        r a2 = bVar2.a();
        n.a a3 = n.a();
        a3.e(vVar.f6287b.a());
        a3.g(vVar.f6288c.a());
        a3.f(str);
        a3.d(new m(bVar, eVar.apply(cVar.b())));
        i.b bVar3 = (i.b) a3;
        bVar3.f6259b = cVar.a();
        eVar2.a(a2, bVar3.b(), hVar);
    }
}
