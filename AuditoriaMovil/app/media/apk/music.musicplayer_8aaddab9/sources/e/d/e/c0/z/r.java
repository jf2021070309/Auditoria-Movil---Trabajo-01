package e.d.e.c0.z;

import e.d.e.a0;
import e.d.e.z;
import org.slf4j.Marker;
/* loaded from: classes2.dex */
public class r implements a0 {
    public final /* synthetic */ Class a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f7892b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z f7893c;

    public r(Class cls, Class cls2, z zVar) {
        this.a = cls;
        this.f7892b = cls2;
        this.f7893c = zVar;
    }

    @Override // e.d.e.a0
    public <T> z<T> a(e.d.e.j jVar, e.d.e.d0.a<T> aVar) {
        Class<? super T> cls = aVar.a;
        if (cls == this.a || cls == this.f7892b) {
            return this.f7893c;
        }
        return null;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Factory[type=");
        y.append(this.a.getName());
        y.append(Marker.ANY_NON_NULL_MARKER);
        y.append(this.f7892b.getName());
        y.append(",adapter=");
        y.append(this.f7893c);
        y.append("]");
        return y.toString();
    }
}
