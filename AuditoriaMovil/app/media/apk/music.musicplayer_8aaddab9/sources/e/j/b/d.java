package e.j.b;
/* loaded from: classes2.dex */
public abstract class d {
    public e.j.b.i.a a(e.j.b.i.a aVar) {
        return b(aVar.a, aVar.f8513b);
    }

    public abstract e.j.b.i.a b(String str, String str2);

    public e.j.b.i.a c(e.j.b.i.a aVar) {
        e.j.b.i.a a = a(aVar);
        if (a == null) {
            a = new e.j.b.i.a(aVar.a, aVar.f8513b, aVar.f8514c);
        }
        a.f8516e = System.currentTimeMillis();
        a.f8515d++;
        e(a);
        aVar.b(a.f8515d);
        return aVar;
    }

    public e.j.b.i.a d(e.j.b.i.a aVar) {
        e.j.b.i.a a = a(aVar);
        if (a == null) {
            a = new e.j.b.i.a(aVar.a, aVar.f8513b, aVar.f8514c);
        }
        a.b(0);
        e(a);
        aVar.b(a.f8515d);
        return aVar;
    }

    public abstract void e(e.j.b.i.a aVar);
}
