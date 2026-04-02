package e.d.e.c0.z;

import e.d.e.c0.z.j;
import e.d.e.z;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* loaded from: classes2.dex */
public final class n<T> extends z<T> {
    public final e.d.e.j a;

    /* renamed from: b  reason: collision with root package name */
    public final z<T> f7873b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f7874c;

    public n(e.d.e.j jVar, z<T> zVar, Type type) {
        this.a = jVar;
        this.f7873b = zVar;
        this.f7874c = type;
    }

    @Override // e.d.e.z
    public T a(e.d.e.e0.a aVar) throws IOException {
        return this.f7873b.a(aVar);
    }

    @Override // e.d.e.z
    public void b(e.d.e.e0.c cVar, T t) throws IOException {
        z<T> zVar = this.f7873b;
        Type type = this.f7874c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f7874c) {
            zVar = this.a.c(new e.d.e.d0.a<>(type));
            if (zVar instanceof j.a) {
                z<T> zVar2 = this.f7873b;
                if (!(zVar2 instanceof j.a)) {
                    zVar = zVar2;
                }
            }
        }
        zVar.b(cVar, t);
    }
}
