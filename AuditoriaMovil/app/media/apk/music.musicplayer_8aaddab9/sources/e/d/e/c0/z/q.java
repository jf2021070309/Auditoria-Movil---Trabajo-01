package e.d.e.c0.z;

import e.d.e.a0;
import e.d.e.z;
import org.slf4j.Marker;
/* loaded from: classes2.dex */
public class q implements a0 {
    public final /* synthetic */ Class a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f7890b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ z f7891c;

    public q(Class cls, Class cls2, z zVar) {
        this.a = cls;
        this.f7890b = cls2;
        this.f7891c = zVar;
    }

    @Override // e.d.e.a0
    public <T> z<T> a(e.d.e.j jVar, e.d.e.d0.a<T> aVar) {
        Class<? super T> cls = aVar.a;
        if (cls == this.a || cls == this.f7890b) {
            return this.f7891c;
        }
        return null;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Factory[type=");
        y.append(this.f7890b.getName());
        y.append(Marker.ANY_NON_NULL_MARKER);
        y.append(this.a.getName());
        y.append(",adapter=");
        y.append(this.f7891c);
        y.append("]");
        return y.toString();
    }
}
