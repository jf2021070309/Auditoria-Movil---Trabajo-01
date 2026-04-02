package e.c.a.m.u.h;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class f {
    public final List<a<?, ?>> a = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a<Z, R> {
        public final Class<Z> a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f5946b;

        /* renamed from: c  reason: collision with root package name */
        public final e<Z, R> f5947c;

        public a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.a = cls;
            this.f5946b = cls2;
            this.f5947c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f5946b);
        }
    }

    public synchronized <Z, R> List<Class<R>> a(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
