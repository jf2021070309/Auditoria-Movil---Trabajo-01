package e.d.e.c0.z;

import e.d.e.a0;
import e.d.e.z;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class a<E> extends z<Object> {
    public static final a0 a = new C0170a();

    /* renamed from: b  reason: collision with root package name */
    public final Class<E> f7841b;

    /* renamed from: c  reason: collision with root package name */
    public final z<E> f7842c;

    /* renamed from: e.d.e.c0.z.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0170a implements a0 {
        @Override // e.d.e.a0
        public <T> z<T> a(e.d.e.j jVar, e.d.e.d0.a<T> aVar) {
            Type type = aVar.f7896b;
            boolean z = type instanceof GenericArrayType;
            if (z || ((type instanceof Class) && ((Class) type).isArray())) {
                Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new a(jVar, jVar.c(new e.d.e.d0.a<>(genericComponentType)), e.d.e.c0.a.e(genericComponentType));
            }
            return null;
        }
    }

    public a(e.d.e.j jVar, z<E> zVar, Class<E> cls) {
        this.f7842c = new n(jVar, zVar, cls);
        this.f7841b = cls;
    }

    @Override // e.d.e.z
    public Object a(e.d.e.e0.a aVar) throws IOException {
        if (aVar.g0() == e.d.e.e0.b.NULL) {
            aVar.a0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.y()) {
            arrayList.add(this.f7842c.a(aVar));
        }
        aVar.m();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f7841b, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.d.e.z
    public void b(e.d.e.e0.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.y();
            return;
        }
        cVar.f();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f7842c.b(cVar, Array.get(obj, i2));
        }
        cVar.m();
    }
}
