package e.c.a.p;

import e.c.a.m.p;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class f {
    public final List<a<?>> a = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a<T> {
        public final Class<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final p<T> f5981b;

        public a(Class<T> cls, p<T> pVar) {
            this.a = cls;
            this.f5981b = pVar;
        }
    }

    public synchronized <Z> p<Z> a(Class<Z> cls) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a<?> aVar = this.a.get(i2);
            if (aVar.a.isAssignableFrom(cls)) {
                return (p<Z>) aVar.f5981b;
            }
        }
        return null;
    }
}
