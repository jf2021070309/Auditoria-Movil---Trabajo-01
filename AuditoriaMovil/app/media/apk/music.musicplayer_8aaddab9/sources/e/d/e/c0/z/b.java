package e.d.e.c0.z;

import e.d.e.a0;
import e.d.e.c0.t;
import e.d.e.z;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
/* loaded from: classes2.dex */
public final class b implements a0 {
    public final e.d.e.c0.g a;

    /* loaded from: classes2.dex */
    public static final class a<E> extends z<Collection<E>> {
        public final z<E> a;

        /* renamed from: b  reason: collision with root package name */
        public final t<? extends Collection<E>> f7843b;

        public a(e.d.e.j jVar, Type type, z<E> zVar, t<? extends Collection<E>> tVar) {
            this.a = new n(jVar, zVar, type);
            this.f7843b = tVar;
        }

        @Override // e.d.e.z
        public Object a(e.d.e.e0.a aVar) throws IOException {
            if (aVar.g0() == e.d.e.e0.b.NULL) {
                aVar.a0();
                return null;
            }
            Collection<E> a = this.f7843b.a();
            aVar.a();
            while (aVar.y()) {
                a.add(this.a.a(aVar));
            }
            aVar.m();
            return a;
        }

        @Override // e.d.e.z
        public void b(e.d.e.e0.c cVar, Object obj) throws IOException {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                cVar.y();
                return;
            }
            cVar.f();
            for (E e2 : collection) {
                this.a.b(cVar, e2);
            }
            cVar.m();
        }
    }

    public b(e.d.e.c0.g gVar) {
        this.a = gVar;
    }

    @Override // e.d.e.a0
    public <T> z<T> a(e.d.e.j jVar, e.d.e.d0.a<T> aVar) {
        Type type = aVar.f7896b;
        Class<? super T> cls = aVar.a;
        if (Collection.class.isAssignableFrom(cls)) {
            Type f2 = e.d.e.c0.a.f(type, cls, Collection.class);
            if (f2 instanceof WildcardType) {
                f2 = ((WildcardType) f2).getUpperBounds()[0];
            }
            Class cls2 = f2 instanceof ParameterizedType ? ((ParameterizedType) f2).getActualTypeArguments()[0] : Object.class;
            return new a(jVar, cls2, jVar.c(new e.d.e.d0.a<>(cls2)), this.a.a(aVar));
        }
        return null;
    }
}
