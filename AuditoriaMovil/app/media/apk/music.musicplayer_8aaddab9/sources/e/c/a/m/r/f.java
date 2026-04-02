package e.c.a.m.r;

import e.c.a.m.r.e;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class f {
    public static final e.a<?> a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, e.a<?>> f5565b = new HashMap();

    /* loaded from: classes.dex */
    public class a implements e.a<Object> {
        @Override // e.c.a.m.r.e.a
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // e.c.a.m.r.e.a
        public e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements e<Object> {
        public final Object a;

        public b(Object obj) {
            this.a = obj;
        }

        @Override // e.c.a.m.r.e
        public Object a() {
            return this.a;
        }

        @Override // e.c.a.m.r.e
        public void b() {
        }
    }
}
