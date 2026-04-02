package e.d.e.c0.z;

import e.d.e.a0;
import e.d.e.z;
/* loaded from: classes2.dex */
public class p implements a0 {
    public final /* synthetic */ Class a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f7889b;

    public p(Class cls, z zVar) {
        this.a = cls;
        this.f7889b = zVar;
    }

    @Override // e.d.e.a0
    public <T> z<T> a(e.d.e.j jVar, e.d.e.d0.a<T> aVar) {
        if (aVar.a == this.a) {
            return this.f7889b;
        }
        return null;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Factory[type=");
        y.append(this.a.getName());
        y.append(",adapter=");
        y.append(this.f7889b);
        y.append("]");
        return y.toString();
    }
}
