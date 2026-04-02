package e.d.d.p.k;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class h {
    public final Map<Class<?>, e.d.d.p.e<?>> a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, e.d.d.p.g<?>> f7560b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.d.p.e<Object> f7561c;

    /* loaded from: classes2.dex */
    public static final class a implements e.d.d.p.i.b<a> {
        public final Map<Class<?>, e.d.d.p.e<?>> a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<Class<?>, e.d.d.p.g<?>> f7562b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        public e.d.d.p.e<Object> f7563c = new e.d.d.p.e() { // from class: e.d.d.p.k.b
            @Override // e.d.d.p.b
            public final void encode(Object obj, e.d.d.p.f fVar) {
                StringBuilder y = e.a.d.a.a.y("Couldn't find encoder for type ");
                y.append(obj.getClass().getCanonicalName());
                throw new e.d.d.p.c(y.toString());
            }
        };

        @Override // e.d.d.p.i.b
        public a registerEncoder(Class cls, e.d.d.p.e eVar) {
            this.a.put(cls, eVar);
            this.f7562b.remove(cls);
            return this;
        }
    }

    public h(Map<Class<?>, e.d.d.p.e<?>> map, Map<Class<?>, e.d.d.p.g<?>> map2, e.d.d.p.e<Object> eVar) {
        this.a = map;
        this.f7560b = map2;
        this.f7561c = eVar;
    }

    public void a(Object obj, OutputStream outputStream) throws IOException {
        Map<Class<?>, e.d.d.p.e<?>> map = this.a;
        g gVar = new g(outputStream, map, this.f7560b, this.f7561c);
        if (obj == null) {
            return;
        }
        e.d.d.p.e<?> eVar = map.get(obj.getClass());
        if (eVar != null) {
            eVar.encode(obj, gVar);
            return;
        }
        StringBuilder y = e.a.d.a.a.y("No encoder for ");
        y.append(obj.getClass());
        throw new e.d.d.p.c(y.toString());
    }
}
