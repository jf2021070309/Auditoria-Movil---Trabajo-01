package e.j.d.z;

import h.o.c.j;
import h.r.f;
/* loaded from: classes2.dex */
public final class d<T> {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public volatile c f8909b;

    public d(String str) {
        this.a = str;
    }

    public c a(T t, f<?> fVar) {
        j.e(t, "thisRef");
        j.e(fVar, "property");
        c cVar = this.f8909b;
        if (cVar == null) {
            this.f8909b = new c(t, this.a);
            c cVar2 = this.f8909b;
            j.c(cVar2);
            return cVar2;
        }
        return cVar;
    }
}
